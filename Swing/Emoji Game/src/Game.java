
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
import java.util.Random;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Game extends JPanel implements KeyListener, ActionListener
{
    private int delay = 100;
    Random r = new Random();
    Timer timer = new Timer(delay, this);
    private BufferedImage sface;
    private BufferedImage pipe;
    private int pipeX = (10 + r.nextInt(650));
    private int faceY = 480;
    private int faceX = 330;
    private int faceDegisim = 10;
    private int skor = 0;
    JLabel skorTabelasi = new JLabel("Skor : 0");
    

    public Game()
    {  
        setLayout(null);
        skorTabelasi.setOpaque(true);
        skorTabelasi.setHorizontalAlignment(SwingConstants.CENTER);
        skorTabelasi.setBackground(Color.DARK_GRAY);
        skorTabelasi.setForeground(Color.PINK);
        skorTabelasi.setBounds(2, 540,68,20); //Set Bounds Kullanmazsan Layout Null bisiye yaramaz!
        
        try
        {
            sface = ImageIO.read(new FileImageInputStream(new File("sface.png")));
            pipe = ImageIO.read(new FileImageInputStream(new File("pipe.png")));            
        } 
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(this, "Resim Dosyaları Bulunamadi!");
            System.exit(0);
        }
        
        add(skorTabelasi);  
        
        timer.start();
    }

    public boolean isOver()
    {
        Rectangle pipeLeftBorder = new Rectangle(pipeX + 3 , 0, 10, 110);
        Rectangle pipeRightBorder = new Rectangle(pipeX + 115, 0, 10, 110);
        
        Rectangle face = new Rectangle(faceX, faceY, sface.getWidth(), sface.getHeight() - 10);
        
        if (faceX > 710 || faceX < 0)
        {
            return true;
        }
        else if (faceY < 0)
        {
            if (faceX < pipeX || faceX > pipeX + 120)
            {
                return true;
            }    
        }
        
        return face.intersects(pipeLeftBorder) || face.intersects(pipeRightBorder);
    }
    
    @Override
    public void paint(Graphics g)
    {
        super.paint(g); 
        g.drawImage(sface, faceX, faceY, sface.getWidth(), sface.getHeight(), this);
        g.drawImage(pipe, pipeX, 0, pipe.getWidth() + 10, pipe.getHeight(), this);
        
        g.setColor(Color.CYAN);
        g.drawLine(0, 0, 0, 600);
        g.drawLine(793, 0, 793, 600);
        g.drawLine(0, 0, 800, 0);   
    }

    @Override
    public void repaint()
    {
        super.repaint(); 
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_RIGHT || c == KeyEvent.VK_D)
        {
            faceX += faceDegisim;
        }
        else if (c == KeyEvent.VK_LEFT || c == KeyEvent.VK_A)
        {
            faceX -= faceDegisim;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {        
        if (isOver())
        {
            JOptionPane.showMessageDialog(this, "Skor : " + skor, "Game Over", 0);
            System.exit(0);
        }
        
        if (faceY < 0)
        {
            skor += 10;
            pipeX = (10 + r.nextInt(650));
            faceX = (10 + r.nextInt(700));
            faceY = 480;
            skorTabelasi.setText("Skor : " + skor);
            
            if (skor % 40 == 0)
            {
                delay -= 10;
                timer.setDelay(delay);
            }
        } 
        
        faceY  -= faceDegisim;                 
        
        repaint();
    }
      
}
