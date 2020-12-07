package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login_Steps {

    @Given("^Amazon sitesine git$")
    public void amazon_sitesine_git() throws Throwable {

        System.out.println("Siteye gidildi.");
    }

    @Given("^login butonuna tıkla$")
    public void login_butonuna_tıkla() throws Throwable {
        System.out.println("Login butonuna tıklandı.");

    }

    @Given("^isim gir$")
    public void isim_gir() throws Throwable {
        System.out.println("isim girildi.");

    }

    @Given("^sifre gir$")
    public void sifre_gir() throws Throwable {
        System.out.println("sifre girildi");
    }

    @When("^submit butonuna tıkladıgımda$")
    public void submit_butonuna_tıkladıgımda() throws Throwable {


        System.out.println("Submit butonuna tıklandı");
    }

    @Then("^success mesajini verify et$")
    public void success_mesajini_verify_et() throws Throwable {


        System.out.println("Login işlemi başarıyla tamamlandı... ! ");
    }



}
