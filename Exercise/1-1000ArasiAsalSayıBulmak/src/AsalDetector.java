public class AsalDetector 
{
    public static boolean AsalBulucu (int x)
    {
        boolean t = true;
        for (int i = 2; i < x; i++)
        {
            if (x % i == 0)
            {
                t = false;
                break;
            }
        }
        
        return t;
    }
    public static void main(String[] Args)
    {
        boolean Asal;
        
        for (int i = 0; i < 1000; i++)
        {
            
            Asal = AsalBulucu(i);
            
            if (Asal != false)
            {
                System.out.println(i + " Asaldir");
            }
            
        }
    }
    
}
