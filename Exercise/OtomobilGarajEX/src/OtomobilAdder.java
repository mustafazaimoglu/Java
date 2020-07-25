import java.util.Scanner;

public class OtomobilAdder 
{
    public Otomobil Adder()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Eklemek İstediginiz Aracın Özelliklerini Giriniz!");
        System.out.print("Lutfen Aracın Modelini Giriniz : ");
        String Model = scanner.nextLine();
        
        System.out.print("Lutfen Aracın Üretim Yılını Giriniz : ");
        int Yıl = scanner.nextInt();
        scanner.nextLine(); //Dummy
        
        System.out.print("Lutfen Aracın Motor Hacmini Giriniz : ");
        String Motor = scanner.nextLine();
        
        System.out.print("Lutfen Aracin Kilometresini Giriniz : ");
        int Kilometre = scanner.nextInt();
        
        Otomobil mkz = new Otomobil(Model,Yıl,Motor,Kilometre);
        
        return mkz;
    }
    
}
