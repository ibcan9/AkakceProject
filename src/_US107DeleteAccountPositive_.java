import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _US107DeleteAccountPositive_ extends BaseDriver {
    @Test
    public void US107PositiveDelete() {
        driver.get("https://www.akakce.com");
        MyFunc.Wait(2);

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.akakce.com/"));

        WebElement loginButton = driver.findElement(By.cssSelector("div[id='H_rl_v8'] > :nth-child(2)"));
        Assert.assertTrue(loginButton.getText().equals("Giriş Yap"));
        loginButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("akakcem/giris"));

        WebElement emailInputField = driver.findElement(By.cssSelector("form[id='FrmLi'] > span > input"));
        emailInputField.sendKeys("batch7team5@gmail.com");

        WebElement passwordInputField = driver.findElement(By.cssSelector("form[id='FrmLi'] > :nth-child(6) > input"));
        passwordInputField.sendKeys("1q2w3e4raA.");

        WebElement submitLoginButton = driver.findElement(By.cssSelector("form[id='FrmLi'] > :nth-child(10)"));
        submitLoginButton.click();
        MyFunc.Wait(3);

        WebElement displayedUsername = driver.findElement(By.cssSelector("div[class='g-3_v8 hm_hp_v8']  > div"));
        Assert.assertTrue(displayedUsername.getText().equals("Hans"));

        WebElement profileDropdownButton = driver.findElement(By.cssSelector("div[id='HM_v8'] > i"));
        profileDropdownButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("akakcem"));

        WebElement deleteAccountMenuOption = driver.findElement(By.cssSelector("ul[id='AL'] > :nth-child(4) > :nth-child(5)"));
        deleteAccountMenuOption.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("uyelik-iptali"));

        WebElement passwordInputForDeletion = driver.findElement(By.cssSelector("label[for='dup'] + input"));
        passwordInputForDeletion.sendKeys("1q2w3e4raA.");

        WebElement confirmDeleteButton = driver.findElement(By.cssSelector("span[class='tool'] > input"));
        confirmDeleteButton.click();
        MyFunc.Wait(3);

        Assert.assertTrue(driver.getCurrentUrl().contains("iptal-tamamlandi"));

        WebElement successText = driver.findElement(By.cssSelector("ul[class='cul'] > li i"));

        try {
            Assert.assertTrue(successText.getText().contains("Hesabın silindi."));
        } catch (Exception e) {
            System.out.println("Hesabın silinmedi.");
        } finally {
            WaitAndClose();
        }
    }
}
