public class Tablo 
{
    public static void main (String[] Args)
    {
        int i,j;
        String Sayilar[] = {"Birler","Ikiler","Ucler","Dortler","Besler","Altilar","Yediler","Sekizler","Dokuzlar","Onlar"};
        
        System.out.println("****CARPIM TABLOSU*****");
                
        for (i = 1; i <= 10; i++)
        {
            System.out.println(Sayilar[i-1] + " : ");
            System.out.println("***********************");      
            for (j = 1; j <= 10; j++)
            {
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println("***********************\n");
        }
    }
    
}
