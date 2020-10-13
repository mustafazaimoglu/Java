
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static List<String> generateParantheses(int n)
    {
        List<String> list = new ArrayList<>();
        char arr[] = new char[n * 2];
        char right = '(';
        char left = ')';
        Arrays.fill(arr, left); //tüm arrayı leftle doldurmak
        arr[0] = right;

        for(int i = 1;i < (n*2) - 1; i++)
        {
//            for(int j = i; j < )
        }
                        
           

//            for (int i = 1; i < (n - 1); i++)
//            {
//
//            }
        return list;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen bir sayı giriniz: ");
        int n = sc.nextInt();

        List<String> list = generateParantheses(n);

        System.out.println(list);
    }
}
