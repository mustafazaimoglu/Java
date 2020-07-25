
public class Main
{
    public static void main(String[] args)
    {
        WaitNotify wn = new WaitNotify();
        
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                wn.func1();
            }
        });
        
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                wn.func2();
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
    }
    
}
