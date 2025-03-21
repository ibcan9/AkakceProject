package US105;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_105_OrderListCheck extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://www.akakce.com/");
        WebElement girisYap = driver.findElement(By.cssSelector("div[class='g-3_v8 hm_hp_v8']>div > a[href='/akakcem/giris/']"));
        girisYap.click();
        MyFunc.Wait(2);
        WebElement eposta = driver.findElement(By.cssSelector("form[id='FrmLi']> span> input[type='email']"));
        eposta.sendKeys(new CharSequence[]{"ennurgl25@gmail.com"});
        MyFunc.Wait(2);
        WebElement sifre = driver.findElement(By.cssSelector("form[id='FrmLi']> span> input[type='password']"));
        sifre.sendKeys(new CharSequence[]{"Akakce12."});
        MyFunc.Wait(2);
        WebElement beniHatirla = driver.findElement(By.cssSelector("span[class='checkbox-wrapper']+label[class='nf']"));
        beniHatirla.click();
        MyFunc.Wait(2);
        WebElement girisYap2 = driver.findElement(By.cssSelector("a[class='fp']+input[id='lfb']"));
        girisYap2.click();
        MyFunc.Wait(2);
        WebElement hesabim = driver.findElement(By.cssSelector("div[id='HM_v8'] > i > a"));
        hesabim.click();
        MyFunc.Wait(3);
        WebElement siparislerim = driver.findElement(By.cssSelector("a[href='/akakcem/siparislerim/']"));
        siparislerim.click();
        MyFunc.Wait(2);
        WaitAndClose();
    }
}