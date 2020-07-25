
public class Main
{
    //extends class deme sebebimiz integer vb gelirse problem olmasin diye!!!
    public static <E extends Aday> E birinciBul(E x1,E x2)
    {
        if (x1.puanHesapla() > x2.puanHesapla())
        {
            return x1;
        }
        else
        {
            return x2;
        }
    }
    /*
    public static <E> void yazdir(E x[])
    {
        for (E i : x)
        {
            System.out.println(i);
        }
        System.out.println();
    }
    */
    
    public static void main(String[] args)
    {
        /*
        String dizi1[] = {"Mustafa","Murat","Coskun"};
        Integer dizi2[] = {1,2,3,4};
        
        yazdir(dizi1);
        yazdir(dizi2);
        */
        
        EA esit1 = new EA(38, 14, 44, 10);
        EA esit2 = new EA(41, 8, 38, 6);
        
        MF say1 = new MF(35, 48, 14, 39);
        MF say2 = new MF(34, 42, 16, 44);
        
        EA birinci1 = birinciBul(esit1, esit2);
        MF birinci2 = birinciBul(say1, say2);
        
        System.out.println("Sayisal Birinci Puani : " + birinci2.puanHesapla());
        System.out.println("Esit Ağırlık Birinci Puani : " + birinci1.puanHesapla());
    }
}
