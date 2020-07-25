
public class Main
{
    public static void main(String[] args)
    {
        // Bir Exception Handling şemasında finally varsa kesinlikle calisir.
        // Finally bloğu içerisine hata olussa bile kesinlikle yerine getirilmesi gereken işler yazılır.
        // Yazılandan farklı bir hata yakalansa bile finally calısır fakat program devam etmez!!!
        
        try
        {
            //int a = 30 / 0;
            
            String s = null;
            
            System.out.println(s.hashCode());
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Referans Hatasi...");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("Finally Bloğu Çalışıyor...");
        }
        
        System.out.println("This shit is still working...");
    }
    
}
