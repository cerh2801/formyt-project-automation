import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.security.Key;

public class Datepicker {
    public static void main(String[] args
) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement date = driver.findElement(By.id("datepicker"));

        date.sendKeys("03/03/2021");
        date.sendKeys(Keys.RETURN);

        date.click();

        driver.manage().window().maximize();

        Thread.sleep(6000);

        driver.quit();
    }
}