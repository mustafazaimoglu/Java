//Coded By MKZ
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        ArrayList<Student> student = new ArrayList<>();
        ArrayList<Teacher> teacher = new ArrayList<>();
        
        String ders[] = {"Algoritma","Matematik","Cebir"};
        String ders2[] = {"Nesne Tabanli Programlama", "Veri Yapilari", "Calculus"};
        String ders3[] = {"Programlama Dilleri","Algoritma","Işlemciler"};
        String ders4[] = {"Yapay Zeka", "Bilgisayar Gormesi" ,"Nesne Tabanli Programlama"};
        
        student.add(new Student("Hasan Bostan", "Validator23", ders));
        student.add(new Student("Ege Barisan", "EgeCanMakeEverything", ders2));
        student.add(new Student("Mehmet Badem", "Badembabaaga", ders));
        
        teacher.add(new Teacher("Ali Karci", "cCc.ali.cCc", ders3));
        teacher.add(new Teacher("Muhammet Fatih Talu", "MatlabOlaydiAh", ders4));
       
        String Islem1 = "1 - Ogrenci\n"
                + "2 - Ogretmen\n"
                + "q - Cıkıs";
        
        String Islem2 = "1 - Giris Yap\n"
                + "2 - Kayıt Yap\n"
                + "0 - Ana Menu\n"
                + "q - Cıkıs"; 
        
        
        Mainmkz:
        while (true)
        {
            System.out.println("**************** ANA MENU **************");
            System.out.println(Islem1);
            System.out.println("****************************************");
            System.out.print("Lutfen Giris Turunu Seciniz : ");
            String islem = scanner.nextLine();
            
            
            switch (islem)
            {
                case "q":
                    break Mainmkz;
                case "1":
                    mkz :
                    while (true)
                    {
                        System.out.println("\n***** OGRENCI *****");
                        System.out.println(Islem2);
                        System.out.print("Lutfen Seciniz : ");
                        String secim2 = scanner.nextLine();
                        
                        switch (secim2)
                        {
                            case "q":
                                break Mainmkz;
                            case "1":
                                int giris = login.OgrenciGirisYap(student);
                                if (giris > -1)
                                {
                                    student.get(giris).BilgileriGoster();
                                    student.get(giris).DersleriGoster();
                                }
                                else
                                {
                                    System.out.println("Giris Basarisiz!");
                                }
                                break;
                            case "2":
                                student.add(new Student());
                                break;
                            case "0":
                                break mkz;
                            default:
                                System.out.println("Hatali bir Secim Yaptınız!\n");
                                break;
                        }    
                    }
                    break;
                case "2":
                    mkz :
                    while (true)
                    {
                        System.out.println("\n***** OGRETMEN *****");
                        System.out.println(Islem2);
                        System.out.print("Lutfen Seciniz : ");
                        String secim2 = scanner.nextLine();
                        
                        switch (secim2)
                        {
                            case "q":
                                break Mainmkz;
                            case "1":
                                int giris = login.OgretmenGirisYap(teacher);
                                if (giris > -1)
                                {
                                    teacher.get(giris).BilgileriGoster();
                                    teacher.get(giris).DersleriGoster();
                                }
                                else
                                {
                                    System.out.println("Giris Basarisiz!");
                                }
                                break;
                            case "2":
                                teacher.add(new Teacher());
                            case "0":
                                break mkz;
                            default:
                                System.out.println("Hatali bir Secim Yaptınız!\n");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Hatali bir Giris Yaptınız!\n");
                    break;
            }
            
        }
    }
    
}
