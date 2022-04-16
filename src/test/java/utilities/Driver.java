package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {
    } // to prevent creating objects

    public static WebDriver getDriver() {
        String browser = PropertyReader.getProperty("browser").toLowerCase();
        //String browser = System.getProperty("browser");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}