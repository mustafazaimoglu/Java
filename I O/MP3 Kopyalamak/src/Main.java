
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
        long basla = System.currentTimeMillis();
        
        yaz("Mars2.mp3");
        yaz("Mars3.mp3");
        yaz("Mars4.mp3");
        yaz("Mars5.mp3");
        yaz("Mars6.mp3");
        yaz("Mars7.mp3");
        yaz("Mars8.mp3");
        yaz("Mars9.mp3");
        yaz("Mars10.mp3");
        
        long bitis = System.currentTimeMillis();
        
        System.out.println("Islemin tamamlanma süresi : " + ((bitis - basla) / 1000) + " Saniye");
        
    }
}
