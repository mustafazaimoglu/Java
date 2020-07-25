// Coded By MKZ 
import java.util.Scanner;

public class Main
{
    public static String findPolindrome(String text)
    {
        String answer = "";
        String temp = "";
        
        for (int i = 1; i < text.length() - 1; i++)
        {
            int j = 1;
            int k = 1;
            char instantLetter = text.charAt(i);
            temp = String.valueOf(instantLetter);
            
            if (instantLetter == text.charAt(i+k))
            {
                temp = temp + String.valueOf(text.charAt(i+k));
                k++;
                while (true)
                {
                    try
                    {
                        if (text.charAt(i-j) == text.charAt(i+k))
                        {
                            temp = String.valueOf(text.charAt(i-j)) + temp;
                            temp = temp + String.valueOf(text.charAt(i+k));
                        }
                        else
                        {
                            if (j != 1)
                            {
                                if (answer.length() < temp.length())
                                {
                                    answer = temp;
                                }
                            }
                            break;
                        }
                        j++;
                        k++;
                    }
                    catch (StringIndexOutOfBoundsException ex)
                    {
                        if (answer.length() < temp.length())
                        {
                            answer = temp;
                        }
                        break;
                    }
                }
            }
            else
            {
                while (true)
                {
                    try
                    {
                        if (text.charAt(i-j) == text.charAt(i+j))
                        {
                            temp = String.valueOf(text.charAt(i-j)) + temp;
                            temp = temp + String.valueOf(text.charAt(i+j));
                        }
                        else
                        {
                            if (j != 1)
                            {
                                if (answer.length() < temp.length())
                                {
                                    answer = temp;
                                }
                            }
                            break;
                        }
                        j++;
                    }
                    catch (StringIndexOutOfBoundsException ex)
                    {
                        if (answer.length() < temp.length())
                        {
                            answer = temp;
                        }
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String answer;
        
        System.out.print("Type Any String : ");
        String text = scanner.nextLine();
        
        answer = findPolindrome(text);
        
        if (answer.length() > 1)
        {
            System.out.println("The Longest Polindrome : " + answer);
        }
        else
        {
            System.out.println("There is no Polindrome!");
        }
        
        
    }
    
}
