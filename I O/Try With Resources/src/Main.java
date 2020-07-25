
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try (FileWriter writer = new FileWriter("Text.txt"))
        {
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                System.out.print("Lutfen Bir Dil Giriniz : ");
                String dil = scanner.nextLine();
                
                if (dil.equals("00"))
                {
                    System.out.println("Programdan Cikildi...");
                    System.out.println("Check the file!");
                    break;
                }
                
                writer.write(dil + "\n");
            }
        } 
        catch (IOException ex)
        {
            System.out.println("IO Exception Oluştu!");
        }
    }
    
}
