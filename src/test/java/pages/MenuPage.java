package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import util.BaseMethod;

public class MenuPage extends BaseMethod {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    By myAdressBtn = MobileBy.xpath("//android.widget.Button[@index=2]");

    public MenuPage(AppiumDriver driver)  {
        this.driver = driver;
    }

    public void myAdresses() {
        try {
            driver.findElement(myAdressBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Ana sayfa butonu gorunur degil!");
        }
        driver.findElement(myAdressBtn).click();
    }
}
