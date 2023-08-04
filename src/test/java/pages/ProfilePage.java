package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import util.BaseMethod;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import util.ConfigReader;

import java.io.IOException;

public class ProfilePage extends BaseMethod{
    AppiumDriver driver;
    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    protected final String Eposta = ConfigReader.readaAccountInfo().getProperty("Eposta");
    protected final String Sifre = ConfigReader.readaAccountInfo().getProperty("Sifre");


    //@FindBy(xpath = "//android.widget.Button[@resource-id='com.mobisoft.beymen:id/btnLogin']")
    //public By logInBtn;
    By logInBtn = MobileBy.xpath("//android.widget.Button[@resource-id='com.mobisoft.beymen:id/btnLogin']");

    //@FindBy(xpath = "//android.widget.EditText[@resource-id='com.mobisoft.beymen:id/emailText']")
    //public By emailArea;
    By emailArea = MobileBy.xpath("//android.widget.EditText[@resource-id='com.mobisoft.beymen:id/emailText']");

    //@FindBy(xpath = "//android.widget.EditText[@resource-id='com.mobisoft.beymen:id/passwordText']")
    //public By passwordArea;
    By passwordArea = MobileBy.xpath("//android.widget.EditText[@resource-id='com.mobisoft.beymen:id/passwordText']");

    //@FindBy(xpath = "//android.widget.Button[@resource-id='com.mobisoft.beymen:id/loginButton']")
    //public By logInBtnToAccount;
    By logInBtnToAccount = MobileBy.xpath("//android.widget.Button[@resource-id='com.mobisoft.beymen:id/loginButton']");

    //@FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.mobisoft.beymen:id/rl_profile_user_info']")
    //public By verifyEmail;
    By verifyEmail = MobileBy.xpath("//android.widget.TextView[@resource-id='com.mobisoft.beymen:id/tvProfileEmail']");

    //@FindBy(xpath = "//android.widget.TextView[@resource-id='com.mobisoft.beymen:id/addressText']")
    //public By verifyAdress;
    By verifyAdress = MobileBy.xpath("//android.widget.TextView[@resource-id='com.mobisoft.beymen:id/addressText']");
    public ProfilePage(AppiumDriver driver) throws IOException {
        this.driver = driver;
    }

    public void logInBeymen() {
        try {
            driver.findElement(logInBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Giris yap butonu gorunur degil!");
        }
        driver.findElement(logInBtn).click();
    }

    public void emailArea() {
        try {
            driver.findElement(emailArea).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Eposta yazma alani gorunur degil!");
        }
        driver.findElement(emailArea).sendKeys(Eposta);
    }

    public void PasswordArea() {
        try {
            driver.findElement(passwordArea).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Sifre yazma alani gorunur degil!");
        }
        driver.findElement(passwordArea).sendKeys(Sifre);
    }

    public void LogInBtnToAccount() {
        try {
            driver.findElement(logInBtnToAccount).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Giris yap butonu gorunur degil!");
        }
        driver.findElement(logInBtnToAccount).click();
    }

    public void verifyAcoount() {
        String emailProfilePage = driver.findElement(verifyEmail).getText();
        try {
            Assert.assertEquals(emailProfilePage, Eposta, "Girilen hesap dogru degil.");
        }
        catch (Exception e) {
            new AssertionError("Email adresleri uyusmuyor.");
        }
    }

    public void verifyRegisteredAdress() {
        String registeredAdress = driver.findElement(verifyAdress).getText();
        try {
            Assert.assertNotNull(registeredAdress, "Adres kismi bos.");
        }
        catch (Exception e) {
            new AssertionError("Adres kontrolunde hata verdi.");
        }
    }
}
