public class Calisan //SuperClass or BaseClass
{
    private String isim;
    private int maas;
    private String departman;
    
    public Calisan (String isim, int maas, String departman)
    {
       this.isim = isim;
       this.maas = maas;
       this.departman = departman;
    }
    
    public void BilgileriGoster()
    {
        System.out.println("İsim : " + isim);
        System.out.println("Maas : " + maas);
        System.out.println("Departman : " + departman);
    }
    
    public void ZamYap(int ZamMiktari)
    {
        this.maas += ZamMiktari;
        System.out.println("Maaslara " + ZamMiktari + " TL zam yapildi!");
        
    }
    
    public void DepartmanDegistir(String YeniDepartman)
    {
        this.departman = YeniDepartman;       
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
}
