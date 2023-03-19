package Day02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asertioınss {

    @Test
    void eqauls()
    {
        String s1="hello";
        String S2="hello";

        Assert.assertEquals(s1,S2,"not equal");
    }

    @Test
    void notequal()
    {
        int s1=4;
        int s2=5;

        Assert.assertNotEquals(s1,s2,"equal");
    }

    @Test
    void truee()
    {
        int s1=5;
        int s2=5;

        Assert.assertEquals(s2, s1, "not true");
    }

    @Test
    void nulll()
    {
        String s1=null;

        Assert.assertNull(s1,"not null");
    }


}
