
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates
{
    private int x,y;

    public Ates(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
    
}

public class Oyun extends JPanel implements KeyListener,ActionListener
{
    Timer timer = new Timer(5, this);
    private float gecenSure = 0;
    private int kullanilanCephane = 0;
    
    private BufferedImage image;
    
    private ArrayList<Ates> cephane = new ArrayList<>();
    
    private int cephanedirY = 1;
    private int hedefX = 0;
    
    private int hedefdirX = 2;

    private int uzayGemisiX = 0;
    private int uzaygemisidirX = 20;

    public boolean kontrolEt()
    {
        for (Ates a : cephane)
        {
            Rectangle mermi = new Rectangle(a.getX(), a.getY(), 10, 15);
            Rectangle hedef = new Rectangle(hedefX, 0, 20, 20);
            
            if (mermi.intersects(hedef))
            {
                return true;
            }
                
        }
        return false;
        
    }    
    public Oyun()
    {
        try
        {
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } 
        catch (IOException ex)
        {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.BLACK);
        
        timer.start();
              
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        gecenSure += 0.005;
        
        g.setColor(Color.red);
        
        g.fillOval(hedefX, 0, 20, 20);
        
        g.drawImage(image, uzayGemisiX, 495, image.getWidth()/10, image.getHeight()/10, this);
        
        for (Ates a : cephane)
        {
            if (a.getY() < 0)
            {
                cephane.remove(a);
            }
        }
        
        g.setColor(Color.CYAN);
        
        for (Ates a : cephane)
        {
            g.fillRect(a.getX(), a.getY(), 10, 15);
        }
        
        if (kontrolEt())
        {
            timer.stop();
            String Message = "Tebrikler...\n"
                    + "Harcanan Cephane : " + kullanilanCephane +
                    "\nGecen Sure : " + Math.round(gecenSure) + " Saniye";
            JOptionPane.showMessageDialog(this, Message);
            System.exit(0);
            
        }
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_LEFT)
        {
            if (uzayGemisiX >= 10)
            {
                uzayGemisiX -= uzaygemisidirX;
            }
        }
        else if (c == KeyEvent.VK_RIGHT)
        {
                if (uzayGemisiX <= 730)
            {
                uzayGemisiX += uzaygemisidirX;
            }
        }
        else if (c == KeyEvent.VK_CONTROL)
        {
            cephane.add(new Ates(uzayGemisiX+15, 475));
            
            kullanilanCephane++;
        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        int k = e.getKeyCode();
        
        if (k == KeyEvent.VK_Q)
        {
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        for (Ates a : cephane)
        {
            a.setY(a.getY() - cephanedirY);
        }
        
        hedefX += hedefdirX;
        
        if (hedefX >= 775)
        {
            hedefdirX *= -1;
        }
        
        if (hedefX <= 0)
        {
            hedefdirX *= -1;
        }
        
        repaint();
    }
    
}
