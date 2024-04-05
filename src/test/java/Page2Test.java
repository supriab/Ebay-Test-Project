import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Page2Test extends Basic {
    Page2 page2;

    @BeforeMethod
    void starting() {
        openBrowser("https://www.ebay.com/giftcards");
        PageFactory.initElements(Basic.driver, Page2.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
    @AfterMethod
    void close(){
        closeBrowser();
    }

    @Test
    void testGiftCards() {
        System.out.println("display the page");
    }

    @Test
    void testGiftcards() {
        System.out.println(driver.getCurrentUrl());
    }
    @Test
    void testText(){
        String expected = "eBay eGift Cards";
        String actual = page2.text();
        Assert.assertEquals(actual,expected);
    }
    @Test
    void testGift(){
        String expected = "Redeeming your eBay eGift Card";
        String actual = page2.text();
        Assert.assertEquals(actual,expected);
    }

    @Test
    void GiftCards() {
        String expectedUrl = "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545";

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void pageLinks() {
        Integer actual = page2.allPageLinks();
        Assert.assertTrue(actual > 144);
    }


    @Test
    void ebayLogo() {
        page2.clickEbayLogo();
    }

    @Test
    public void testCartBtn() {
        String actual = page2.setCartBtn();
        String expected = "https://cart.payments.ebay.com/";
        Assert.assertTrue(actual.contains(expected));
    }
    @Test(enabled = true)
    void testBellButton(){
        page2.clickBellButton();
    }

    @Test
    void testMyeBay() {
        String expectedText = "MyeBay";
        String actualText = page2.testMyeBay();
        Assert.assertEquals(actualText, expectedText);
    }
    @Test
    void Advanced() {
        System.out.println("page2 = " + page2);
    }
    @Test
    public void  advanced(){
        page2.clickAdvanced();
    }

    @Test
    void testBuyNow() {
        System.out.println(driver.getCurrentUrl());
    }



}