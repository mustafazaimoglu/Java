
public class Main
{
    public static void main(String[] args)
    {
        ReentrantLockExample RLE = new ReentrantLockExample();
        
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                RLE.func1();
            }
        });
        
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                RLE.func2();
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
        
        RLE.finito();
    }
    
}
