package US107;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _US107DeleteAccountNegative_ extends BaseDriver {

    @Test

    public void Test1(){
        driver.get("https://www.akakce.com/");

        MyFunc.Wait(2);

        //giriş yapma aşaması
        WebElement girisYapButonu = driver.findElement(By.cssSelector("div[id='H_rl_v8'] > :nth-child(2)"));
        girisYapButonu.click();
        MyFunc.Wait(2);


        // E-posta ve şifre Gir
        WebElement email = driver.findElement(By.cssSelector("input[id='life']"));
        email.sendKeys("temelreis59@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input#lifp"));
        password.sendKeys("112233Aa!!");

        WebElement submitButton = driver.findElement(By.cssSelector("input#lfb"));
        submitButton.click();

        //Sağ üst kısımda bulunan isme tıkla

        WebElement Username = driver.findElement(By.cssSelector("div[id='HM_v8'] > i"));
        Username.click();

        //Hesabımı Sil Butonu

        WebElement HesabimiSil = driver.findElement(By.cssSelector("a[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        HesabimiSil.click();

        //şifre girme aşaması

        WebElement HataliSifre = driver.findElement(By.cssSelector("input#p"));
        HataliSifre.sendKeys("wrongpass");

        //hesabı şilme butonuna tıklama
        WebElement HesabimiSilButonu = driver.findElement(By.cssSelector("input#u"));
        HesabimiSilButonu.click();

        MyFunc.Wait(2);

        //hata mesajı ekranı

        WebElement ErrorPage = driver.findElement(By.cssSelector("div[class='m-w'] > :nth-child(2) > div > div > button"));
        ErrorPage.click();

        WebElement ErrorText = driver.findElement(By.cssSelector("input[id='p']"));


        try{
            Assert.assertTrue("Hata mesajı görüntülendi.",ErrorText.getText().contains("Şifrenizi kontrol ediniz."));
        } catch (Exception e) {
            System.out.println("Hata mesajı görüntülenemedi");
        }
        finally {
            WaitAndClose();
        }
    }
}
