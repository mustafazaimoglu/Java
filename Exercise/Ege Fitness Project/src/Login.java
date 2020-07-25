
import java.util.ArrayList;
import java.util.Scanner;

public class Login
{
    public static Scanner scanner = new Scanner(System.in);
    
    public int OgrenciGirisYap(ArrayList<Student> x)
    {
        System.out.println("\n*** Kullanici Girisine Hosgeldiniz! (Ogrenci) ****");
        System.out.print("Kullanici Adi Giriniz : ");
        String kullaniciAdi = scanner.nextLine();
        
        System.out.print("Parola Giriniz : ");
        String parola = scanner.nextLine();
        
        for (int i = 0; i < x.size(); i++)
        {
            if (x.get(i).getKullaniciAdi().equals(kullaniciAdi) && x.get(i).getParola().equals(parola))
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public int OgretmenGirisYap(ArrayList<Teacher> x)
    {
        System.out.println("\n*** Kullanici Girisine Hosgeldiniz! (Ogretmen) ****");
        System.out.print("Kullanici Adi Giriniz : ");
        String kullaniciAdi = scanner.nextLine();
        
        System.out.print("Parola Giriniz : ");
        String parola = scanner.nextLine();
        
        for (int i = 0; i < x.size(); i++)
        {
            if (x.get(i).getKullaniciAdi().equals(kullaniciAdi) && x.get(i).getParola().equals(parola))
            {
                return i;
            }
        }
        
        return -1;
    }
}
