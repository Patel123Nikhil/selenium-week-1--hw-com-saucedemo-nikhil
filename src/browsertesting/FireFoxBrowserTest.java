package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com";
        System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch the URL
        driver.get(baseUrl);
        //Give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Get the page source
        System.out.println("Page source is: " + driver.getPageSource());
        //Find the user filed
        WebElement userFiled = driver.findElement(By.name("user-name"));
        //Type the username in user field
        userFiled.sendKeys("Tridev");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Type the password in password field
        passwordField.sendKeys("Anand123");
    }
}
