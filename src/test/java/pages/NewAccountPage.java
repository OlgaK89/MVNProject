package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewAccountPage {

    //Non-pageFactory style page object class

    public WebElement registerPage = Driver.getDriver().findElement(By.partialLinkText("Register"));
    public WebElement email = Driver.getDriver().findElement(By.id("email"));
    public WebElement password = Driver.getDriver().findElement(By.id("password"));


    //PageFactory style

//    public NewAccountPage() {
//        PageFactory.initElements(Driver.getDriver(), this);
//    }
//        @FindBy (partialLinkText = "Register")
//        public WebElement registerPage;
//
//        @FindBy (id = "email")
//         public WebElement email;
//
//       @FindBy (id = "password")
//       public WebElement password;


}
