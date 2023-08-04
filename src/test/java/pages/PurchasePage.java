package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import util.BaseMethod;
import util.ConfigReader;

import java.io.IOException;

public class PurchasePage extends BaseMethod {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);
    protected final String Adres = ConfigReader.readAdressInfo().getProperty("Adres");

    By verifyAdress = MobileBy.xpath("//android.widget.TextView[@resource-id='com.mobisoft.beymen:id/addressText']");
    public PurchasePage(AppiumDriver driver) throws IOException {
        this.driver = driver;
    }

    public void verifyRegisteredAdressInPurchasePage() {
        String registeredAdress = driver.findElement(verifyAdress).getText().substring(0,35);
        try {
            Assert.assertEquals(registeredAdress, Adres, "Adresler ayni degil.");
            Assert.assertNotNull(registeredAdress, "Adres kismi bos.");
        }
        catch (Exception e) {
            new AssertionError("Adres kontrolunde hata verdi.");
        }
    }
}
