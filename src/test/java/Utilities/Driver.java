package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        try {
            if (driver == null) {
                WebDriverManager.chromedriver().setup();
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setJavascriptEnabled(true);
                ChromeOptions opt = new ChromeOptions();
                //            opt.addArguments("--headless");
                driver = new ChromeDriver(opt);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return driver;

    }


    public static void quitDriver() {
        try {
            if (driver != null) {
                driver.quit();
                driver = null;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void killAllBrowsers() throws IOException {
        //TODO due to config issue this is removed
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        //        Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");

    }
}
