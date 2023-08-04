package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;

import util.DriverFactory;
public class HomePageStepDefinitions {
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @When("Konum etkinlestirilir")
    public void konumEtkinlestirilir() {
        homePage.locationActive();
    }

    @When("Profilim butonuna tiklanir")
    public void profilimButonunaTiklanir() {
        homePage.clickToProfile();
    }

    @Given("Hesaba giris yapilir")
    public void hesabaGirisYapilir() {
        homePage.locationActive();
        homePage.clickToProfile();    }


    @Given("Ana sayfaya gidilir")
    public void anaSayfayaGidilir() {
        homePage.clickToHomepage();
    }

    @When("Kategoriler butonuna tiklanir")
    public void kategorilerButonunaTiklanir() {
        homePage.clickToCategoryBtn();
    }
}
