package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "FireFox";
    static String baseUrl = "https://www.saucedemo.com";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gheko.driver", "driver/geckodriver.exe");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Wrong Browser Name");
        }
        driver.get(baseUrl);

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + driver.getTitle());
        //Get the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //Get page source
        System.out.println("Page source is: " + driver.getPageSource());
        //Find the user field
        WebElement userField = driver.findElement(By.name("user-name"));
        // Type the username in user field
        userField.sendKeys("munnabhai");
        //Find the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        //Type the password in password field
        passwordField.sendKeys("junjun123");
        //Close the browser
        driver.quit();


    }
}
