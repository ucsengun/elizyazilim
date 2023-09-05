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

        @FindBy(xpath = "//div[@id='footer_menu']//a[contains(text(),'İletişim')]")
        private WebElement iletisimButonu;

        @FindBy(css= "#ctl05_rptQuestions_tbQuestion_0")
        private WebElement adinizSoyadiniz;

        @FindBy(css = "#ctl05_rptQuestions_tbQuestion_1")
        private WebElement telefonNumaraniz;

        @FindBy(css = "#ctl05_rptQuestions_tbQuestion_2")
        private WebElement emailAdresiniz;
        @FindBy(css = "#ctl05_rptQuestions_cblQuestion_3_1_3")
        private WebElement muhasebe;

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
        public WebElement getIletisimButonu() {
            return iletisimButonu;
        }

        public WebElement getAdinizSoyadiniz() {
            return adinizSoyadiniz;
        }

        public WebElement getTelefonNumaraniz(){
            return telefonNumaraniz;
        }
        public WebElement getEmailAdresiniz(){
            return emailAdresiniz;
        }

        public WebElement getMuhasebe(){
            return muhasebe;
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
