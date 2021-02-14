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
        Assert.assertEquals("https://qa-sandbox.apps.htec.rs/", URL);
        Assert.assertEquals("Sandbox", Title);
    }


    private static String loginButton_xpath() throws InterruptedException {
        String xpath = ".//*[contains(text(), 'Login')]";
        return xpath;
    }

    public static void loginButton() throws InterruptedException {
        String xpath = loginButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on Login Button");
    }

    private static String emailTextField_xpath() throws InterruptedException {
        String xpath = ".//input[@type='email']";
        return xpath;
    }

    public static void email(String name) throws InterruptedException {
        String xpath = emailTextField_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Email");
    }

    private static String passwordTextField_xpath() throws InterruptedException {
        String xpath = ".//input[@type='password']";
        return xpath;
    }

    public static void password(String name) throws InterruptedException {
        String xpath = passwordTextField_xpath();
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
        Log.info("Clicked on Submit Button");
    }

    private static String logoutButton_xpath() throws InterruptedException {
        String xpath = ".//*[contains(text(),'Logout')]";
        return xpath;
    }

    public static void logoutButton() throws InterruptedException {
        String xpath = logoutButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on Logout Button");
    }

    public static void emailErrorMessage() throws InterruptedException {
        String emailError = driver.findElement(By.xpath(".//div[@class='invalid-feedback']")).getText();
        WebElement element = GetElementByXpathWithoutCondition(emailError);
        CommonPage.WaitForElementToBeAvailable(emailError);
        Assert.assertEquals("Email field is required", emailError);
        Log.info("Received Email Error Message");
    }

    public static void userNotFoundErrorMessage() throws InterruptedException {
        String userError = driver.findElement(By.xpath(".//div[@class='invalid-feedback']")).getText();
        WebElement element = GetElementByXpathWithoutCondition(userError);
        CommonPage.WaitForElementToBeAvailable(userError);
        Assert.assertEquals("User not found", userError);
        Log.info("Received User Error Message");
    }

    public static void passwordErrorMessage() throws InterruptedException {
        String passError = driver.findElement(By.xpath(".//div[@class='invalid-feedback']")).getText();
        WebElement element = GetElementByXpathWithoutCondition(passError);
        CommonPage.WaitForElementToBeAvailable(passError);
        Assert.assertEquals("Password is required", passError);
        Log.info("Received Password Error Message");
    }

    public static void refreshWebPage() throws InterruptedException {
        driver.navigate().refresh();
        Log.info("Refreshed the Page");
    }

}