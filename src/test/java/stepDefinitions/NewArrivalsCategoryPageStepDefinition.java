package stepDefinitions;

import io.cucumber.java.en.When;
import pages.NewArrivalsCategoryPage;
import pages.ProductPage;
import util.DriverFactory;


public class NewArrivalsCategoryPageStepDefinition {

    NewArrivalsCategoryPage newArrivalsCategoryPage = new NewArrivalsCategoryPage(DriverFactory.getDriver());

    @When("Urun secilir")
    public void urunSecilir() {
        newArrivalsCategoryPage.chooseProduct();
    }
}
