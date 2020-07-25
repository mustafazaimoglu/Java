
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite
{
    public static void main(String[] args)
    {
        Ogrenci ogrenci1 = new Ogrenci("Mustafa Zaimoğlu", "Bilgisayar Muhendisliği");
        ogrenci1.setOgrenciSayisi(100);
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenci.bin")))
        {          
            out.writeObject(ogrenci1);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadi...");
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception Oluştu...");
            ex.printStackTrace();
        }       
        
        
    }   
    
}
