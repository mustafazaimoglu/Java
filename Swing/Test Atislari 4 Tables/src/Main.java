

import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame
{
    DefaultTableModel model = new DefaultTableModel();
    
    public Main()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        satirText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sutunText = new javax.swing.JTextField();
        makeIt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        message = new javax.swing.JTextField();
        goster = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Satır : ");

        satirText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        satirText.setText("1");
        satirText.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                satirTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Sutun :");

        sutunText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sutunText.setText("1");

        makeIt.setText("Olustur");
        makeIt.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                makeItActionPerformed(evt);
            }
        });

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        message.setForeground(new java.awt.Color(255, 0, 0));

        goster.setText("Göster");
        goster.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                gosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(satirText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sutunText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(makeIt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(message)
                        .addGap(18, 18, 18)
                        .addComponent(goster, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(satirText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sutunText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(makeIt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goster))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeItActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_makeItActionPerformed
    {//GEN-HEADEREND:event_makeItActionPerformed
        int sat,sut;
        
        sat = Integer.parseInt(satirText.getText());
        sut = Integer.parseInt(sutunText.getText());
        
        model.setColumnCount(sut);
        model.setRowCount(sat);
                    
        table.setModel(model);
        
    }//GEN-LAST:event_makeItActionPerformed

    private void satirTextActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_satirTextActionPerformed
    {//GEN-HEADEREND:event_satirTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satirTextActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableMouseClicked
    {//GEN-HEADEREND:event_tableMouseClicked
        try
        {
            
        }
        catch (NullPointerException ex)
        {
            message.setText("Seçilen Kutu Boş!");
        }
    }//GEN-LAST:event_tableMouseClicked

    private void gosterActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_gosterActionPerformed
    {//GEN-HEADEREND:event_gosterActionPerformed

        try
        {
           message.setText(model.getValueAt(table.getSelectedRow(), table.getSelectedColumn()).toString()); 
        }
        catch (NullPointerException ex)
        {
            message.setText("Seçilen Kutu Boş!");
        }
    }//GEN-LAST:event_gosterActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JButton goster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton makeIt;
    private javax.swing.JTextField message;
    private javax.swing.JTextField satirText;
    private javax.swing.JTextField sutunText;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
