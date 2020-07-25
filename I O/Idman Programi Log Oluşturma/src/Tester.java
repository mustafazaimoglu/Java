
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tester 
{   
    public static int Soru(String Hareket)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç Adet "+ Hareket +" Yapmak İstiyorsunuz : ");
        int Sayi = scanner.nextInt();
        
        return Sayi;
    }
       
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int Situp;
        int Pushup;
        int Squat;
        
        String Hareketler = "**** Geçerli Hareketler ****\n"
                + "Pushup\n"
                + "Situp\n"
                + "Squat\n";
                        
        System.out.println("********************************"
                + " Idman Programina Hoşgeldiniz! "
                + "********************************");
        
        System.out.println(Hareketler);
        
        System.out.println("Lütfen Idmanınızı Olusturunuz!");
        System.out.print("Pushup Sayisi : ");
        Pushup = scanner.nextInt();
        System.out.print("Situp Sayisi : ");
        Situp = scanner.nextInt();
        System.out.print("Squat Sayisi : ");
        Squat = scanner.nextInt();
        scanner.nextLine(); // Dummy
                
        Idman idman1 = new Idman(Pushup, Situp, Squat);
        
        try(FileWriter writer = new FileWriter("Log.txt"))
        {
            writer.write("İdman Programi...\n");
            writer.write("Pushup Sayisi : " + Pushup);
            writer.write("\nSitup Sayisi : " + Situp);
            writer.write("\nSquat Sayisi : " + Squat + "\n\n");
            
            int i = 1;
            while (idman1.AntrenmanSonu() == false)
            {
                System.out.print("\nYapmak İstediğiniz Hareketi Giriniz : ");
                String Name = scanner.nextLine();
                int Sayi = 0;

                switch (Name) 
                {
                    case "Pushup" :
                        Sayi = Soru("Pushup");
                        idman1.pushupYap(Sayi);
                        break;
                    case "Situp" :
                        Sayi = Soru("Situp");
                        idman1.situpYap(Sayi);
                        break;
                    case "Squat" :
                        Sayi = Soru("Squat");
                        idman1.squatYap(Sayi);
                        break;
                    default :
                        System.out.println("Girilen Hareket Bulunamadi!");
                        continue;
                }
                
                writer.write(i + ".Hareket : " + Name + " Tekrar Sayisi : " + Sayi + "\n");
                i++;
            }
            
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
        System.out.println("Tebrikler Programi Basari ile Bitirdiniz...");
    }
    
        
}
    

