
public class Main
{
    public static void main(String[] args)
    {
        IOgrenci ogrenci1 = new IOgrenci()
        {
            @Override
            public void dersCalis()
            {
                System.out.println("Ders Calisiyorum...");
            }

            @Override
            public void derseGir()
            {
                System.out.println("Derse Giriyorum...");         
            }
        };
        
        ogrenci1.dersCalis();
        ogrenci1.derseGir();
        
        System.out.println("***********************************************");
        
        AOgrenci ogrenci2 = new AOgrenci("Mustafa KUZ", "02180201066")
        {
            @Override
            public void kayitYaptir()
            {
                System.out.println("İsim : " + getIsim() + "\nNumara : " + getNumber() + "\nKayıt"
                        + " Edilmiştir.");
            }
        };
        
        ogrenci2.kayitYaptir();
        ogrenci2.selamla();
        
    }
    
}
