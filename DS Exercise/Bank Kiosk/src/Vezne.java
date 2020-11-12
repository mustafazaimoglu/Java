
import java.util.LinkedList;
import java.util.Queue;


public class Vezne
{
    private static int vezneNum = 0;
    private String vezneIsmi;
    private int anlikMusteri = 0;
    private int ToplamIslemSuresi = 0;
    private Queue<Musteri> q;

    public Vezne()
    {
        vezneNum++;
        vezneIsmi = vezneNum + ". Vezne";
        q = new LinkedList<>();
    }

    public static int getVezneNum()
    {
        return vezneNum;
    }

    public String getVezneIsmi()
    {
        return vezneIsmi;
    }

    public int getAnlikMusteri()
    {
        return anlikMusteri;
    }

    public int getToplamIslemSuresi()
    {
        return ToplamIslemSuresi;
    }
     
    public void ekleMusteri(Musteri m)
    {
        this.q.add(m);
        this.anlikMusteri++;
        this.ToplamIslemSuresi += m.getIslemZamani();
    }
}
