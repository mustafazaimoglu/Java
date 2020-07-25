
import java.util.Scanner;


public class Vec
{
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim)
    {
        Scanner scanner = new Scanner(System.in);
        this.isim = isim;
        
        System.out.println("Vectorun i , j ve k Degerlerini Giriniz...");
        System.out.print("i : ");
        this.i = scanner.nextInt();
        System.out.print("j : ");
        this.j = scanner.nextInt();
        System.out.print("k : ");
        this.k = scanner.nextInt();
    }

    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim)
    {
        this.isim = isim;
    }

    public int getI()
    {
        return i;
    }

    public void setI(int i)
    {
        this.i = i;
    }

    public int getJ()
    {
        return j;
    }

    public void setJ(int j)
    {
        this.j = j;
    }

    public int getK()
    {
        return k;
    }

    public void setK(int k)
    {
        this.k = k;
    }
    
    
    
    
}
