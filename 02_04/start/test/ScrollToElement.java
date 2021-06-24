import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement nombre = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(nombre);
        nombre.sendKeys("Cinthia Ramos");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("02/11/2021");



    }
}
