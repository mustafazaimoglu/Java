
public class MF extends Candidate
{

    public MF(String isim, int turkce, int matematik, int edebiyat, int fizik)
    {
        super(isim, turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla()
    {
        return getTurkce()*5 + getMatematik()*5 + getEdebiyat()*1 + getFizik()*4;
    }
    
}
