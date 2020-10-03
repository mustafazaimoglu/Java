
public class Main
{

    public static void main(String[] args)
    {
        int first,second,third;
        int arr[] =
        {
            1, 2, 3, 9, 5, 7, 4, 8, 6
        };

        for (int a : arr)
        {
            System.out.print(a + " ");
        }

        first = second = third = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] > first)
            {
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second)
            {
                third = second;
                second = arr[i];
            }
            else if(arr[i] > third)
            {
                third = arr[i];
            }
        }
        
        System.out.println();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        
        
        
        
//        int temp;
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = 0; j < arr.length; j++)
//            {
//                try
//                {
//                    if (arr[j] > arr[j + 1])
//                    {
//                        temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//                catch(ArrayIndexOutOfBoundsException ex){};
//
//            }
//        }
//
//        System.out.println();
//        System.out.println(arr[arr.length-1]);
//        System.out.println(arr[arr.length-2]);
//        System.out.println(arr[arr.length-3]);
        
    }
}
