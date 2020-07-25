public class Account 
{
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String telNo;
    
    public Account()
    {
        //System.out.println("I Made It Myself!");
        this("Bigi Yok",0,"Bilgi Yok","Bilgi Yok");
    }
    
    public Account(String hesapNo,double bakiye,String isim,String telNo)
    {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.telNo = telNo;
    }
    
    public Account (String hesapNo,double bakiye)
    {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = "Bilgi Yok";
        this.telNo = "Bilgi Yok";
    }
    
    public void bilgileriGoster()
    {
        System.out.println("\nHesap No = " + hesapNo);
        System.out.println("İsim = " + isim);
        System.out.println("Bakiye = " + bakiye);       
        System.out.println("Telefon Numarasi = " + telNo);
    }
    
    public void paraCekme(double miktar)
    {
        if (miktar > 1500)
        {
            System.out.println("Bir Günde Maximum 1500 Lira Cekebilirsiniz!");
        }
        else if (bakiye-miktar < 0)
        {
            System.out.println("Yeterli Bakiyeniz Bulunmamaktadır!\n"
                    + "Güncel Bakiye = " + bakiye);
        }
        else
        {
            bakiye -= miktar;
            System.out.println("Güncel Bakiye = " + getBakiye());
        }
    }
    
    public void paraYatirma(double miktar)
    {
        bakiye += miktar;
        System.out.println("Güncel Bakiye = " + getBakiye());
    }

    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
    
    
}
