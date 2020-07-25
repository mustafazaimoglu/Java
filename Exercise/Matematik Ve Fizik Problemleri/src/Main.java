
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");
        
        String islemler = "***** İşlemler *****\n"
                          + "1. Daire Alanı Hesaplama\n"
                          + "2. Üçgen Çevresi Hesaplama\n"
                          + "3. 2 Vektörün İç Çarpımını Hesaplama\n"
                          + "Çıkış :  q";
        
        
        OUTER:
        while (true)
        {
            System.out.println(islemler);
            System.out.print("\nİşlemi Seçiniz : ");
            String islem = scanner.nextLine();
            
            switch (islem)
            {
                case "q":
                    System.out.println("Programdan Çıkılıyor...");
                    break OUTER;
                case "1":
                    System.out.print("Dairenin Yarıçapı : ");
                    int yaricap = scanner.nextInt();
                    scanner.nextLine();
                    Problem.Matematik.daireAlan(yaricap);
                    break;
                case "2":
                    System.out.print("Kenar  1: ");
                    int kenar1 = scanner.nextInt();
                    System.out.print("Kenar 2 : ");
                    int kenar2 = scanner.nextInt();
                    System.out.print("Kenar 3 : ");
                    int kenar3 = scanner.nextInt();
                    scanner.nextLine();
                    Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);
                    break;
                case "3":
                    Vec vec1 = new Vec("Vektör1");
                    Vec vec2 = new Vec("Vektör2");
                    Problem.Fizik.icCarpim(vec1, vec2);
                    break;
                default:
                    System.out.println("Geçersiz işlem...");
                    break;
            }
        }    

    }
    
}
