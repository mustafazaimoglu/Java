
public class Main
{
    public static void main(String[] args)
    {
        // Catch Bloklari yazilirken ozelden genele doğrudur.
        // En basa super class yazılmaz!!!
        // En basta super class olursa hersey ona takılır aranan sıkıntı bulunamaz!!!
        // Bir Hata bulunup yakalanırsa Son Catchdan devam eder!!!
        // e.printStackTrace hatanın javadaki Metnini yazar!!!
        
        try
        {
            int a = 30 / 0;
            
            int b[] = {1,2,3,4,5};
            
            System.out.println(b[6]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Herhangi Bir Sayi 0'a Bolunemez");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Dizinin Boyutunu Aştınız");
        }
        catch(Exception e)
        {
            System.out.println("Bir Hata Oluştu!!!");
            e.printStackTrace();
        }
        System.out.println("This shit is still working....");
                
    }
    
}
