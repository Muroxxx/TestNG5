package Day03;

import Uti.BseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Dependecy extends BseDriver {
@Test
    void startcar(){
    System.out.println("start");
}
@Test(dependsOnMethods = {"startcar"}) //runs if it start run
    void drivecar(){
    System.out.println("drive");
}
@Test(dependsOnMethods = {"drivecar"})
    void partkcar(){
    System.out.println("park");
    Assert.fail();
}
@Test(alwaysRun = true)  // it's going to run even the priority system broke
    void stopcar(){
    System.out.println("stop");
}

    
}
