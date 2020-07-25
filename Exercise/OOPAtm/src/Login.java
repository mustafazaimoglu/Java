
import java.util.Scanner;

public class Login {
    
    public boolean GirisYap (Hesap mkz1){
    
    Scanner scanner = new Scanner(System.in);
    String KullaniciAdi;
    String Parola;
    
    
    System.out.println("***Kullanici Girisine Hoşgeldiniz!***");
    System.out.print("Kullanici Adi : ");
    KullaniciAdi = scanner.nextLine();
    System.out.print("Parola : ");
    Parola = scanner.nextLine();
    
    return mkz1.getKullaniciAdi().equals(KullaniciAdi) && mkz1.getParola().equals(Parola);
    
    }
    
            
}
