package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import pages.CategoryPage;
import pages.DeliveryPage;
import util.DriverFactory;

public class DeliveryPageStepDefinition {

    DeliveryPage deliveryPage = new DeliveryPage(DriverFactory.getDriver());

    @When("Sepet sayfasina donulur.")
    public void sepetSayfasinaDonulur() {
        deliveryPage.backToBasket();
    }
}
