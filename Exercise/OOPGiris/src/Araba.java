public class Araba 
{
    private String Model;
    private int Kapilar;
    private String Motor;
    
    public void setModel (String Model)
    {
        this.Model = Model; //This. fonksiyonu modeller karismasin diye var!
    }
    
    public String getModel ()
    {
        return Model;
    }

    
    public int getKapilar() {
        return Kapilar;
    }

    public void setKapilar(int Kapilar) {
        if (Kapilar < 0) {
            System.out.println("Hatalı Bir Giris Yaptiniz!");
        }
        else {
            this.Kapilar = Kapilar;
        }
    }

    
    public String getMotor() {
        return Motor;
    }

    
    public void setMotor(String Motor) {
        this.Motor = Motor;
    }
    
}
