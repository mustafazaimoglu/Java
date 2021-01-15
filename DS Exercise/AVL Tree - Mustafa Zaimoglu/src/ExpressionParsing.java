
import java.util.ArrayList;

public class ExpressionParsing
{

    public String[][] parseExpressions(String x)
    {
        ArrayList<String> raw = new ArrayList<>();
        String matrix[][];
        String temp = "";
        x = x.trim();

        if (x.charAt(0) == '{' && x.charAt(x.length() - 1) == '}')
        {
            x = x.substring(1, x.length() - 1);
        }

        for (int i = 0; i < x.length(); i++)
        {
            if (x.charAt(i) != ')')
            {
                if (x.charAt(i) != '(')
                {
                    temp += x.charAt(i);
                }
                else
                {
                    temp = "";
                }
            }
            else
            {
                raw.add(temp.trim());
            }
        }

        matrix = new String[raw.size()][3];

        for (int i = 0; i < raw.size(); i++)
        {
            matrix[i] = raw.get(i).split(",");
        }

        for (int i = 0; i < raw.size(); i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix[i][j] = matrix[i][j].trim();
//                System.out.print(matrix[i][j] + " ");
            }
//            System.out.println();
        }

        return matrix;
    }
}
