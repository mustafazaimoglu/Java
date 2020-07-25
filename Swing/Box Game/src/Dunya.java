
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Dunya extends JPanel implements ActionListener
{
    Random r = new Random();
    Timer timer = new Timer(60, this);
    JPanel paneller[] = new JPanel[5]; 
    private int ballDimension = 15;
    private int ballY = 0;
    private int ballX = (int) (20 + r.nextDouble()*560);
    private int ballDeğisim = 15; 
    private int skor = 0;

    Dunya()
    {
        int sonuc = JOptionPane.showConfirmDialog(this, "Baslamak İçin Hazırmısın?", "Başla", 1);
        
        if (sonuc == JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
        else if (sonuc == JOptionPane.CANCEL_OPTION)
        {
            System.exit(0);
        }
        timer.start();

    }
    
    public void panelVer(Component[] components)
    {
        int i = 0;
        
        for (Component c : components)
        {
            paneller[i] = (JPanel) c;
            i++;
        }
    }
    
    public boolean isOver()
    {
        Rectangle ball = new Rectangle(ballX, ballY, ballDimension, ballDimension);
        
        for (JPanel j : paneller)
        {
            Rectangle instantPanel = new Rectangle(j.getX(), j.getY(), j.getWidth(), j.getHeight());
            
            if (ball.intersects(instantPanel))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g); 
        
        g.setColor(Color.red);
        g.fillOval(ballX, ballY+15, ballDimension,ballDimension);
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        
        if (isOver() == true)
        {
            JOptionPane.showMessageDialog(this, "Skor : " + skor + "\n" + skor +" Tane Toptan Kaçıldı", "Game Over", 0);
            System.exit(0);
        }
        
        ballY += ballDeğisim;
        
        if (ballY > 600)
        {
            skor++;
            ballX = (int) (20 + r.nextDouble()*560);
            ballY = 0;
        }
        
        repaint();
    }

    
}
