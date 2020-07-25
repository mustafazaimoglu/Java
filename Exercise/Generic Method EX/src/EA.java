
public class EA extends Aday
{

    public EA(int turkce, int matematik, int edebiyat, int fizik)
    {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanHesapla()
    {
        return getMatematik()* 5 + getTurkce()*5 + getEdebiyat()*4 + getFizik()*1;
    }
    
}
