public class NewStringMethods 
{
    public static void main (String[] Args)
    {
        String s1 = "JavaTPoint";
        String s2 = "javatpoint";
        String s3 = "JAVATPOİNT";
        String MKZ = "Hello, today we are going to do string examples";
        String First = "Mustafa ";
        String Last = "KUZ";       
        
        System.out.println(s1.equalsIgnoreCase(s3)); //Buyuk ve Kucuk Harf Duyarsız!
        System.out.println(s2.equals(s3)); //Tamamen Aynısı mı Onu Kontrol Ediyor!
        
        System.out.println(s1.replace('a','e')); // yer degistirme (hedef,sonuc)!
        
        System.out.println(MKZ.replace("today","Tomorrow")); // today yerine tomorrow koyuldu!
        
        System.out.println(MKZ.contains("we are going"));// yazilan degerin içerilmesi ile alaki!
        System.out.println(MKZ.contains("integer"));
        
        System.out.println("The Lenght of the MKZ String is : " + MKZ.length()); //boyutunu bulur!
        
        System.out.println(s1 + " = BuyukHali = " + s1.toUpperCase()); //Metni Buyuk Harf Yapar!
        System.out.println(s1 + " = KucukHali = " + s1.toLowerCase()); //Metni Kucuk Harf Yapar!
        
        System.out.println(MKZ.indexOf("string")); // Girilen Metnin Basharfinin Sirasini Bulur!
        
        System.out.println(First.concat(Last));
        
        System.out.println(MKZ.substring(22)); //Girilen Siradan Sonrasını Yazar!
        
        System.out.println(MKZ.substring(22,36)); //Girilen Aralıgı yazar!
        
        System.out.println(s2.startsWith("java")); //Girilen Değerlemi Basliyor!
        
        System.out.println("\' ---- \" ---- \\ = Spacial Charachters");
              
    }   
}
