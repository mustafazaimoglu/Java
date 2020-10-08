
public class Main
{
    public static boolean isThatMagic(int m[][])
    {
        int total = 0;
        
        for(int j = 0; j < m[0].length; j++)
        {
            total += m[0][j];
        }
                
        for(int i = 0; i < m.length; i++)
        {
            int row = 0, column = 0;
            
            for (int j = 0; j < m.length; j++)
            {
                row += m[i][j];
                column += m[j][i];
            }
            
            if(column != total || row != total)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args)
    {
        int m[][] =
        {
            {
                2, 2, 1
            },
            {
                2, 1, 2
            },
            {
                1, 2, 2
            }
        };

        for (int i[] : m)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        if (isThatMagic(m))
        {
            System.out.println("That is a Magic Matrix!");
        }
        else
        {
            System.out.println("That is not a Magic Matrix!!!");
        }
    }
}
