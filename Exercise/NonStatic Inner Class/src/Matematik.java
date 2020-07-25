
import java.util.Scanner;


public class Matematik
{
    private final double PI = Math.PI;
    
    public class Factorial
    {
        public void factorial()
        {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Lutfen Faktoriyeli Bulunacak Sayıyı Giriniz : ");
            int sayi = scanner.nextInt();
            int fakt = 1;
            
            for (int i = 2; i <= sayi; i++)
            {
                fakt = fakt * i;
            }
            
            System.out.println("Faktoriyel : " + fakt);
        }
        
    }
    
    public class Asal
    {
        public boolean AsalMi(int sayi)
        {
            int i = 2;
            
            while (sayi > i)
            {
                if (sayi % i == 0)
                {
                    return false;
                }
                i++;
            }
                
            return true;
        }
    }
    
    public class Alan
    {
        public class DaireAlan
        {
            public void dairealan(int yaricap)
            {
                System.out.println("Dairenin Alani : " + (yaricap * yaricap * PI));
            }
        }
        
        public class KareselAlan
        {
            public void karealan(int kenar)
            {
                System.out.println("Karenin Alani : " + (kenar * kenar));
            }
        }
    }
    
}
