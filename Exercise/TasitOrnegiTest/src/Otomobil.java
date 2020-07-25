public class Otomobil extends MotorluTasit{
    
    public Otomobil(String TekerlekSayisi) {
        super(TekerlekSayisi);
    }

    @Override
    public String BuNedir() {
        return (super.BuNedir() + " > Otomobil");
    }
    
    
}
