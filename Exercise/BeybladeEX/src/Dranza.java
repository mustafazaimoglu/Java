public class Dranza extends Beyblade
{
    private String KutsalCanavar;
    
    public Dranza(String Beybladeci, int DonusHızı, int SaldırıGucu, String KutsalCanavar) {
        super(Beybladeci, DonusHızı, SaldırıGucu);
        this.KutsalCanavar = KutsalCanavar;
        
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {
        System.out.println("Dranza " + KutsalCanavar + " ortaya cıkariyor...");
    }

    @Override
    public void Informations() {
        super.Informations();
        System.out.println("Kutsal Canavar : " + KutsalCanavar);
    }
    
    
    
}
