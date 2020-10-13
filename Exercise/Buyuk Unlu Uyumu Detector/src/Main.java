
import java.util.Scanner;

public class Main
{
    public static boolean isThatCompatible(String word)
    {
        char bold[] =
        {
            'a', 'ı','o','u'
        };
        char thin[] =
        {
            'e','i','ö','ü'
        };
        boolean b = false, t = false;

        for (int i = 0; i < word.length(); i++)
        {
            char instantLetter = word.charAt(i);
            
//            System.out.println(Integer.valueOf(instantLetter));
//            System.out.println('ö');
////            System.out.println(Integer.valueOf('ç'));
//            System.out.println(instantLetter);
            
            for (int j = 0; j < bold.length; j++)
            {
                if (b == false && t == false)
                {
                    if (instantLetter == bold[j] || instantLetter == Character.toUpperCase(bold[j]))
                    {
                        b = true;
                        j = 0;
                    }
                   
                    if (instantLetter == thin[j] || instantLetter == Character.toUpperCase(thin[j]))
                    {
                        t = true;
                        j = 0;
                    }
                }
                else if(b == true && t == false)
                {
                    if (instantLetter == thin[j] || instantLetter == Character.toUpperCase(thin[j]))
                    {
                        return false;
                    }
                }
                else if(b == false && t == true)
                {
                    if (instantLetter == bold[j] || instantLetter == Character.toUpperCase(bold[j]))
                    {
                        return false;
                    }
                }

            }
        }
        
        return !(b == false && t == false);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in,"utf-8");
        System.out.print("Please type the word: ");
        String word = sc.nextLine();

        System.out.println(isThatCompatible(word)); 
        
//        System.out.println(Charset.availableCharsets());
    }
}
