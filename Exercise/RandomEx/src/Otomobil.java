public class Otomobil 
{
    private int AracKm;
    private double yakit;
    private double sicaklik;

    public Otomobil(int AracKm, double yakit, double sicaklik) {
        this.AracKm = AracKm;
        this.yakit = yakit;
        this.sicaklik = sicaklik;
    }

    public int getAracKm() {
        return AracKm;
    }

    public void setAracKm(int AracKm) {
        this.AracKm = AracKm;
    }

    public double getYakit() {
        return yakit;
    }

    public void setYakit(double yakit) {
        this.yakit = yakit;
    }

    public double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }   
}
