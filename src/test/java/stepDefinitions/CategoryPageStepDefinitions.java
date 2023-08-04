package stepDefinitions;

import io.cucumber.java.en.When;
import pages.BasketPage;
import pages.CategoryPage;
import util.DriverFactory;

public class CategoryPageStepDefinitions {

    CategoryPage categoryPage = new CategoryPage(DriverFactory.getDriver());

    @When("Erkek alanina tiklanir")
    public void erkekAlaninaTiklanir() {
        categoryPage.clickToMenCategory();
    }

    @When("Yeni gelenler kategorisine tiklanir")
    public void yeniGelenlerKategorisineTiklanir() {
        categoryPage.clickToNewArrivalsCategory();
    }

    @When("Kategoriler sayfasina donulur.")
    public void kategorilerSayfasinaDonulur() {
        categoryPage.backToCategoryPage();
    }
}
