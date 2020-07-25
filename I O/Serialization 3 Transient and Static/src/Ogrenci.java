
import java.io.Serializable;

public class Ogrenci implements Serializable
{
    private static final long serialVersionUID = 1000; // Serializable Versiyonunu belli eder
    private String isim;
    private transient String bolum; // Transiet Ozellikler serileştirilmez.
    private static int ogrenciSayisi; // Staticler classa ait ozelliktir nesneye ait değil.

    public Ogrenci(String isim, String bolum)
    {
        this.isim = isim;
        this.bolum = bolum;
    }

    public static int getOgrenciSayisi()
    {
        return ogrenciSayisi;
    }

    public static void setOgrenciSayisi(int ogrenciSayisi)
    {
        Ogrenci.ogrenciSayisi = ogrenciSayisi;
    }

    @Override
    public String toString()
    {
        return "Öğreci ismi : " + isim +
                "\nBölüm : " + bolum;
    }
    
    
}
