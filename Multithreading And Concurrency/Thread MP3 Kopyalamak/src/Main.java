
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{


    private static ArrayList<Integer> icerik = new ArrayList<>();
    
    public static void oku()
    {
        try
        {
            FileInputStream in = new FileInputStream("marş.mp3");
            
            int oku;
            
            while ((oku = in.read()) != -1)
            {
                icerik.add(oku);
            }
        } 
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void yaz(String isim)
    {
        try
        {
            FileOutputStream out = new FileOutputStream(isim);
            
            for(int A : icerik)
            {
                out.write(A);
            }
        } 
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void main(String[] args)
    {
        oku();
        
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars2.mp3");
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars3.mp3");
            }
        });
        Thread t3 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars4.mp3");
            }
        });
        Thread t4 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars5.mp3");
            }
        });
        Thread t5 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars6.mp3");
            }
        });
        Thread t6 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars7.mp3");
            }
        });
        Thread t7 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars8.mp3");
            }
        });
        Thread t8 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars9.mp3");
            }
        });
        Thread t9 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                yaz("Mars10.mp3");
            }
        });

        long basla = System.currentTimeMillis();
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        
        
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
        
        } 
        catch (InterruptedException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("Islemin tamamlanma süresi : " + ((bitis - basla) / 1000) + " Saniye");
        
    }
}
