package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewAccountPage;
import utilities.PropertyReader;

public class CreateAccountTest extends TestBase {

    @Test(groups = {"smoke"})

    public void negativeLoginTest() {
        driver.get(PropertyReader.getProperty("url"));

        NewAccountPage newAcc = new NewAccountPage();
        newAcc.registerPage.click();
        newAcc.email.sendKeys(PropertyReader.getProperty("usr"));
        newAcc.password.sendKeys(PropertyReader.getProperty("pass"));

        Assert.assertFalse(driver.getPageSource().contains("This email already belongs to an account. "));




    }


}