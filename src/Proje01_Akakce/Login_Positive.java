package Proje01_Akakce;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Positive extends BaseDriver {

    @Test
    public void Login(){


        driver.get("https://www.akakce.com/");

        WebElement girisYap= driver.findElement(By.cssSelector("div[class='g-3_v8 hm_hp_v8']>div > a[href='/akakcem/giris/']"));
        girisYap.click();
        MyFunc.Wait(2);

        WebElement eposta= driver.findElement(By.cssSelector("form[id='FrmLi']> span> input"));
        eposta.sendKeys("ennurgl25@gmail.com");
        MyFunc.Wait(2);

        WebElement sifre= driver.findElement(By.cssSelector("form[id='FrmLi']> span> input[type='password']"));
        sifre.sendKeys("Akakce12.");
        MyFunc.Wait(2);

        WebElement beniHatirla= driver.findElement(By.cssSelector("span[class='checkbox-wrapper']+label"));
        beniHatirla.click();
        MyFunc.Wait(2);

        WebElement girisYap2= driver.findElement(By.cssSelector("a[class='fp']+input"));
        girisYap2.click();
        MyFunc.Wait(2);


        WaitAndClose();
    }
}
