
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lutfen Matris Boyutunu Giriniz : ");
        int boyut = sc.nextInt();
        
        String matris[][] = new String[boyut][boyut];
        
        
        for (int i = 0; i < boyut; i++)
        {
            for (int j = 0; j < boyut; j++)
            {
                if (i == j || i + j == boyut-1)
                {
                    matris[i][j] = "*";
                }
                else
                {
                    matris[i][j] = " ";
                }
            }
        }
        
        /*
        for (int i = 0; i < boyut; i++)
        {
            for (int j = 0; j < boyut; j++)
            {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        */
        
        for (String s1[] : matris)
        {
            for (String s : s1)
            {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        
    }
}
