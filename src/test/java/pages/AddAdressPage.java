package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import util.BaseMethod;
import util.ConfigReader;

import java.io.IOException;

public class AddAdressPage extends BaseMethod {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);
    protected final String Adres = ConfigReader.readAdressInfo().getProperty("Adres");
    protected final String AdresAciklamasi = ConfigReader.readAdressInfo().getProperty("AdresAciklamasi");

    By adresArea = MobileBy.xpath("//android.widget.EditText[@resource-id='com.mobisoft.beymen:id/addressAddress']");
    By selectCity = MobileBy.xpath("//android.widget.Button[@resource-id='com.mobisoft.beymen:id/citySelectorButton']");
    By selectDistrict = MobileBy.xpath("//android.widget.Button[@resource-id='com.mobisoft.beymen:id/districtSelectorButton']");
    By selectNeighborhood = MobileBy.xpath("//android.widget.Button[@resource-id='com.mobisoft.beymen:id/neighborhoodSelectorButton']");
    By adresDescription = MobileBy.xpath("//android.widget.EditText[@resource-id='com.mobisoft.beymen:id/addressDescription']");
    By selectedCity = MobileBy.xpath("//android.widget.TextView[@text='Ankara']");
    By selectedDistrict = MobileBy.xpath("//android.widget.TextView[@text='Altındağ']");
    By selectedNeighborhood = MobileBy.xpath("//android.widget.TextView[@text='Altınpark']");
    By saveAdress = MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADRESİ KAYDET\")");
    By deleteAdress = MobileBy.xpath("//android.widget.Button[@resource-id='android:id/button1']");

    By billInfo = MobileBy.AndroidUIAutomator("new UiSelector().text(\"FATURA BİLGİLERİNİZ\")");


    public AddAdressPage(AppiumDriver driver) throws IOException {
        this.driver = driver;
    }
    public void addAdress() {
        try {
            driver.findElement(adresArea).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Adres yazılacak alan gorunur degil!");
        }
        driver.findElement(adresArea).sendKeys(Adres);
    }
    public void selectCity() {
        try {
            driver.findElement(selectCity).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Sehir secme butonu gorunur degil!");
        }
        driver.findElement(selectCity).click();
    }
    public void selectedCity() {
        driver.findElement(selectedCity).click();
    }
    public void selectDistrict() {
        try {
            driver.findElement(selectDistrict).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Ilce secme butonu gorunur degil!");
        }
        driver.findElement(selectDistrict).click();
    }
    public void selectedDistrict() {
        driver.findElement(selectedDistrict).click();
    }
    public void selectNeighborhood() {
        try {
            driver.findElement(selectNeighborhood).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Mahalle secme butonu gorunur degil!");
        }
        driver.findElement(selectNeighborhood).click();
    }
    public void selectedNeighborhood() {
        driver.findElement(selectedNeighborhood).click();
    }
    public void addAdressDescription() {
        try {
            driver.findElement(adresDescription).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Adres aciklamasi yazilacak alan gorunur degil!");
        }
        driver.findElement(adresDescription).sendKeys(AdresAciklamasi);
    }

    public void deleteAdress() {
        try {
            driver.findElement(deleteAdress).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Sil butonu gorunur degil!");
        }
        driver.findElement(deleteAdress).click();
    }

    public void saveAdress() {
        String billInfoStr = driver.findElement(saveAdress).getText();
        driver.findElement(scrollToElementAndClick(billInfoStr));
        driver.findElement(saveAdress).click();
    }
}
