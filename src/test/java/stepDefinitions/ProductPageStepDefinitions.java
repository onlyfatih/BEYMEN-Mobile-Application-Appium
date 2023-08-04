package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ProductPage;
import pages.ProfilePage;
import util.DriverFactory;

public class ProductPageStepDefinitions {

    ProductPage productPage = new ProductPage(DriverFactory.getDriver());


    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
        productPage.addToBasket();
        productPage.chooseProductSize();
    }

    @When("Sepet sayfasina gidilir")
    public void sepetSayfasinaGidilir() {
        productPage.goToBasket();
    }
}
