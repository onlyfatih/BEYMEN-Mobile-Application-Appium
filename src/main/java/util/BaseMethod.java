package util;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;


public class BaseMethod extends DriverFactory {
    WebDriverWait wait;

    final Logger LOG = LogManager.getLogger(BaseMethod.class);

    public BaseMethod() {
    }

    public WebElement presenceElement(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
        public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }

    public void click(By key){
        getDriver().findElement(key).click();  // click --- tıklamayı sağlar.
    }

    public void sendKeys(By key , String text){
        getDriver().findElement(key).sendKeys(text);   //sendKeys --- Text gondermeyi sağlar.
    }

    public By scrollToElementAndClick(String targetText) {
        try {
            String uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + targetText + "\").instance(0))";
            getDriver().findElement(MobileBy.AndroidUIAutomator(uiAutomator)).click();
        } catch (Exception e) {
            // Hata durumlarını ele alın
            e.printStackTrace();
        }
        return null;
    }

    public WebElement checkVisible(By key){
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(key));
        return element;
    }

    public void wait(int time) throws InterruptedException {
        TimeUnit.SECONDS.sleep(time);
    }
}
