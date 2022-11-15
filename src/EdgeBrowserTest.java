import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.time.Duration;

public class EdgeBrowserTest {


    public static void main(String[] args) {

        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        //Set Edge drive path
        System.setProperty("webdriver.Edge.driver", "drivers/msedgedriver.exe");

        //start Edge browser
        WebDriver driver = new EdgeDriver();
//open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//print the title pf page
        System.out.println("Page Title is: " + driver.getTitle());
        //Get current url
        System.out.println("Current Url is :" + driver.getCurrentUrl());
        //Get web elements or page source
        System.out.println("Page source is :" + driver.getPageSource());

        //Find and enter email in email field element
        WebElement userField = driver.findElement(By.name("username"));
        userField.sendKeys("Admin");

//Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

//close browser
        driver.quit();


    }
}
