
public class Main
{

    public static double duzenle(int nums1[], int nums2[])
    {
        int result[] = new int[nums1.length + nums2.length];
        int j = 0, i = 0, k;
        double value;
        boolean arr1 = false, arr2 = false;

        for (k = 0; k < result.length; k++)
        {
            if (nums1.length == 0 || nums2.length == 0)
            {
                if (nums1.length == 0)
                {
                    result[k] = nums2[j];
                    j++;
                }
                else
                {
                    result[k] = nums1[i];
                    i++;
                }
            }
            else if (arr1 == true || arr2 == true)
            {
                if (arr1 == true)
                {
                    result[k] = nums2[j];
                    j++;
                }
                else
                {
                    result[k] = nums1[i];
                    i++;
                }
            }
            else if (nums1[i] <= nums2[j])
            {
                result[k] = nums1[i];
                if (i < nums1.length - 1)
                {
                    i++;
                }
                else
                {
                    arr1 = true;
                }

            }
            else
            {
                result[k] = nums2[j];
                if (j < nums2.length - 1)
                {
                    j++;
                }
                else
                {
                    arr2 = true;
                }

            }
        }

        for (int l : result)
        {
            System.out.println(l);
        }

        if (result.length % 2 == 0)
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

        };
        int arr2[] =
        {
            2, 6, 7, 8, 9
        };

        System.out.println(duzenle(arr1, arr2));
    }
}
