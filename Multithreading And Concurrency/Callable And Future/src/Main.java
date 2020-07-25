
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        
        /*
        executor.submit(new Runnable()
        {
            @Override
            public void run()
            {
                Random r = new Random();
                
                System.out.println("Thread Calisiyor...");
                
                int sure = 2000 + r.nextInt(1000);
                
                try
                {
                    Thread.sleep(sure);
                } 
                catch (InterruptedException ex)
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Thread Calismayı Durdurdu...");
            }
        });
        */
        
        Future<?> future = executor.submit(new Callable<Integer>() //Futurenin içine ? isaretikonulması otomatik return tipi demek
        {
            @Override
            public Integer call() throws Exception
            {
                Random r = new Random();
                
                System.out.println("Thread Calisiyor...");
                
                int sure = 2000 + r.nextInt(1000);
                
                if (sure > 2500)
                {
                    throw new IOException("Thread Cok Uyudu Gaaak gayri!");
                }   
                
                try
                {
                    Thread.sleep(sure);
                } 
                catch (InterruptedException ex)
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.println("Thread Calismayı Durdurdu...");
                
                return sure;
            }
        });
        
        executor.shutdown();
        
        try
        {
            System.out.println("Gecen Sure : " + future.get());
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex)
        {
            System.out.println(ex);
        }
    }
}
