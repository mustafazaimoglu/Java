
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel
{

    @Override
    public void paint(Graphics g)
    {
        super.paint(g); 
        
        g.setColor(Color.red);
        
        g.drawOval(50, 50, 50, 50);
        g.fillOval(100, 100, 75, 75);
        g.setColor(Color.blue);
        g.fillOval(200, 200, 35, 75);
        g.fill3DRect(300, 300, 50, 40, true);
        g.setColor(Color.CYAN);
        g.drawLine(60, 60, 400, 60);
        g.fillRect(500, 500, 46, 46);
        g.setColor(Color.yellow);
        g.drawLine(0, 0, 500, 500);
    }

    public GrafikKullanimi()
    {
        setBackground(Color.black);
    }
    
    
}
