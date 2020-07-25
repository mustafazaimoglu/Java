
public class MF extends Aday
{

    public MF(int turkce, int matematik, int edebiyat, int fizik)
    {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla()
    {
        return getMatematik()* 5 + getTurkce()*5 + getEdebiyat()*1 + getFizik()*4;
    }
    
}
