package Day02;

import org.testng.annotations.Test;

public class enable {

    @Test
    void t1(){
        System.out.println("active");


    }
    @Test(enabled = false)
    void t2(){
        System.out.println("active");

    }

    @Test
    void t3(){
        System.out.println("active");
    }
}
