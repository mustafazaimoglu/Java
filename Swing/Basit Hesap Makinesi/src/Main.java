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

    /**
     * Creates new form MainTest
     */
    public Main()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        topla = new javax.swing.JButton();
        cikar = new javax.swing.JButton();
        carpma = new javax.swing.JButton();
        bolme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sayi1 = new javax.swing.JTextField();
        sayi2 = new javax.swing.JTextField();
        sonuc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basit Hesap Makinesi");
        setBackground(new java.awt.Color(17, 17, 17));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setName("MKZ"); // NOI18N

        topla.setText("+");
        topla.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                toplaActionPerformed(evt);
            }
        });

        cikar.setText("-");
        cikar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cikarActionPerformed(evt);
            }
        });

        carpma.setText("x");
        carpma.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                carpmaActionPerformed(evt);
            }
        });

        bolme.setText("/");
        bolme.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bolmeActionPerformed(evt);
            }
        });

        jLabel1.setText("Sayi 1 : ");

        jLabel2.setText("Sayi 2 : ");

        jLabel3.setText("Sonuc :");

        sayi1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sayi1ActionPerformed(evt);
            }
        });

        sonuc.setEditable(false);
        sonuc.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sonucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(sayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(sayi2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cikar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carpma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bolme)))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(sayi1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sonuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sayi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topla)
                    .addComponent(cikar)
                    .addComponent(carpma)
                    .addComponent(bolme))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toplaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_toplaActionPerformed
    {//GEN-HEADEREND:event_toplaActionPerformed
        int a =  Integer.valueOf(this.sayi1.getText());
        int b =  Integer.valueOf(this.sayi2.getText());
        sonuc.setText(String.valueOf(a+b));
    }//GEN-LAST:event_toplaActionPerformed

    private void cikarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cikarActionPerformed
    {//GEN-HEADEREND:event_cikarActionPerformed
        int a =  Integer.valueOf(this.sayi1.getText());
        int b =  Integer.valueOf(this.sayi2.getText());
        sonuc.setText(String.valueOf(a-b));
    }//GEN-LAST:event_cikarActionPerformed

    private void carpmaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_carpmaActionPerformed
    {//GEN-HEADEREND:event_carpmaActionPerformed
        int a =  Integer.valueOf(this.sayi1.getText());
        int b =  Integer.valueOf(this.sayi2.getText());
        sonuc.setText(String.valueOf(a*b));
    }//GEN-LAST:event_carpmaActionPerformed

    private void bolmeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bolmeActionPerformed
    {//GEN-HEADEREND:event_bolmeActionPerformed
        int a =  Integer.valueOf(this.sayi1.getText());
        int b =  Integer.valueOf(this.sayi2.getText());
        sonuc.setText(String.valueOf((double)a/b));
    }//GEN-LAST:event_bolmeActionPerformed

    private void sayi1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sayi1ActionPerformed
    {//GEN-HEADEREND:event_sayi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sayi1ActionPerformed

    private void sonucActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sonucActionPerformed
    {//GEN-HEADEREND:event_sonucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonucActionPerformed

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
                if ("Windows".equals(info.getName()))
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
    private javax.swing.JButton bolme;
    private javax.swing.JButton carpma;
    private javax.swing.JButton cikar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField sayi1;
    private javax.swing.JTextField sayi2;
    private javax.swing.JTextField sonuc;
    private javax.swing.JButton topla;
    // End of variables declaration//GEN-END:variables
}
