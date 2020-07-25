
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Hareket implements MouseMotionListener, MouseListener
{
    private int X, Y;

    Hareket(Component[] paneller)
    {
        for (Component c : paneller )
        {
            c.addMouseMotionListener(this);
            c.addMouseListener(this);
        }
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
