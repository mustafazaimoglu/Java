
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class AnaEkran extends JFrame
{

    public AnaEkran(String title) throws HeadlessException
    {
        super(title);
    }
    
    
    public static void main(String[] args)
    {
        GrafikKullanimi grafik = new GrafikKullanimi();
        
        AnaEkran ana = new AnaEkran("Grafik Kullanımı");
        
        ana.setVisible(true);
        ana.setResizable(true);
        ana.setSize(800,600);
        ana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ana.add(grafik);
    }

}
