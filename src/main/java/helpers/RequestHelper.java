package helpers;

import okhttp3.*;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import static helpers.JsonHelper.jsonToObject;


public final class RequestHelper extends BaseHelper{

    private final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .build();

    public <T> T get(Class<T> responseClass, String endpoint, Map<String,String> params) throws IOException {
        HttpUrl.Builder httpBuilder = HttpUrl.parse(BASE_URL + endpoint).newBuilder();
        if (params != null) {
            for(Map.Entry<String, String> param : params.entrySet()) {
                httpBuilder.addQueryParameter(param.getKey(),param.getValue());
            }
        }

        Request request = new Request.Builder()
                .url(httpBuilder.build())
                .get()
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        return jsonToObject(Objects.requireNonNull(response.body()).string(), responseClass);
    }

    public <T> T get(Class<T> responseClass, String endpoint) throws IOException {
        return get(responseClass, endpoint, null);
    }
}
