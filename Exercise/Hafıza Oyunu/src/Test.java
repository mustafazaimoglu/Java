
import java.util.Scanner;

public class Test
{
    private static Kart kartlar[][] = new Kart[4][4];
    
    public static void main (String Args[])       
    {       
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');
        
        while (OyunBittiMi() == false)
        {
            OyunTahtasi();
            
            TahminEt();
        }
        
    }
    
    public static void TahminEt()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci Tahmin (I ve J yi Bosluk Birakarak Giriniz) : ");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        i1--; j1--;
        
        kartlar[i1][j1].setTahmin(true);
        OyunTahtasi();
        
        System.out.print("Birinci Tahmin (I ve J yi Bosluk Birakarak Giriniz) : ");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        i2--; j2--;
        
        if (kartlar[i1][j1].getDeger() == kartlar[i2][j2].getDeger())
        {
            System.out.println("Tebrikler, Doğru Tahmin... \n");
            kartlar[i2][j2].setTahmin(true);
        }
        else
        {
            System.out.println("Yanlış Tahmin... \n");
            kartlar[i1][j1].setTahmin(false);
        }
        
    }
    
    public static void OyunTahtasi()
    {
        for (int i = 0; i < 4; i++)
        {
            if (i == 0)
            {
                System.out.println("    1    2    3    4");
            }
            System.out.println("  --------------------");
            System.out.print((i+1) + " ");
            for (int j = 0; j < 4; j++)
            {
                
                if (kartlar[i][j].isTahmin())
                {
                    System.out.print(" |" + kartlar[i][j].getDeger() + "| ");
                }
                else
                {
                    System.out.print(" | | ");
                }
            }
            System.out.println();
        }
        System.out.println("  --------------------");
    }
    
    public static boolean OyunBittiMi()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (kartlar[i][j].isTahmin() == false)
                {
                    return false;
                }
            }
        }
        return true;
    }
             
}
