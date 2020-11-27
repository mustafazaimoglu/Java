package simple.sorting.practice;

import java.util.Arrays;

public class Sorting
{
    int arr[];

    public Sorting(int[] arr)
    {
        this.arr = arr;
    }

    public void insertionSort()
    {
        int i,j;
        
        for ( i = 0; i < this.arr.length; i++)
        {
            int temp = arr[i];
            for ( j = i - 1; j > 0 && temp < arr[j]; j--)
            {
                arr[j + 1] = arr[j];
            }
            
            arr[j + 1] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
        
    }

    public void selectionSort()
    {
        for (int i = 0; i < this.arr.length; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < this.arr.length; j++)
            {
                if (arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }

            if (minIndex != i)
            {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
