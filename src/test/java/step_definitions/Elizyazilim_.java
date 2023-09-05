package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.elizyazilim_POM;

import java.time.Duration;


    WebDriver driver = new ChromeDriver();

public class Elizyazilim_ {

    elizyazilim_POM ar = new elizyazilim_POM();


    //WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.elizyazilim.com/contents/iletisim");
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));

    Thread.sleep(5000);

    driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
}

