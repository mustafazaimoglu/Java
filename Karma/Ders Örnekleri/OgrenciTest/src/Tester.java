public class Tester 
{
    public static void main(String[] args) 
    {
        Ogrenci mkz = new Ogrenci();
        
        mkz.OgrNo = 118;
        mkz.OgrAdi = "Mustafa KUZ"; 
        
        mkz.Goruntule();
        mkz.DersEkle();
        
        Ogrenci Iramazan = new Ogrenci();
        
        System.out.println();
        Iramazan.OgrAdi = "Iramazan Kahraman";
        Iramazan.OgrNo = 52;
        
        Iramazan.Goruntule();
        
        int dizi[] = new int[5];
       
        Ogrenci dizi2[];
        dizi2 = new Ogrenci[5];
        
        
        System.out.println();
        dizi2[0] = Ogrenci.Ekls();
        dizi2[1] = Ogrenci.Ekls();
        
        dizi2[0].Goruntule();
       
        System.out.println();
        
        Ogrenci.KareBul(4);
        
        System.out.println();
        
        dizi2[1].Goruntule();
    }
    
}
