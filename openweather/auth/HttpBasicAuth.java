package openweather.auth;

import java.net.URI;
import java.util.List;
import java.util.Map;
import openweather.Pair;

public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri
    ) {
        if (username == null && password == null) return;
        String auth = (username == null ? "" : username) + ":" + (password == null ? "" : password);
        headerParams.put("Authorization", "Basic " + java.util.Base64.getEncoder().encodeToString(auth.getBytes()));
    }
}
