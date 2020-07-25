import java.util.Scanner;

public class Login 
{
    public boolean Giris(Kullanici Hesap)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("*************************************************");
        System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
        String KullaniciAdi = scanner.nextLine();
        
        System.out.print("Lutfen Parolanizi Giriniz : ");
        String Parola = scanner.nextLine();
        System.out.println("*************************************************");
        
        
        return Hesap.getSys_KullaniciAdi().equals(KullaniciAdi) && Hesap.getSys_Parola().equals(Parola);
    }
    
}
