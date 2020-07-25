
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class Main extends JFrame
{
    public static final int MAXARACBOYUTU = 10;
    public static final int DUNYABOYUTU = 600;

    Arac araclar[] = new Arac[MAXARACBOYUTU];
    int aracSayisi = 0;
    
    @Override
    public void paint(Graphics g)
    {
        ciz_alan(g, 4, 30, DUNYABOYUTU-9, DUNYABOYUTU-35);
    
        for (int i = 0; i < aracSayisi; i++)
        {
            System.out.println("X: " + araclar[i].getX() + " Y : " + araclar[i].getY() + " Aci : " + araclar[i].getAci());
            araclar[i].ciz(g);
            
        }
    }
    
    public void ciz_alan(Graphics g, int x, int y, int genislik, int yukseklik)
    {
       g.setColor(Color.red);
       g.drawRect(x, y, genislik, yukseklik);
 
    }
    public Main() 
    {
        setSize(DUNYABOYUTU, DUNYABOYUTU);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); //Ekran Ortasına Koyar
       
        
    }
   
    public void ekleArac(Arac a)
    {
        araclar[aracSayisi] = a;
        aracSayisi++;
    }
    
    public static void main(String[] args)
    {
        Main dunya = new Main();
        //dunya.ekleArac(new Araba());
        
        Araba a1 = new Araba();
        Araba a2 = new Araba();
        Araba a3 = new Araba();
        
       // Kamyon k1 = new Kamyon();
        
        
        dunya.ekleArac(a1);
        dunya.ekleArac(a2);
        dunya.ekleArac(a3);
       // dunya.ekleArac(k1);
    }
}
