
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectRead
{
    public static void main(String[] args)
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Ogrenciler.bin")))
        {
            Ogrenci Arr[] = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ArrList = (ArrayList<Ogrenci>) in.readObject();
            
            System.out.println("**********************************************");
            for (Ogrenci o : Arr)
            {
                System.out.println("--------------------------------------");
                System.out.println(o);
                System.out.println("--------------------------------------");
            }
            System.out.println("**********************************************");
            for (Ogrenci o : ArrList)
            {
                System.out.println("--------------------------------------");
                System.out.println(o);
                System.out.println("--------------------------------------");
            }
            System.out.println("**********************************************");
            
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadi...");
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception Olustu...");
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println("Class Bulunamadi...");
        }
            

            
    }
}
