package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;


public class elizyazilim_Hakkimizda_POM extends MyMethods {
    public elizyazilim_Hakkimizda_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }
}
