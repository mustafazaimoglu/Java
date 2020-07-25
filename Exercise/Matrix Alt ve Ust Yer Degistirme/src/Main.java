
public class Main
{
    public static void Yazdir(int x[][])
    {
        System.out.println("************************");
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("************************");
    }
    
    public static void reverseIt(int x[][])
    {
        int a[][] = new int[6][6];
        
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                int temp = x[i][j];
                int temp2 = x[j][i];
                a[i][j] = temp2;
                a[j][i] = temp;  
            }
        }
       
        Yazdir(a);
    }
    
    public static void main(String args[])
    {
        int matris[][] = new int[6][6];
        
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (i == j)
                {
                    matris[i][j] = 0;
                }
                else if (i > j)
                {
                    matris[i][j] = 4;
                }
                else
                {
                    matris[i][j] = 1;
                }
            }
        }
        
        
        Yazdir(matris);
        
        reverseIt(matris);
    }
    
}
