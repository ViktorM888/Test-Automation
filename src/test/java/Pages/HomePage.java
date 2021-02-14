package Pages;

import Utils.DriverFactory;
import Utils.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Steps.Steps.GetElementByXpathWithoutCondition;

public class HomePage extends DriverFactory {

    private static String allGalleries_xpath() throws InterruptedException {
        String xpath = "//h1[contains(text(),'All Galleries')]";
        return xpath;
    }

    public static void allGalleriesTitle() throws InterruptedException {
        String xpath = allGalleries_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
    }

    private static String createGallery_xpath() throws InterruptedException {
        String xpath = "//a[contains(text(),'Create Gallery')]";
        return xpath;
    }

    public static void createGallery() throws InterruptedException {
        String xpath = createGallery_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on Create Gallery");
    }

    private static String galleryTitle_xpath() throws InterruptedException {
        String xpath = "//input[@id='title']";
        return xpath;
    }

    public static void galleryTitle(String name) throws InterruptedException {
        String xpath = galleryTitle_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Title for Gallery");
    }

    private static String galleryDescription_xpath() throws InterruptedException {
        String xpath = "//input[@id='description']";
        return xpath;
    }

    public static void galleryDescription(String name) throws InterruptedException {
        String xpath = galleryDescription_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Description for Gallery");
    }

    private static String galleryImage_link() throws InterruptedException {
        String xpath = ".//input[@placeholder='image url']";
        return xpath;
    }

    public static void galleryImage(String link) throws InterruptedException {
        String xpath = galleryImage_link();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(link);
        Log.info("Entered URL of image for Gallery");
    }

    private static String allGalleriesButton_xpath() throws InterruptedException {
        String xpath = "//a[contains(text(),'All Galleries')]";
        return xpath;
    }

    public static void allGalleries() throws InterruptedException {
        String xpath = allGalleriesButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on All Galleries button");
    }

    public static void imageGallery() throws InterruptedException {
        String Title = driver.findElement(By.xpath("//a[contains(text(),'Nope')]")).getText();
        String Author = driver.findElement(By.xpath("//a[contains(text(),'Viktor Test')]")).getText();
        Assert.assertEquals("Nope", Title);
        Assert.assertEquals("Viktor Test", Author);
        Log.info("Checked whether the image is present");
    }

    private static String myGallery_xpath() throws InterruptedException {
        String xpath = "//a[contains(text(),'My Galleries')]";
        return xpath;
    }

    public static void myGallery() throws InterruptedException {
        String xpath = myGallery_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on My Gallery button");
    }

    public static void searchTextField (String name) throws InterruptedException {

        String xpath = ".//input[@placeholder='Search...']";
        driver.findElement(By.xpath(xpath)).sendKeys(name);
        driver.navigate().refresh();
        driver.findElement(By.xpath("//a[contains(text(),'My Galleries')]")).click();
        driver.findElement(By.xpath(xpath)).sendKeys(name);
            Log.info("Entered words into Search bar");
    }

    private static String filterButton_xpath() throws InterruptedException {
        String xpath = "//button[contains(text(),'Filter')]";
        return xpath;
    }

    public static void filterButton() throws InterruptedException {
        String xpath = filterButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Thread.sleep(2000);
        Log.info("Clicked on Filter button");

    }

    public static void noGalleriesFoundMessage() throws InterruptedException {
        String error = driver.findElement(By.xpath(".//h4")).getText();
        WebElement element = GetElementByXpathWithoutCondition(error);
        CommonPage.WaitForElementToBeAvailable(error);
        Assert.assertEquals("No galleries found", error);
        Log.info("No Galleries Found Message");
    }

    private static String logoutButton_xpath() throws InterruptedException {
        String xpath = "//a[contains(text(),'Logout')]";
        return xpath;
    }

    public static void logoutButton() throws InterruptedException {
        String xpath = logoutButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Thread.sleep(2000);
        Log.info("Clicked on Logout button");

    }
}
