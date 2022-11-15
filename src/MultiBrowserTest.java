import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "chrome";
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    static WebDriver driver;

    public static void main(String[] args) {


        if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver=new ChromeDriver();

        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gheko.driver","drivers/geckodriver.exe");
            driver= new FirefoxDriver();
        }

       if (browser.equalsIgnoreCase("edge")){
           System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");

       }
       //print the title of the page
        System.out.println("Title of the age is "+ driver .getTitle());

// 4. print the current url
        System.out.println("Current Url is"+ driver.getCurrentUrl());
        // 5. print page source
        System.out.println("Page source is "+ driver.getPageSource());


    }
}
