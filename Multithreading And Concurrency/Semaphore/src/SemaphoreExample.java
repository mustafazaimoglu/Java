
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SemaphoreExample
{
    private Semaphore sem = new Semaphore(3); // Thread Sınırı : 3
    
    public void function(int id)
    {
        try
        {
            sem.acquire();
            
            System.out.println("Thread " + id + " Calişiyor...");
            
            Thread.sleep(4000);
            
            System.out.println("Thread " + id + " Bitti...");
            
            sem.release();
        } 
        catch (InterruptedException ex)
        {
            Logger.getLogger(SemaphoreExample.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
