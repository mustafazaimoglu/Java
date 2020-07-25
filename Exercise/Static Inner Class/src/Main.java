
public class Main
{
    public static void main(String[] args)
    {
        Matematik.Alan alan = new Matematik.Alan(); //Tek Tek Baslatmaya Gerek Yok. Static oldugu için otomatik ramde yer ediyor.
        
        alan.daireAlan(5);
        
        Matematik.Alan.daireAlan(4);
        
     // Matematik.Alan.daireCevre(5); Method Static Olmadığı için Class adı ıle erişilemez...
     
        alan.daireCevre(8);
        
        
        Matematik.KareAlan kare = new Matematik.KareAlan();
        
        kare.karealan(10);
        
        Matematik.KareAlan.karecevre(15);
    }
    
}
