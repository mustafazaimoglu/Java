
public class Main
{
    public static double duzenle(int nums1[], int nums2[])
    {
        int result[] = new int[nums1.length + nums2.length];
        int j = 0, i = 0, k = 0;

        while (i < nums1.length)
        {
            if (nums1[i] <= nums2[j])
            {
                result[k] = nums1[i];

                i++;

            }
            else
            {
                result[k] = nums2[j];
                if (j < nums2.length - 1)
                {
                    j++;

                }
            }

            k++;
        }

        while (j < nums2.length)
        {
            result[k] = nums2[j];
            j++;
            k++;
        }

        for (int l : result)
        {
            System.out.println(l);
        }

        double value;
        
        if(result.length % 2 == 0)
        {
            value = (double) (result[result.length / 2 - 1] + result[result.length / 2]) / 2; 
        }
        else
        {
            value = (double) result[result.length / 2];
        }
            
        return value;
    }

    public static void main(String[] args)
    {
        int arr1[] =
        {
            1, 3,
        };
        int arr2[] =
        {
            2,
        };

        
        System.out.println(duzenle(arr1, arr2));
    }
}
