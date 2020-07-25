public class IfStatement 
{
    public static void main (String Args[])
    {
        long a = 158;
        int b = 84;
        float c = 83.99f;
        double d = 84.01;
        short e = 13;
        
        
        if (a > b)
        {
            System.out.println("A B den Buyuktur ve fark = "+(a-b));
        }
        
        if (b == e)
        {
            System.out.println("Esittir");
        }
        else
        {
            System.out.println("Esit Degildir");
        }
        
        if (d > c && b > c)
        {
            System.out.println("C den Buyuklerdir");
        }
        
        if (b%2 == 0)
        {
            System.out.println("B Sayısı 2 ye tam bolunur");
        }
    }    
        
}
