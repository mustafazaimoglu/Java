
import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari
{
    private int Harc;
    private boolean Vize;
    private boolean Yasak;

    public Yolcu()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Odenen Harc Bedelini Giriniz : ");
        this.Harc = scanner.nextInt();
        scanner.nextLine(); //Dummy
        
        System.out.print("Vizeniz Var Mi? (evet ya da hayır) : ");
        String Cevap = scanner.nextLine();
        
        this.Vize = Cevap.equals("evet") || Cevap.equals("Evet");
        
        System.out.print("Siyasi Yasağınız Var Mi? (evet ya da hayır) : ");
        String Cevap2 = scanner.nextLine();
        
        this.Yasak = Cevap2.equals("evet") || Cevap2.equals("Evet");
    }

    
    
    @Override
    public boolean HarcKontrol()
    {
        if (this.Harc < 15)
        {
            System.out.println("Yurtdısı Harcını Tam Yatırmalısınız...");
            return false;
        }
        else
        {
            System.out.println("Harc Tam Yatırıldı.");
            return true;
        }
    }

    @Override
    public boolean VizeKontrol()
    {
        if (this.Vize == true)
        {
            System.out.println("Vize İslemi Tamam.");
            return true;
        }
        else
        {
            System.out.println("Gidilecek Ulkeye Vizeniz Bulunmamaktadır.");
            return false;
        }
    }

    @Override
    public boolean SiyasiYasakKontrol()
    {
       if (this.Yasak == true)
       {
           System.out.println("Siyasi Yasaktan Dolayı Yurt Dısına Gidemezsiniz!");
           return false;
       }
       else
       {
           System.out.println("Siyasi Yasağınız Bulunmamaktadır.");
           return true;
       }
    }
    
}
