package tools.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import WeatherAdvisory.Spec;
import WeatherAdvisory.WeatherAdvisoryGrpc;

import openweather.api.DefaultApi;
import openweather.model.Data25WeatherGet200Response;
import openweather.model.Data25AirPollutionGet200Response;
import openweather.model.Data25ForecastGet200Response;

import java.math.BigDecimal;

public class WeatherAdvisoryServer {

    static class WeatherAdvisoryServiceImpl extends WeatherAdvisoryGrpc.WeatherAdvisoryImplBase {

        private final String apiKey = System.getenv("OPENWEATHER_API_KEY");

        // Get Weather
        @Override
        public void getWeather(Spec.WeatherRequest request,
                               StreamObserver<Spec.WeatherResponse> responseObserver) {
            String city = request.getCity();

            try {
                DefaultApi api = new DefaultApi();
                api.getApiClient().setBasePath("https://api.openweathermap.org");

                Data25WeatherGet200Response weatherResponse =
                        api.data25WeatherGet(city, apiKey);

                double kelvin = weatherResponse.getMain().getTemp().doubleValue();
                double celsius = kelvin - 273.15;
                String description = weatherResponse.getWeather().get(0).getDescription();

                Spec.WeatherResponse reply = Spec.WeatherResponse.newBuilder()
                        .setCity(city)
                        .setTemperature((float) celsius)
                        .setDescription(description)
                        .build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();

                System.out.printf("Weather via SDK for %s: %.2f°C, %s%n", city, celsius, description);

            } catch (Exception e) {
                System.out.println("Error in getWeather(): " + e.getMessage());
                e.printStackTrace();
                responseObserver.onError(e);
            }
        }

        // Get Air Quality
        @Override
        public void getAirQuality(Spec.AirQualityRequest request,
                                  StreamObserver<Spec.AirQualityResponse> responseObserver) {

            String city = request.getCity();

            try {
                DefaultApi api = new DefaultApi();
                api.getApiClient().setBasePath("https://api.openweathermap.org");

                double lat, lon;

                // Step 1: Convert city -> lat/lon
                String geoApiUrl = String.format(
                        "https://api.openweathermap.org/geo/1.0/direct?q=%s&limit=1&appid=%s",
                        city, apiKey);

                java.net.URL url = new java.net.URL(geoApiUrl);
                var conn = (java.net.HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                var reader = new java.io.BufferedReader(
                        new java.io.InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) sb.append(line);
                reader.close();

                org.json.JSONArray geoArray = new org.json.JSONArray(sb.toString());
                if (geoArray.isEmpty()) {
                    responseObserver.onError(new Throwable("City not found"));
                    return;
                }

                lat = geoArray.getJSONObject(0).getDouble("lat");
                lon = geoArray.getJSONObject(0).getDouble("lon");

                Data25AirPollutionGet200Response airResponse =
                        api.data25AirPollutionGet(
                                BigDecimal.valueOf(lat),
                                BigDecimal.valueOf(lon),
                                apiKey
                        );

                int aqi = airResponse.getList().get(0).getMain().getAqi();

                String desc;
                switch (aqi) {
                    case 1 -> desc = "Good";
                    case 2 -> desc = "Fair";
                    case 3 -> desc = "Moderate";
                    case 4 -> desc = "Poor";
                    default -> desc = "Very Poor";
                }

                Spec.AirQualityResponse reply = Spec.AirQualityResponse.newBuilder()
                        .setCity(city)
                        .setAirQuality(desc)
                        .setMessage("Air Quality Index: " + aqi)
                        .build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();

                System.out.printf("Air quality via SDK for %s: %s (AQI: %d)%n",
                        city, desc, aqi);

            } catch (Exception e) {
                System.out.println("Error in getAirQuality(): " + e.getMessage());
                e.printStackTrace();
                responseObserver.onError(e);
            }
        }

        // Get Travel Recommendation
        @Override
        public void getTravelRecommendation(Spec.TravelRequest request,
                                            StreamObserver<Spec.TravelRecommendationResponse> responseObserver) {
            String city = request.getCity();
            String apiKey = System.getenv("OPENWEATHER_API_KEY");
            DefaultApi api = new DefaultApi(); 
            openweather.JSON.setLenientOnJson(true);

            


            try {
                api.getApiClient().setBasePath("https://api.openweathermap.org"); 

                   
                Data25ForecastGet200Response forecastResponse =
                api.data25ForecastGet(city, apiKey);

                double kelvin = forecastResponse.getList().get(0).getMain().getFeelsLike().doubleValue();
                double celsius = kelvin - 273.15;

                String recommendation;
                if (celsius < 15)
                    recommendation = "It's chilly, consider wearing a jacket.";
                else if (celsius > 30)
                    recommendation = "It's hot, consider wearing sunscreen.";
                else
                    recommendation = "It's perfect, no need to bring an umbrella.";

                Spec.TravelRecommendationResponse reply = Spec.TravelRecommendationResponse.newBuilder()
                        .setCity(city)
                        .setRecommendation(recommendation)
                        .build();

                responseObserver.onNext(reply);
                responseObserver.onCompleted();

                System.out.printf("Travel recommendation for %s: %.2f°C → %s%n", city, celsius, recommendation);

            } catch (Exception e) {
                System.out.println("Error in getTravelRecommendation(): " + e.getMessage());
                e.printStackTrace();
                responseObserver.onError(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int port = System.getenv("SERVER_PORT") != null
                ? Integer.parseInt(System.getenv("SERVER_PORT"))
                : 9999;

        Server server = ServerBuilder.forPort(port)
                .addService(new WeatherAdvisoryServiceImpl())
                .build();

        System.out.println(" gRPC Weather Advisory Server started on port: " + port);
        server.start();
        server.awaitTermination();
    }
}
