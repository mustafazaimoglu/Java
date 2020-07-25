public class MotorluTasit extends Tasit {
    
    public MotorluTasit(String TekerlekSayisi) {
        super(TekerlekSayisi);
    }

    @Override
    public String BuNedir() {
        return (super.BuNedir() + " > Motorlu Tasit");
    }
    
    
    
}
