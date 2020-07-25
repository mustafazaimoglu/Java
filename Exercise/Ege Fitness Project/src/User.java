
import java.util.Scanner;


public class User
{
    private String kullaniciAdi;
    private String parola;
    private String dersler[] = new String[3];
    private final String ID;

    public User()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Kullanici Adinizi Giriniz : ");
        this.kullaniciAdi = scanner.nextLine();
        
        System.out.print("Lutfen Parola Giriniz : ");
        this.parola = scanner.nextLine();
                
        for (int i = 0; i < dersler.length; i++)
        {
            System.out.print((i + 1) + ". Ders : ");
            dersler[i] = scanner.nextLine();
        }
                
        ID = kullaniciAdi.substring(0, 3) + parola.substring(parola.length() - 3, parola.length());
    }

    public User(String kullaniciAdi, String parola, String dersler[])
    {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.dersler = dersler;
        
        ID = kullaniciAdi.substring(0, 3) + parola.substring(parola.length() - 3, parola.length());
    }
    
    

    public String getKullaniciAdi()
    {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi)
    {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola()
    {
        return parola;
    }

    public void setParola(String parola)
    {
        this.parola = parola;
    }

    public String[] getDersler()
    {
        return dersler;
    }

    public void setDersler(String[] dersler)
    {
        this.dersler = dersler;
    }

    public String getID()
    {
        return ID;
    }
    
    
    
    
    


    
    
    
    
    
    
   
    
    
}
