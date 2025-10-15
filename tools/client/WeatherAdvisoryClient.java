package tools.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import WeatherAdvisory.Spec;
import WeatherAdvisory.WeatherAdvisoryGrpc;

public class WeatherAdvisoryClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 9999; // or whatever port your server printed

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        WeatherAdvisoryGrpc.WeatherAdvisoryBlockingStub stub =
                WeatherAdvisoryGrpc.newBlockingStub(channel);

        // Test #1: Weather
        Spec.WeatherRequest weatherReq = Spec.WeatherRequest.newBuilder()
                .setCity("Karachi")
                .build();

        Spec.WeatherResponse weatherRes = stub.getWeather(weatherReq);
        System.out.println("\nWEATHER RESPONSE:");
        System.out.println("City: " + weatherRes.getCity());
        System.out.println("Temperature: " + weatherRes.getTemperature() + "°C");
        System.out.println("Description: " + weatherRes.getDescription());

        // Test #2: Air Quality
        Spec.AirQualityRequest airReq = Spec.AirQualityRequest.newBuilder()
                .setCity("Karachi")
                .build();

        Spec.AirQualityResponse airRes = stub.getAirQuality(airReq);
        System.out.println("\nAIR QUALITY RESPONSE:");
        System.out.println("City: " + airRes.getCity());
        System.out.println("Air Quality: " + airRes.getAirQuality());
        System.out.println("Message: " + airRes.getMessage());

        channel.shutdown();
    }
}
