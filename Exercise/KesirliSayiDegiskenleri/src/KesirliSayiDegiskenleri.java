public class KesirliSayiDegiskenleri 
{
   public static void main (String[] Args)
   {
       // int --> float --> double
       float toplam;
       double a = 5.0;
       float b = 6.5f;// in float we have to use f or (float)
       //float b = 6.5; f ile donusum saglanmali
       double c = 326.154d;// we dont have to put "d" in double
       float d = (float) 33.33;
       
       System.out.println("A = "+a);
       System.out.println("B = "+b);    
       System.out.println("C = "+c);
       System.out.println("D = "+d);
       
       float x = 22f / 7f;
       double z = 22d / 7d;
       
       System.out.println("");
       System.out.println("x = "+x);
       System.out.println("z = "+z);
       System.out.println("");
       
       toplam = d / (float)a;
       System.out.println("Toplam = "+toplam);
   
   }
}
