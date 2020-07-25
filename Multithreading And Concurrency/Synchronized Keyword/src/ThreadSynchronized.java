
public class ThreadSynchronized
{
    private int count = 0;
    
    public synchronized void arttir() // SYNCHRONIZED key word sayesinde bu fonksiyon bi anda bir kez calisabiliyor.
    {
        count++;
    }
    
    public void threadlariAc()
    {
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 5000; i++)
                {
                    arttir();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 5000; i++)
                {
                    arttir();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        try
        {
            t1.join();
            t2.join();
        } 
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        
        
        System.out.println("Count : " + count);
    }
    
    public static void main(String[] args)
    {
        ThreadSynchronized ts = new ThreadSynchronized();
        
        ts.threadlariAc();
        
        System.out.println("Main Count : " + ts.count);
        
    }
    
}
