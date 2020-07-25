import java.util.Scanner;

public class Adder 
{
    public Students StudentsAdd()
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("\nLutfen Ogrencinin İsmini Giriniz : ");
        String Isim = scanner.nextLine();
                
        return new Students(Isim);
    }
    
    public School SchoolAdd()
    {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Lutfen Okul İsmi Giriniz : ");
        String OkulIsmi = scanner.nextLine();
        
        System.out.print("Lutfen Ogrencinin Sinifini Giriniz : ");
        String SinifNumarasi = scanner.nextLine();
        
        return new School(OkulIsmi, SinifNumarasi);
    }   
}
