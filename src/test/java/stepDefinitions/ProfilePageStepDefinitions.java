package stepDefinitions;

import io.cucumber.java.en.When;
import pages.ProfilePage;
import util.DriverFactory;

import java.io.IOException;

public class ProfilePageStepDefinitions {
    ProfilePage profilePage = new ProfilePage(DriverFactory.getDriver());

    public ProfilePageStepDefinitions() throws IOException {
    }

    @When("Uye ol butonuna tiklanir")
    public void uyeOlButonunaTiklanir() {
        profilePage.logInBeymen();
    }
    @When("Eposta adresi yazilir")
    public void epostaAdresiYazilir() { profilePage.emailArea();
    }

    @When("Sifre yazilir")
    public void sifreYazilir() { profilePage.PasswordArea();
    }

    @When("Giris yap butonuna tiklanir.")
    public void girisYapButonunaTiklanir() throws InterruptedException {
        profilePage.LogInBtnToAccount();

    }

    @When("Dogru email ile doğru hesaba girdigi verify edilir.")
    public void dogruEmailIleDoğruHesabaGirdigiVerifyEdilir() {
        profilePage.verifyAcoount();
    }


    @When("Adres kontrol edilir.")
    public void adresKontrolEdilir() {
        profilePage.verifyRegisteredAdress();
    }

}
