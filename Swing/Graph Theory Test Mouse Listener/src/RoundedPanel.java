
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
        private Color backgroundColor;
        private int cornerRadius = 15;
        JLabel number = new JLabel();

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            setOpaque(false);
            setLayout(null);
            
            number.setForeground(Color.BLACK);
            number.setFont(new Font("Arial", 0, 18));
            number.setText("15");
            number.setHorizontalAlignment(SwingConstants.CENTER);
            number.setBounds(9, 13, 20, 15);
            add(number);         
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
            setOpaque(false);
            
            setLayout(null);
            number.setForeground(Color.BLACK);
            number.setFont(new Font("Arial", 0, 18));
            number.setText("15");
            number.setHorizontalAlignment(SwingConstants.CENTER);
            number.setBounds(9, 13, 20, 15);
            add(number);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
}
