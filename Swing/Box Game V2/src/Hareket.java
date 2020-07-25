
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Hareket implements MouseMotionListener, MouseListener, ActionListener
{
    JPanel top = null;
    Random r = new Random();
    Timer timer = new Timer(60,this);
    JPanel paneller[] = new JPanel[5]; 
    private int X, Y;
    private int ballDimension = 15;
    private int ballY = 0;
    private int ballX = (int) (20 + r.nextDouble()*560);
    private int ballDeğisim = 15; 
    private int skor = 0;

    public Hareket(Component[] paneller)
    {
        int sonuc = JOptionPane.showConfirmDialog(null, "Baslamak İçin Hazırmısın?", "Başla", 1);
        
        if (sonuc == JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
        else if (sonuc == JOptionPane.CANCEL_OPTION)
        {
            System.exit(0);
        }
        timer.start();                  
        
        for (int i = 0; i < 5; i++)
        {
            Component c = paneller[i];
            c.addMouseMotionListener(this);
            c.addMouseListener(this);
            this.paneller[i] = (JPanel) c;        
        }
       
        top = (JPanel) paneller[5]; 
        top.setBackground(Color.YELLOW);
        top.setSize(ballDimension, ballDimension);     
    }
    
    public boolean isOver()
    {
        Rectangle ball = new Rectangle(ballX, ballY, ballDimension, ballDimension);
        
        for (int i = 0; i < 5; i++)
        {
            JPanel j = paneller[i];
            Rectangle instantPanel = new Rectangle(j.getX(), j.getY(), j.getWidth(), j.getHeight());
            
            if (ball.intersects(instantPanel))
            {
                return true;
            }
        }
        return false;
    }    

    @Override
    public void mouseDragged(MouseEvent e)
    {
        e.getComponent().setLocation(e.getComponent().getX() - X + e.getX(), e.getComponent().getY() - Y + e.getY());          
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        X = e.getX();
        Y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (isOver() == true)
        {
            JOptionPane.showMessageDialog(null, "Skor : " + skor + "\n" + skor +" Tane Toptan Kaçıldı", "Game Over", 0);
            System.exit(0);
        }
                
                
        ballY += ballDeğisim;
        
        if (ballY > 600)
        {
            skor++;
            ballX = (int) (20 + r.nextDouble()*560);
            ballY = 0;
        }
        
        top.setLocation(ballX, ballY);
    }
    
}
