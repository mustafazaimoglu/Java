
import java.util.ArrayList;

public class Main
{

    public static ArrayList<Integer> indexI = new ArrayList<>();
    public static ArrayList<Integer> indexJ = new ArrayList<>();

    public static void main(String[] args)
    {
        int Matrix[][] = new int[10][10];

        int k = 1;

        doldur(Matrix);
        createObjects(Matrix);

        yazdir(Matrix);

        a:
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                if (Matrix[i][j] == 1)
                {
                    Matrix[i][j] = k;
                    distinguishObjects(k, Matrix, i, j);
                    recursive(k, Matrix);
                    k++;
                    
                }
            }
        }

        yazdir(Matrix);

    }
    
    public static void recursive(int k, int Matrix[][])
    {
        if (!indexI.isEmpty())
        {
            int newI = indexI.get(0);
            int newJ = indexJ.get(0);
            indexI.remove(0);
            indexJ.remove(0);
            distinguishObjects(k, Matrix, newI, newJ);
            recursive(k, Matrix);
        }
    }

    public static void distinguishObjects(int k, int Matrix[][], int i, int j)
    {
        try
        {
            if (Matrix[i - 1][j] == 1)
            {
                Matrix[i - 1][j] = k;
                indexI.add(i - 1);
                indexJ.add(j);
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i - 1][j + 1] == 1)
                {
                    Matrix[i - 1][j + 1] = k;
                    indexI.add(i - 1);
                    indexJ.add(j + 1);
                }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i - 1][j - 1] == 1)
                {
                    Matrix[i - 1][j - 1] = k;
                    indexI.add(i - 1);
                    indexJ.add(j - 1);
                }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i + 1][j + 1] == 1)
                {
                    Matrix[i + 1][j + 1] = k;
                    indexI.add(i + 1);
                    indexJ.add(j + 1);
                }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i + 1][j] == 1)
            {
                Matrix[i + 1][j] = k;
                indexI.add(i + 1);
                indexJ.add(j);
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i + 1][j - 1] == 1)
                {
                    Matrix[i + 1][j - 1] = k;
                    indexI.add(i + 1);
                    indexJ.add(j - 1);
                }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i][j + 1] == 1)
            {
                Matrix[i][j + 1] = k;
                indexI.add(i);
                indexJ.add(j + 1);
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
        try
        {
            if (Matrix[i][j - 1] == 1)
            {
                Matrix[i][j - 1] = k;
                indexI.add(i);
                indexJ.add(j - 1);
            }
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            // ...
        }
        
/*        
        if (i != 0)
        {
            if (Matrix[i - 1][j] == 1)
            {
                Matrix[i - 1][j] = k;
                indexI.add(i - 1);
                indexJ.add(j);
            }

            if (j < Matrix[0].length - 1)
            {
                if (Matrix[i - 1][j + 1] == 1)
                {
                    Matrix[i - 1][j + 1] = k;
                    indexI.add(i - 1);
                    indexJ.add(j + 1);
                }
            }

            if (j != 0)
            {
                if (Matrix[i - 1][j - 1] == 1)
                {
                    Matrix[i - 1][j - 1] = k;
                    indexI.add(i - 1);
                    indexJ.add(j - 1);
                }
            }

        }

        if (i < Matrix.length - 1)
        {
            if (j < Matrix[0].length - 1)
            {
                if (Matrix[i + 1][j + 1] == 1)
                {
                    Matrix[i + 1][j + 1] = k;
                    indexI.add(i + 1);
                    indexJ.add(j + 1);
                }
            }

            if (Matrix[i + 1][j] == 1)
            {
                Matrix[i + 1][j] = k;
                indexI.add(i + 1);
                indexJ.add(j);
            }

            if (j != 0)
            {
                if (Matrix[i + 1][j - 1] == 1)
                {
                    Matrix[i + 1][j - 1] = k;
                    indexI.add(i + 1);
                    indexJ.add(j - 1);
                }
            }

        }

        if (j < Matrix[0].length - 1)
        {
            if (Matrix[i][j + 1] == 1)
            {
                Matrix[i][j + 1] = k;
                indexI.add(i);
                indexJ.add(j + 1);
            }
        }

        if (j != 0)
        {
            if (Matrix[i][j - 1] == 1)
            {
                Matrix[i][j - 1] = k;
                indexI.add(i);
                indexJ.add(j - 1);
            }
        }
*/
    }

    public static void yazdir(int Matrix[][])
    {
        System.out.println("* * * * * * * * * * * * * * *");
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print(Matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("* * * * * * * * * * * * * * *");
    }

    public static void doldur(int Matrix[][])
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                Matrix[i][j] = 0;
            }
        }
    }

    public static void createObjects(int Matrix[][])
    {
        Matrix[0][0] = 1;
        Matrix[0][2] = 1;
        Matrix[0][6] = 1;
        Matrix[0][7] = 1;
        Matrix[0][8] = 1;
        Matrix[0][9] = 1;
        Matrix[1][2] = 1;
        Matrix[1][4] = 1;
        Matrix[1][6] = 1;
        Matrix[2][0] = 1;
        Matrix[2][1] = 1;
        Matrix[2][2] = 1;
//        Matrix[2][3] = 1;
        Matrix[2][6] = 1;
        Matrix[3][0] = 1;
        Matrix[3][3] = 1;
        Matrix[3][5] = 1;
        Matrix[4][0] = 1;
        Matrix[4][1] = 1;
        Matrix[4][2] = 1;
        Matrix[4][3] = 1;
        Matrix[4][7] = 1;
        Matrix[4][8] = 1;
        Matrix[4][9] = 1;
        Matrix[5][1] = 1;
        Matrix[5][3] = 1;
        Matrix[5][6] = 1;
        Matrix[5][7] = 1;
        Matrix[5][8] = 1;
        Matrix[5][9] = 1;
        Matrix[6][5] = 1;
        Matrix[6][6] = 1;
        Matrix[6][7] = 1;
        Matrix[7][3] = 1;
        Matrix[7][6] = 1;
        Matrix[7][7] = 1;
        Matrix[7][8] = 1;
        Matrix[8][0] = 1;
        Matrix[8][2] = 1;
        Matrix[8][4] = 1;
//        Matrix[8][7] = 1;
        Matrix[9][0] = 1;
//        Matrix[9][1] = 1;
        Matrix[9][2] = 1;
        Matrix[9][3] = 1;
        Matrix[9][7] = 1;
        Matrix[9][8] = 1;
        Matrix[9][9] = 1;

    }

}
