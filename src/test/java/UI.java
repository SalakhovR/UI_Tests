import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UI {

    @Test(description = "Проверка успешной авторизации")
    public void SuccessAuth() {
        WebDriver driver = InstallWebDriver.installWebDriver();
        Auth.auth(driver, Config.getLOGIN(), Config.getPASS());
        Checker.loginCheck(driver, Config.getGOOD_USER());
    }

    @Test(description = "Проверка неудачной авторизации")
    public void FailureAuth() {
        WebDriver driver = InstallWebDriver.installWebDriver();
        Auth.auth(driver, Config.getLOGIN(), Config.getBAD_PASS());
        Checker.failureLoginCheck(driver);
    }

}
