package Pages;

import Utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage {

    public static String WaitForElementToBeAvailable(String xpath) throws InterruptedException {
        try {
            WebDriverWait newq = new WebDriverWait(DriverFactory.driver, 2);
            newq.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            Thread.sleep(1000);
            return null;
        }
        catch (Exception e)
        {
            Thread.sleep(1000);
            return "error";
        }
    }
}
