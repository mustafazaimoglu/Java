
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead
{
    public static void main(String[] args)
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ogrenci.bin")))
        {
            Ogrenci ogr1 = (Ogrenci) in.readObject();
            
            System.out.println(ogr1);
            System.out.println("Ogrenci Sayisi : " + ogr1.getOgrenciSayisi()); //Staticler classa aittir.
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadi...");
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception Olustu...");
            ex.printStackTrace();
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println("Class Bulunamadi...");
        }
            

            
    }
}
