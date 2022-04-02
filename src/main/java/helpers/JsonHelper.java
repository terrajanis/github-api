package helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper {

    public  static <T> T jsonToObject(String json, Class<T> response) {
        try {
            return new ObjectMapper().readValue(json, response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}

