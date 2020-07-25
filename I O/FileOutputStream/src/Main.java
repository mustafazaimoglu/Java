
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main
{
    public static void main(String[] args)
    {
        FileOutputStream fos = null;
        File file = new File("Metnim1.txt"); // Seklinde de FileOutputStreama da yazılabilirdi.
        
        try
        {
            fos = new FileOutputStream("Metnim.txt", true); // True Koymazsak her seferinde dosyayı silip yeniden yazma yapar!!!
            
            fos.write(65);
            fos.write(73);
            
            String s = " Mustafa Zaimoğlu";
            
            byte Arr[] = s.getBytes();
            
            fos.write(Arr);
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("File Not Found Exception Hatası Oluştu...");
        } catch (IOException ex)
        {
            System.out.println("IO Exception Hatası Oluştu...");
        }
        finally
        {
            try
            {
                fos.close();
            } catch (IOException ex)
            {
                System.out.println("Dosya Kapatılırken Bir Hata Oluştu;");
            }
        }
    }
}
