public class Tester 
{
    public static void main(String[] args) 
    {
        Araba Tesla = new Araba();
        
       // Tesla.Model = "CyberTruck";
        
       Tesla.setModel("Tesla CyberTruck");
       
       Tesla.setKapilar(4);
       
       Tesla.setMotor("720 HP");
       
       
       System.out.println(Tesla.getModel() + "\n" + Tesla.getMotor() + "\n" +
               Tesla.getKapilar() + "\n");
       
       Araba McLaren = new Araba();
       
       McLaren.setModel("McLaren 600LT");
       
       McLaren.setMotor("3.8 LT");
       
       McLaren.setKapilar(2);
       
       System.out.println(McLaren.getModel());
       System.out.println(McLaren.getMotor());
       System.out.println(McLaren.getKapilar() + "\n");
       
       Araba Honda = new Araba();
       
       Honda.setModel("Honda Civic");
       Honda.setMotor("1.6 CC");
       Honda.setKapilar(4);
       
       System.out.println(Honda.getModel());
       System.out.println(Honda.getMotor());
       System.out.println(Honda.getKapilar());
   
    }    
}
