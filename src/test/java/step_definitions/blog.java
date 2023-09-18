package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.elizyazilim_POM;


public class blog {

    elizyazilim_POM ey = new elizyazilim_POM();

    @And("blog butonuna tıkla.")
    public void blogButonunaTıkla() {
        ey.clickMethod(ey.getBlog());
    }

    @And("kurumsal kimlik başlığı altındaki devamını oku butonuna tıkla.")
    public void kurumsalKimlikBaşlığıAltındakiDevamınıOkuButonunaTıkla() {

        ey.clickMethod(ey.getDevaminiOku());
    }

    @Then("kurumsal kimlik makalesinin tamamının açıldığını kontrol et.")
    public void kurumsalKimlikMakalesininTamamınınAçıldığınıKontrolEt() {
        Assert.assertTrue(ey.getKurumsalKimlikTasarimiDogrulama().isDisplayed());
    }
}
