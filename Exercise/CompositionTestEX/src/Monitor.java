public class Monitor 
{
    private String Model;
    private String Boyut;
    private Resolution resolution;

    public Monitor(String Model, String Boyut, Resolution resolution) {
        this.Model = Model;
        this.Boyut = Boyut;
        this.resolution = resolution;
    }
    
    public void MonitorKapa()
    {
        System.out.println("Monitor Kapatılıyor...");
    }
    
    public void Information()
    {
        System.out.println("Model : " + Model);
        System.out.println("Boyut : " + Boyut);
        System.out.println(resolution.getEn() + " X " + resolution.getBoy());
    }
    
    public void ModelDegistir(String Model)
    {
        this.Model = Model;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getBoyut() {
        return Boyut;
    }

    public void setBoyut(String Boyut) {
        this.Boyut = Boyut;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
    
}
