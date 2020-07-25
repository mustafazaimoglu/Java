
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main extends javax.swing.JFrame
{
    Thread t1 = new Thread();

    public Main() 
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pBar = new javax.swing.JProgressBar();
        doldur = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 250, 0, 0));

        pBar.setStringPainted(true);

        doldur.setText("Doldur");
        doldur.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                doldurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(doldur)
                    .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doldur)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doldurActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_doldurActionPerformed
    {//GEN-HEADEREND:event_doldurActionPerformed
        Thread t1 = new Thread() 
        {
            public void run()
            {
                for (int i = 0; i < 101; i++)
                {        
                    try
                    {
                        Thread.sleep(15);
                    } 
                    catch (InterruptedException ex)
                    {
                        System.out.println("Hata!");
                    }

                    pBar.setValue(i);
                }
                
                try
                {
                    Thread.sleep(2500);
                } catch (InterruptedException ex)
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.exit(0);
            }
        };
           
        t1.start();   
        
        
    }//GEN-LAST:event_doldurActionPerformed

    public static void main(String args[]) 
    {
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
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doldur;
    private javax.swing.JProgressBar pBar;
    // End of variables declaration//GEN-END:variables
}
