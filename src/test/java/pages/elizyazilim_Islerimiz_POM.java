package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class elizyazilim_Islerimiz_POM extends MyMethods {
    public elizyazilim_Islerimiz_POM() {
            PageFactory.initElements(DriverClass.getDriver(), this);
        }


    @FindBy(xpath = "(//a[@class='btn transparent'][contains(text(),'İNCELE')])[1]")
    private WebElement cnmedIncele;
    @FindBy(xpath = "//li[normalize-space()='MENU']")
    private WebElement menuButonu;

    @FindBy(xpath = "//a[normalize-space()='HAKKIMIZDA']")
    private WebElement hakkimizda;

    @FindBy(xpath = "//a[@href='https://www.elizyazilim.com/hizmetlerimiz']")
    private WebElement hizmetlerimiz;

    @FindBy(xpath = "//li[@class='clearfix']//a[@href='https://www.elizyazilim.com/son-projelerimiz']")
    private WebElement islerimiz;
    @FindBy(xpath = "//li[@class='clearfix']//a[@href='https://www.elizyazilim.com/musterilerimiz']")
    private WebElement musterilerimiz;


    public WebElement getCnmedIncele() {
        return cnmedIncele;
    }
    public WebElement getMenuButonu() {
        return menuButonu;
    }

    public WebElement getHakkimizda() {
        return hakkimizda;
    }

    public WebElement getHizmetlerimiz(){
        return hizmetlerimiz;
    }
    public WebElement getIslerimiz(){
        return islerimiz;
    }
}
