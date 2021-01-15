
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        AVLTree avl = new AVLTree();
        ExpressionParsing ep = new ExpressionParsing();
        String matrix[][];

        String message = "1 = Üçlü Girmek\n"
                + "2 = Üçlü Güncellemek\n"
                + "3 = Yazdırmak\n"
                + "0 = Çıkış";

        System.out.println("BİLGİLENDİRME : \n"
                + "EKLEME İÇİN ÖRNEK GİRDİLER : {(-,2,5),(/,8,1)} YADA (-,2,5),(/,8,1)\n"
                + "GÜNCELLEME İÇİN ÖRNEK GİRDİLER : {(*,7,4)} YADA (+,9,6)\n");

        while (true)
        {
            System.out.println(message);
            System.out.print("Seçiminiz : ");
            String choose = sc.nextLine();

            switch (choose)
            {
                case "0":
                    return;
                case "1":
                    System.out.print("Lutfen ekleme işlemi için giriniz : ");
                    String Expressions = sc.nextLine();
                    matrix = ep.parseExpressions(Expressions);

                    for (int i = 0; i < matrix.length; i++)
                    {
                        avl.insert(new Expression(matrix[i][0], Double.parseDouble(matrix[i][1]), Double.parseDouble(matrix[i][2])));
                    }
                    break;
                case "2":
                    System.out.print("Lütfen güncellencek olan üçlüyü giriniz : ");
                    String antique = sc.nextLine();

                    System.out.print("Lütfen yeni üçlüyü giriniz : ");
                    String fresh = sc.nextLine();

                    String antiqueMatrix[][] = ep.parseExpressions(antique);
                    String freshMatrix[][] = ep.parseExpressions(fresh);

                    avl.update(new Expression(antiqueMatrix[0][0], Double.parseDouble(antiqueMatrix[0][1]), Double.parseDouble(antiqueMatrix[0][2])),
                            new Expression(freshMatrix[0][0], Double.parseDouble(freshMatrix[0][1]), Double.parseDouble(freshMatrix[0][2])));
                    break;
                case "3":
                    avl.printTree();
                    break;
                default:
                    System.out.println("Hatalı Tuşlama Yaptınız!!!");
                    break;
            }
        }
    }
}
