package openweather.auth;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import openweather.Pair;

public interface Authentication extends Interceptor {

    /**
     * Apply authentication settings to header, query, or cookie params.
     */
    void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri
    );

    @Override
    default Response intercept(Chain chain) throws IOException {
        Request request = apply(chain.request().newBuilder()).build();
        return chain.proceed(request);
    }

    /**
     * Override this method in subclasses if you modify requests directly.
     */
    default Request.Builder apply(Request.Builder builder) {
        return builder;
    }
}
