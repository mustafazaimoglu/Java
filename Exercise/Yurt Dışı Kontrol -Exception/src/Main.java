
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        String Islemler = "\tYurtdışı Cıkıs Kurallari :  \n"
                + "1 - Herhangi Bir Siyasi Yasağınız Bulunmamali!\n"
                + "2 - 15 TL Yurtdısı Harcını Tam Yatırmalısınız!\n"
                + "3 - Gidilecek Ülkeye Vizeniz Olmali!";
        
        String Message = "Yurtdışı Sartlarının Hepsini Tamamlamaniz Gerekiyor!!!\n";
        
        System.out.println("**** Havalimanına Hos Geldiniz ****");
        
        while (true)
        {
            System.out.println("*************************************");
            System.out.println(Islemler);
            System.out.println("*************************************");
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc Bedeli Kontrol Ediliyor...");
            Thread.sleep(2500);
            
            try
            {
                yolcu.harcKontrol();
            } 
            catch (HarcException ex)
            {
                ex.printStackTrace();
                System.out.println(Message);
                continue;
            }
            
            System.out.println("Vize Kontrol Ediliyor...");
            Thread.sleep(2500);
            
            try
            {
                yolcu.vizeKontrol();
            } 
            catch (VizeException ex)
            {
                ex.printStackTrace();
                System.out.println(Message);
                continue;
            }
            
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(2500);
            
            try
            {
                yolcu.siyasiYasakKontrol();
            } 
            catch (SiyasiException ex)
            {
                ex.printStackTrace();
                System.out.println(Message);
                continue;
            }
            
            System.out.println("Everything is fine! You are free to go to abroad.");
            break;
        }
    }
    
}
