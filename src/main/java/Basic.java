import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Basic {

    static WebDriver driver;


    void openBrowser(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    void closeBrowser() {
        driver.quit();
    }

    public void actions(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


        void allTab () {
            String currentTab = driver.getWindowHandle();
            Set<String> allTabs = driver.getWindowHandles();

            for (String a : allTabs) {
                if (a != currentTab) {
                    driver.switchTo().window(a);
                }

            }

    }

    public void implicitlyWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void explicitlyWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    
    public void category(){
        WebElement category = (WebElement) driver;
        Select select = new Select(category);
        select.selectByIndex(7);

        select.selectByValue("15032");
        select.selectByVisibleText("Baby");
    }

    public static void setDriver(WebDriver driver) {
        Basic.driver = driver;driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame("presentation");
        WebElement signInText = driver.findElement(By.cssSelector("[jsname=\"a9kxte\"]"));

        String message = signInText.getText();

        System.out.println(message);

    }

}
