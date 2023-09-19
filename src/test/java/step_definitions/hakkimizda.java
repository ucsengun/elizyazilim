package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import pages.elizyazilim_POM;
import utilities.DriverClass;

public class hakkimizda {

    elizyazilim_POM ey = new elizyazilim_POM();

    private JavascriptExecutor jsExecutor;


    @And("hakkımızda butonuna tıkla.")
    public void hakkımızdaButonunaTıkla() {
        ey.clickMethod(ey.getHakkimizda());
    }

    @Then("sağa kaydırma butonuna tıkla.")
    public void sağaKaydırmaButonunaTıkla() {
        ey.clickMethod(ey.getSagaKaydir());
    }
    

    @Then("sola kaydırma butonuna tıkla.")
    public void solaKaydırmaButonunaTıkla() {
        ey.clickMethod(ey.getSolaKaydir());

    }
}
