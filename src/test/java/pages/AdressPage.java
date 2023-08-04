package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import util.BaseMethod;

public class AdressPage extends BaseMethod {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    By addNewAdressBtn = MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.mobisoft.beymen:id/llAddAddress']");
    By backToMenu = MobileBy.xpath("//android.widget.ImageView[@resource-id='com.mobisoft.beymen:id/ivToolbarBack']");
    By clickToEditAdress = MobileBy.xpath("//android.widget.TextView[@resource-id='com.mobisoft.beymen:id/updateButton']");

    public AdressPage(AppiumDriver driver)  {
        this.driver = driver;
    }
    public void addNewAdress() {
        try {
            driver.findElement(addNewAdressBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Yeni adres ekle butonu gorunur degil!");
        }
        driver.findElement(addNewAdressBtn).click();
    }
    public void backToMenu() {
        driver.findElement(backToMenu).click();
    }

    public void clickToEditAdress() {
        try {
            driver.findElement(clickToEditAdress).isDisplayed();
        }
        catch (Exception e) {
                LOG.info("Duzenle butonu gorunur degil!");
        }
        driver.findElement(clickToEditAdress).click();
    }
}
