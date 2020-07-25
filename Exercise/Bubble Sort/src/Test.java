import java.util.Scanner;

public class Test
{
    public static void Bubble(int Boyut, int X[])
    {
        int temp;
       
        for (int i = 0; i < Boyut; i++)
        {
            for (int j = 0; j < (Boyut - i - 1); j++)
            {
                if (X[j] > X[j+1])
                {
                    temp = X[j];
                    X[j] = X[j+1];
                    X[j+1] = temp;
                }
            }
        }
    }
    
    public static void Yazdir(int Boyut, int X[])
    {
        for (int i = 0; i < Boyut; i++)
        {
            System.out.print(X[i] + " ");
        }
        System.out.println();
    }
    
    public static void main (String Args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dizi Kac Elemanli Olacak Giriniz : ");
        int Boyut = scanner.nextInt();
        
        int i;
        int Arr[] = new int[Boyut];
        
        for (i = 0; i < Boyut; i++)
        {
            System.out.print("Lutfen Dizinin " + (i+1) + ".Elemanını Giriniz : ");
            Arr[i] = scanner.nextInt();
        }
        
        System.out.println("\nUnsorted Array : ");
        Yazdir(Boyut, Arr);
        
        Bubble(Boyut, Arr);
        
        System.out.println("\nSorted Array : ");
        Yazdir(Boyut, Arr);             
    }    
}
