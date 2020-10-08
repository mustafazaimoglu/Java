
public class Main
{

    public static void rotate(int matrix[][])
    {
        int n = matrix.length - 1;
        int c = matrix.length - 1;
        
        for (int i = 0; i < matrix.length/2; i++)
        {
            int p = 0;
            for (int j = i; j < c; j++)
            {
                int t1 = matrix[j][n];
                matrix[j][n] = matrix[i][j];
                int t2 = matrix[n][n-p];
                matrix[n][n-p] = t1;
                t1 = matrix[n-p][i];
                matrix[n-p][i] = t2;
                matrix[i][j] = t1;
                p++;
            }
            n--;
            c--;
        }

        System.out.println("\n*** Result ***");
        for (int i[] : matrix)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        for(int i[] : matrix)
//        {
//            System.out.print(Arrays.toString(i));
//        }
    }

    public static void main(String[] args)
    {
        int matrix[][] =
        {
            {
                11, 12, 13, 14, 15
            },
            {
                16, 17, 18, 19, 20
            },
            {
                21, 22, 23, 24, 25
            },
            {
                26, 27, 28, 29, 30
            },
            {
                31, 32, 33, 34, 35
            }
        };
        
//        int matrix[][] =
//        {
//            {
//                1,2,3,4
//            },
//            {
//                5,6,7,8
//            },
//            {
//               9,10,11,12
//            },
//            {
//                13,14,15,16
//            }
//        };

        for (int i[] : matrix)
        {
            for (int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        rotate(matrix);
    }
}
