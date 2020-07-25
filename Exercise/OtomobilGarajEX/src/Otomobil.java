public class Otomobil 
{
    private String Model;
    private int Yıl;
    private String Motor;
    private int Kilometre;

    public Otomobil(String Model, int Yıl, String Motor, int Kilometre) {
        this.Model = Model;
        this.Yıl = Yıl;
        this.Motor = Motor;
        this.Kilometre = Kilometre;
    }    

    public Otomobil() {
        
    }
    
    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getYıl() {
        return Yıl;
    }

    public void setYıl(int Yıl) {
        this.Yıl = Yıl;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public int getKilometre() {
        return Kilometre;
    }

    public void setKilometre(int Kilometre) {
        this.Kilometre = Kilometre;
    }
    
    
    
    
}
