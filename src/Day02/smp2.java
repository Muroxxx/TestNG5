package Day02;

import Uti.BseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class smp2 extends BseDriver {
    @Test
    void logtst(){

        driverx.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement inputEmail=driverx.findElement(By.id("input-email"));
        inputEmail.sendKeys("furkis@gmail.com");

        WebElement password=driverx.findElement(By.id("input-password"));
        password.sendKeys("ğğğğ");

        WebElement loginBtn=driverx.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();

        Assert.assertTrue(driverx.getTitle().equals("My Account"));



    }

}
