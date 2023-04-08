package Day06.pageobjectmodel;

import Utlity.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class placeord extends BaseDriver {
    @Test
    void PD(){

        placeordelements_POM elements=new placeordelements_POM();

        elements.searchBox.sendKeys("ipod");
        elements.searchButton.click();
        elements.addToChart.click();
        elements.shoppingChart.click();
        elements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue3)).click();
        elements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.continue4)).click();

        wait.until(ExpectedConditions.elementToBeClickable(elements.confirm)).click();



    }
}
