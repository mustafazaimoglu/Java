
import java.io.Serializable;

public class Ogrenci implements Serializable
{
    private static final long serialVersionUID = 1000; // Serializable Versiyonunu belli eder
    private String isim;
    private String bolum;

    public Ogrenci(String isim, String bolum)
    {
        this.isim = isim;
        this.bolum = bolum;
    }

    @Override
    public String toString()
    {
        return "Öğreci ismi : " + isim +
                "\nBölüm : " + bolum;
    }
    
    
}
