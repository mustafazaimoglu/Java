
import java.util.Arrays;
import java.util.Scanner;

public class Test
{
    public static int[] ArrayDoldur(int Sayi)
    {
        Scanner scanner = new Scanner(System.in);
        int Arr[] = new int[Sayi];
        
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.print((i+1) + ". Degeri Giriniz : ");
            Arr[i] = scanner.nextInt();
        }
        
        return Arr;
    }
    
    public static void Yazdir(int Arr[])
    {
        for (int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void ArraySort(int Arr[])
    {
        Arrays.sort(Arr);
        
        System.out.println("Sorted Array : ");
        Yazdir(Arr);
    }
    
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Lutfen Boyut Giriniz : ");
        int Boyut = scanner.nextInt();
        
        int MKZ[] = ArrayDoldur(Boyut);
        
        System.out.println("Unsorted Array : ");
        Yazdir(MKZ);
        
        ArraySort(MKZ);
        
        System.out.println();
        
        int Arr1[] = {1,2,3,4,5,6,7,8};
        int Arr2[] = {1,2,3,4,5,6,7,8};
        
        if (Arrays.equals(Arr1, Arr2))
        {
            System.out.println("Eşittirler!");
        }
        else
        {
            System.out.println("Eşit Değildirler!");
        }
   

    }
}
