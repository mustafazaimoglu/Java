import java.util.Scanner;

public class YerDegistirici 
{
    public static void main(String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int a,b,temp;
        
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        a = scanner.nextInt();
        System.out.print("Lutfen Bir Sayı Daha Giriniz : ");
        b = scanner.nextInt();
        
        System.out.println("Degismeden Onceki Hali : ");
        System.out.println("a = " + a + " b = " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Degisimden Sonraki Hali : ");
        System.out.println("a = " + a + " b = " + b);  
    }
    
}
