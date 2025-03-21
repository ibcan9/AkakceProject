package US101;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateUserAccountNegative extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement hesabAcButton = driver.findElement(By.xpath("//a[@rel='nofollow']"));
        hesabAcButton.click();
        MyFunc.Wait(2);

        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys(" ");
        MyFunc.Wait(2);

        WebElement soyad = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys(" ");
        MyFunc.Wait(2);

        WebElement eposta = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        eposta.sendKeys("ennurgl25@gmail.com");
        MyFunc.Wait(2);

        WebElement epostaTekrar = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        epostaTekrar.sendKeys("ennurgl25@gmail.com");
        MyFunc.Wait(2);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("Akakce12.");
        MyFunc.Wait(2);

        WebElement sifreTekrar = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreTekrar.sendKeys("Akakce12.");
        MyFunc.Wait(2);

        WebElement cinsiyet = driver.findElement(By.xpath("//input[@id='rngf']"));
        MyFunc.Wait(2);

        WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
        il.sendKeys("Adana");
        MyFunc.Wait(2);

        WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
        ilce.sendKeys("Çukurova");
        MyFunc.Wait(2);

        WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
        gun.sendKeys("1");
        MyFunc.Wait(2);

        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        ay.sendKeys("1");
        MyFunc.Wait(2);

        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));
        yil.sendKeys("2025");
        MyFunc.Wait(2);

        WebElement kullanimSoz = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        kullanimSoz.click();
        MyFunc.Wait(2);

        WebElement hesapAcButton = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapAcButton.click();


        WaitAndClose();


    } }
