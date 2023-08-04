package stepDefinitions;

import io.cucumber.java.en.When;
import pages.BasketPage;
import pages.PurchasePage;
import util.DriverFactory;

import java.io.IOException;

public class PurchasePageStepDefinitions {
    PurchasePage purchasePage = new PurchasePage(DriverFactory.getDriver());

    public PurchasePageStepDefinitions() throws IOException {
    }

    @When("Satin alma sayfasinda adres verify edilir")
    public void satinAlmaSayfasindaAdresVerifyEdilir() {
        purchasePage.verifyRegisteredAdressInPurchasePage();
    }
}
