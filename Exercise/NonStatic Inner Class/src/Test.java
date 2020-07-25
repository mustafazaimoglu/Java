
import java.util.Scanner;


public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        Matematik.Factorial faktoriyel = new Matematik().new Factorial(); //Tek Tek Tum Classlari Baslatmalısın.
        
        faktoriyel.factorial();
        
        Matematik.Alan.DaireAlan dairealan = new Matematik().new Alan().new DaireAlan();
        Matematik.Alan.KareselAlan karealan = new Matematik().new Alan().new KareselAlan();

        dairealan.dairealan(6);
        karealan.karealan(8);
        
        Matematik.Asal asal = new Matematik().new Asal();
        
        System.out.print("Lutfen Asallıgını Kontrol Edecegimiz Sayıyı Giriniz :");
        int sayi = scanner.nextInt();
        
        if (asal.AsalMi(sayi))
        {
            System.out.println("Asaldir!");
        }
        else
        {
            System.out.println("Asal Degildir!");
        }
            
        
    }
    
}
