
public class Tester
{
    public static void StringTersCevirici(int x)
    {
        int p;
        String Ters = "";
        
        while (x > 0)
        {
            p = x % 10;
            x = (x - p) / 10;
            Ters += p;           
        }
        System.out.println(Integer.valueOf(Ters));
    }
    
    public static void IntegerTersCevirici(int x)
    {
        int p,Ters = 0;
        
        while (x > 0)
        {
            p = x % 10;
            x = (x - p) / 10;
            Ters = (Ters*10)+p;
        }
        System.out.println(Ters);
        
    }
    
    public static void main(String[] args)
    {
        StringTersCevirici(152);
        IntegerTersCevirici(168);
        System.out.println();

        StringTersCevirici(78549);
        IntegerTersCevirici(15487);
    }
    
}
