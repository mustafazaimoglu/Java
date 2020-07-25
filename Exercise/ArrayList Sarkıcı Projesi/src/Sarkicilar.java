
import java.util.ArrayList;

public class Sarkicilar
{
    private ArrayList<String> SarkiciIsimleri = new ArrayList<>();
    
    public void SarkicilariBastir()
    {
        System.out.println("Listede " + SarkiciIsimleri.size() + " Adet Sarkici "
                + "Bulunmaktadir.");
        
        for (int i = 0; i < SarkiciIsimleri.size(); i++)
        {
            System.out.println((i+1) + " - " + SarkiciIsimleri.get(i));
        }
    }
    
    public void SarkiciEkle(String isim)
    {
        SarkiciIsimleri.add(isim);
        
        System.out.println("Sarkici Eklendi...");
    }
    
    public void SarkiciGuncelle(int position, String isim)
    {
        SarkiciIsimleri.set(position, isim);
        
        System.out.println("Sarkici Ismi Guncellendi...");
    }
    
    public void SarkiciSil(int Position)
    {
        String isim = SarkiciIsimleri.get(Position);
        
        SarkiciIsimleri.remove(Position);
        
        System.out.println(isim + "isimli sarkici silindi...");
    }
    
    public void SarkiciAra(String isim)
    {
        int position = SarkiciIsimleri.indexOf(isim);
        
        if (position >= 0)
        {
            System.out.println("Sarkici Bulundu.");
            System.out.println(isim + " isimli sarkici " + (position+1) + ". pozisyonda");
        }
        else
        {
            System.out.println("Sarkici Bulunamadi...");
        }
    }
}
