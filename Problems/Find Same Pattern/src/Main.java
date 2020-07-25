
import java.util.ArrayList;
import java.util.Scanner;


public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
               
        String result1; 
        String result2;
        
        System.out.print("Please Type Pattern 1 : ");
        String pattern1 = scanner.nextLine();
               
        System.out.print("Please Type Pattern 2 : ");
        String pattern2 = scanner.nextLine();
        
        result1 = TestPattern(pattern1);
        result2 = TestPattern(pattern2);
        
        System.out.println();
        System.out.print("The Conclusion is ");
        
        if (result1.equals(result2))
        {
            System.out.println(true);           
        }
        else
        {
            System.out.println(false);
        }
        System.out.println(result1);
        System.out.println(result2);
        
    }
    
    
    public static String TestPattern(String p)
    {
        ArrayList<String> chars = new ArrayList<>();
        int i = 1;
        String result = "";
        
        chars.add(String.valueOf(p.charAt(0)));
        result += 0;
        
        while (i < p.length())
        {
            String temp = String.valueOf(p.charAt(i));
            
            for (int j = 0; j < chars.size(); j++)
            {
                if (temp.equals(chars.get(j)))
                {
                    result += j;
                    break;
                }
                
                if (j == chars.size() - 1)
                {
                    chars.add(temp);
                }
            }

            i++;
        }
        
        return result;
    }
}
