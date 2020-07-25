
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main
{
    public static void main(String[] args)
    {
        //Buffered Reader File Reader ile aynı işi yapar fakat fileReader gibi 
        //Karakter karakter calışmaz. Parça Parça okuyarak HDD yi FileReader gibi çok meşgul etmez...
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Ogrenciler.txt"))) // (.txt , true) metnin devamına yazar
        {
            writer.write("Mustafa Zaimoğlu,Bilgisayar Mühendisliği\n");
            writer.write("Ege Barışan,Bilgisayar Mühendisliği\n");
            writer.write("Mehmet Şevki Şen,Ekonometri\n");
            writer.write("Eyyüb Gündoğdu,Maliye\n");
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("Ogrenciler.txt"))))
        {
            while (scanner.hasNextLine())
            {
                String ogrenci_bilgisi = scanner.nextLine();
                
                String Array[] = ogrenci_bilgisi.split(",");
                
                if (Array[1].equals("Bilgisayar Mühendisliği"))
                {
                    System.out.println(ogrenci_bilgisi);
                }
                
                //System.out.println(scanner.nextLine());
            }
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
    } 
}

