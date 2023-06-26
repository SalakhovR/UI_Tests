import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Config {
    private static final Properties defaultConfig = new Properties();

    static {
        String conf_file = (System.getProperty("fileconf") != null ? System.getProperty("fileconf") : "uiProperties.properties");
        InputStream inputStream = Config.class.getClassLoader().getResourceAsStream(conf_file);
        try {
            assert inputStream != null;
            defaultConfig.load(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getConfigStringParam(String paramName) {

        String param = System.getenv(paramName);

        return param != null
                ? param
                : (String) defaultConfig.get(paramName);
    }

    public static String getWEBDRIVER_PATH() {
        return Config.getConfigStringParam("WEBDRIVER_PATH");
    }

    public static String getTEST_URL() {
        return Config.getConfigStringParam("TEST_URL");
    }

    public static String getLOGIN() {
        return Config.getConfigStringParam("LOGIN");
    }

    public static String getPASS() {
        return Config.getConfigStringParam("PASS");
    }

    public static String getBAD_PASS() {
        return Config.getConfigStringParam("BAD_PASS");
    }

    public static String getGOOD_USER() {
        return Config.getConfigStringParam("GOOD_USER");
    }
}
