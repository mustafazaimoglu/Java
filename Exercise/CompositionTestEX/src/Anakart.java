public class Anakart 
{
    private String Model;
    private String SlotSayisi;
    private int RamMiktari;
    private String ChipsetTipi;

    public Anakart(String Model, String SlotSayisi, int RamMiktari, String ChipsetTipi) {
        this.Model = Model;
        this.SlotSayisi = SlotSayisi;
        this.RamMiktari = RamMiktari;
        this.ChipsetTipi = ChipsetTipi;
    }
    
    public void RamEkle(int RamMiktari)
    {
        this.RamMiktari += RamMiktari;
        System.out.println("Yeni Ram Miktari : " + this.RamMiktari);
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getSlotSayisi() {
        return SlotSayisi;
    }

    public void setSlotSayisi(String SlotSayisi) {
        this.SlotSayisi = SlotSayisi;
    }

    public int getRamMiktari() {
        return RamMiktari;
    }

    public void setRamMiktari(int RamMiktari) {
        this.RamMiktari = RamMiktari;
    }

    public String getChipsetTipi() {
        return ChipsetTipi;
    }

    public void setChipsetTipi(String ChipsetTipi) {
        this.ChipsetTipi = ChipsetTipi;
    }
    
    
    
}
