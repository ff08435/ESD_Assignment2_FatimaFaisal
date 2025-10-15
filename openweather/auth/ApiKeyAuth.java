package openweather.auth;

import java.net.URI;
import java.util.List;
import java.util.Map;
import openweather.Pair;

public class ApiKeyAuth implements Authentication {
    private final String location;
    private final String paramName;

    private String apiKey;
    private String apiKeyPrefix;

    public ApiKeyAuth(String location, String paramName) {
        this.location = location;
        this.paramName = paramName;
    }

    public String getApiKey() { return apiKey; }
    public void setApiKey(String apiKey) { this.apiKey = apiKey; }

    public String getApiKeyPrefix() { return apiKeyPrefix; }
    public void setApiKeyPrefix(String apiKeyPrefix) { this.apiKeyPrefix = apiKeyPrefix; }

    @Override
    public void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri
    ) {
        if (apiKey == null) return;
        String value = apiKeyPrefix != null ? apiKeyPrefix + " " + apiKey : apiKey;

        switch (location) {
            case "query" -> queryParams.add(new Pair(paramName, value));
            case "header" -> headerParams.put(paramName, value);
            case "cookie" -> cookieParams.put(paramName, value);
        }
    }
}
