package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver = null;
    protected static WebDriverWait waitVar = null;
    String scName = "";

    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\KATARINA\\VIKTOR\\chromedriver_win32\\chromedriver.exe");

        // Initialize new WebDriver session
        System.out.println("Starting driver...");
        driver = new ChromeDriver();

        // driver = new FirefoxDriver();
        System.out.println("Started driver.");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String baseURL = "https://gallery-app.vivifyideas.com/";
        driver.get(baseURL);
        waitVar = new WebDriverWait(driver, 15);


    }

    public void tearDown() {

        driver.close();
        driver.quit();
    }
}
