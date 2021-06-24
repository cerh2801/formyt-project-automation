import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class Form {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement name = driver.findElement(id("first-name"));
        name.sendKeys("Cinthia");

        WebElement apellido = driver.findElement(id("last-name"));
        apellido.sendKeys("Ramos Herrera");

        WebElement profesion = driver.findElement(id("job-title"));
        profesion.sendKeys("Ingeniero de sistemas");

        WebElement elegir = driver.findElement(id("radio-button-3"));
        elegir.click();

        WebElement sexo = driver.findElement(id("radio-button-3"));
        sexo.click();

        WebElement seleccion = driver.findElement(id("select-menu"));
        seleccion.click();

        driver.findElement(xpath("//*[@id=\"select-menu\"]/option[5]")).click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("06/23/2021");

        WebElement enviar = driver.findElement(By.linkText("Submit"));
        enviar.click();


        driver.manage().window().maximize();




    }
    }

