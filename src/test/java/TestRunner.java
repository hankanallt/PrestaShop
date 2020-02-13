import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;


public class TestRunner {

    public static void main(String[] args) throws InterruptedException {
        // Testrunner//

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.prestashop.com/#/en/front");
        PrestashopTest.signInMethod(driver).click();


    }

    }

