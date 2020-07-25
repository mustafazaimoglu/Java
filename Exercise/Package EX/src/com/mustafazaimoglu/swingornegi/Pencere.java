
package com.mustafazaimoglu.swingornegi;

import javax.swing.*;

public class Pencere
{
    private JFrame frame;

    public Pencere()
    {
        frame = new JFrame();
        
        JButton button = new JButton("Tıkla");
        JButton button2 = new JButton("Cıkıs");
        
        button.setBounds(130, 100, 100, 50);
        button2.setBounds(130, 200, 100, 50);
        
        frame.add(button);
        frame.add(button2);
        
        frame.setSize(400, 500);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
    }

    
    
}
