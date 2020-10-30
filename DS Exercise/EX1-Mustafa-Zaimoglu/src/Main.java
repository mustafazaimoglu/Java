
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        MyOwnArray mya = new MyOwnArray(10);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice;
        String result;
        
        mkz:
        while(true)
        {
            message();
            choice = br.readLine();
            
            switch(choice)
            {
                case "1":
                    System.out.print("Lütfen eklemek istediğiniz Stringi girin : ");
                    result = br.readLine();
                    mya.add(result);
                    break;
                case "2":
                    System.out.print("Lütfen silmek istediğiniz Stringi girin : ");
                    result = br.readLine();
                    mya.delete(result);
                    break;
                case "3":
                    System.out.print("Lütfen güncellemek istediğiniz Stringi girin : ");
                    result = br.readLine();
                    System.out.print("Yeni Stringi giriniz : ");
                    String newString = br.readLine();
                    mya.update(result,newString);
                    break;
                case "4":
                    System.out.print("Lütfen bulmak istediğiniz Stringi girin : ");
                    result = br.readLine();
                    int position = mya.find(result);
                    if(position == -1)
                    {
                        System.err.println(result + " elementi bulunamadı!");
                    }
                    else
                    {
                        System.out.println(result + " elementinin index numarası :  " + position);
                    }
                    break;
                case "5":
                    mya.display();
                    break;
                case "q":
                    System.err.println("Programdan cikiliyor...");
                    break mkz;
                default:
                    System.err.println("Yanlış bir tuşlama yaptınız!");
                    break;
            }
        }
    }
    
    public static void message()
    {
        System.out.println("************ MENU ************");
        System.out.println("1 : Ekle \n"
                + "2 : Sil \n"
                + "3 : Guncelle \n"
                + "4 : Bul \n"
                + "5 : Yazdir \n"
                + "q : Cikis");
        System.out.print("Seçiminiz : ");
    }
}
