
import java.util.Random;


public class Obstacle
{
   Random r = new Random();
   private final int mainWidht = 500;
   private final int height = 80;
   private final int space = 90; 
   private int letfWidth = 20 + r.nextInt(380);
   private int rightWidth = mainWidht - (letfWidth + space);
   private int Y = 0;
   private int leftX = 0;
   private int rightX = letfWidth + space;

    public int getMainWidht()
    {
        return mainWidht;
    }

    public int getHeight()
    {
        return height;
    }

    public int getSpace()
    {
        return space;
    }

    public int getLetfWidth()
    {
        return letfWidth;
    }

    public int getRightWidth()
    {
        return rightWidth;
    }

    public int getY()
    {
        return Y;
    }

    public int getLeftX()
    {
        return leftX;
    }

    public int getRightX()
    {
        return rightX;
    }

    public void setLetfWidth(int letfWidth)
    {
        this.letfWidth = letfWidth;
    }

    public void setRightWidth(int rightWidth)
    {
        this.rightWidth = rightWidth;
    }

    public void setY(int Y)
    {
        this.Y = Y;
    }

    public void setLeftX(int leftX)
    {
        this.leftX = leftX;
    }

    public void setRightX(int rightX)
    {
        this.rightX = rightX;
    }
   
   
   
}
