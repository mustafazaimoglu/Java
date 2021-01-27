

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class Araba extends Arac
{

    public Araba()
    {
        super();
    }

    public Araba(int x, int y, double aci)
    {
        super(x, y, aci);
    }
    
 

    @Override
    public void git(double don, int ilerle)
    {
        setAci(getAci() + don);
        setX((int) (getX() + ilerle * Math.cos(getAci())));
        setY((int) (getY() + ilerle * Math.sin(getAci())));
    }

    @Override
    public void ciz(Graphics g1)
    {
        Graphics2D g2 = (Graphics2D) g1;
        
        Shape r1 = new Ellipse2D.Float(getX()-20, getY()-10, 40, 20);
        
        g2.rotate(Math.toRadians(getAci()),getX()+20,getY()+10);

        g2.setPaint(Color.YELLOW);
        
        g2.fill(r1);
        
        g2.setStroke(new BasicStroke(2));
        
        g2.setPaint(Color.BLACK);
        
        g2.draw(r1);
        
        int x = getX()-2;
        int y = getY()-2;
        g2.setColor(Color.red);
        g2.fillOval(x, y, 3, 3);
        
        
        double x2 = getX() + 20 * Math.cos(getAci());
        double y2 = getY() + 10 * Math.cos(getAci());
        
        Line2D.Double line1 = new Line2D.Double(getX(), getY(), x2, y2);
        
        g2.setColor(Color.red);
        g2.draw(line1);
    }
    




}
