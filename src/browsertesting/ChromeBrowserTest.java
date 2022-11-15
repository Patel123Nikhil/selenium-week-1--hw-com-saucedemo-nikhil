package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com";
        System.setProperty("websdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch the URL
        driver.get(baseUrl);
        // Give the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Get the title of page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source is: " + driver.getPageSource());
        //Find the user field
        WebElement userField = driver.findElement(By.name("user-name"));
        //Type the username in user field
        userField.sendKeys("tararampam");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Type the password in password field
        passwordField.sendKeys("nikhil123");
        //Close the browser
        driver.quit();
    }
}
