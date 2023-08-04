package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class NewArrivalsCategoryPage {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);
    By product = MobileBy.xpath("//android.widget.FrameLayout[@index=2 and @resource-id='com.mobisoft.beymen:id/card_view']");

    public NewArrivalsCategoryPage(AppiumDriver driver)  {
        this.driver = driver;
    }
    public void chooseProduct() {
        try {
            driver.findElement(product).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Urun gorunur degil!");
        }
        driver.findElement(product).click();
    }

}
