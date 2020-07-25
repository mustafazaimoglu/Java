public class School 
{
    private String OkulIsmi;
    private String SinifNumarasi;
    
    public School ()
    {
        OkulIsmi = "Bilgi Yok";
        SinifNumarasi = "Bilgi Yok";
    }

    public School(String OkulIsmi, String SinifNumarasi) {
        this.OkulIsmi = OkulIsmi;
        this.SinifNumarasi = SinifNumarasi;
    }

    public String getOkulIsmi() {
        return OkulIsmi;
    }

    public void setOkulIsmi(String OkulIsmi) {
        this.OkulIsmi = OkulIsmi;
    }

    public String getSinifNumarasi() {
        return SinifNumarasi;
    }

    public void setSinifNumarasi(String SinifNumarasi) {
        this.SinifNumarasi = SinifNumarasi;
    }
    
    
    
}
