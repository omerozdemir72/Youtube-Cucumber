package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUs_Page extends AbstractClass {

    WebDriver driver;

    public contactUs_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;

    public void clickContactUsButton(){
        clickFunction(contactUsButton);
    }

    @FindBy(name = "id_contact")
    private WebElement subjectHeadingDropdown;


    public void selectFromDropdown(){

        selectElementFromDropdown(subjectHeadingDropdown,"Webmaster");
    }


    @FindBy(id = "email")
    private WebElement emailTextArea;

    public void typeEmail(){
        sendKeysFunction(emailTextArea,"omerozdemir123@gmail.com");
    }


    @FindBy(name = "id_order")
    private WebElement order;

    public void typeOrderReference(String orderr){

        sendKeysFunction(order,orderr);
    }

    @FindBy(id = "message")
    private WebElement messageBox;

    public void typeMessage(){

        sendKeysFunction(messageBox,"Ürün kırık geldi. Lütfen bana email olarak dönüş yapın.. Saygılarımla..");

    }

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    public void clickOnSendButton(){

        clickFunction(sendButton);
    }

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public void assertMyMessage(){
        Assertion(successMessage,"Your message has been successfully sent to our team.");



    }

}
