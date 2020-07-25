
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame
{


    public Main()
    {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        urunTablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        kategori_cb = new javax.swing.JComboBox<>();
        urunIsmi_tf = new javax.swing.JTextField();
        fiyat_tf = new javax.swing.JTextField();
        urunEkle_b = new javax.swing.JButton();
        urunGuncelle_b = new javax.swing.JButton();
        urunSil_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stock App");

        urunTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Ürün İsmi", "Kategori", "Fiyat"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        urunTablosu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                urunTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(urunTablosu);

        jLabel1.setText("Ürün ismi : ");

        jLabel2.setText("Kategori :");

        jLabel3.setText("Fiyat : ");

        message.setForeground(new java.awt.Color(255, 0, 0));

        kategori_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kültür Sanat", "Yemek", "Elektronik" }));

        urunIsmi_tf.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                urunIsmi_tfActionPerformed(evt);
            }
        });

        urunEkle_b.setText("Ürün Ekle");
        urunEkle_b.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                urunEkle_bActionPerformed(evt);
            }
        });

        urunGuncelle_b.setText("Ürün Güncelle");
        urunGuncelle_b.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                urunGuncelle_bActionPerformed(evt);
            }
        });

        urunSil_b.setText("Ürün Sil");
        urunSil_b.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                urunSil_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urunIsmi_tf)
                            .addComponent(kategori_cb, 0, 187, Short.MAX_VALUE)
                            .addComponent(fiyat_tf))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urunEkle_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(urunGuncelle_b, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(urunSil_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(urunIsmi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunEkle_b))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kategori_cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunGuncelle_b))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fiyat_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunSil_b))
                .addGap(19, 19, 19)
                .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urunIsmi_tfActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_urunIsmi_tfActionPerformed
    {//GEN-HEADEREND:event_urunIsmi_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunIsmi_tfActionPerformed

    private void urunEkle_bActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_urunEkle_bActionPerformed
    {//GEN-HEADEREND:event_urunEkle_bActionPerformed
        message.setText("");
        DefaultTableModel table = (DefaultTableModel) urunTablosu.getModel();
        
        if (urunIsmi_tf.getText().trim().equals(""))
        {
            message.setText("Ürün İsmi Boş Bırakılamaz...");
        }
        else
        {
            String row[] = {urunIsmi_tf.getText(),kategori_cb.getSelectedItem().toString(),fiyat_tf.getText()};
            
            table.addRow(row);
            
        }
    }//GEN-LAST:event_urunEkle_bActionPerformed

    private void urunGuncelle_bActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_urunGuncelle_bActionPerformed
    {//GEN-HEADEREND:event_urunGuncelle_bActionPerformed
        message.setText("");
        DefaultTableModel table = (DefaultTableModel) urunTablosu.getModel();
        
        int selectedRow = urunTablosu.getSelectedRow();
        
        if (selectedRow == -1)
        {
            if (urunTablosu.getRowCount() == 0)
            {
                message.setText("Ürün Tablosu su an boş...");
            }
            else
            {
                message.setText("Lutfen güncellenecek satırı seçiniz...");
            }
        }
        else
        {
            table.setValueAt(urunIsmi_tf.getText(), selectedRow, 0);
            table.setValueAt(kategori_cb.getSelectedItem().toString(), selectedRow, 1);
            table.setValueAt(fiyat_tf.getText(), selectedRow, 2);
            
            message.setText("Ürün Başarı ile güncellendi...");
        }
    }//GEN-LAST:event_urunGuncelle_bActionPerformed

    private void urunTablosuMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_urunTablosuMouseClicked
    {//GEN-HEADEREND:event_urunTablosuMouseClicked
        int selectedRow = urunTablosu.getSelectedRow();
        
        DefaultTableModel table = (DefaultTableModel) urunTablosu.getModel();
        
        urunIsmi_tf.setText(table.getValueAt(selectedRow, 0).toString());
        kategori_cb.setSelectedItem(table.getValueAt(selectedRow, 1).toString());
        fiyat_tf.setText(table.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_urunTablosuMouseClicked

    private void urunSil_bActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_urunSil_bActionPerformed
    {//GEN-HEADEREND:event_urunSil_bActionPerformed
        message.setText("");
        
        int selectedRow = urunTablosu.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) urunTablosu.getModel();
        
        if (selectedRow == -1)
        {
            if (urunTablosu.getRowCount() == 0)
            {
                message.setText("Ürün tablosu su anda boş...");
            }
            else
            {
                message.setText("Lutfen silinecek satırı seçiniz...");
            }
        }
        else
        {
            table.removeRow(selectedRow);
            urunIsmi_tf.setText("");
            fiyat_tf.setText("");
            message.setText("Ürün Başarı ile Silindi...");
        }
    }//GEN-LAST:event_urunSil_bActionPerformed

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
    private javax.swing.JTextField fiyat_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kategori_cb;
    private javax.swing.JLabel message;
    private javax.swing.JButton urunEkle_b;
    private javax.swing.JButton urunGuncelle_b;
    private javax.swing.JTextField urunIsmi_tf;
    private javax.swing.JButton urunSil_b;
    private javax.swing.JTable urunTablosu;
    // End of variables declaration//GEN-END:variables
}
