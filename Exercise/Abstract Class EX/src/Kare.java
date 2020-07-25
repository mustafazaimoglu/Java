
public class Kare extends Sekil
{
    private int Kenar;

    public Kare(String Isim, int Kenar)
    {
        super(Isim);
        this.Kenar = Kenar;
    }
    
    @Override
    public void AlanHesapla()
    {
        System.out.println(getIsim() + " alanı : " + (Kenar * Kenar));
    }
    
    public void CevreHesapla()
    {
        System.out.println(getIsim() + " cevresi : " + (4 * Kenar));
    }
    
}
