package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import java.math.BigDecimal;
import org.openapitools.client.model.Data25AirPollutionGet200Response;
import org.openapitools.client.model.Data25ForecastGet200Response;
import org.openapitools.client.model.Data25WeatherGet200Response;
import org.openapitools.client.model.Geo10DirectGet200ResponseInner;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-10-15T16:22:21.557714607Z[Etc/UTC]", comments = "Generator version: 7.17.0-SNAPSHOT")
public class DefaultApi extends BaseApi {

    public DefaultApi() {
        super(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Get air quality data
     * Fetch air quality data for specific coordinates.
     * <p><b>200</b> - Successful response for air quality data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param lat Latitude of the location (e.g., \&quot;51.5074\&quot;). (required)
     * @param lon Longitude of the location (e.g., \&quot;-0.1278\&quot;). (required)
     * @param appid API key for authentication. (required)
     * @return Data25AirPollutionGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Data25AirPollutionGet200Response data25AirPollutionGet(BigDecimal lat, BigDecimal lon, String appid) throws RestClientException {
        return data25AirPollutionGetWithHttpInfo(lat, lon, appid).getBody();
    }

    /**
     * Get air quality data
     * Fetch air quality data for specific coordinates.
     * <p><b>200</b> - Successful response for air quality data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param lat Latitude of the location (e.g., \&quot;51.5074\&quot;). (required)
     * @param lon Longitude of the location (e.g., \&quot;-0.1278\&quot;). (required)
     * @param appid API key for authentication. (required)
     * @return ResponseEntity&lt;Data25AirPollutionGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Data25AirPollutionGet200Response> data25AirPollutionGetWithHttpInfo(BigDecimal lat, BigDecimal lon, String appid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'lat' is set
        if (lat == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lat' when calling data25AirPollutionGet");
        }
        
        // verify the required parameter 'lon' is set
        if (lon == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lon' when calling data25AirPollutionGet");
        }
        
        // verify the required parameter 'appid' is set
        if (appid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appid' when calling data25AirPollutionGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lat", lat));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lon", lon));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "appid", appid));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Data25AirPollutionGet200Response> localReturnType = new ParameterizedTypeReference<Data25AirPollutionGet200Response>() {};
        return apiClient.invokeAPI("/data/2.5/air_pollution", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get 5-day/3-hour weather forecast
     * Retrieve weather forecasts at 3-hour intervals for the next 5 days.
     * <p><b>200</b> - Successful response for weather forecast data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param q Name of the city (or city, state, and country). (required)
     * @param appid API key for authentication. (required)
     * @return Data25ForecastGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Data25ForecastGet200Response data25ForecastGet(String q, String appid) throws RestClientException {
        return data25ForecastGetWithHttpInfo(q, appid).getBody();
    }

    /**
     * Get 5-day/3-hour weather forecast
     * Retrieve weather forecasts at 3-hour intervals for the next 5 days.
     * <p><b>200</b> - Successful response for weather forecast data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param q Name of the city (or city, state, and country). (required)
     * @param appid API key for authentication. (required)
     * @return ResponseEntity&lt;Data25ForecastGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Data25ForecastGet200Response> data25ForecastGetWithHttpInfo(String q, String appid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling data25ForecastGet");
        }
        
        // verify the required parameter 'appid' is set
        if (appid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appid' when calling data25ForecastGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "appid", appid));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Data25ForecastGet200Response> localReturnType = new ParameterizedTypeReference<Data25ForecastGet200Response>() {};
        return apiClient.invokeAPI("/data/2.5/forecast", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get current weather data for a city
     * Fetch current weather details such as temperature, humidity, and weather description.
     * <p><b>200</b> - Successful response for current weather data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param q Name of the city (or city, state, and country). (required)
     * @param appid API key for authentication. (required)
     * @return Data25WeatherGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Data25WeatherGet200Response data25WeatherGet(String q, String appid) throws RestClientException {
        return data25WeatherGetWithHttpInfo(q, appid).getBody();
    }

    /**
     * Get current weather data for a city
     * Fetch current weather details such as temperature, humidity, and weather description.
     * <p><b>200</b> - Successful response for current weather data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param q Name of the city (or city, state, and country). (required)
     * @param appid API key for authentication. (required)
     * @return ResponseEntity&lt;Data25WeatherGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Data25WeatherGet200Response> data25WeatherGetWithHttpInfo(String q, String appid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling data25WeatherGet");
        }
        
        // verify the required parameter 'appid' is set
        if (appid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appid' when calling data25WeatherGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "appid", appid));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Data25WeatherGet200Response> localReturnType = new ParameterizedTypeReference<Data25WeatherGet200Response>() {};
        return apiClient.invokeAPI("/data/2.5/weather", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Geocode a location
     * Fetch geographic coordinates for a given city, state, and country.
     * <p><b>200</b> - Successful response for geocoding data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param q Name of the city (or city, state, and country). (required)
     * @param appid API key for authentication. (required)
     * @param limit Maximum number of results to return. (optional, default to 5)
     * @return List&lt;Geo10DirectGet200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Geo10DirectGet200ResponseInner> geo10DirectGet(String q, String appid, Integer limit) throws RestClientException {
        return geo10DirectGetWithHttpInfo(q, appid, limit).getBody();
    }

    /**
     * Geocode a location
     * Fetch geographic coordinates for a given city, state, and country.
     * <p><b>200</b> - Successful response for geocoding data
     * <p><b>401</b> - Unauthorized - Invalid API key
     * <p><b>404</b> - Resource not found
     * @param q Name of the city (or city, state, and country). (required)
     * @param appid API key for authentication. (required)
     * @param limit Maximum number of results to return. (optional, default to 5)
     * @return ResponseEntity&lt;List&lt;Geo10DirectGet200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Geo10DirectGet200ResponseInner>> geo10DirectGetWithHttpInfo(String q, String appid, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling geo10DirectGet");
        }
        
        // verify the required parameter 'appid' is set
        if (appid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appid' when calling geo10DirectGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "appid", appid));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Geo10DirectGet200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<Geo10DirectGet200ResponseInner>>() {};
        return apiClient.invokeAPI("/geo/1.0/direct", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
