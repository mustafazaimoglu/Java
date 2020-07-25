
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Main extends JFrame
{
    private final int ScreenX = 600;
    private final int ScreenY = 600;

    public Main(String title) throws HeadlessException
    {
        super(title);
        setResizable(false);
        setFocusable(false);
        setSize(ScreenX, ScreenY);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        AltEkran game = new AltEkran();
     
        game.setBackground(Color.BLACK);
        game.setSize(getSize());
        
        UstEkran game2 = new UstEkran();
        game2.setOpaque(false);
        game2.setBounds(0, 0, 600, 600);       
        
        add(game2); //Ust ekran eklendi ve opak
        add(game); // Cizim ekrani
    }
   
    public static void main(String[] args)
    {
        Main screen = new Main("Cube");        
        
        screen.setVisible(true);
               
    }
    
}
