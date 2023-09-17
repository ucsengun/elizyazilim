package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.elizyazilim_POM;
import utilities.DriverClass;


public class hizmetlerimiz {

    elizyazilim_POM ey = new elizyazilim_POM();

    @Given("eliz yazılım websitesine eriş.")
    public void elizYazılımWebsitesineEriş() {
        DriverClass.getDriver().get("https://elizyazilim.com/");
    }

    @When("menüye tıkla.")
    public void menüyeTıkla() {
        ey.clickMethod(ey.getMenuButonu());
    }

    @And("hizmetlerimiz butonuna tıkla.")
    public void hizmetlerimizButonunaTıkla() {
        ey.clickMethod(ey.getHizmetlerimiz());
    }

    @And("web sunucu hizmetlerine tıkla.")
    public void webSunucuHizmetlerineTıkla() {
        ey.clickMethod(ey.getWebSunucuHizmetleri());
    }

    @And("bakım destek hizmetlerine tıkla.")
    public void bakımDestekHizmetlerineTıkla() {
        ey.clickMethod(ey.getBakimDestekHizmetleria());
    }

    @And("dijital pazarlama hizmetlerine tıkla.")
    public void dijitalPazarlamaHizmetlerineTıkla() {
        ey.clickMethod(ey.getDijitalPazarlamaHizmetleri());
    }

    @And("grafik tasarım hizmetlerine tıkla.")
    public void grafikTasarımHizmetlerineTıkla() {
        ey.clickMethod(ey.getGrafikTasarimHizmetleri());
    }

    @And("web yazılım hizmetlerine tıkla.")
    public void webYazılımHizmetlerineTıkla() {
        ey.clickMethod(ey.getWebYazilimHizmetleri());
    }

    @And("web tasarım hizmetlerine tıkla.")
    public void webTasarımHizmetlerineTıkla() {
        ey.clickMethod(ey.getWebTasarimHizmetleri());
    }

    @Then("açılan sayfanın web sunucu hizmetlerine ait olduğunu kontrol et.")
    public void açılanSayfanınWebSunucuHizmetlerineAitOlduğunuKontrolEt() {
       // ey.
    }

    @Then("açılan sayfanın bakım destek hizmetlerine ait olduğunu kontrol et.")
    public void açılanSayfanınBakımDestekHizmetlerineAitOlduğunuKontrolEt() {
        
    }

    @Then("açılan sayfanın dijital pazarlama hizmetlerine ait olduğunu kontrol et.")
    public void açılanSayfanınDijitalPazarlamaHizmetlerineAitOlduğunuKontrolEt() {
        
    }

    @Then("açılan sayfanın grafik tasarım hizmetlerine ait olduğunu kontrol et.")
    public void açılanSayfanınGrafikTasarımHizmetlerineAitOlduğunuKontrolEt() {
        
    }

    @Then("açılan sayfanın web yazılım hizmetlerine ait olduğunu kontrol et.")
    public void açılanSayfanınWebYazılımHizmetlerineAitOlduğunuKontrolEt() {
        
    }

    @Then("açılan sayfanın web tasarım hizmetlerine ait olduğunu kontrol et.")
    public void açılanSayfanınWebTasarımHizmetlerineAitOlduğunuKontrolEt() {
    }
}
