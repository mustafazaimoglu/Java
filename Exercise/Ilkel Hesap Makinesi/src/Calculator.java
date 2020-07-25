import java.util.Scanner;

public class Calculator 
{
    public static void main(String[] Args)
    {
        Scanner scanner = new Scanner (System.in);
        int sayi1,sayi2;
        
        
        while (true)
        {
            System.out.println("***********************************");
            System.out.println("1. Toplama\n2. Cikarma\n3. Carpma\n4. Toplama");
            System.out.println("***********************************");
            System.out.print("Lutfen Islem Numarasini Giriniz :");
            int islem = scanner.nextInt();
            
            boolean k = true;
         
            switch (islem)
            {
                case 1: 
                    System.out.print("1.Sayiyi Giriniz : ");
                    sayi1 = scanner.nextInt();
                    System.out.print("2.Sayiyi Giriniz : ");
                    sayi2 = scanner.nextInt();
                    System.out.println("Toplama İslemi Sonucu : "+ (sayi1+sayi2));
                    break;
                 
                case 2:
                    System.out.print("1.Sayiyi Giriniz : ");
                    sayi1 = scanner.nextInt();
                    System.out.print("2.Sayiyi Giriniz : ");
                    sayi2 = scanner.nextInt();
                    System.out.println("Cikarma İslemi Sonucu : "+ (sayi1-sayi2));
                    break;
                    
                case 3:
                    System.out.print("1.Sayiyi Giriniz : ");
                    sayi1 = scanner.nextInt();
                    System.out.print("2.Sayiyi Giriniz : ");
                    sayi2 = scanner.nextInt();
                    System.out.println("Carpma İslemi Sonucu : "+ (sayi1*sayi2));
                    break;
                    
                case 4:
                    System.out.print("1.Sayiyi Giriniz : ");
                    sayi1 = scanner.nextInt();
                    System.out.print("2.Sayiyi Giriniz : ");
                    sayi2 = scanner.nextInt();
                    System.out.println("Bolme İslemi Sonucu : "+ ((double)sayi1/sayi2));
                    break;
                    
                default : 
                    System.out.println("Yanlis Bir Islem Numarasi Girdiniz!");
                    k = false;
                    break;
            }
            
            if (k == true)
            {
                break;
            }
            
            
        }
    }
    
}
