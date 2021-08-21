package tests;

import Page.LocatePage;
import Utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestPage extends BaseTest{

    @Test
    public  void myTest() {

        LocatePage lp = new LocatePage();
      //1) Navigate to WW Studio Finder page  https://www.weightwatchers.com/us/find-a-workshop/
        driver.get("https://www.weightwatchers.com/us/find-a-workshop/");
        //String expectedTitle="Find WW Studios & Meetings Near You | WW USA";
        String actualTitle = driver.getTitle();

       //2) Assert loaded page title contains “Find WW Studios & Meetings Near You | WW USA”

        System.out.println("Actual title: " + actualTitle);
        Assert.assertTrue(actualTitle.contains("Find WW Studios & Meetings Near You | WW USA"));

        //3) Under Find your Workshop, click on Studios
        lp.studio.click();
        BrowserUtils.wait(3);

       // 4) In the search field, search for meetings for zip code: 10011
        lp.searchZipCode.click();
        lp.searchZipCode.sendKeys("10011");
        lp.searchArrow.click();
        BrowserUtils.wait(2);

        //5) Print the title of the first result and the distance (located on the right of location title/name)
        System.out.println(lp.firstTitle.getText()+"           "+ lp.distance.getText());
        BrowserUtils.wait(3);


        //6) Click on the first search result and then verify displayed location name/title matches with the name of the first searched result that was clicked.
        lp.firstTitle.click();
        System.out.println("After clicking title= "+ lp.titleAfterClick.getText());
        BrowserUtils.wait(2);

        assertEquals("WW Studio @ Chelsea", lp.titleAfterClick.getText() );


        //7) Click on Business Hours
        BrowserUtils.wait(2);
        lp.businessHours.click();

        //8) Create a method to print all the business hours for that studio
        List<WebElement> printBusinessHours=driver.findElements(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div"));

        for (WebElement hours:printBusinessHours)
            System.out.println(hours.getText());{

        }





        /*


         */

    }
}
