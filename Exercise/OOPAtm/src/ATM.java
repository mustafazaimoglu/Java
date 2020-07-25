import java.util.Scanner;

public class ATM {
    
    public void calis (Hesap mstf) {
        
        Scanner scanner = new Scanner(System.in);
        Login login1 = new Login();
        
        String islemler = "1. Bakiye Görüntüle\n"
                          + "2. Para Yatırma\n"
                          + "3. Para Çekme\n"
                          + "Çıkış için q'ya basın";
        
        int GirisHakki = 3;
        
        while (true) {
            
            if (login1.GirisYap(mstf)) {
                
                System.out.println("Giris Başarili...");
                break;
            }
            else {
                System.out.println("Giris Basarisiz...");
                GirisHakki--;
                System.out.println("Kalan Giris Hakki : " + GirisHakki);
            }
            
            if (GirisHakki == 0) {
                
                System.out.println("Giris Hakkiniz Bitti...!");
                return;
            }
        }
        
        while (true) {
            System.out.println("*********************************");
            System.out.println(islemler);
            System.out.println("**********************************");
            System.out.print("Lutfen Bir İslem Seciniz : ");
            String İslem = scanner.nextLine();
            
            switch (İslem) {
                case "q":
                    return;
                case "1":
                    System.out.println("Güncel Bakiyeniz : " + mstf.getBakiye());
                    break;
                case "2":
                    {
                        System.out.print("Yatırmak İstediğiniz Miktari Giriniz : ");
                        double Miktar = scanner.nextDouble();
                        scanner.nextLine(); // Dummy
                        mstf.paraYatir(Miktar);
                        break;
                    }
                case "3":
                    {
                        System.out.print("Cekmek İstediğiniz Miktari Giriniz : ");
                        double Miktar = scanner.nextDouble();
                        scanner.nextLine(); // Dummy
                        mstf.paraCek(Miktar);
                        break;
                    }
                default:
                    System.out.println("Geçersiz islem...");
                    break;
            }
        }
    }
}
