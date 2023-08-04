package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    //@FindBy(xpath = "//android.widget.FrameLayout[@index=0 and @resource-id='com.mobisoft.beymen:id/card_view']")
    //public By product;
    By product = MobileBy.xpath("//android.widget.FrameLayout[@index=0 and @resource-id='com.mobisoft.beymen:id/card_view']");
    By addToBasket = MobileBy.xpath("//android.widget.TextView[@resource-id='com.mobisoft.beymen:id/tvSelectionColour']");
    By productSize = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView[@index='1']/*[@index='3']");
    By goToBasket = MobileBy.xpath("//android.widget.Button[@resource-id='android:id/button1']");

    public ProductPage(AppiumDriver driver)  {
        this.driver = driver;
    }

    public void addToBasket() {
        try {
            driver.findElement(addToBasket).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Sepete eklerken hata olustu");
        }
        driver.findElement(addToBasket).click();
    }

    public void chooseProductSize() {
        try {
            driver.findElement(productSize).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Urun boyutu secerken hata olustu");
        }
        driver.findElement(productSize).click();
    }

    public void goToBasket() {
        try {
            driver.findElement(goToBasket).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Sepete giderken hata olustu");
        }
        driver.findElement(goToBasket).click();
    }


}
