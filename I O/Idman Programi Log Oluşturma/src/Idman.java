public class Idman 
{
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }
    
    public void pushupYap (int sayi) 
    {    
        if ((pushup_sayisi-sayi) < 0) {
            
            System.out.println("Tebrikler Hedefinizden Daha Cok Pushup"
                    + " yaptınız!");
            pushup_sayisi = 0;
            System.out.println("Kalan Pushup Sayisi : " + pushup_sayisi);
        }
        else {
            
            pushup_sayisi -= sayi;
            System.out.println("Kalan Pushup Sayisi : " + pushup_sayisi);
        }
    }
    
    public void situpYap (int sayi) 
    {   
        if ((situp_sayisi-sayi) < 0) {
            
            System.out.println("Tebrikler Hedefinizden Daha Cok Situp"
                    + " yaptınız!");
            situp_sayisi = 0;
            System.out.println("Kalan Situp Sayisi : " + situp_sayisi);
        }
        else {
            
            situp_sayisi -= sayi;
            System.out.println("Kalan Situp Sayisi : " + situp_sayisi);
        }    
    }

    public void squatYap (int sayi) 
    {   
        if ((squat_sayisi-sayi) < 0) {
            
            System.out.println("Tebrikler Hedefinizden Daha Cok Squat"
                    + " yaptınız!");
            squat_sayisi = 0;
            System.out.println("Kalan Squat Sayisi : " + squat_sayisi);
        }
        else {
            
            squat_sayisi -= sayi;
            System.out.println("Kalan Squat Sayisi : " + squat_sayisi);
        }    
    }
    
    public boolean AntrenmanSonu() 
    {
        return (squat_sayisi == 0 && situp_sayisi == 0 && pushup_sayisi == 0);
    }
    
}
