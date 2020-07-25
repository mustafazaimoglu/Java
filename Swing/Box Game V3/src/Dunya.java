
import java.awt.Color;
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

public class Dunya extends JPanel implements ActionListener, MouseMotionListener, MouseListener
{
    Random r = new Random();
    Timer timer = new Timer(60, this);
    JPanel paneller[] = new JPanel[5]; 
    JPanel ball = new JPanel();
    private final int ballDimension = 15;
    private int ballY = 0;
    private int ballX = (int) (20 + r.nextDouble()*560);
    private final int ballDeğisim = 15; 
    private int skor = 0;
    private int X, Y;

    Dunya()
    {   
        ball.setLocation(ballX, ballY);
        ball.setBackground(Color.YELLOW);
        ball.setSize(ballDimension, ballDimension); 
        add(ball);
        
        for (int i = 0; i < 5; i++)
        {
            paneller[i] = new JPanel();
            paneller[i].setBackground(Color.CYAN);
            paneller[i].setBounds(80+i*100, 400, 50, 50);
            paneller[i].setName("Panel " + (i+1));
            paneller[i].addMouseListener(this);
            paneller[i].addMouseMotionListener(this);
            add(paneller[i]);
        }
        
        timer.start();   

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
        
        ball.setLocation(ballX, ballY);
        
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

    
}
