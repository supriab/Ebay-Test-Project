import org.openqa.selenium.devtools.v119.overlay.model.HighlightConfig;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends Basic{

    HomePage homePage;

    @BeforeMethod
    void srarting(){
        openBrowser("https://ebay.com");
         homePage = PageFactory.initElements(Basic.driver,HomePage.class);
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    void finishTest(){
        closeBrowser();
    }


    @Test(priority = 1)
    void testMotors() {

        System.out.println(driver.getCurrentUrl());
    }
    @Test(priority = 0)
    void testMotots(){
        homePage.clickMotors();


    }

    @Test(priority = 2)
    void testFashion1(){
        String expectedUrl = "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545";

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test(priority = 4)
    public void testRegistration(){
        boolean actual = homePage.registration();
        boolean expected = true;
        Assert.assertEquals(actual,expected);
    }
    @Test(priority = 2,groups = {"smoke"})
    void testSearch(){
        homePage.clickSearch();
        }

        @Test(priority = 3,groups = {"smoke"})
     void testSearchBox() {
            homePage.clickSearchBox();
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("Kids"));
    }

    @Test
    void searchB() {
        String key = "Books";
        homePage.clickSearchB();
    }

    @Test
    void clickLinks(){
        homePage.clickLinks();
    }
    @Test
    void testAnnouncement() {
        String expectedText = "Announcement";
        String actualText =homePage.textAnnounce();
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    void testAnnouncements() {
        String expectedText = "Announcements";
        String actualText = homePage.textAnnounce();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    void testLink(){
        Assert.assertEquals(homePage.allLink(),469);
        Assert.assertTrue(homePage.allLink()>400);
    }
    @Test
    void termsConditions(){
        homePage.clickTerms();
    }
    @Test
    void testBuyNow() {
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    void clickBuyNow(){
    }
    @Test
    void urlBuyNow(){

      String actualUrl = driver.getCurrentUrl();
      String expectedUrl ="https://www.ebay.com/giftcards";
      Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test
    void clickMotorcycle() {
        System.out.println(driver.getCurrentUrl());

    }
    @Test
    void testOtherVehicles(){
        String currentUrl = driver.getCurrentUrl();


    }





}