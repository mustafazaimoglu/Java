public class Kullanici 
{
    private String sys_KullaniciAdi;
    private String sys_Parola;

    public Kullanici(String sys_KullaniciAdi, String sys_Parola) {
        this.sys_KullaniciAdi = sys_KullaniciAdi;
        this.sys_Parola = sys_Parola;
    }
    
    public String getSys_KullaniciAdi() {
        return sys_KullaniciAdi;
    }

    public void setSys_KullaniciAdi(String sys_KullaniciAdi) {
        this.sys_KullaniciAdi = sys_KullaniciAdi;
    }

    public String getSys_Parola() {
        return sys_Parola;
    }

    public void setSys_Parola(String sys_Parola) {
        this.sys_Parola = sys_Parola;
    }
    
    
    
}
