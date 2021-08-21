package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.BaseTest;

import java.sql.Driver;

public class LocatePage extends BaseTest {
    public LocatePage() {
        PageFactory.initElements(driver, this);
    }


    ////body/div[@id='__next']/div[@id='main']/div[@id='search-container']/div[1]/div[2]/button[1]/div[1]/span[1]
    @FindBy(xpath="//*[@id=\"search-container\"]/div/div[2]/button/div/span")
    public WebElement studio;

    @FindBy(xpath = "//*[@id=\"location-search\"]")
    public WebElement searchZipCode;

    //rightArrow-daPRP
    @FindBy(xpath = "//*[@id=\"location-search-cta\"]")
    public WebElement searchArrow;

    ////*[@id="location-1252089"]/a/div[1]/div/a
    @FindBy(xpath = "//*[@id=\"location-1252089\"]/a/div[1]/div/a")
    public WebElement firstTitle;

    ////*[@id="location-1252089"]/a/div[1]/span
    @FindBy(xpath = "//*[@id=\"location-1252089\"]/a/div[1]/span")
    public WebElement distance;

    //    //*[@id="main"]/div[1]/div[2]/div/div[2]/h1
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div[2]/h1")
    public WebElement titleAfterClick;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div[2]/div[2]/div[1]")
    public WebElement businessHours;

    ////*[@id="main"]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]
    @FindBy(xpath = "//*[@id=\"main\"]/div[1]/div[2]/div/div[2]/div[2]/div[2]/div/div[1]")
    public WebElement printHours;
}
