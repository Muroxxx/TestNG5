package Day06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {


    @Test
    void hardAssert()//if it not qualifys the result it breaks the test
    {
        String s="hi";
        System.out.println("working");
        Assert.assertEquals("hiaa",s,"not expected");
        System.out.println("worling");

    }

    @Test
    void softAssert()
    {
        String sth="www.facebook.com/homepage";
        String str="www.facebook.com/cartpage";
        String stc="www.facebook.com/editaccountpage";



        SoftAssert sf=new SoftAssert();

        sf.assertEquals("www.facebook.com/homepage", sth);
        System.out.println("s1");

        sf.assertEquals("www.facebook.com/",str);
        System.out.println("s2");

        sf.assertEquals("www.facebook.com/editaccountpage",stc);
        System.out.println("s3");


        sf.assertAll();



    }

}














