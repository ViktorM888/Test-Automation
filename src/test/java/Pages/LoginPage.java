package Pages;

import Utils.DriverFactory;
import Utils.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Steps.Steps.GetElementByXpathWithoutCondition;

public class LoginPage extends DriverFactory {


    public static void webPage() throws InterruptedException {
        String URL = driver.getCurrentUrl();
        String Title = driver.getTitle();
        CommonPage.WaitForElementToBeAvailable(URL);
        CommonPage.WaitForElementToBeAvailable(Title);
        Assert.assertEquals("https://gallery-app.vivifyideas.com/", URL);
        Assert.assertEquals("gallery-app", Title);
    }


    private static String loginButton_xpath() throws InterruptedException {
        String xpath = ".//a[contains(text(),'Login')]";
        return xpath;
    }

    public static void loginButton() throws InterruptedException {
        String xpath = loginButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on Login Button");
    }

    private static String emailTestField_xpath() throws InterruptedException {
        String xpath = ".//input[@id='email']";
        return xpath;
    }

    public static void email(String name) throws InterruptedException {
        String xpath = emailTestField_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Email");
    }

    private static String password_xpath() throws InterruptedException {
        String xpath = ".//input[@id='password']";
        return xpath;
    }

    public static void password(String name) throws InterruptedException {
        String xpath = password_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Password");
    }

    private static String submitButton_xpath() throws InterruptedException {
        String xpath = ".//button[contains(text(),'Submit')]";
        return xpath;
    }

    public static void submitButton() throws InterruptedException {
        String xpath = submitButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on submit button");
    }

    public static void errorMessage() throws InterruptedException {
        String error = driver.findElement(By.xpath(".//p")).getText();
        WebElement element = GetElementByXpathWithoutCondition(error);
        CommonPage.WaitForElementToBeAvailable(error);
        Assert.assertEquals("Bad Credentials", error);
        Log.info("Received Error Message");
    }

    public static void refreshWebPage() throws InterruptedException {
        driver.navigate().refresh();
        Log.info("Refreshed the Page");
    }

}