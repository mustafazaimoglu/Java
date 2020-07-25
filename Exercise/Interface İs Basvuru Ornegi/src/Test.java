
public class Test
{
    public static void main(String[] args)
    {
        
        PCMuhendisi muhendis1 = new PCMuhendisi(true, false);
        
        muhendis1.AdliSicilKaydi();
        muhendis1.AskerlikSorgula();
        System.out.println(muhendis1.MezuniyetOrtalamasi(3.52));
        String tecrube[] = {"Aselsan","Baykar Makina","Tesla"};
        muhendis1.IsTecrubesi(tecrube);
        System.out.println();
        
        MakineMuhendisi muhendis2 = new MakineMuhendisi(false, false);
        
        String tecrube2[] = {};
        String Referans[] = {"Mustafa KUZ","Muhammet Fatih Talu","Ege Barisan"};
        
        muhendis2.AdliSicilKaydi();
        muhendis2.AskerlikSorgula();
        System.out.println(muhendis2.MezuniyetOrtalamasi(2.31));
        muhendis2.IsTecrubesi(tecrube2);
        muhendis2.Referanslarim(Referans);
        muhendis2.calis();
        
        
    
    }
    
}
