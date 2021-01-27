
import java.util.Scanner;

public class Test
{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        
        Daire daire1 = new Daire(5, "Mor");
        Daire daire2 = new Daire(8);
        Daire daire3 = new Daire();
        
        daire1.alanHesapla();
        System.out.println(daire1.getRenk());
        
        daire2.cevreHesapla();
        
        daire1.setRenk("Yesil");
        System.out.println(daire1.getRenk());
        
        daire3.alanHesapla();
        System.out.println(daire3.getRenk());
        
        System.out.print("Lutfen Bir Yaricap Giriniz : ");
        int yaricap = sc.nextInt();
        sc.nextLine(); //Dummy
        
        System.out.print("Lutfen Bir Renk Giriniz : ");
        String renk = sc.nextLine();
        
        Daire daire4 = new Daire(yaricap, renk);
        
        System.out.println(daire4.getRenk());
        daire4.alanHesapla();
        
        daire3.setYaricap(9);
        daire3.alanHesapla();
        
        daire1.Information();
        daire4.Information();
               
        
        Daire mkz[] = new Daire[2];
        
        mkz[0] = new Daire(2, "Pink");
        mkz[1] = new Daire(8, "Cyan");
        
        for (Daire x : mkz)
        {
            x.Information();
        }
   
    }
    
}
