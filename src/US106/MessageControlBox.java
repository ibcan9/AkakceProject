package US106;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageControlBox extends BaseDriver {

    @Test
    public void Test(){

        // Websitesi linki ile giriş yapılır.
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);

        // Giriş butonu  tıklanır.
        WebElement girisButonu= driver.findElement(By.cssSelector("div[id='H_rl_v8'] > :nth-child(2)"));
        girisButonu.click();
        MyFunc.Wait(2);

        // Email kutusu "melekoz@gmail.com" ile doldurulur.
        WebElement emailKutusu= driver.findElement(By.cssSelector("form[id='FrmLi'] > span > input"));
        emailKutusu.sendKeys("melekoz@gmail.com");
        MyFunc.Wait(2);

        // Şifre kutusu "1w2e3r4TA" ile doldurulur.
        WebElement sifreKutusu= driver.findElement(By.cssSelector("form[id='FrmLi'] > :nth-child(6) > input"));
        sifreKutusu.sendKeys("1w2e3r4TA");
        MyFunc.Wait(2);

        // SubmitButton tıklanır.
        WebElement submitButton= driver.findElement(By.cssSelector("form[id='FrmLi'] > :nth-child(10)"));
        submitButton.click();
        MyFunc.Wait(2);

        // Profildeki isme tıklanır.
        WebElement profilKutusu= driver.findElement(By.cssSelector("div[id='HM_v8'] > i > a "));
        profilKutusu.click();
        MyFunc.Wait(2);

        // Mesajlarım butonu tıklanır.
        WebElement mesajlarımKutusu= driver.findElement(By.cssSelector("ul[id='AL'] > li > :nth-child(3)"));
        mesajlarımKutusu.click();
        MyFunc.Wait(2);

        // Görüntülenecek mesaj kontrol edilir.
        WebElement dogrulanmisMesaj= driver.findElement(By.cssSelector("div[class='wbb_v8'] > p"));
        try {
            Assert.assertTrue(dogrulanmisMesaj.getText().contains("Listenecek mesaj bulunamadı."));
        }catch (Exception e)
        {
            System.out.println("Mesaj kutunuz boş değildir");
        }

        finally {
            WaitAndClose();
        }

    }


}
