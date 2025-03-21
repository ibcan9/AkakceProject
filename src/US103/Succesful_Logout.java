package US103;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Succesful_Logout extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);
        WebElement girisyap= driver.findElement(By.cssSelector("[id='H_rl_v8']>:nth-child(2)"));
        girisyap.click();

        MyFunc.Wait(2);
        WebElement email= driver.findElement(By.cssSelector("input[id='life']"));
        email.sendKeys("ennurgl25@gmail.com");

        MyFunc.Wait(2);
        WebElement password= driver.findElement(By.cssSelector("input[id='lifp']"));
        password.sendKeys("Akakce12.");

        MyFunc.Wait(2);
        WebElement hesabaGir= driver.findElement(By.cssSelector("input[id='lfb']"));
        hesabaGir.click();

        WebElement hesabim=driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(hesabim).build();
        aksiyon.perform();
        MyFunc.Wait(2);

        WebElement cik = driver.findElement(By.xpath("//*[text()='Çık']"));
        cik.click();
        MyFunc.Wait(2);

        WebElement girisVarmi= driver.findElement(By.xpath("//*[text()='Giriş Yap']"));
        Assert.assertTrue("Giriş yap butonu bulunumadı",girisVarmi.getText().contains("Giriş Yap"));

        WaitAndClose();
    }
}

