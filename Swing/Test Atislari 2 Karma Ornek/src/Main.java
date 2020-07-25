
import java.awt.Color;
import java.text.ParseException;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKZ
 */
public class Main extends javax.swing.JFrame
{
    JSeparator a = new JSeparator();
    
    

    public Main()
    {
        initComponents();
        add(a);
        a.setLocation(15, 60);
        a.setSize(15, 60);
        a.setBackground(Color.PINK);
        a.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mkz = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MyButton = new javax.swing.JLabel();
        denemeText = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        tgl = new javax.swing.JToggleButton();
        ftext = new javax.swing.JFormattedTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        mkz.setBackground(new java.awt.Color(255, 153, 153));
        mkz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mkz.setText("MKZ");
        mkz.setOpaque(true);
        mkz.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                mkzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                mkzMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                mkzMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt)
            {
                mkzMouseReleased(evt);
            }
        });

        jButton1.setText("Push Me");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        MyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mavi.png"))); // NOI18N
        MyButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                MyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                MyButtonMouseExited(evt);
            }
        });

        denemeText.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        denemeText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        denemeText.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                denemeTextKeyReleased(evt);
            }
        });

        pass.setEnabled(false);

        tgl.setText("Kapalı");
        tgl.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tglActionPerformed(evt);
            }
        });

        try
        {
            ftext.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(0##) ### - ## - ##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mkz, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(denemeText, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(pass))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(ftext, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(mkz, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(MyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(denemeText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tgl)
                    .addComponent(ftext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mkzMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mkzMouseEntered
    {//GEN-HEADEREND:event_mkzMouseEntered
        mkz.setBackground(Color.green);
    }//GEN-LAST:event_mkzMouseEntered

    private void mkzMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mkzMouseExited
    {//GEN-HEADEREND:event_mkzMouseExited
        mkz.setBackground(new java.awt.Color(255, 153, 153));
    }//GEN-LAST:event_mkzMouseExited

    private void mkzMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mkzMousePressed
    {//GEN-HEADEREND:event_mkzMousePressed
        mkz.setText("Mouse Basılı");
    }//GEN-LAST:event_mkzMousePressed

    private void mkzMouseReleased(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mkzMouseReleased
    {//GEN-HEADEREND:event_mkzMouseReleased
       
        mkz.setText("MKZ");
    }//GEN-LAST:event_mkzMouseReleased

    private void MyButtonMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MyButtonMouseEntered
    {//GEN-HEADEREND:event_MyButtonMouseEntered
        MyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mor.png"))); 
    }//GEN-LAST:event_MyButtonMouseEntered

    private void MyButtonMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_MyButtonMouseExited
    {//GEN-HEADEREND:event_MyButtonMouseExited
        MyButton.setIcon(new ImageIcon(getClass().getResource("/Images/mavi.png"))); 
    }//GEN-LAST:event_MyButtonMouseExited

    private void denemeTextKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_denemeTextKeyReleased
    {//GEN-HEADEREND:event_denemeTextKeyReleased
        label1.setText(denemeText.getText());
        
        String s = denemeText.getText();
        
        dogru(s);
    }//GEN-LAST:event_denemeTextKeyReleased

    private void tglActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tglActionPerformed
    {//GEN-HEADEREND:event_tglActionPerformed
        if (tgl.isSelected())
        {
            tgl.setText("Açık");
            tgl.setBackground(Color.green);
        }
        else
        {
            tgl.setText("Kapalı");
            tgl.setBackground(Color.red);
        }
    }//GEN-LAST:event_tglActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        System.out.println(ftext.getText());
        
        System.out.println(Integer.valueOf(ftext.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    public void dogru(String s)
    {
        if (s.equals("Mustafa"))
        {
            pass.setEnabled(true);
        }
        else
        {
            pass.setEnabled(false);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MyButton;
    private javax.swing.JTextField denemeText;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JFormattedTextField ftext;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel mkz;
    private javax.swing.JPasswordField pass;
    private javax.swing.JToggleButton tgl;
    // End of variables declaration//GEN-END:variables


}
