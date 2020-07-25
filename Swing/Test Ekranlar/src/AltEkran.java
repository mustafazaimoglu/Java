
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class AltEkran extends JPanel 
{

    public AltEkran()
    {
    }
    
    

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.YELLOW);
        g2.fillRect(15, 15, 50, 50);
        
        
        g2.setStroke(new BasicStroke(3F));
        g2.drawLine(15, 15, 400, 400);
        
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }
    
    
}
