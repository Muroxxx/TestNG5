package Day07;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class wislistelemnets {

    public wislistelemnets(){
        PageFactory.initElements(BaseDriver.driver,this);
    }

        @FindBy(css = "div[class='caption']>h4>a")
        List<WebElement>searchResult;


        @FindBy(xpath = "//button[@data-original-title='Add to W ish List']")
        List<WebElement>wishbutton;

        @FindBy(id = "wishlist-total")
        WebElement btnpro;

        @FindBy(css = "[class='text-left']>a")
        List<WebElement> wt;


    }

