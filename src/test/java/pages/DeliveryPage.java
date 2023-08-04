package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class DeliveryPage {
    AppiumDriver driver;
    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    By backToBasket = MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.mobisoft.beymen:id/llToolbarMenu']");
    public DeliveryPage(AppiumDriver driver)  {
        this.driver = driver;
    }

    public void backToBasket() {
        try {
            driver.findElement(backToBasket).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Geri donme butonu gorunur degil!");
        }
        driver.findElement(backToBasket).click();
    }
}
