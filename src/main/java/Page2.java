import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Page2 extends Basic{

    @FindBy(css = "//a[@data-sp=\"m570.l174317\"]")
    WebElement giftCards;
    void clickGiftCards(){
        giftCards.click();
    }
    @FindBy(css = "//a[@data-sp=\"m570.l174317\"]//a")
    List<WebElement> pageLinks;
    public Integer allPageLinks(){
        return pageLinks.size();
    }
    @FindBy(css = "[[class=\"page-nav__title\"]")
    WebElement cardText;
    String text(){
        String card = cardText.getText();
        return card;

    }
    @FindBy(css = "[class=\"feature-cards__title\"]")
    WebElement giftText;
    String textGift(){
        String gift = giftText.getText();
        return gift;
    }


    @FindBy(css = "[alt=\"eBay Home\"]")
    WebElement ebayLogo;
    void clickEbayLogo(){
        ebayLogo.click();
    }
    @FindBy(css = "[data-sp=\"m570.l2633\"]")
    WebElement cartBtn;
    public String setCartBtn(){
        cartBtn.click();
        return driver.getCurrentUrl();
    }

   @FindBy(css = "[class=\"gh-eb-li gh-layer rt\"]")
    WebElement bellButton;
    void clickBellButton(){
        bellButton.click();
    }
    @FindBy(xpath = "//li[@class=\"gh-eb-li gh-dd rt\"]")
    WebElement myeBay;
    String testMyeBay(){
        return myeBay.getText();
    }
    @FindBy(css = "title=\"Advanced Search\"")
    WebElement advanced;
    void clickAdvanced(){
        advanced.click();
    }




}