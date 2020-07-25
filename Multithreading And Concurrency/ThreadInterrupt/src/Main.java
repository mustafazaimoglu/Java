
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        
        Thread t = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Thread Calısıyor...");
                
                for (int i = 0; i < 1000000; i++)
                {
                    if (Thread.currentThread().isInterrupted())
                    {
                        System.out.println("Dudeee What did you do? You Fucked The Thread!");
                        return;
                    }
                    list.add(i);
                }
                
                System.out.println("Thread Kesintiye Ugramadan İşini Bitirdi...");
                
                /*
                for (int i = 1; i <= 10; i++)
                {
                    try
                    {
                        Thread.sleep(1000);
                        System.out.println("Uykumun " + i + ". saniyesindeyim...");
                    } 
                    catch (InterruptedException ex)
                    {
                        System.out.println("Uykum Bolundü...");
                    }
                }
                
                System.out.println("Ne Uyudum beee...");
                */
            }
        });
        
        
        t.start();
        
        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t.interrupt();
        
        
        
    }
}
