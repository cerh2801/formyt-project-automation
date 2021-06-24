import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploas {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement img = driver.findElement(By.id("file-upload-field"));

        img.sendKeys("C:\\Users\\USUARIO\\Downloads\\img.png");


        driver.manage().window().maximize();


    }
}
