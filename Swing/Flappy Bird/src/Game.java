
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Game extends JPanel implements KeyListener, ActionListener
{
    private int delay = 40;
    Random r = new Random();
    Timer timer = new Timer(delay,this);
    JLabel skorTabelasi = new JLabel("Skor : 0");
    private final int engelDegisim = 5;
    private final int birdButtonDegisim = 15;
    private final int birdDimension = 60;
    private final int birdX = 45;
    private int uretimSuresi = 1;
    private int birdY = 150;   
    private int skor = 10;
    
    ArrayList<Obstacle> sutun = new ArrayList<>();

    public Game()
    {
        skorTabelasi.setHorizontalAlignment(SwingConstants.CENTER);
        skorTabelasi.setFont(new Font("Tohama", 0, 20));
        skorTabelasi.setBounds(0, 541, 100, 30);       
        skorTabelasi.setForeground(Color.YELLOW);
        add(skorTabelasi);
        setLayout(null);
        timer.start();
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g); 
        
        g.setColor(new Color(77, 38, 0));
        g.drawLine(0, 430, 1000, 430);   //
        g.drawLine(0, 431, 1000, 431);   // Kahverengi line
        g.drawLine(0, 432, 1000, 432);   //
        g.setColor(new Color(0, 125, 0));
        g.fillRect(0, 433, 1000, 110); // Yesil Bolge
        g.fillRect(100, 540, 930, 50);
        
        g.setColor(Color.DARK_GRAY);
        g.fillOval(birdX, birdY, birdDimension, birdDimension);
        
        g.setColor(Color.red);
        for (Obstacle o : sutun)
        {
            g.fillRect(o.getGenelX(), o.getUstY(), o.getGenislik(), o.getUstYukseklik());
            g.fillRect(o.getGenelX(), o.getAltY(), o.getGenislik(), o.getAltYukseklik());
        }       
        
    }

    @Override
    public void repaint()
    {
        super.repaint();       
    }
    
    public boolean isOver()
    {
        
        Rectangle bird = new Rectangle(birdX, birdY, birdDimension, birdDimension);
        
        
        if (birdY > 370)
        {
            return true;
        }
        else if (birdY < 0)
        {
            return true;
        }
        
        for (Obstacle o : sutun)
        {
            Rectangle ust = new Rectangle(o.getGenelX(), o.getUstY(), o.getGenislik(), o.getUstYukseklik());
            Rectangle alt = new Rectangle(o.getGenelX(), o.getAltY(), o.getGenislik(), o.getAltYukseklik());
            
            if (alt.intersects(bird) || ust.intersects(bird))
            {
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        int c = e.getKeyCode();
        
        if (c == KeyEvent.VK_W || c == KeyEvent.VK_UP)
        {
            birdY -= birdButtonDegisim;
        }
        else if (c == KeyEvent.VK_S || c == KeyEvent.VK_DOWN)
        {
            birdY += birdButtonDegisim;
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {        
        uretimSuresi += delay;
        
        if (uretimSuresi == 2800 || uretimSuresi == 41) //bir kereye mahsus olması için ilk seferde 1 den baslatıp 41 da ilk obje olussun
        {
            sutun.add(new Obstacle());
            uretimSuresi = 0;

            if (sutun.size() > 4)
            {
                skor += 10;
                sutun.remove(0);
                skorTabelasi.setText("Skor : " + skor);
            }
        }
        
        for (Obstacle o : sutun)
        {         
            o.setGenelX(o.getGenelX() - engelDegisim);
        }         
        
        
        if (isOver())
        {
            JOptionPane.showMessageDialog(this, "Game Over", "Game Over",1);
            System.exit(0);
        }
        
        repaint();
    }
      
}
