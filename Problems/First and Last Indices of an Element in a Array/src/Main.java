
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void find(ArrayList<Integer> array,int target)
    {
        int firstIndex = -1;
        int lastIndex = -1;
        
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i) == target)
            {
                if (firstIndex == -1)
                {
                    firstIndex = i;
                }
                else
                {
                    if (array.get(i+1) != target)
                    {
                        lastIndex = i;
                    }
                }
            }
        }
        
        System.out.println("Indexes : " + "[" + firstIndex + "," + lastIndex +"]");
    }
    
    public static void sort(ArrayList<Integer> array)
    {
        for (int i = 0; i < array.size(); i++)
        {
            for (int j = 0; j < array.size(); j++)
            {
                if (j != (array.size() - 1))
                {
                    if (array.get(j) > array.get(j + 1))
                    {
                        int temp = array.get(j); 
                        array.set(j, array.get(j + 1));
                        array.set(j + 1, temp);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        
        System.out.println("Lutfen Degerleri Giriniz!\n"
                + "İşlemi sonlandırmak için q ya basın.");
        while (true)
        {
            System.out.print(": ");
            String element = scanner.nextLine();
            
            if (element.equals("q"))
            {
                break;
            }
            
            try
            {
                array.add(Integer.valueOf(element));
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Hatalı Bir Giris Yaptınız!");
            }        
        }
        
        System.out.print("Lutfen Aranan Degeri Giriniz : ");
        int target = scanner.nextInt();
        
        sort(array);
        
        find(array, target);
    }
}
