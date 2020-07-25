import java.util.Scanner;

public class Tester
{
    public static void Yazdir(int Boyut,char X[][])
    {
        for (int i = 0; i < Boyut; i++)
        {
            for (int j = 0; j < Boyut; j++)
            {
                System.out.print(X[i][j] + " ");
            }
            System.out.println();
        }      
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Matris Boyutu Kac Olsun : ");
        int MBoyut = scanner.nextInt();
        
        char Matris[][] = new char[MBoyut][MBoyut];
        
        for (int i = 0; i < MBoyut; i++)
        {
            for (int j = 0; j < MBoyut; j++)
            {
                if (i == j || (i + j == MBoyut-1))
                {
                    Matris[i][j] = '*';
                }
                else
                {
                    Matris[i][j] = ' ';
                }                
            }           
        }
        
        Yazdir(MBoyut, Matris);
   
    }
    
}
