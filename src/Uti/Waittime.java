package Uti;

public class Waittime {

    public static void  waittime(int sn){
        try {
            Thread.sleep(1000L*sn);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
