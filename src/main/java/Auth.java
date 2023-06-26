import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Auth {

    public static void auth(WebDriver driver, String Login, String Pass){
        WebElement login = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/form/table/tbody/tr[1]/td/input[1]"));
        login.clear();
        login.sendKeys(Login);

        WebElement pass = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/form/table/tbody/tr[1]/td/input[2]"));
        pass.clear();
        pass.sendKeys(Pass);

        WebElement go = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[1]/form/table/tbody/tr[2]/td[1]/input"));
        go.click();
    }
}
