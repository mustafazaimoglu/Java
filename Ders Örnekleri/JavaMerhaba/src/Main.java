
import java.util.Scanner;

// import java.util.*; Utildeki tum dosyaları ekler

public class Main 
{
    public static int Toplama(int a, int b)
    {
        int top;
        
        
        top = a + b; 
        
        
        return top;
    }
    
    public int Topla(int a, int b)
    {
        int top;
        
        
        top = a + b; 
        
        
        return top;
    }
    
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        Main j = new Main();
        
        /*
        System.out.println("MKZ");
        System.out.println("Java Merhaba");
        */
         /*
        int a = 5;
        
        char c = 'a';
        
        float d = 5.25f;
        
        double k = 554.25;
        
        String mkz = "Merhaba";
        
        boolean b = true;
        
        
        System.out.println("İnt : " + a 
                + "\nchar : " + c +
                "\nfloat : " + d + 
                "\ndouble : " + k +
                "\nString : " + mkz +
                "\nBoolean : " + b);

          */
        
         /*
         System.out.print("Lutfen Bir İsim Giriniz : ");
         String mkz = scanner.next();
         
         System.out.print("Lutfen Bir Sayi Giriniz :");
         int a = scanner.nextInt();
        
         
         System.out.println("İsim : " + mkz +
                 "\nSayi : " + a);
         
        */
         
         /*
         int a = 5;
         
         String MKZ;
         
         MKZ = String.valueOf(a);
         
         System.out.println("MKZ : " + MKZ);
         
         int b;
         
         String h = "15";
         
         b = Integer.valueOf(h);
         
         System.out.println("B : " + b);
        */
        
        int p = Main.Toplama(42,21); //Static oldugu icin her türlü calısır!
        int k = Toplama(15,18);
        int t = j.Topla(16,18); //Nesne Olusturmak Gerekli!!!
        
        System.out.println("Toplam : " + p);
        System.out.println("Toplam : " + k);
        System.out.println("Toplam : " + t);
        

    }
    
}
