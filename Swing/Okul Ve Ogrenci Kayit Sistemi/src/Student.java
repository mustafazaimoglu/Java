
public class Student
{
    private String ogrenciIsmi;
    private String sinif;

    public Student(String ogrenciIsmi, String sinif)
    {
        this.ogrenciIsmi = ogrenciIsmi;
        this.sinif = sinif;
    }

    public String getOgrenciIsmi()
    {
        return ogrenciIsmi;
    }

    public void setOgrenciIsmi(String ogrenciIsmi)
    {
        this.ogrenciIsmi = ogrenciIsmi;
    }

    public String getSinif()
    {
        return sinif;
    }

    public void setSinif(String sinif)
    {
        this.sinif = sinif;
    }
    
    
}
