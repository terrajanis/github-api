package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseHelper {

    protected Properties properties = new Properties();

    {
        try {
            properties.load(new FileInputStream("src/main/resources/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected final String BASE_URL = properties.getProperty("baseUrl");
}
