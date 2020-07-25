import java.util.Scanner;

public class Login 
{
    public boolean GirisYap(Kullanici MKZ1)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
        String MKZ = scanner.nextLine();
        
        return MKZ1.getSys_Kullanici().equals(MKZ);
    }
}
