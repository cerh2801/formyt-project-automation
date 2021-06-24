import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement drop = driver.findElement(By.id("dropdownMenuButton"));
        drop.click();

        WebElement autocompleto = driver.findElement(By.id("autocomplete"));
        autocompleto.click();

        driver.manage().window().maximize();


    }
}
