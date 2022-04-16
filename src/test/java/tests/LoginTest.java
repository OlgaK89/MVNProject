package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;


import utilities.PropertyReader;

public class LoginTest extends TestBase {


    @Test (groups = {"smoke"})
    public void positiveLoginTest() {

        driver.get(PropertyReader.getProperty("url"));

        LoginPage loginPage = new LoginPage();
        loginPage.loginButton.click();
        loginPage.email.sendKeys(PropertyReader.getProperty("usr"));
        loginPage.password.sendKeys(PropertyReader.getProperty("pass"));


    new LoginPage().loginWithValidCredentials();



    }

    }
