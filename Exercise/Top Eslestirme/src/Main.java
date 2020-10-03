
import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char charArr[] = {'A','B','C'};
        int n;
        
        System.out.print("Lutfen bir sayi giriniz: ");
        n = sc.nextInt();
        
        char arr[] = new char[n];
        Random r = new Random();
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = charArr[r.nextInt(3)];
            System.out.println(arr[i]);
        }
        
        
    }
}
