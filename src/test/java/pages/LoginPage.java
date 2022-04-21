package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.PropertyReader;

public class LoginPage {

    //Non-pageFactory style page object class
//    public WebElement email = Driver.getDriver().findElement(By.id("email"));
//    public WebElement password = Driver.getDriver().findElement(By.id("password"));;
//    public WebElement loginButton = Driver.getDriver().findElement(By.partialLinkText("Account"));

//Annotation
    //PageFactory style

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "Login to your")
   public WebElement loginButton;

    @FindBy (id = "email")
    public WebElement email;

    @FindBy (id = "password")
    public WebElement password;



    public void loginWithValidCredentials() {
        email.sendKeys(PropertyReader.getProperty("usr"));
        password.sendKeys(PropertyReader.getProperty("pass"));
        loginButton.click();
    }
}