package pages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.BaseMethod;

public class HomePage extends BaseMethod {
    AppiumDriver driver;

    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    //@FindBy(xpath = "//android.widget.Button[@index=1]")
    //public By locationActivation;
    By locationActivation = MobileBy.xpath("//android.widget.Button[@index=1]");

    //@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profilim\"]")
    //public By profileBtn;
    By profileBtn = MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.mobisoft.beymen:id/navigation_profile']");

    //@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Anasayfa\"]")
    //public By homePageBtn;
    By homePageBtn = MobileBy.xpath("//android.widget.FrameLayout[@resource-id='com.mobisoft.beymen:id/navigation_mainpage']");

    //@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Kategoriler\"]")
    //public By categoryBtn;
    By categoryBtn = MobileBy.xpath("//android.widget.FrameLayout[@index=1 and @resource-id='com.mobisoft.beymen:id/navigation_category']");


    public HomePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void locationActive() {
        try {
            driver.findElement(locationActivation).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Konum ayarları bildirimi gorunur degil!");
        }
        click(locationActivation);
    }
    public void clickToProfile()
    {
        try {
            driver.findElement(profileBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Profil butonu gorunur degil!");
        }
        driver.findElement(profileBtn).click();
    }
    public void clickToHomepage()
    {
        try {
            driver.findElement(homePageBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Ana sayfa butonu gorunur degil!");
        }
        driver.findElement(homePageBtn).click();
    }
    public void clickToCategoryBtn()
    {
        try {
            driver.findElement(categoryBtn).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Kategoriler butonu gorunur degil!");
        }
        driver.findElement(categoryBtn).click();
    }
}
