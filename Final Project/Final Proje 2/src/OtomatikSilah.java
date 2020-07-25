
import java.util.ArrayList;


public class OtomatikSilah extends Silah
{
    private final int sarjorKapasitesi = 45;
    private ArrayList<Sarjor> otoSilahSarjorler = new ArrayList<>();
    private final int seriAteşHızı = 3; 
    
    public OtomatikSilah(String silahIsmi, int etkiliMenzil, int otoSilahSarjorSayisi)
    {
        super(silahIsmi, etkiliMenzil);
        
        for (int i = 0; i < otoSilahSarjorSayisi; i++)
        {
            otoSilahSarjorler.add(new Sarjor(sarjorKapasitesi, sarjorKapasitesi));
        }
    }
    
    public int hicMermiVarmi()
    {
        for (int i = 0; i < otoSilahSarjorler.size(); i++)
        {
            if (otoSilahSarjorler.get(i).getKalanMermi() > 0)
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void atesEt(int hedefUzakligi)
    {
        int mermiBulunanSarjorIndexi = hicMermiVarmi();
        
        if (mermiBulunanSarjorIndexi == -1)
        {
            System.out.println("Sarjörlerde Mermi Bulunmamaktadır!");
        }
        else
        {
            if (getEtkiliMenzil() >= hedefUzakligi)
            {
                System.out.println("1 el ateş edildi!\n"
                                  + "Hedef menzilde olduğu için atış isabetli!!");
                otoSilahSarjorler.get(mermiBulunanSarjorIndexi).setKalanMermi(otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi() - 1);
                System.out.println((mermiBulunanSarjorIndexi+1) + ".Sarjörde Kalan Mermi : " + otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi());
            }
            else
            {
                System.out.println("1 el ateş edildi!\n"
                                  + "Hedef menzil dışında olduğu için atış isabetsiz!!");
                otoSilahSarjorler.get(mermiBulunanSarjorIndexi).setKalanMermi(otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi() - 1);
                System.out.println((mermiBulunanSarjorIndexi+1) + ".Sarjörde Kalan Mermi : " + otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi());
            }
        }
    }
    
    public void seriAtesEt(int hedefUzakligi)
    {
        int mermiBulunanSarjorIndexi = hicMermiVarmi();
        
        if (mermiBulunanSarjorIndexi == -1)
        {
            System.out.println("Sarjörlerde Mermi Bulunmamaktadır!");
        }
        else
        {
            if (getEtkiliMenzil() >= hedefUzakligi)
            {
                System.out.println("1 el ateş edildi!\n"
                                  + "Hedef menzilde olduğu için atış isabetli!!");
                otoSilahSarjorler.get(mermiBulunanSarjorIndexi).setKalanMermi(otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi() - seriAteşHızı);
                System.out.println((mermiBulunanSarjorIndexi+1) + ".Sarjörde Kalan Mermi : " + otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi());
            }
            else
            {
                System.out.println("1 el ateş edildi!\n"
                                  + "Hedef menzil dışında olduğu için atış isabetsiz!!");
                otoSilahSarjorler.get(mermiBulunanSarjorIndexi).setKalanMermi(otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi() - seriAteşHızı);
                System.out.println((mermiBulunanSarjorIndexi+1) + ".Sarjörde Kalan Mermi : " + otoSilahSarjorler.get(mermiBulunanSarjorIndexi).getKalanMermi());
            }
        }
    }

    @Override
    public void doldur()
    {
        for (Sarjor s : otoSilahSarjorler)
        {
            s.setKalanMermi(sarjorKapasitesi);
        }
        System.out.println("Tum Sarjörler Başarı ile Tam Kapasiteye Getirildi!");
    }

    public ArrayList<Sarjor> getOtoSilahSarjorler()
    {
        return otoSilahSarjorler;
    }

    public void setOtoSilahSarjorler(ArrayList<Sarjor> otoSilahSarjorler)
    {
        this.otoSilahSarjorler = otoSilahSarjorler;
    }
 
    
}
