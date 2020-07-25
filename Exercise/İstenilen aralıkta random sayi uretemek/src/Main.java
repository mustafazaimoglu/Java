
import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        
        /*
       // int a = r.nextInt();
        //float b = r.nextFloat();
        
        for (int i = 0; i < 10; i++)
        {
            float c = r.nextFloat();
            double d = r.nextDouble();
            int mkz = (int) (r.nextDouble() * 800);
            int mkz1 = (r.nextInt(795) + 5);
            int o = r.nextInt(1450);
            
            System.out.println(c);
            System.out.println(d);
            System.out.println(o);
            System.out.println("**************************************");
            System.out.println(mkz);
            System.out.println(mkz1);
            System.out.println("**************************************");
        }
        
       // System.out.println(a);
       // System.out.println(b);
*/
        System.out.print("Lutfen Random Sayi Uretmek Istediğiniz Aralığı Boşluk birakarak Giriniz : (Ex : 5 160) \n---> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.print("Kac Kere Uretmek İstediğinizi Giriniz : ");
        int sayi = scanner.nextInt();
        
        
        for (int i = 0; i < sayi; i++)
        {
            int randSayi = (int) (a + r.nextDouble() * (b-a));  // sondaki islem yapilmazsa sınırlardan buyuk sayılar uretir.
            System.out.println( (i+1) + ". - " + randSayi);
        }
        
    }
    
}
