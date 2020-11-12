
import java.util.Stack;

public class Main
{

    public static void main(String[] args)
    {
        String islem = "2+3*5";
        String output = "";

        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for (int i = 0; i < islem.length(); i++)
        {
            String temp = String.valueOf(islem.charAt(i));
            try
            {
                Integer.valueOf(temp);
                output += temp;
            } catch (NumberFormatException ex)
            {
                stack1.push(temp);
            }

        }

        while (!stack1.isEmpty())
        {
            output += stack1.pop();
        }

        System.out.println(output);

        for (int i = 0; i < output.length(); i++)
        {
            String temp = String.valueOf(output.charAt(i));
            try
            {
                Integer.valueOf(temp);
                stack2.push(temp);
            } catch (NumberFormatException ex)
            {
                int temp1 = Integer.valueOf(stack2.pop());
                int temp2 = Integer.valueOf(stack2.pop());
                int temp3;

                switch (temp)
                {
                    case "+":
                        temp3 = temp2 + temp1;
                        break;
                    case "-":
                        temp3 = temp2 - temp1;
                        break;
                    case "/":
                        temp3 = temp2 / temp1;
                        break;
                    case "*":
                        temp3 = temp2 * temp1;
                        break;
                    default:
                        temp3 = 0;
                        break;
                }
                
                stack2.push(String.valueOf(temp3));
            }
        }
        
        System.out.println(stack2.pop());
    }
}
