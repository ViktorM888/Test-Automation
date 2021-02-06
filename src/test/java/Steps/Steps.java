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
                Thread.sleep(2000);
        }

        @Then("^I should see the main page$")
        public void iShouldSeeTheMainPage() throws Throwable {
                HomePage.allGalleriesTitle();
        }

        @Then("^I should see the error message$")
        public void iShouldSeeTheErrorMessage() throws Throwable {
                LoginPage.errorMessage();
        }

        @Then("^I refresh the page$")
        public void iRefreshThePage() throws Throwable {
                LoginPage.refreshWebPage();
        }

        @Then("^I click on Create Gallery$")
        public void iClickCreateGallery() throws Throwable {
                HomePage.createGallery();
        }

        @And("^I enter title ([^\"]*) for the Gallery$")
        public void iEnterTitleForGallery(String name) throws Throwable {
                HomePage.galleryTitle(name);
        }

        @And("^I enter description ([^\"]*) for the Gallery$")
        public void iEnterDescriptionForGallery(String name) throws Throwable {
                HomePage.galleryDescription(name);
        }

        @And("^I enter URL ([^\"]*) of image for the Gallery$")
        public void iEnterURLForGallery(String link) throws Throwable {
                HomePage.galleryImage(link);
        }

        @And("^I click on All Galleries$")
        public void iClickOnAllGalleries() throws Throwable {
                HomePage.allGalleries();
        }

        @And("^image is shown in gallery$")
        public void imageIsShownInGallery() throws Throwable {
                HomePage.imageGallery();
        }

        @And("^I click on My Galleries$")
        public void iClickOnMyGalleries() throws Throwable {
                HomePage.myGallery();
        }

        @And("^I enter into Search field ([^\"]*) for my gallery$")
        public void iEnterSearchForGallery(String name) throws Throwable {
                HomePage.searchTextField(name);
        }

        @And("^I click on Filter button$")
        public void iClickOnFilter() throws Throwable {
                HomePage.filterButton();
        }

        @And("^I click on Logout button$")
        public void iClickOnLogout() throws Throwable {
                HomePage.logoutButton();
        }

}
