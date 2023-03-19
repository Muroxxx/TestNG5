package Day02;

import Uti.BseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class subscribe extends BseDriver {
    @Test
     void subs(){


        WebElement news= driverx.findElement(By.linkText("Newsletter"));
        news.click();

        WebElement yes= driverx.findElement(By.xpath("//input[@value='1']"));
        yes.click();

        WebElement but= driverx.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(but.getText().toLowerCase().contains("success"));

    }




}
