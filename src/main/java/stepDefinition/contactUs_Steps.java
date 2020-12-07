package stepDefinition;

import PageObjectModel.contactUs_Page;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_Steps {

    private WebDriver driver;
    contactUs_Page contactUs_page = new contactUs_Page();
    @Given("^navigate to Website$")
    public void navigate_to_Website() throws Throwable {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^click on contact us button$")
    public void click_on_contact_us_button() throws Throwable {

        contactUs_page.clickContactUsButton();


    }

    @Given("^select Subject Heading$")
    public void select_Subject_Heading() throws Throwable {

contactUs_page.selectFromDropdown();
    }

    @Given("^type Email$")
    public void type_Email() throws Throwable {

        contactUs_page.typeEmail();
    }


    @Given("^type a message$")
    public void type_a_message() throws Throwable {

        contactUs_page.typeMessage();

    }

    @When("^click on send button$")
    public void click_on_send_button() throws Throwable {
        contactUs_page.clickOnSendButton();
    }

    @Then("^verify success message$")
    public void verify_success_message() throws Throwable {
contactUs_page.assertMyMessage();

    }
    @After
    public void driverQuit() throws InterruptedException {

        Thread.sleep(2000);
        Driver.quitDriver();


    }

    @And("^type Order reference \"([^\"]*)\"$")
    public void typeOrderReference(String order) throws Throwable {
        contactUs_page.typeOrderReference(order);
    }
}
