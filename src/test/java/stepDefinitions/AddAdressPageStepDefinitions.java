package stepDefinitions;

import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.AddAdressPage;
import util.BaseMethod;
import util.DriverFactory;

import java.io.IOException;

public class AddAdressPageStepDefinitions extends BaseMethod {

    AddAdressPage addAdressPage = new AddAdressPage(DriverFactory.getDriver());
    By saveAdress = MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADRESİ KAYDET\")");

    public AddAdressPageStepDefinitions() throws IOException {
    }

    @Given("Adres bilgileri girilir")
    public void adresBilgileriGirilir() {
        addAdressPage.addAdress();
        addAdressPage.selectCity();
        addAdressPage.selectedCity();
        addAdressPage.selectDistrict();
        addAdressPage.selectedDistrict();
        addAdressPage.selectNeighborhood();
        addAdressPage.selectedNeighborhood();
        addAdressPage.addAdressDescription();
        //addAdressPage.saveAdress();
        addAdressPage.scrollToElementAndClick("ADRESİ KAYDET");
    }

    @When("Eklenen adres silinir.")
    public void eklenenAdresSilinir() {
        addAdressPage.scrollToElementAndClick("ADRESİ SİL");
        addAdressPage.deleteAdress();
    }
}
