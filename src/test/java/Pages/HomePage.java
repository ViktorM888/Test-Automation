package Pages;

import Utils.DriverFactory;
import Utils.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Steps.Steps.GetElementByLinkTextWithoutCondition;
import static Steps.Steps.GetElementByXpathWithoutCondition;

public class HomePage extends DriverFactory {

    private static String dashboard_xpath() throws InterruptedException {
        String xpath = "//b[contains(text(),'Dashboard')]";
        return xpath;
    }

    public static void dashboardTitle() throws InterruptedException {
        String xpath = dashboard_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
    }

    private static String useCases_xpath() throws InterruptedException {
        String xpath = "//*[contains(text(),'Use Cases')]";
        return xpath;
    }

    public static void useCasesLabel() throws InterruptedException {
        String xpath = useCases_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
    }

    private static String createUseCases_linkText() throws InterruptedException {
        String linkText = "CREATE USE CASE";
        return linkText;
    }

    public static void createUseCases() throws InterruptedException {
        String linkText = createUseCases_linkText();
        WebElement element = GetElementByLinkTextWithoutCondition(linkText);
        CommonPage.WaitForElementToBeAvailable(linkText);
        element.click();
    }

    private static String titleUseCase_xpath() throws InterruptedException {
        String xpath = "//*[@placeholder='* Title']";
        return xpath;
    }

    private static String editFirstStep_xpath() throws InterruptedException {
        String xpath = ".//input[@placeholder='* Use case step 1']";
        return xpath;
    }

    private static String editSecondStep_xpath() throws InterruptedException {
        String xpath = ".//input[@placeholder='* Use case step 2']";
        return xpath;
    }

    private static String editThirdStep_xpath() throws InterruptedException {
        String xpath = ".//input[@placeholder='* Use case step 3']";
        return xpath;
    }

    private static String editFourthStep_xpath() throws InterruptedException {
        String xpath = ".//input[@placeholder='* Use case step 4']";
        return xpath;
    }

    private static String editFifthStep_xpath() throws InterruptedException {
        String xpath = ".//input[@placeholder='* Use case step 5']";
        return xpath;
    }

    public static void titleCase(String name) throws InterruptedException {
        String xpath = titleUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Title");
    }

    private static String descriptionUseCase_xpath() throws InterruptedException {
        String xpath = "//*[@placeholder='Description']";
        return xpath;
    }

    public static void descCase(String name) throws InterruptedException {
        String xpath = descriptionUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Description");
    }

    private static String expResultUseCase_xpath() throws InterruptedException {
        String xpath = "//*[@placeholder='* Expected Result']";
        return xpath;
    }

    public static void expResult(String name) throws InterruptedException {
        String xpath = expResultUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Expected Result");
    }

    private static String toggleButton_xpath() throws InterruptedException {
        String xpath = ".//label[contains(text(),'Toggle')]";
        return xpath;
    }

    public static void toggleButton() throws InterruptedException {
        String xpath = toggleButton_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Clicked on Toggle for automated test");
    }

    private static String caseStepsUseCase_xpath() throws InterruptedException {
        String xpath = "//input[@id='stepId']";
        return xpath;
    }

    public static void caseSteps(String name) throws InterruptedException {
        String xpath = caseStepsUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.sendKeys(name);
        Log.info("Entered Case Steps");
    }

    private static String editFirstUseCase_xpath() throws InterruptedException {
        String xpath = ".//a[@class='list-group-item list-group-item-action'][1]";
        return xpath;
    }

    public static void editFirstUseCase() throws InterruptedException {
        String xpath = editFirstUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Edit First Use Case");
    }

    private static String editSecondUseCase_xpath() throws InterruptedException {
        String xpath = ".//a[@class='list-group-item list-group-item-action'][2]";
        return xpath;
    }

    public static void editSecondUseCase() throws InterruptedException {
        String xpath = editSecondUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Edit Second Use Case");
    }

    private static String editThirdUseCase_xpath() throws InterruptedException {
        String xpath = ".//a[@class='list-group-item list-group-item-action'][3]";
        return xpath;
    }

    public static void editThirdUseCase() throws InterruptedException {
        String xpath = editThirdUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Edit Third Use Case");
    }

    private static String editFourthUseCase_xpath() throws InterruptedException {
        String xpath = ".//a[@class='list-group-item list-group-item-action'][4]";
        return xpath;
    }

    public static void editFourthUseCase() throws InterruptedException {
        String xpath = editFourthUseCase_xpath();
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        CommonPage.WaitForElementToBeAvailable(xpath);
        element.click();
        Log.info("Edit Fourth Use Case");
    }


    public static void editTitleCase() throws InterruptedException {
        String xpath = titleUseCase_xpath();
        String letters = driver.findElement(By.xpath(titleUseCase_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Title with number of characters");
    }

    public static void editDescription() throws InterruptedException {
        String xpath = descriptionUseCase_xpath();
        String letters = driver.findElement(By.xpath(descriptionUseCase_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Description with number of characters");
    }
    public static void editExpectedResult() throws InterruptedException {
        String xpath = expResultUseCase_xpath();
        String letters = driver.findElement(By.xpath(expResultUseCase_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Expected Result with number of characters");
    }

    public static void editFirstStep() throws InterruptedException {
        String xpath = editFirstStep_xpath();
        String letters = driver.findElement(By.xpath(editFirstStep_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited First Step with number of characters");
    }

    public static void editSecondStep() throws InterruptedException {
        String xpath = editSecondStep_xpath();
        String letters = driver.findElement(By.xpath(editSecondStep_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Second Step with number of characters");
    }

    public static void editThirdStep() throws InterruptedException {
        String xpath = editThirdStep_xpath();
        String letters = driver.findElement(By.xpath(editThirdStep_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Third Step with number of characters");
    }

    public static void editFourthStep() throws InterruptedException {
        String xpath = editFourthStep_xpath();
        String letters = driver.findElement(By.xpath(editFourthStep_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Fourth Step with number of characters");
    }

    public static void editFifthStep() throws InterruptedException {
        String xpath = editFifthStep_xpath();
        String letters = driver.findElement(By.xpath(editFifthStep_xpath())).getAttribute("value");
        WebElement element = GetElementByXpathWithoutCondition(xpath);
        int numberOfChar = letters.length();
        element.clear();
        element.sendKeys("The field previously had " + numberOfChar + " characters");
        Log.info("Edited Fifth Step with number of characters");
    }

}
