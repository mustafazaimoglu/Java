public class Daire
{
    private static double pi = 3.14; 
    private int yaricap;
    private String renk;

    public Daire(int yaricap, String renk)
    {
        this.yaricap = yaricap;
        this.renk = renk;
    }

    public Daire(int yaricap)
    {
        this.yaricap = yaricap;
    }
    
    public Daire()
    {
        
    }

    public void setRenk(String renk)
    {
        this.renk = renk;
    }
    

    public String getRenk()
    {
        return renk;
    }
    

    public int getYaricap()
    {
        return yaricap;
    }

    public void setYaricap(int yaricap)
    {
        this.yaricap = yaricap;
    }
    
    public void alanHesapla()
    {
        System.out.println("Alan = " + (yaricap*yaricap*pi));
    }
    
    public void cevreHesapla()
    {
        System.out.println("Cevre = " + (2*pi*yaricap));
    }
       
    public void Information()
    {
        System.out.println("\nYaricap = " + yaricap);
        System.out.println("Renk = " + renk);
        cevreHesapla();
        alanHesapla();
        System.out.println();
    }
    
}
