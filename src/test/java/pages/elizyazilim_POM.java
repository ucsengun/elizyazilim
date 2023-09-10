package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;


    public class elizyazilim_POM extends MyMethods {
        public elizyazilim_POM() {
            PageFactory.initElements(DriverClass.getDriver(), this);
        }

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

        @FindBy(css = "#ctl05_rptQuestions_tbQuestion1_4")
        private WebElement mesajiniz;

        @FindBy(xpath = "#ctl05_txtCaptha")
        private WebElement resimDogrulama;

        @FindBy(xpath = "//a[@title='Hemen Kayıt Ol']")
        private WebElement kayitOlButonu;

        @FindBy(xpath = "//button[@type='submit']")
        private WebElement kayitOlSayfasiDogrulama;

        @FindBy(xpath = "//a[@title='Ücretsiz, E-Mağazanı Aç']")
        private WebElement ucretsizEmagazaniAc;

        @FindBy(xpath = "//a[@title='Ücretsiz, Fiyat Teklifi Hazırla']")
        private WebElement ucretsizFiyatTeklifi;

        @FindBy(xpath = "//b[normalize-space()='Hemen Ücretsiz']")
        private WebElement ucretsizEmagazaniAcDogrulama;
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

        public WebElement getMusterilerimiz(){
            return musterilerimiz;
        }

        public WebElement getMesajiniz() {
            return mesajiniz;
        }

        public WebElement getResimDogrulama() {
            return resimDogrulama;
        }

        public WebElement getKayitOlButonu(){
            return kayitOlButonu;
        }

        public WebElement getKayitOlSayfasiDogrulama(){
            return kayitOlSayfasiDogrulama;
        }

        public WebElement getUcretsizEmagazaniAc(){
            return ucretsizEmagazaniAc;
        }

        public WebElement getUcretsizFiyatTeklifi(){
            return ucretsizFiyatTeklifi;
        }

        public WebElement getUcretsizEmagazaniAcDogrulama(){
            return ucretsizEmagazaniAcDogrulama;
        }
    }
