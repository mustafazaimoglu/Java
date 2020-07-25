public class Tester 
{
    public static void main(String[] args) 
    {
        Otomobil mkz = new Otomobil("2");
        
        System.out.println(mkz.BuNedir());
        System.out.println("Tekerlek Sayisi : " + mkz.getTekerlekSayisi());
        
        Tasit mkz1 = new Tasit("5");
        
        System.out.println(mkz1.BuNedir());
        System.out.println("Tekerlek Sayisi : " + mkz1.getTekerlekSayisi());

        MotorluTasit mkz2 = new MotorluTasit("15");
        System.out.println(mkz2.BuNedir());
        System.out.println("Tekerlek Sayisi : " + mkz2.getTekerlekSayisi());
        

    }
    
}
