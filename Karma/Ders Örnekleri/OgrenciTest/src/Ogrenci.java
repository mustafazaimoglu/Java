public class Ogrenci 
{
    int OgrNo;
    String OgrAdi;

    public Ogrenci() {
    }

    

    public Ogrenci(int OgrNo, String OgrAdi) {
        this.OgrNo = OgrNo;
        this.OgrAdi = OgrAdi;
    }
    
    public static Ogrenci Ekls()
    {
        return new Ogrenci(115, "MKZ");
    }
    
    public void DersEkle()
    {
        System.out.println("Yeni Ders Eklendi");
    }
    
    public void Goruntule()
    {
        System.out.println("Ogrenci Adi : " + OgrAdi);
        System.out.println("Ogrenci Numarasi : " + OgrNo);
        
    }
    
    public static void KareBul(int a)
    {
        System.out.println("Karesi : " + a*a );
    }
    
}
