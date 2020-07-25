
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
    public static String harfnotuHesapla(String isim,int vize1,int vize2,int finalnot) 
    {
        String cikti = "";
        
        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);
        
        if (toplamnot >= 90) {
            cikti = isim + " bu dersten AA Aldı...";
        }
        else if (toplamnot >= 85) {
            cikti = isim + " bu dersten BA Aldı...";
            
        }
        else if (toplamnot >= 80) {
            cikti = isim + " bu dersten BB Aldı...";
            
        }
        else if (toplamnot >= 75) {
            cikti = isim + " bu dersten CB Aldı...";
            
        }
        else if (toplamnot >= 70) {
            cikti = isim + " bu dersten CC Aldı...";
            
        }
        else if (toplamnot >= 65) {
            cikti = isim + " bu dersten DC Aldı...";
            
        }
        else if (toplamnot >= 60) {
            cikti = isim + " bu dersten DD Aldı...";
            
        }
        else if (toplamnot >= 55) {
            cikti = isim + " bu dersten FD Aldı...";
            
        }
        else {
            cikti = isim + " bu dersten FF Aldı...";
        }
       return cikti;
        
    }
    
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("HamNot.txt")));
            BufferedWriter writer = new BufferedWriter(new FileWriter("HarfNotu.txt")))
        {
            while (scanner.hasNextLine())
            {
                String ogrenciBilgisi = scanner.nextLine();
                
                String bilgiler[] = ogrenciBilgisi.split(",");
                int vize1 = Integer.parseInt(bilgiler[1]);
                int vize2 = Integer.parseInt(bilgiler[2]);
                int finalNot = Integer.parseInt(bilgiler[3]);
                
                String sonuc = harfnotuHesapla(bilgiler[0], vize1, vize2, finalNot);
                
                writer.write(sonuc + "\n");
                
            }
        } 
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
