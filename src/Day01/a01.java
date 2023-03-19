package Day01;

import org.testng.annotations.Test;

public class a01 {

    //if not prioritized it will work in alphabetical order
    @Test(priority = 1)
    public void s(){
        System.out.println("sı completed");

    }

    @Test(priority = 2)
    public void s2(){
        System.out.println("s2 completed");

    }

    @Test(priority = 3)
    public void v3(){
        System.out.println("s3 completed");

    }








}
