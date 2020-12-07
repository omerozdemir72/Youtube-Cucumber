package stepDefinition;

import PageObjectModel.register_Page;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {


    register_Page register_page = new register_Page();
    private WebDriver driver;
    @Given("^Navigate to Website$")
    public void navigateToWebsite() {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    @And("^click Sign in button$")
    public void clickSignInButton() {


        register_page.clickOnSignInButton();
    }

    @And("^type email \"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {

        register_page.typeEmail(email);
    }

    @And("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {


        register_page.clickOnSubmitButton();

    }

    @And("^choose title$")
    public void chooseTitle() {
    }

    @And("^type firstname \"([^\"]*)\" and lastname \"([^\"]*)\"$")
    public void typeFirstnameAndLastname(String firstname, String lastname) throws Throwable {
        register_page.typeFirstnameAndLastName(firstname,lastname);
    }

    @And("^type password \"([^\"]*)\"$")
    public void typePassword(String password) throws Throwable {
register_page.typePassword(password);

    }

    @And("^type Company \"([^\"]*)\"$")
    public void typeCompany(String company) throws Throwable {

        register_page.typeCompany(company);
    }


    @And("^type address \"([^\"]*)\"$")
    public void typeAddress(String address) throws Throwable {

        register_page.typeAdress(address);
    }

    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000);

        Driver.getDriver();
    }




}
