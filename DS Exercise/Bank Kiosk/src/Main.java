
import java.util.Scanner;

public class Main
{

    public static Vezne v[] =
    {
        new Vezne(), new Vezne(), new Vezne(), new Vezne()
    };

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("-- -- KIOSK -- --");
        mkz:
        while (true)
        {
            System.out.println("Sıra almak için 1'e \n"
                    + "Cıkmak için q'ya basın.");
            System.out.print("Seçim : ");
            String islem = sc.nextLine();

            switch (islem)
            {
                case "1":
                    System.out.print("Lutfen İslem Surenizi giriniz : ");
                    int sure = sc.nextInt();
                    sc.nextLine(); //DUMMY
                    
                    Musteri m = new Musteri(sure);
                    int index = musaaitVezne();
                    v[index].ekleMusteri(m);
                    
                    System.out.println("* * * * * * * * * * * * * * * * *");
                    System.out.println("Vezneniz : " + v[index].getVezneIsmi());
                    System.out.println("Sıra Numaranız : " + v[index].getAnlikMusteri());
                    System.out.println("Bu günün : " + m.getSiraNumarasi() + ". Müsterisisiniz...");
                    System.out.println("* * * * * * * * * * * * * * * * *\n");
                    
                    bilgi();
                    break;
                case "q":
                    System.out.println("Exit!");
                    break mkz;
                default:
                    System.out.println("Hatalı Bir Tuslama Yaptınız!!!\n");
                    break;
            }
        }

    }

    public static void bilgi()
    {
        for (int i = 0; i < v.length; i++)
        {
            System.out.println(v[i].getVezneIsmi() + " Musteri Sayısı : " + v[i].getAnlikMusteri() + ", Toplam İslem Suresi : " + v[i].getToplamIslemSuresi());
        }
    }

    public static int musaaitVezne()
    {
        int temp = v[0].getToplamIslemSuresi();
        int index = 0;
        boolean esit = true;
        for (int i = 1; i < v.length; i++)
        {
            if (temp != v[i].getToplamIslemSuresi())
            {
                esit = false;
                if (v[i].getToplamIslemSuresi() < temp)
                {
                    temp = v[i].getToplamIslemSuresi();
                    index = i;
                }
            }
        }

        if (esit == true)
        {
            return 0;
        }
        else
        {
            return index;
        }

    }
}
