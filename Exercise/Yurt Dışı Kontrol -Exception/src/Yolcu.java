
import java.util.Scanner;


public class Yolcu implements YurtDisiKurallari
{
    private int harc;
    private boolean vize;
    private boolean siyasiYasak;

    public Yolcu()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Odenen Harc Bedelini Giriniz : ");
        this.harc = scanner.nextInt();
        scanner.nextLine(); //Dummy
        
        System.out.print("Vizeniz Var Mi? (evet ya da hayır) : ");
        String Cevap = scanner.nextLine();
        
        this.vize = Cevap.equals("evet") || Cevap.equals("Evet");
        
        System.out.print("Siyasi Yasağınız Var Mi? (evet ya da hayır) : ");
        String Cevap2 = scanner.nextLine();
        
        this.siyasiYasak = Cevap2.equals("evet") || Cevap2.equals("Evet");
    }
    
    

    @Override
    public void harcKontrol() throws HarcException
    {
        if (harc < 15)
        {
            throw new HarcException();
        }
        else
        {
            System.out.println("Harc Tam Yatirilmis...");
        }
    }

    @Override
    public void vizeKontrol() throws VizeException
    {
        if (vize == true)
        {
            System.out.println("Vizeniz Bulunmaktadır...");
        }
        else
        {
            throw new VizeException();
        }
    }

    @Override
    public void siyasiYasakKontrol() throws SiyasiException
    {
        if (siyasiYasak == true)
        {
            throw new SiyasiException();
        }
        else
        {
            System.out.println("Herhangi Bir Yasağınız Bulunmamaktadır...");
        }
    }


}

