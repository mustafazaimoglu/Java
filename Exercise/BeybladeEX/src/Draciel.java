public class Draciel extends Beyblade
{
    private String KutsalCanavar;
    
    public Draciel(String Beybladeci, int DonusHızı, int SaldırıGucu, String KutsalCanavar) {
        super(Beybladeci, DonusHızı, SaldırıGucu);
        this.KutsalCanavar = KutsalCanavar; 
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {
        System.out.println("Draciel " + KutsalCanavar + " ortaya cıkariyor...");        
    }

    @Override
    public void Informations() {
        super.Informations();
        System.out.println("Kutsal Canavar : " + KutsalCanavar);
    }
    
    
    
}
