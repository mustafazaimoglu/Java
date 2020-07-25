
public class Main
{
    public static void main(String[] args) 
    {
        Calisan calisanlar[] = new Calisan[7];
        
        calisanlar[0] = new Mudur("Furkan", "Kartal");
        ((Mudur)calisanlar[0]).setToplamSatis(37000);
        
        calisanlar[1] = new Tezgahtar("Okan", "Yeşil");
        ((Tezgahtar) calisanlar[1]).setSatis(15000);
        
        calisanlar[2] = new Tezgahtar("Burcu", "Seğmen");
        ((Tezgahtar) calisanlar[2]).setSatis(22000);
        
        calisanlar[3] = new IdariPersonel("Ayşe", "Demir");
        calisanlar[4] = new IdariPersonel("Mehmet", "Çelik");
        
        calisanlar[5] = new Hizmetli("Ali", "Kaya");       
        ((Hizmetli) calisanlar[5]).setMesaiSaati(60);
        
        calisanlar[6] = new Hizmetli("Ahmet", "Ateş");
        ((Hizmetli) calisanlar[6]).setMesaiSaati(40);
        
        
        System.out.println("Çalışanların maaşları:");
        for (int i = 0; i < calisanlar.length; ++i) 
        {
            System.out.println(calisanlar[i].getBilgi());
        }
    }
    
}
