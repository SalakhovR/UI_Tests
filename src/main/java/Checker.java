import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.TestException;

public class Checker {

    public static void loginCheck(WebDriver driver, String userForFound){
        WebElement successLogin = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/b/a"));
        String user = successLogin.getText();
        if (user.equals(userForFound)){
            System.out.println("Проверка авторизации прошла успешно");
        } else {
            throw new TestException("Проверка авторизации провалилась");
        }
    }

    public static void failureLoginCheck(WebDriver driver){
        WebElement failLogin = driver.findElement(By.xpath("/html/body/font"));
        String text = failLogin.getText();
        System.out.println(text);
        if (text.equals("* Данные о пользователе введены неправильно!")){
            System.out.println("Проверка ввода неверного пароля прошла успешно");
        } else {
            throw new TestException("Проверка ввода неверного пароля провалилась");
        }
    }
}
