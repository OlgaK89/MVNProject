package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

import java.time.Duration;

public class TestBase {
   protected WebDriver driver;

//    @BeforeClass(alwaysRun = true)
//    public void setupClass(){
//        WebDriverManager.edgedriver().setup();
//    }


    @BeforeMethod(alwaysRun = true)
    public void setupMethod() {

        driver = Driver.getDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod() {
        Driver.quitDriver();
    }


}
