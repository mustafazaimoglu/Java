
import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        FileWriter writer = null;
        
        try
        {
            writer = new FileWriter("Dosya.txt",true); //true olursa dosyada kalınan yerden devam eder.
            
            writer.write("Mustafa Zaimoğlu\n");
            writer.write("Ayse Zaimoğlu\n");
            writer.write("GÜLNAR!!!");

        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception Oluştu.");
        }
        finally
        {
            if (writer != null)
            {
                try
                {
                    writer.close();
                } 
                catch (IOException ex)
                {
                    System.out.println("Dosya Kapatılırken Bir Hata Oluştu.");
                }
            }
        }
    }
}
