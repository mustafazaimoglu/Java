
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char charArr[] =
        {
            'A', 'B', 'C'
        };
        HashMap<String, Integer> map = new HashMap<>();
        int n;

        System.out.print("Lutfen bir sayi giriniz: ");
        n = sc.nextInt();

        char arr[] = new char[n];
        Random r = new Random();

        for (int i = 0; i < n; i++)
        {
            arr[i] = charArr[r.nextInt(3)];
            System.out.println(arr[i]);
        }

        map.put("A", 0);
        map.put("B", 0);
        map.put("C", 0);

        for (int i = 0; i < n; i++)
        {
            if (arr[i] == 'A')
            {
                map.put("A", map.get("A") + 1);
            }
            else if (arr[i] == 'B')
            {
                map.put("B", map.get("B") + 1);
            }
            else if (arr[i] == 'C')
            {
                map.put("C", map.get("C") + 1);
            }
        }

        for (Integer i : map.values())
        {
            System.out.println(i);
        }
        
        System.out.println("Toplam Top Çifti Sayısı : " + (map.get("A")/2 + map.get("B")/2 + map.get("C")/2));
    }
}
