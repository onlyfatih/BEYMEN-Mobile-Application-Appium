package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class CategoryPage {
    AppiumDriver driver;
    private static final Logger LOG = LogManager.getLogger(AddAdressPage.class);

    By menCategory = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView[@index=1]/*[@index=1]");
    By newArrivals = MobileBy.xpath("//androidx.recyclerview.widget.RecyclerView[@index=0]/*[@index=0]");
    By backToCategory = MobileBy.xpath("//android.widget.LinearLayout[@resource-id='com.mobisoft.beymen:id/llToolbarMenu']");

    public CategoryPage(AppiumDriver driver)  {
        this.driver = driver;
    }

    public void clickToMenCategory()
    {
        try {
            driver.findElement(menCategory).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Erkek kategorisi alanı gorunur degil!");
        }
        driver.findElement(menCategory).click();
    }

    public void clickToNewArrivalsCategory()
    {
        try {
            driver.findElement(newArrivals).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Yeni gelenler alanı gorunur degil!");
        }
        driver.findElement(newArrivals).click();
    }

    public void backToCategoryPage() {
        try {
            driver.findElement(backToCategory).isDisplayed();
        }
        catch (Exception e) {
            LOG.info("Geridon butonu gorunur degil!");
        }
        driver.findElement(backToCategory).click();
    }
}
