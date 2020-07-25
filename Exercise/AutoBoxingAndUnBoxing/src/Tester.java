
import java.util.ArrayList;

public class Tester
{
    public static void main(String[] args) 
    {
        /*
        Wrapper Class 

        int ------> Integer
        short ----> Short
        char -----> Character
        float ----> Float
        double ---> Double
        byte -----> Byte
        boolean --> Boolean
        long -----> Long
        */
        
        // ArrayList<int> arraylist = new ArrayList<>(); This is Wrong!
                                                      // We Have to Use a Class!   
        
        ArrayList<Integer> arraylist = new ArrayList<>();
        
        /*
        for (int i = 0; i < 10; i++)
        {
            arraylist.add(Integer.valueOf(i*4)); // AutoBoxing 
        }
        
        for (int i = 0; i < arraylist.size(); i++)
        {
            System.out.println(arraylist.get(i).intValue()); // UnBoxing
        }
        */

        // YUKARDAKI GIBI YAPMAYA GEREK YOK CUNKU JAVA İS DOİNG THİS!!!
        // ALTTAKİ İLE YUKARDALİ AYNI!!!
        
        for (int i = 0; i < 10; i++)
        {
            arraylist.add(i*4);
        }
        
        for (int i = 0; i < arraylist.size() ; i++)
        {
            System.out.println(arraylist.get(i));
        }
                
        
   
    }
    
}
