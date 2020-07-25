
public class Daire extends Sekil
{
    private int Yaricap;

    public Daire(int Yaricap, String Isim)
    {
        super(Isim);
        this.Yaricap = Yaricap;
    }
    
    @Override
    public void AlanHesapla()
    {
        System.out.println(getIsim()+ " alanı : " + (Math.PI * Yaricap * Yaricap));
    }
    
    
}
