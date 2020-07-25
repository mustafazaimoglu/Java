public class Test
{
    public static void Yazdir(int Matris[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(Matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void BirYapici(int X[][])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (i == j || (j+i == 4))
                {
                    X[i][j] = 1;
                }
            }
        }
    }
    
    public static void main(String[] args) 
    {
        int Matris[][] = new int[5][5];
        int i,j,c = 3;
        
        for (i = 0; i < 5; i++)
        {
            for (j = 0; j < 5; j++)
            {
                Matris[i][j] = c;               
            }
            c++;
        }
        
        System.out.println("Matris İlk Hali : ");
        Yazdir(Matris); //Matris Yazdırıcı Metodu Calıştırıyor...
        
        BirYapici(Matris);
        
        System.out.println("Matris Son Hali : ");
        Yazdir(Matris);
   
    }
    
}
