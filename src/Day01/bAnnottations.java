package Day01;

import org.testng.annotations.*;

public class bAnnottations {

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class");

    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("before method");

    }

    @BeforeTest
    public void  before(){
        System.out.println("before test ");
    }
    @Test
    public void t(){
        System.out.println("test ");
    }


    @AfterTest
    public void after(){
        System.out.println("after test ");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("after method");

    }

    @AfterClass
    public void afterclass(){
        System.out.println("after  class");

    }













}
