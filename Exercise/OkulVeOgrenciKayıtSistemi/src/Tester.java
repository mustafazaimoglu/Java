import java.util.Scanner;

public class Tester 
{
    public static void main (String[] Args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Kac Tane Öğrenci Kayıt Etmek "
                + "İstediğinizi Giriniz : ");
        int OgrenciSayisi = scanner.nextInt();
        scanner.nextLine(); //Dummy
        
        Adder adder = new Adder();
        
        Students Ogrenciler[];
        Ogrenciler = new Students[OgrenciSayisi];
        
        School Okullar[];
        Okullar = new School[OgrenciSayisi];
        
        for (int i = 0; i < OgrenciSayisi; i++)
        {
            Ogrenciler[i] = adder.StudentsAdd();
            Okullar[i] = adder.SchoolAdd();            
        }
        
        System.out.println("\n********************************************");
        System.out.println("Ogrenci Bulma Sistemine Hoş Geldiniz");
        System.out.println("********************************************");
        while (true)
        {
            System.out.println("\nBulmak İstediğiniz Ogrencinin Adını Giriniz"
                    + "\nCıkmak İçin \"q\" ya Basabilirsiniz!");
            System.out.print("Please Enter : ");
            String İslem = scanner.nextLine();
            
            if (İslem.equals("q"))
            {
                System.out.println("Programi Kullandiginiz İcin Tesekkür ederiz!"
                        + "\nProgramdan Cıkılıyor...");
                break;
            }
            else
            {
                boolean Bulmak = false;
                for (int i = 0; i < OgrenciSayisi; i++)
                {
                    if (İslem.equals(Ogrenciler[i].getOgrenciIsmi()))
                    {
                        System.out.println("Okudugu Okul : " + Okullar[i].getOkulIsmi() +
                                "\nSınıfı : " + Okullar[i].getSinifNumarasi());
                        Bulmak = true;
                    }   
                }
                               
                if (Bulmak == false)
                {
                    System.out.println("Aradığınız İsimle Eşleşen Öğrenci Bulunamadi!");
                }
            }            
        }        
    }    
}
