
public class Teacher extends User
{

    public Teacher(){}
    
    public Teacher(String kullaniciAdi, String Parola, String dersler[])
    {
        super(kullaniciAdi, Parola, dersler);
    }
    
    public void DersleriGoster()
    {
        System.out.println("Verdiği Dersler : ");
        int i = 1;
        for (String s : getDersler())
        {
            System.out.println(i + ". Ders : " + s);
            i++;
        }
        System.out.println();
    }
    
    public void BilgileriGoster()
    {
        System.out.println("\nSistem ID : " + getID());
        System.out.println("Isim : " + getKullaniciAdi());
        System.out.println("Universite : Inonu Universitesi");
        System.out.println("Verdiği Ders Sayisi : 3\n");
    }
}