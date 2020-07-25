
import java.util.logging.Level;
import java.util.logging.Logger;


public class Worker implements Runnable
{
    private String name;
    private int id;

    public Worker(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
     
    @Override
    public void run()
    {
        
        try
        {
            System.out.println("Thread " + name + " Calismaya Başladi..." + id );
            Thread.sleep(5000);
            System.out.println("Thread " + name + " Calismayı Bitirdi..." + id );
            
        } catch (InterruptedException ex)
        {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
