
public class Tester
{
    public static void main(String args[])
    {       
        String a = "Mustafa";
        String k = "Ali Hergun Okula Bu Saatte Gelirdi Fakat Bu Gun Gelmedi";
        
        System.out.println("String'in Harf Sayisi : " + a.length()); //Uzunluk Bulucu
        
        System.out.println("0.index = " + a.charAt(0));
        System.out.println("2.index = " + a.charAt(2));
        System.out.println("Sonuncu index = " + a.charAt(a.length()-1));
        
        for (int i = 0; i < a.length(); i++)
        {
            System.out.println(a.charAt(i)); //Karakter İndexleyici
        }
        
        System.out.println(a.startsWith("Mu")); //Bununla mı Basliyor...
        System.out.println(a.endsWith("fa")); //Bununla mı Bitiyor...
        System.out.println(a.startsWith("mkz"));
        
        System.out.println("Uzunluk = " + k.length());
        System.out.println(k.startsWith("Ok", 11)); //11.karakterden sonrası bu mu?
        
        System.out.println(a.indexOf("U")); //Soldan Baslayarak Buldugu İlk Harfin Konumu
        System.out.println(a.indexOf("u"));
        
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a")); //Sagdan Baslayarak Buldugu İlk Harfin Konumu
        
        
        System.out.println(a.toLowerCase()); //Kucuk Harf Yapar
        System.out.println(a.toUpperCase()); //Buyuk Harf Yapar
        
        String a1 = "1923";
        int a2 = Integer.valueOf(a1); //String to Integer
        
        System.out.println(a2);
        
        int b1 = 1453;
        String b2 = String.valueOf(b1); //Integer to String
        
        System.out.println(b2);
        
        String mkz1 = "Mustafa"; //Java mzk1 ve mkz2 ye aynı yeri gosterdi!!
        String mkz2 = "Mustafa";
        
        if (mkz1 == mkz2) // == Ramdaki yerine göre kontrol yapiyor!
        {
            System.out.println("Esitlerdir!"); // O yuzden esittir cıktı.
        }
        else
        {
            System.out.println("Esit Degillerdir!");
        }
        
        System.out.println();
        
        String mkz3 = new String("Mustafa"); // farklı iki yer olusturmasını sagladık.
        String mkz4 = new String("Mustafa");
        
        if (mkz3 == mkz4) //
        {
            System.out.println("Esitlerdir!");
        }
        else
        {
            System.out.println("Esit Degillerdir!"); // O yuzden Esit degildir cıktı.
        }
        
        System.out.println();
        //YANİ KONTROL YAPARKEN == KULLANILMAMALI!!!!!
        //ONUN YERİNE .EQUALS KULLANILMALIDIR!!!
        
        if (mkz1.equals(mkz2))
        {
            System.out.println("Esitlerdir!");
        }
        else
        {
            System.out.println("Esit Degillerdir!");
        }
        
        if (mkz3.equals(mkz4)) 
        {
            System.out.println("Esitlerdir!");
        }
        else
        {
            System.out.println("Esit Degillerdir!");
        }
                   
    }
    
}
