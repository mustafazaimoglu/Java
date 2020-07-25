public class Kasa 
{
    private String Model;
    private String Malzeme;
    private int PortSayisi;

    public Kasa(String Model, String Malzeme, int PortSayisi) {
        this.Model = Model;
        this.Malzeme = Malzeme;
        this.PortSayisi = PortSayisi;
    }
    
    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getMalzeme() {
        return Malzeme;
    }

    public void setMalzeme(String Malzeme) {
        this.Malzeme = Malzeme;
    }

    public int getPortSayisi() {
        return PortSayisi;
    }

    public void setPortSayisi(int PortSayisi) {
        this.PortSayisi = PortSayisi;
    }
    
    
}
