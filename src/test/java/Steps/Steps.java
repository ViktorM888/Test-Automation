package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static Utils.DriverFactory.driver;


public class Steps {

        public static Boolean isVisible = false;
        private LoginPage loginPage = new LoginPage();

        public static WebElement GetElementByXpathWithoutCondition(String xPath) throws InterruptedException {

                WebElement element = null;
                for (int i = 1; i < 20; i = i + 1)
                        try {

                                element = driver.findElement(By.xpath(xPath));
                                break;
                        } catch (Exception e) {
                                //default:500, put lower number for less waiting time
                                Thread.sleep(500);

                                if (i == 19) {
                                        isVisible = false;
                                        break;
                                }
                        }
                return element;
        }

        public static WebElement GetElementByLinkTextWithoutCondition(String linkText) throws InterruptedException {

                WebElement element = null;
                for (int i = 1; i < 20; i = i + 1)
                        try {

                                element = driver.findElement(By.linkText(linkText));
                                break;
                        } catch (Exception e) {
                                //default:500, put lower number for less waiting time
                                Thread.sleep(500);

                                if (i == 19) {
                                        isVisible = false;
                                        break;
                                }
                        }
                return element;
        }

        @Given("^Web browser is at web page ([^\"]*)$")
        public void iNavigateToTheCorrectPageWebPage(String webpage) throws Throwable {
                LoginPage.webPage();
        }

        @And("^I click on Login button$")
        public void iClickLoginButton() throws Throwable {
                LoginPage.loginButton();
        }

        @And("^I enter the email as ([^\"]*)$")
        public void iEnterTheEmailAsEmail(String userName) throws Throwable {
                LoginPage.email(userName);
        }

        @And("^I enter the password as ([^\"]*)$")
        public void iEnterPasswordAsPassword(String password) throws Throwable {
                LoginPage.password(password);
        }

        @And("^I click on Submit button$")
        public void iClickSubmitButton() throws Throwable {
                LoginPage.submitButton();
        }

        @And("^I click on Logout button$")
        public void iClickLogoutButton() throws Throwable {
                LoginPage.logoutButton();
        }

        @Then("^I should see the main page$")
        public void iShouldSeeTheMainPage() throws Throwable {
                HomePage.dashboardTitle();
        }

        @Then("^I should see the Email error message$")
        public void iShouldSeeTheEmailErrorMessage() throws Throwable {
                LoginPage.emailErrorMessage();
        }

        @Then("^I should see the User not found error message$")
        public void iShouldSeeTheUserNotFoundErrorMessage() throws Throwable {
                LoginPage.userNotFoundErrorMessage();
        }

        @Then("^I should see the Password error message$")
        public void iShouldSeeThePasswordErrorMessage() throws Throwable {
                LoginPage.passwordErrorMessage();
        }

        @Then("^I refresh the page$")
        public void iRefreshThePage() throws Throwable {
                LoginPage.refreshWebPage();
        }

        @Then("^I click on Use Cases Label$")
        public void iClickOnUseCasesLabel() throws Throwable {
                HomePage.useCasesLabel();
        }

        @Then("^I click on Create Use Cases Button$")
        public void iClickOnCreateUseCasesButton() throws Throwable {
                HomePage.createUseCases();
        }

        @Then("^I enter ([^\"]*) as title for new Use Case$")
        public void iEnterTitle(String title) throws Throwable {
                HomePage.titleCase(title);
        }

        @Then("^I enter ([^\"]*) as description for new Use Case$")
        public void iEnterDescription(String desc) throws Throwable {
                HomePage.descCase(desc);
        }

        @Then("^I enter ([^\"]*) as expected result for new Use Case$")
        public void iEnterExpectedResult(String expectedResult) throws Throwable {
                HomePage.expResult(expectedResult);
        }

        @Then("^I click on toggle for automated tests$")
        public void iClickOnAutomatedTests() throws Throwable {
                HomePage.toggleButton();
        }

        @Then("^I enter ([^\"]*) as case steps for new Use Case$")
        public void iEnterCaseSteps(String steps) throws Throwable {
                HomePage.caseSteps(steps);
        }

        @Then("^I click on First Use Case to edit$")
        public void iClickFirstUseCase() throws Throwable {
                HomePage.editFirstUseCase();
        }

        @Then("^I click on Second Use Case to edit$")
        public void iClickSecondUseCase() throws Throwable {
                HomePage.editSecondUseCase();
        }

        @Then("^I click on Third Use Case to edit$")
        public void iClickThirdUseCase() throws Throwable {
                HomePage.editThirdUseCase();
        }

        @Then("^I click on Fourth Use Case to edit$")
        public void iClickFourthUseCase() throws Throwable {
                HomePage.editFourthUseCase();
        }

        @Then("^I input how many letters were in the previous field$")
        public void inputLetters() throws Throwable {
                HomePage.editTitleCase();
                HomePage.editDescription();
                HomePage.editExpectedResult();
                HomePage.editFirstStep();
                HomePage.editSecondStep();
                HomePage.editThirdStep();
                HomePage.editFourthStep();
                HomePage.editFifthStep();

        }







}
