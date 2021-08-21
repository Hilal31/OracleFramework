package tests;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public static WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = Driver.getDriver();
    }


    @AfterMethod
    public void tearDown() {Driver.quitDriver();}

}
