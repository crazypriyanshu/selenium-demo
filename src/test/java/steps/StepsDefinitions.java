package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pdas.pom.HomePage;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class StepsDefinitions {
    WebDriver webDriver;
    HomePage homePage;
    private final String homePageUrl = "https://automationpanda.com/";

    Logger log = Logger.getLogger(StepsDefinitions.class.getName());
    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
        webDriver = new ChromeDriver();
        webDriver.get(homePageUrl);
        log.info("Navigated to main home page");
        homePage = new HomePage(webDriver);
    }


    @Given("I click on the page anywhere")
    public void i_click_on_the_page_anywhere() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnSearch();
    }

    @Then("I should still see the header")
    public void i_should_still_see_the_header() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        homePage.iShouldSeeHeader();
    }
}
