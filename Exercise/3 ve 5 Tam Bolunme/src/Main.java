
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sayi;
        
        System.out.print("Lutfen Bir Sayı Giriniz: ");
        sayi = sc.nextInt();
        
        for(int i = 1; i <= sayi; i++)
        {
            
            System.out.print(i + " --> ");
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("CengTurkey");
            }
            else if(i % 3 == 0)
            {
                System.out.print("Ceng");
            }
            else if(i % 5 == 0)
            {
                System.out.print("Turkey");
            }
            else
            {
                System.out.print("Null");
            }
            System.out.println();
        }
    }
}
