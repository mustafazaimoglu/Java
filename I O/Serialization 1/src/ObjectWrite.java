
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite
{
    public static void main(String[] args)
    {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenciler.bin")))
        {
            Ogrenci ogrenci1 = new Ogrenci("Mustafa KUZ", "Bilgisayar Muhendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Mehmet Şevki Şen", "Ekonometri");
            
            
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
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
