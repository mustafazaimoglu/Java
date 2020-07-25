import java.util.Scanner;

public class Metodlar 
{
    public static int Toplama (int a, int b, int c)
    {
       int top = (a+b+c); 
        
       return top; 
    }
    public static void Selam(String Isim)           
    {
        System.out.println("\n" + Isim + " Bey");
        System.out.println("***Java Metodlar İle Faktoriyel "
                + "Hesaplamaya Hoş Geldiniz***\n");
    }
    public static void Faktoriyel(int a)
    {
        int fakt = 1;
        
        while (a > 0)
        {
            fakt *= a;
            a--;
        }
        
        System.out.println("Faktoriyel = " + fakt);  
    }
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Lufen İsminizi Giriniz :");
        String yazi = scanner.nextLine();
        
        Selam(yazi);
        
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int sayi = scanner.nextInt();
        
        Faktoriyel(sayi);
        
        
        System.out.println("\nSon İslemimiz Toplama (a+b+c):"
                + "\nSayilar Toplami = " + Toplama(3,4,5));
        
    }
}
