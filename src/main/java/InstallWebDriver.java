import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class InstallWebDriver {
    public static WebDriver installWebDriver() {
        ChromeDriverService service = new ChromeDriverService.Builder()
                .withLogOutput(System.out)
                .build();
        System.setProperty("webdriver.chrome.driver", Config.getWEBDRIVER_PATH());
        WebDriver driver = new ChromeDriver(service);
        driver.get(Config.getTEST_URL());
        return driver;
    }
}
