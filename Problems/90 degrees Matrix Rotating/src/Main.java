
public class Main
{
    public static void rotate(int matrix[][])
    {
        
        
        
        
        
        
        
        for(int i = 0; i < matrix.length; i++)
        {
            for (int j = 0 ; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        

//        for(int i[] : matrix)
//        {
//            System.out.println(Arrays.toString(i));
//        }
       
    }
    
    public static void main(String[] args)
    {
        int matrix[][] =
        {
            {
                1, 2, 3
            },
            {
                4, 5, 6
            },
            {
                7, 8, 9
            }
        };
        
        for(int i[] : matrix)
        {
            for(int j : i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
        rotate(matrix);
    }
}
