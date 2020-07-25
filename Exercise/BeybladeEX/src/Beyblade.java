public class Beyblade 
{
    private String Beybladeci;
    private int DonusHızı;
    private int SaldırıGucu;

    public Beyblade(String Beybladeci, int DonusHızı, int SaldırıGucu) {
        this.Beybladeci = Beybladeci;
        this.DonusHızı = DonusHızı;
        this.SaldırıGucu = SaldırıGucu;
    }
    
    public void Informations()
    {
        System.out.println("Beyblade Kullanicisi : " + Beybladeci);
        System.out.println("Donus Hizi : " + DonusHızı);
        System.out.println("Saldiri Gucu : " + SaldırıGucu);
        
    }
    
    public void KutsalCanavarOrtayaCikar()
    {
        System.out.println("Bu Beyblade Kutsal Canavara Sahip Değil...");
    }

    public String getBeybladeci() {
        return Beybladeci;
    }

    public void setBeybladeci(String Beybladeci) {
        this.Beybladeci = Beybladeci;
    }

    public int getDonusHızı() {
        return DonusHızı;
    }

    public void setDonusHızı(int DonusHızı) {
        this.DonusHızı = DonusHızı;
    }

    public int getSaldırıGucu() {
        return SaldırıGucu;
    }

    public void setSaldırıGucu(int SaldırıGucu) {
        this.SaldırıGucu = SaldırıGucu;
    }
    
    
}
