
import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame
{
    Dimension boyutlar = new Dimension(1000, 555);
    private Icon icon;

    public MainFrame(String title) throws HeadlessException
    {
        super(title);

        setSize(boyutlar);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(false);  //odağı frame den aldık  aksiyonlarımız framde değil game panel de olacak 
        setLocationRelativeTo(this);
        setLayout(null);

        icon = new ImageIcon("Background.jpg");

        JPanel ArkaCerceve = new JPanel();
        ArkaCerceve.setSize(getSize());
        ArkaCerceve.setLayout(null);
        JLabel background = new JLabel(icon);
        background.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        ArkaCerceve.add(background);

        GamePanel game = new GamePanel();

        // key action için bazı komutlar yazmamız gerekli onları açıklayalım
        game.requestFocus();
        game.addKeyListener(game); // bir tane Keylistenerı implemente eden bir nesne ekliyoruz
        game.setFocusable(true); //focusu panele veriyoruz
        game.setLayout(null); // free design 
        game.setOpaque(false); // saydam yapmamızın sebebi background umuzu görebilmek opaklığı true yapsaydık background un üstünde olacaktı
        game.setBounds(0, 0, getWidth(), getHeight());

        add(game);  // önce panelimizi
        add(ArkaCerceve); // sonra arka planı ekliyoruz eğer tam tersi yapsaydık game nesnesi saydam olduğundan arkada kalacaktı  ama oyun oynanabilecekti

        setVisible(true);
    }
    
}
