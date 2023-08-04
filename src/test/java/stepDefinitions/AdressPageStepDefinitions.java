package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AdressPage;
import util.DriverFactory;

public class AdressPageStepDefinitions {
    AdressPage adressPage = new AdressPage(DriverFactory.getDriver());

    @Given("Yeni adres ekle butonuna tiklanir")
    public void yeniAdresEkleButonunaTiklanir() {
        adressPage.addNewAdress();
    }

    @Given("Menu sayfasina gidilir")
    public void menuSayfasinaGidilir() {
        adressPage.backToMenu();
    }

    @When("Adres Duzenle butonuna tiklanir")
    public void adresDuzenleButonunaTiklanir() {
        adressPage.clickToEditAdress();
    }

}
