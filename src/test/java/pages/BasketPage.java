package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class BasketPage {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);
    By buy = MobileBy.xpath("//android.widget.Button[@resource-id='com.mobisoft.beymen:id/btnPay']");
    By backToProducts = MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.mobisoft.beymen:id/llToolbarMenu']");

    public BasketPage(AppiumDriver driver)  {
        this.driver = driver;
    }

    public void buyProduct() {
        try {
            driver.findElement(buy).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Satin alirken bir hata olustu");
        }
        driver.findElement(buy).click();
    }

    public void backToProducts() {
        try {
            driver.findElement(backToProducts).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Geri don butonu gorunur degil!");
        }
        driver.findElement(backToProducts).click();
    }

}
