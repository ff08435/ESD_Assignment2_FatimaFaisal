package openweather.auth;

import java.net.URI;
import java.util.List;
import java.util.Map;
import openweather.Pair;

public class HttpBearerAuth implements Authentication {
    private String bearerToken;

    public String getBearerToken() { return bearerToken; }
    public void setBearerToken(String bearerToken) { this.bearerToken = bearerToken; }

    @Override
    public void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri
    ) {
        if (bearerToken != null && !bearerToken.isEmpty()) {
            headerParams.put("Authorization", "Bearer " + bearerToken);
        }
    }
}
