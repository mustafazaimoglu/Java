import java.util.Scanner;

public class Main 
{
    public static void Yazdir(Otomobil x)
    {
        System.out.println("Model : " + x.getModel());
        System.out.println("Üretim Yılı : " + x.getYıl());
        System.out.println("Motor : " + x.getMotor());
        System.out.println("Kilometre " + x.getKilometre() + "\n");
    }
    
    
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        Login Deneme = new Login();
        
        OtomobilAdder car = new OtomobilAdder();
        
        Kullanici Mustafa = new Kullanici("Mustafa KUZ","123456");
        
        Otomobil Tesla = new Otomobil("Tesla Model S",2020,"720 HP",10500);
        Otomobil Honda = new Otomobil("Honda Civic",2018,"160 HP",32540);
        Otomobil Porsche = new Otomobil("Porsche 911 Spyder",2005,"580 HP",13588);
        Otomobil Nissan = new Otomobil();
        
        int GirisHakki = 3;
        while (true)
            {
            GirisHakki--;
            if (Deneme.Giris(Mustafa))
                {
                    System.out.println("Giris Basarılı!");
                    System.out.println("Hosgeldiniz Sayın " + Mustafa.getSys_KullaniciAdi() + "\n");
                    break; 
                }
                else
                {
                    System.out.println("Kullanıcı Adi veya Parola Yanlış");
                    System.out.println("Kalan Giris Hakki : " + GirisHakki);
                }
                    
                if (GirisHakki == 0)
                {
                    System.out.println("Giris Hakkiniz Bitti!");
                    return;
                }               
            }
        
        Nissan = car.Adder();
        
        System.out.println("\n*** OTOMOBİLLERİNİZ ***");
        Yazdir(Tesla);
        Yazdir(Honda);
        Yazdir(Porsche);
        Yazdir(Nissan);
    }
    
}
