//Coded By MKZ
import java.util.Scanner;
        
public class Example 
{
    public static void main (String[] Args)
    {
        Scanner scanner= new Scanner(System.in); //scanner bir nesne oldugu icin degisebillir
        int yas;
        
        System.out.print("Lutfen Yasinizi Giriniz : ");
        yas = scanner.nextInt(); //int icin nextInt kullanilir.
        
        System.out.println("Yasiniz : "+yas);
      
        double sayi;
        
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        sayi = scanner.nextDouble(); //double icin nextDouble Kullanilir.
        
        System.out.println("Girilen Sayiniz : "+sayi);
                            //Stringden önce double float int vs scan etmeye calisinca oluyor!!!
        scanner.nextLine(); //Bunun Burda Var Olus Sebebi ENTER'i(\n) Bir String Zannetmesi (( DUMMY ))
        System.out.print("Lutfen Bir Yazi Giriniz : ");
        String Yazi = scanner.nextLine(); //String icin nextLine kullanilir.
        
        System.out.println("Yazi = " + Yazi);
    }
    
}