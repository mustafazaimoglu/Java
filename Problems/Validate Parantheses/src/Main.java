
import java.util.Scanner;

public class Main
{
    public static String deleteCharAt(String text, int c)
    {
        return text.substring(0, (c-1)) + text.substring(c+1);
    }
    
    public static boolean validate(String paranthes)
    {
        char right[] = {'{','[','('};
        char left[] = {'}',']',')'};
        
        for (int i = 1; i < paranthes.length(); i++)
        {
            for (int j = 0; j < left.length; j++)
            {
                if (paranthes.charAt(i) == left[j])
                {
                    if (paranthes.charAt(i-1) == right[j])
                    {
                        paranthes = deleteCharAt(paranthes, i);
                        i = 0;
                        break;
                    }
                }
            }
        }

        return paranthes.isEmpty();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter The Parantheses : ");
        String paranthes = scanner.nextLine();
        
        System.out.println("The conclusion is " + validate(paranthes));
    }
}
