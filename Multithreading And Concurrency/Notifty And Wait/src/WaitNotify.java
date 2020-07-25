
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WaitNotify
{
    private Object lock = new Object(); // Bu Anahtara göre kimin kimi uyandıracagi belirleniyor.
    
    public void func1()
    {
        synchronized(lock)
        {
            System.out.println("Thread 1 Calışıyor...");
            System.out.println("Thread 1 beklemede Thread 2 Tarafından Tetiklenmeyi bekliyor...");
            
            try
            {
                lock.wait();
            } 
            catch (InterruptedException ex)
            {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Thread 1 Tetiklendi Calimaya devam ediyor.");
            
            System.out.println("Mustafa Zaimoğlu");
            System.out.println("Mustafa Zaimoğlu");
             
        }
             
        
    }
    
    public void func2()
    {
        Scanner scanner = new Scanner(System.in);
        
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException ex)
        {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        synchronized(lock)
        {
            System.out.println("Thread 2 Calisiyor...");
            
            System.out.println("Şefim yatacak yer varsa entere bas da thread 1 i tetikleyeyim...");
            
            scanner.nextLine();
            
            lock.notify();
            System.out.println("Şefim ben o işi hallettim gerisi sende!");
            
            try
            {
                Thread.sleep(2000);
            } catch (InterruptedException ex)
            {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
