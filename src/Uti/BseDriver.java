package Uti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BseDriver {
    public static WebDriver driverx;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemler() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        driverx = new EdgeDriver(options);
        Duration dr = Duration.ofSeconds(30);
        driverx.manage().timeouts().pageLoadTimeout(dr);
        driverx.manage().timeouts().implicitlyWait(dr);

        wait = new WebDriverWait(driverx,
                Duration.ofSeconds(30));
        loginTest();
    }

    void loginTest() {
        System.out.println("Login Test");

        driverx.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement inputEmail = driverx.findElement(By.id("input-email"));
        inputEmail.sendKeys("furkis@gmail.com");

        WebElement password = driverx.findElement(By.id("input-password"));
        password.sendKeys("ğğğğ");

        WebElement loginBtn = driverx.findElement(By.xpath("//input[@type='submit']"));
        loginBtn.click();


    }
}
