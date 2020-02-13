import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class PrestashopTest{

    public static WebElement signInMethod(WebDriver driver) {
        WebElement element = driver.findElement(By.linkText("Sign in"));
        return element;
    }
}



