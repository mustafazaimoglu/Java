import java.util.Scanner;

public class Fakt {
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Lutfen Faktoriyelini Bulmak Istediginiz Sayiyi Giriniz : ");
        int sayi = scanner.nextInt();
        int fakt = 1;
        
        for (int i = 1; i <= sayi; i++)
        {
            fakt = fakt * i;
        }
        
        System.out.println("Girilen Sayinin Faktoriyeli = " + fakt);
    }
}
