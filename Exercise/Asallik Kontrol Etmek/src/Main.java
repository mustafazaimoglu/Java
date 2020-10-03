
import java.util.Scanner;

public class Main
{
    public static void asalKontrol(int x)
    {
        boolean result = true;

        if (x == 1 || x == 0)
        {
            result = false;
        }
        else
        {
            for (int i = 2; i < x; i++)
            {
                if (x % i == 0)
                {
                    result = false;
                    break;
                }
            }
        }

        if (result)
        {
            System.out.println(x + " Sayısı Asaldır...");
        }
        else
        {
            System.out.println(x + " Sayısı Asal Değildir...");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen Asallık Kontrol etmek istediğiniz sayıyı girin: ");
        int sayi = sc.nextInt();

        asalKontrol(sayi);
    }
}
