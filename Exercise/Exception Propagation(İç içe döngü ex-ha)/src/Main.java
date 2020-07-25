
public class Main
{
    // Hata fonksiyon cağırımı yapılan yerlerde veya fonkUc de yakalanabilir!!!
    // Örnegin fonk iki de de yakalanilabilir...
    // Fakat hata en basta yakalanmazsa yakalanıncaya kadarki kısımların bir kismı calısmaz!!!
    
    public static void fonkUc()
    {
        try
        {
            int a = 12 / 0;    
        }
        catch(ArithmeticException e)
        {
            System.out.println("Bir Hata Olustu (Arithmatic Exception)");
        }
        
        System.out.println("This shit is still working...");
    }
    public static void fonkIki()
    {
        System.out.println("MKZ*");
        fonkUc();
        System.out.println("MKZ**");
    }
    public static void fonkBir()
    {
        System.out.println("Fonk 1*");
        fonkIki();
        System.out.println("Fonk 1**");
    }
    public static void main(String[] args)
    {
        
        fonkBir();

        System.out.println("This thing is still working!!!");
    }
    
}
