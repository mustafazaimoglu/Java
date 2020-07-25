public class Yonetici extends Calisan //SubClass //Extends SuperClassı Ekler
{
    private int SorumluKisi; //Extra Özellik!!!
    public Yonetici(String isim, int maas, String departman, int SorumluKisi)
    {
        super(isim, maas, departman); //SuperClass'dan Bilgi Cekmek İçin
        
        this.SorumluKisi = SorumluKisi;       
    }
    
    public void BilgileriGoster()
    {
        /*
        System.out.println("İsim : " + getIsim());
        System.out.println("Maas : " + getMaas());
        System.out.println("Departman : " + getDepartman());
        */
        
        super.BilgileriGoster(); //SuperClassı Kullanmak İcin
        System.out.println("Sorumlu Olunan Kisi Sayısı : " + SorumluKisi);
    }
    
    public void SorumluSayısıDegistir(int YeniSorumluKisi)
    {
        this.SorumluKisi = YeniSorumluKisi;        
    }
    
    
}
