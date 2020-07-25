
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        
        try
        {
            fis = new FileInputStream("Dosyam.txt");
            
            /*
            System.out.println("Birinci Karakter : " + (char)fis.read());
            System.out.println("İkinci Karakter : " + (char)fis.read());
            System.out.println("Ücüncü Karakter : " + (char)fis.read());
            System.out.println("Dördüncü Karakter : " + (char)fis.read());
           */
            
            // .read() komutu ıterator mantıgında calısmaktadir...
            
            /*
            fis.skip(5); // Karakter Arası Atlama Yapmak için...
            
            System.out.println("5. Karakter : " + (char)fis.read());
            */
            
            //Tum Dosyayı Okumak İçin...
            
            int deger, c = 0;
            String string = "";
            String string2 = "";
            
            while ((deger = fis.read()) != -1)
            {
                string += (char) deger;
                
                c++;
                
                if (c > 4 && c <= 16) //fis.skip(5); kullanilanibilir.
                {
                    string2 += (char) deger;
                }
            }
            
            System.out.println("Metnin Tam Hali : " + string);
            System.out.println("Metnin 5. Karakterden Sonraki 11 Karakteri : " + string2);
        } 
        catch (FileNotFoundException ex)
        {
            System.out.println("Dosya Bulunamadi!!!");
        } catch (IOException ex)
        {
            System.out.println("IO Exception Hatası Oluştu...");
        }
        finally
        {
            try
            {
                fis.close(); //Dosya Kapatılmalı....
            } 
            catch (IOException ex)
            {
                System.out.println("IO Exception Hatası Oluştu...");
            }
        }
    }
}
