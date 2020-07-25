
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OyunKayit
{
    public static void oyunKaydet(Kart[][] kartlar)
    {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Kayit.bin")))
        {
            System.out.println("Oyun Kaydediliyor...");
            
            out.writeObject(kartlar);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadi...");
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception");
            ex.printStackTrace();
        }
    }

    
    public static Kart[][] kayitYukle()
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Kayit.bin")))
        {
            Kart[][] cikti = (Kart[][]) in.readObject();
            return cikti;
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadi...");
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception");
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println("Class Bulunamadi...");
        }
        return null;
    }
}    
