
import java.util.Scanner;

// @author MKZ
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lutfen Gün Sayısını Giriniz :");
        int gun = sc.nextInt();
        
        double hafta = (double) gun/7;
        double ay = (double) gun/30;
        double yil = (double) gun/365;
        
        System.out.println(gun + " Gün: \n" + hafta + " Hafta,\n" + ay + " Ay,\n" + yil + " Yıl etmektedir.");
    }
}
