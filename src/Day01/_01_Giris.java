package Day01;

import org.testng.annotations.Test;

public class _01_Giris {


    // Eğer herhangi bir sıralama verilmezse metod isimlerinin alfabetik çalışıyor
    @Test(priority = 1) // default 0 : index gibi düşünebiliriz.
    public void webSitesiniAc(){
        System.out.println("driver tanımlandı ve webSitesiniAcildi");
    }

    @Test(priority = 2)
    public void loginIsleminiYap(){
        System.out.println("LoginTest işlemi yapıldı");
    }

    @Test(priority = 3)
    public void driveriKapat(){
        System.out.println("driver kapatıldı.");
    }


}
