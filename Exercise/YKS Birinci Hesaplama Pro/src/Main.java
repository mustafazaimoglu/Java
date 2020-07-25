
import java.util.LinkedList;
import java.util.Scanner;


public class Main
{
    public static <E extends Candidate> E birinciBul(LinkedList<E> x)
    {
        int index = 0;
        int deger = x.get(0).puanHesapla();
        for(int i = 0; i < x.size(); i++)
        {
            if (x.get(i).puanHesapla() > deger)
            {
                deger = x.get(i).puanHesapla();
                index = i;
            }
        }
        
        return x.get(index);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "YKS Alana Göre Birinci Bulma Programina Hoşgeldiniz...\n"
                + "1 - Sayisal\n"
                + "2 - Esit Agırlık\n"
                + "cıkıs : q";
        
        mkz:
        while (true)
        {
            System.out.println("******************************************************************");
            System.out.println(islemler);
            System.out.println("******************************************************************");

            System.out.print("Lutfen Bir Giris Türü Seçiniz : ");
            String islem = scanner.nextLine();
            
            switch (islem)
            {
                case "q":
                    System.out.println("Programdan Cıkılıyor....");
                    break mkz;
                case "1":
                    System.out.print("Lutfen Kac Öğrenci Gireceğinizi Söyleyiniz : ");
                    int sayi1 = scanner.nextInt();
                    scanner.nextLine(); //Dummy
                    
                    LinkedList<MF> MFStudent = new LinkedList<>();
                    
                    for (int i = 0; i < sayi1; i++)
                    {
                        System.out.print( (i+1) + ".Öğrenci İsmi : ");
                        String isim = scanner.nextLine();
                        System.out.println("Netleri Bir Bosluk Birakarak Giriniz (Turkce Matematik Edebiyat Fizik) : ");
                        int turkce = scanner.nextInt();
                        int mat = scanner.nextInt();
                        int edebiyat = scanner.nextInt();
                        int fizik = scanner.nextInt();
                        scanner.nextLine(); //Dummy
                        MFStudent.add(new MF(isim, turkce, mat, edebiyat, fizik));
                    }
                    
                    MF birinci = birinciBul(MFStudent);
                    
                    System.out.println("Sayisal Birincisi ismi : " + birinci.getIsim());
                    System.out.println("Puani : " + birinci.puanHesapla());
                                         
                    break;
                case "2":
                    System.out.print("Lutfen Kac Öğrenci Gireceğinizi Söyleyiniz : ");
                    int sayi2 = scanner.nextInt();
                    scanner.nextLine(); //Dummy
                    
                    LinkedList<EA> EAStudent = new LinkedList<>();
                    
                    for (int i = 0; i < sayi2; i++)
                    {
                        System.out.print( (i+1) + ".Öğrenci İsmi : ");
                        String isim = scanner.nextLine();
                        System.out.println("Netleri Bir Bosluk Birakarak Giriniz (Turkce Matematik Edebiyat Fizik) : ");
                        int turkce = scanner.nextInt();
                        int mat = scanner.nextInt();
                        int edebiyat = scanner.nextInt();
                        int fizik = scanner.nextInt();
                        scanner.nextLine(); //Dummy
                        
                        EAStudent.add(new EA(isim, turkce, mat, edebiyat, fizik));
                    }
                    
                    EA birinci1 = birinciBul(EAStudent);
                    
                    System.out.println("Sayisal Birincisi ismi : " + birinci1.getIsim());
                    System.out.println("Puani : " + birinci1.puanHesapla());
                    
                    break;
                default :
                    System.out.println("Hatali Bir Tuslama Yaptiniz...");
            }
        }
        
    }
    
}
