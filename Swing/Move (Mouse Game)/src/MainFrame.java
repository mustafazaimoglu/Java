
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame
{
    Dimension dimension = new Dimension(500, 650);

    public MainFrame(String title) throws HeadlessException
    {
        super(title);
        
        setSize(dimension);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        Game game = new Game();
        
        game.setBackground(Color.BLACK);
        add(game);
    }
    
    
    public static void main(String[] args)
    {
        int x = JOptionPane.showConfirmDialog(null, "Hazır mısınız?", "Başla", 0);
        
        if (x == JOptionPane.NO_OPTION)
        {
            System.exit(0);
        }
        
        MainFrame frame = new MainFrame("Move");
    }
    
}
