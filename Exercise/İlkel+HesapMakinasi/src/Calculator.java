import java.util.Scanner;

public class Calculator 
{
    public static void Toplama(int x, int y, int z)
    {
        System.out.println(x+y+z);
    }
    
    public static void Toplama(int x, int y)
    {
        System.out.println(x+y);
    }
    
    public static void Cikarma(int x, int y)
    {
        System.out.println(x-y);
    }
    
    public static void Carpma(int x, int y, int z)
    {
        System.out.println(x*y*z);
    }
    
    public static void Carpma(int x, int y)
    {
        System.out.println(x*y);
    }
    
    public static void Bolme(int x, int y)
    {
        System.out.println((double)x/y);
    }
    
    public static void main (String[] Args)
    {
        Scanner scanner =  new Scanner(System.in);
        
        int a,b,c,number;
        
        System.out.println("********************************"
                + "\nHesap Makinesine Hosgeldiniz!"
                + "\n********************************");
        
        System.out.print("1. Toplama Islemi\n"
                + "2. Cikarma Islemi\n"
                + "3. Carpma Islemi\n"
                + "4. Bolme Islemi\n"
                + "Lutfen İslem Numarasini Giriniz : ");
        int islem = scanner.nextInt();
        
        switch (islem)
        {
            case 1:
                System.out.print("Kac Tane Sayi Girmek Istiyorsunuz : ");
                number = scanner.nextInt();
                
                switch (number)
                {
                    case 2:
                        System.out.print("A = ");
                        a = scanner.nextInt();
                        System.out.print("B = ");
                        b = scanner.nextInt();
                        Toplama(a,b);
                        break;
                    case 3:
                        System.out.print("A = ");
                        a = scanner.nextInt();
                        System.out.print("B = ");
                        b = scanner.nextInt();
                        System.out.print("C = ");
                        c = scanner.nextInt();
                        Toplama(a,b,c);
                        break; 
                    default :
                        System.out.println("Hatali Bir Tuslama Yaptiniz!");
                }
                break;
            case 2:
                System.out.print("A = ");
                a = scanner.nextInt();
                System.out.print("B = ");
                b = scanner.nextInt();
                Cikarma(a,b);              
                break;
            case 3:
                System.out.print("Kac Tane Sayi Girmek Istiyorsunuz : ");
                number = scanner.nextInt();
                
                switch (number)
                {
                    case 2:
                        System.out.print("A = ");
                        a = scanner.nextInt();
                        System.out.print("B = ");
                        b = scanner.nextInt();
                        Carpma(a,b);
                        break;
                    case 3:
                        System.out.print("A = ");
                        a = scanner.nextInt();
                        System.out.print("B = ");
                        b = scanner.nextInt();
                        System.out.print("C = ");
                        c = scanner.nextInt();
                        Carpma(a,b,c);
                        break; 
                    default :
                        System.out.println("Hatali Bir Tuslama Yaptiniz!");
                }
                break;
            case 4:
                System.out.print("A = ");
                a = scanner.nextInt();
                System.out.print("B = ");
                b = scanner.nextInt();
                Bolme(a,b);              
                break;
            default :
                System.out.println("Hatali Bir Tuslama Yaptiniz!");
                break;  
        }
    }   
}
