
import java.util.Arrays;

public class MyOwnArray
{

    private int arrLength;
    private String arr[];
    private int instantIndex;

    public MyOwnArray(int arrLength)
    {
        this.arrLength = arrLength;
        arr = new String[this.arrLength];
        instantIndex = 0;
    }

    public void add(String x)
    {
        if (instantIndex == arrLength)
        {
            System.err.println("Dizi sinirina ulaşıldı!");
        }
        else
        {
            arr[this.instantIndex] = x;
            instantIndex++;
            System.err.println("Ekleme tamamlandı!");
        }
    }

    public int find(String x)
    {
        int result = -1;
        for (int i = 0; i < instantIndex; i++)
        {
            if (arr[i].equals(x))
            {
                result = i;
            }
        }

        return result;
    }

    public void delete(String x)
    {
        int toDelete = this.find(x);

        if (toDelete != -1)
        {
            while (toDelete < instantIndex - 1)
            {
                arr[toDelete] = arr[toDelete + 1];
                toDelete++;
            }

            instantIndex--;
            System.err.println(x + " stringi basariyla silindi!");
        }
        else
        {
            System.err.println("Element bulunamadı!");
        }

    }

    public void update(String x, String newValue)
    {
        int toUpdate = this.find(x);

        if (toUpdate != -1)
        {
            arr[toUpdate] = newValue;
            System.err.println("Güncelleme tamamlandı!");
        }
        else
        {
            System.err.println("Element bulunamadı!");
        }
    }

    public void display()
    {
        System.out.print("\n[");
        for (int i = 0; i < this.instantIndex; i++)
        {
            if (i != 0)
            {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]\n\n");

//        System.out.println(Arrays.toString(arr));
    }

}
