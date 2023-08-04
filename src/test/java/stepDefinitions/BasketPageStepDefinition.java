package stepDefinitions;

import io.cucumber.java.en.When;
import pages.BasketPage;
import util.DriverFactory;

public class BasketPageStepDefinition {
    BasketPage basketPage = new BasketPage(DriverFactory.getDriver());

    @When("Urun satin alinir")
    public void urunSatinAlinir() {
        basketPage.buyProduct();
    }

    @When("Yeni gelenler sayfasina donulur")
    public void yeniGelenlerSayfasinaDonulur() {
        basketPage.backToProducts();
    }
}
