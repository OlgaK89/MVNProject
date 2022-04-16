package tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import utilities.PropertyReader;

public class CreateAccountTest extends TestBase {

    @Test(groups = {"smoke"})

    public void negativeLoginTest() {
        driver.get(PropertyReader.getProperty("url"));

        driver.findElement(By.partialLinkText("Register")).click();
        driver.findElement(By.name("Email")).sendKeys(PropertyReader.getProperty("usr"));
        driver.findElement(By.name("Password")).sendKeys(PropertyReader.getProperty("pass"));

//        NewAccountPage newAcc = new NewAccountPage();
//        newAcc.registerPage.click();
//        newAcc.email.sendKeys(PropertyReader.getProperty("usr"));
//        newAcc.password.sendKeys(PropertyReader.getProperty("pass"));

        Assert.assertTrue(driver.getPageSource().contains("This email already belongs to an account. "));




    }


}