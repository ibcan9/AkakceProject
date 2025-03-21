package US102;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegativeLoginTestWithInvalidPassword extends BaseDriver {

    @Test
    public void NegativeLoginTestWithInvalidPassword() {


        BaseDriver.driver.get("https://www.akakce.com/");

        WebElement girisYap = BaseDriver.driver.findElement(By.cssSelector("div[class='g-3_v8 hm_hp_v8']>div > a[href='/akakcem/giris/']"));
        girisYap.click();
        MyFunc.Wait(2);

        WebElement eposta = BaseDriver.driver.findElement(By.cssSelector("form[id='FrmLi']> span> input"));
        eposta.sendKeys("batch7team5@gmail.com");
        MyFunc.Wait(2);

        WebElement sifre = BaseDriver.driver.findElement(By.cssSelector("form[id='FrmLi']> span> input[type='password']"));
        sifre.sendKeys("invalidPassword");
        MyFunc.Wait(2);


        WebElement girisYap2 = BaseDriver.driver.findElement(By.cssSelector("a[class='fp']+input"));
        girisYap2.click();
        MyFunc.Wait(2);

        WebElement ErrorMessage = BaseDriver.driver.findElement(By.cssSelector("div[class='alertX t2'] > p"));
        Assert.assertTrue("Beklenen Hata Oluşmadı", ErrorMessage.getText().contains("Şifre doğru değil"));
        MyFunc.Wait(2);

        WebElement TamamButton = BaseDriver.driver.findElement(By.cssSelector("button[class='bt_v8 line_v8'] > b"));
        TamamButton.click();
        BaseDriver.WaitAndClose();



    }
}
