package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.MenuPage;
import util.DriverFactory;

public class MenuPageStepDefinitions {
    MenuPage menuPage = new MenuPage(DriverFactory.getDriver());

    @Given("Adreslerim butonuna tiklanir")
    public void adreslerimButonunaTiklanir() {
        menuPage.myAdresses();
    }
}
