public class Dragon extends Beyblade
{
    private String KutsalCanavar;
    private String OzelYetenek;
    
    public Dragon(String Beybladeci, int DonusHızı, int SaldırıGucu, String KutsalCanavar, String OzelYetenek) {
        super(Beybladeci, DonusHızı, SaldırıGucu);
        this.KutsalCanavar = KutsalCanavar;
        this.OzelYetenek = OzelYetenek;   
    }

    @Override
    public void KutsalCanavarOrtayaCikar() {
        System.out.println("Dragon " + KutsalCanavar + " ortaya cıkariyor...");
        System.out.println(getBeybladeci() + " Ozel yetenegi olan " + OzelYetenek + " kullaniyor");
    }

    @Override
    public void Informations() {
        super.Informations();
        System.out.println("Kutsal Canavar : " + KutsalCanavar);
        System.out.println("Ozel Yetenek : " + OzelYetenek);
    }
    
    
    
}
