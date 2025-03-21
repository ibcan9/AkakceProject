package US104;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NegativeLoginTestWithInvalidEmail extends BaseDriver {

    @Test

    public void NegativeLoginTestWithInvalidEmail() {


        BaseDriver.driver.get("https://www.akakce.com/");

        WebElement girisYap = BaseDriver.driver.findElement(By.cssSelector("div[class='g-3_v8 hm_hp_v8']>div > a[href='/akakcem/giris/']"));
        girisYap.click();
        MyFunc.Wait(2);

        WebElement eposta = BaseDriver.driver.findElement(By.cssSelector("form[id='FrmLi']> span> input"));
        eposta.sendKeys("1batch7team5@gmail.com");
        MyFunc.Wait(2);

        WebElement sifre = BaseDriver.driver.findElement(By.cssSelector("form[id='FrmLi']> span> input[type='password']"));
        sifre.sendKeys("1q2w3e4raA.");
        MyFunc.Wait(2);


        WebElement girisYap2 = BaseDriver.driver.findElement(By.cssSelector("a[class='fp']+input"));
        girisYap2.click();
        MyFunc.Wait(3);


        WebElement ErrorMessage = BaseDriver.driver.findElement(By.cssSelector("div[class='alertX t2'] > p"));
        Assert.assertTrue("Beklenen Hata Oluşmadı",ErrorMessage.getText().contains("hesap bulunamadı"));
        MyFunc.Wait(2);

        WebElement TamamButton = BaseDriver.driver.findElement(By.cssSelector("button[class='bt_v8 line_v8'] > b"));
        TamamButton.click();
        BaseDriver.WaitAndClose();
    }

}
