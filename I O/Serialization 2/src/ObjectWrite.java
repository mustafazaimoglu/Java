
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjectWrite
{
    public static void main(String[] args)
    {
        Ogrenci ogrenci1 = new Ogrenci("Mustafa Zaimoğlu", "Bilgisayar Muhendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Mehmet Şevki Şen", "Ekonometri");
        Ogrenci ogrenci3 = new Ogrenci("Eyyüb Gündoğdu", "Maliye");
         
        Ogrenci Array[] = {ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> arrayList = new ArrayList<>(Arrays.asList(Array));
              
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Ogrenciler.bin")))
        {          
            out.writeObject(Array);
            out.writeObject(arrayList);
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
