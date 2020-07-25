
public class Main
{
    public static void main(String[] args)
    {
        class Renk
        {
            public void Okuyucu(String Renk)
            {
                System.out.println("Renk : " + Renk);
            }
        }
        
        
        Renk mor = new Renk();
        
        mor.Okuyucu("Mor");
        
        Renk sari = new Renk();
        
        sari.Okuyucu("Sari");
        
    }
    
    public static void Deneme()
    {
      //  Renk sarı = new Renk("Sarı"); Method icinde oldugu ıcın erisilemiyor.
        
        
    }
    
}
