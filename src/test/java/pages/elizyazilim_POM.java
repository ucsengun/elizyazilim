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

        @FindBy(xpath = "//span[@class='acceptAndClose']")
        private WebElement cereziKabulEt;
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

        @FindBy(xpath = "//a[normalize-space()='BLOG']")
        private WebElement blog;

        @FindBy(xpath = "//img[@alt='Web Sunucu']")
        private WebElement webSunucuHizmetleri;

        @FindBy(xpath = "//img[@alt='Bakım & Destek']")
        private WebElement bakimDestekHizmetleri;

        @FindBy(xpath = "//img[@alt='Dijital Pazarlama']")
        private WebElement dijitalPazarlamaHizmetleri;

        @FindBy(xpath = "//img[@alt='Grafik Tasarım']")
        private WebElement grafikTasarimHizmetleri;

        @FindBy(xpath = "//img[@alt='Web Yazılım']")
        private WebElement webYazilimHizmetleri;

        @FindBy(xpath = "//img[@alt='Web Tasarım']")
        private WebElement webTasarimHizmetleri;

        @FindBy(xpath = "//div[@id='rev_slider_2_forcefullwidth']/div[@class='rev_slider_wrapper']/div[@id='rev_slider_2']/div[4]")
        private WebElement sagaKaydir;

        @FindBy(xpath = "//div[@id='rev_slider_2_forcefullwidth']/div[contains(@class,'rev_slider_wrapper')]/div[@id='rev_slider_2']/div[3]")
        private WebElement solaKaydir;


        @FindBy(xpath = "//h1[normalize-space()='WEB SUNUCU']")
        private WebElement webSunucuDogrulama;

        @FindBy(xpath = "//h1[normalize-space()='BAKIM DESTEK']")
        private WebElement bakimDestekDogrulama;

        @FindBy(xpath = "//h1[contains(text(),'DİJİTAL PAZARLAMA')]")
        private WebElement dijitalPazarlamaDogrulama;

        @FindBy(xpath = "//h1[contains(text(),'GRAFİK TASARIM NEDİR?')]")
        private WebElement grafikTasarimDogrulama;

        @FindBy(xpath = "//h1[contains(text(),'WEB YAZILIM VE SİTE MİMARİSİ')]")
        private WebElement webYazilimHizmetleriDogrulama;

        @FindBy(xpath = "//h1[contains(text(),'ANKARA WEB TASARIM HİZMETİ')]")
        private WebElement webTasarimHizmetleriDogrulama;

        @FindBy(css = "article[class='post-entry post-entry-type-standard post-entry-11727 post-loop-1 post-parity-odd single-big with-slider post-11727 post type-post status-publish format-standard has-post-thumbnail hentry category-logo-ve-kurumsal-kimlik category-tasarim tag-ankara-katalog-tasarimi tag-ankara-reklam-ajansi tag-ankara-web-tasarim tag-antetli-kagit tag-eliz-yazilim-tasarim tag-kartvizit tag-kurumsal-kimlik-tasarimi tag-logo-tasarimi tag-web-sitesi-tasarimi tag-zarf'] a[class='more-link']")
        private WebElement devaminiOku;

        @FindBy(xpath = "//p[contains(text(),', net bir kimlik oluşturmak için firmaların ayırt ')]")
        private WebElement kurumsalKimlikTasarimiDogrulama;
       // (//a[@class='btn transparent'][contains(text(),'İNCELE')])[1]

        public WebElement getCereziKabulEt() {
            return cereziKabulEt;
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

        public WebElement getMusterilerimiz(){
            return musterilerimiz;
        }

        public WebElement getBlog(){
            return blog;
        }

        public WebElement getWebSunucuHizmetleri() {
            return webSunucuHizmetleri;
        }

        public WebElement getBakimDestekHizmetleria() {
            return bakimDestekHizmetleri;
        }

        public WebElement getDijitalPazarlamaHizmetleri(){
            return dijitalPazarlamaHizmetleri;
        }

        public WebElement getGrafikTasarimHizmetleri(){
            return grafikTasarimHizmetleri;
        }

        public WebElement getWebYazilimHizmetleri(){
            return webYazilimHizmetleri;
        }

        public WebElement getWebTasarimHizmetleri(){
            return webTasarimHizmetleri;
        }

        public WebElement getSagaKaydir(){
            return sagaKaydir;
        }

        public WebElement getSolaKaydir(){
            return solaKaydir;
        }

        public WebElement getWebSunucuDogrulama() { return webSunucuDogrulama;}

        public WebElement getBakimDestekDogrulama() { return bakimDestekDogrulama;}

        public WebElement getDijitalPazarlamaDogrulama() { return dijitalPazarlamaDogrulama;}

        public WebElement getGrafikTasarimDogrulama() { return grafikTasarimDogrulama;}

        public WebElement getWebYazilimHizmetleriDogrulama() { return webYazilimHizmetleriDogrulama;}

        public WebElement getWebTasarimHizmetleriDogrulama() { return webTasarimHizmetleriDogrulama;}

        public WebElement getDevaminiOku() { return devaminiOku;}

        public WebElement getKurumsalKimlikTasarimiDogrulama() { return kurumsalKimlikTasarimiDogrulama;}
    }
