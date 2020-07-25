
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class RoundedPanel extends JPanel
{
    private final Color backgroundColor; 
    private int cornerRadius;
    private int x;
    private int y;
    private int boyut;
    private int degisim;
    private int katsayi;

    JLabel number = new JLabel();

    public RoundedPanel(int x, int y, int boyut, int degisim, int katsayi)
    {
        super();
        this.x = x;
        this.y = y;
        setOpaque(false);
        setLayout(null); // üstüne label falan ekleyebilmek (free desing) için istediğimiz gibi değiştirebilmek için
        this.boyut = boyut;
        this.degisim = degisim;
        this.katsayi = katsayi;

        setBounds(this.x, this.y, this.boyut, this.boyut);
        backgroundColor = Color.YELLOW; // Topun rengi
        cornerRadius = boyut; // Yuvarlatma katsayısı

        number.setText(String.valueOf(this.katsayi)); //gelen katsayı integer onu Stringe çevirerek içine setliyoruz
        int w = 20, h = 15; // içteki label boyutları 
        number.setForeground(Color.BLACK);
        number.setFont(new Font("Arial", 0, 18));
        number.setHorizontalAlignment(SwingConstants.CENTER);
        number.setBounds(boyut / 2 - w / 2, boyut / 2 - h / 2, w, h);  // bölü 2 ler ortalamak için  20 X 15 lik bir label ı ortalamak için biraz ince ayar yaptık denedik 
        //ve en uygun bunu bulduk 

        add(number);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //Draws the rounded panel with borders.
        if (backgroundColor != null)
        {
            graphics.setColor(backgroundColor);
        }
        else
        {
            graphics.setColor(getBackground());
        }
        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
        graphics.setColor(getForeground());
        graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
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

    public int getDegisim()
    {
        return degisim;
    }

    public int getKatsayi()
    {
        return katsayi;
    }

    public void setKatsayi(int katsayi)
    {
        this.katsayi = katsayi;
    }

    public int getBoyut()
    {
        return boyut;
    }

    public void setBoyut(int boyut)
    {
        this.boyut = boyut;
    }

}
