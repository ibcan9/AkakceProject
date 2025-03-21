package US102;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Account_Verification_Check extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);
        WebElement Login = driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        Login.click();

        // kullanıcı bilgileri girişi

        WebElement email = driver.findElement(By.xpath("//input[@id='life']"));
        email.sendKeys("ennurgl25@gmail.com");
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='lifp']"));
        password.sendKeys("Akakce12.");
        MyFunc.Wait(1);

        WebElement LoginButton = driver.findElement(By.xpath("//input[@id='lfb']"));
        LoginButton.click();
        MyFunc.Wait(1);

        WebElement LoginMessage = driver.findElement(By.xpath("//div[@id='HM_v8']/i/a[text()='Ennur']"));

        Assert.assertTrue("Kullanıcı doğrulama yapılamadı", LoginMessage.getText().contains("Ennur"));

        WaitAndClose();
    }
}
