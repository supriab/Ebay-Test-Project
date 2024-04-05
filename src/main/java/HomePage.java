import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends Basic {


    @FindBy(xpath = "//input[@type=\"submit\"]")
    WebElement motors;

    void clickMotors() {
        motors.click();
    }

    void moveToMotors() {
        Actions actions = new Actions(driver);
        actions.moveToElement(motors);
    }

    @FindBy(xpath = "//li[@class=\"gf-li\"]")
    WebElement registration;
    public boolean registration() {
        if (registration.isDisplayed()&& registration.isEnabled()){
            return true;
        }else {
            return false;
        }
    }

    @FindBy(xpath = "//input[@class=\"btn btn-prim gh-spr\"]")
    WebElement search;
    void clickSearch(){
        search.click();
    }

    @FindBy(xpath = "//input[@class=\"gh-tb ui-autocomplete-input\"]")
    WebElement searchBox;
    void clickSearchBox(){

        searchBox.sendKeys("Kids", Keys.ENTER);
    }

    @FindBy(xpath = "//input[@class=\"gh-tb ui-autocomplete-input\"]")
    WebElement searchB;
    void clickSearchB(){
        searchB.sendKeys("Books",Keys.ENTER);
    }

    @FindBy(xpath = "/a[@class=\"thrd\"]")
    List<WebElement> links;
    void clickLinks(){
        for (WebElement link:links){
            System.out.println(link.getText());
        }
    }

    @FindBy(xpath = "//a[@data-sp=\"m571.l2913\"]")
    WebElement announcement;
    String textAnnounce(){
      return announcement.getText();
    }

 @FindBy(xpath = "//a[@data-sp=\"m571.l2913\"]")
 WebElement announcements;
    String textAnnounces(){
        return announcements.getText();
    }

    @FindBy(css = "//a")
    List<WebElement> link;
    int allLink(){
      return link.size();
    }
    @FindBy(css = "[class=\"page-nav__link btn is-blue\"]")
    WebElement buyNow;

    void clickTerms(){
        buyNow.click();
    }
    @FindBy(css = "[alt=\"Motorcycles\"]")
    WebElement motorcycle;
    void clickMotorcycle(){
        motorcycle.click();
    }
    @FindBy(css = "[alt=\"Other Vehicles & Trailers\"]")
    WebElement otherVehicles;
    void clickOtherVehicles(){
        otherVehicles.click();
    }

}