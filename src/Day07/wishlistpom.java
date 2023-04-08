package Day07;

import Day06.pageobjectmodel.placeordelements_POM;
import Utlity.BaseDriver;
import Utlity.Tools;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class wishlistpom extends BaseDriver {
    @Test
    @Parameters("search")
    void addToWishList(String text){

        placeordelements_POM poe=new placeordelements_POM();

        poe.searchBox.sendKeys(text);
        poe.searchButton.click();


        wislistelemnets ws=new wislistelemnets();
        int rnd= Tools.RandomGenerator(ws.searchResult.size());

        String wslh=ws.searchResult.get(rnd).getText();
        ws.wishbutton.get(rnd).click();
        ws.btnpro.click();
        Tools.listContainsString(ws.wt,wslh);











    }

}
