public class Hesap 
{
    private String KullaniciAdi;
    private String Parola;
    private double Bakiye;

    public Hesap(String KullaniciAdi, String Parola, double Bakiye) {
        this.KullaniciAdi = KullaniciAdi;
        this.Parola = Parola;
        this.Bakiye = Bakiye;
    }
    
    public void paraCek(double Miktar) {
        
        if ((Bakiye - Miktar < 0)) {
            
            System.out.println("Yetersiz Bakiye.... "
                    + "\nGüncel Bakiyeniz : " + Bakiye);
        }
        else {
            
            Bakiye -= Miktar;
            
            System.out.println("Güncel Bakiyeniz : " + Bakiye);
        }
    }
    
    public void paraYatir(double Miktar) {
        
        Bakiye += Miktar;
        
        System.out.println("Güncel Bakiyeniz : " + Bakiye);
        
    }

    public String getKullaniciAdi() {
        return KullaniciAdi;
    }

    public void setKullaniciAdi(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;
    }

    public String getParola() {
        return Parola;
    }

    public void setParola(String Parola) {
        this.Parola = Parola;
    }

    public double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }
    
    
    
}
