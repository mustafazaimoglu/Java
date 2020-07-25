
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CalisanEkrani extends javax.swing.JDialog
{    
    DefaultTableModel model;
    CalisanIslemleri islemler = new CalisanIslemleri();

    public CalisanEkrani(java.awt.Frame parent, boolean modal)
    {        
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) calisanTablosu.getModel();
        tabloDoldur();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisanTablosu = new javax.swing.JTable();
        searchingField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        departmentField = new javax.swing.JTextField();
        salaryField = new javax.swing.JTextField();
        calisanEkleButton = new javax.swing.JButton();
        messageField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        calisanGüncelleButton = new javax.swing.JButton();
        calisanSilButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Çalışanlar");
        setLocation(new java.awt.Point(200, 150));

        calisanTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "AD", "SOYAD", "DEPARTMAN", "MAAS"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        calisanTablosu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                calisanTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisanTablosu);
        if (calisanTablosu.getColumnModel().getColumnCount() > 0)
        {
            calisanTablosu.getColumnModel().getColumn(0).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(1).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(2).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(3).setResizable(false);
            calisanTablosu.getColumnModel().getColumn(4).setResizable(false);
        }

        searchingField.setToolTipText("Ne Aramak İstiyorsunuz?");
        searchingField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                searchingFieldKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad : ");

        jLabel2.setText("Soyad :");

        jLabel3.setText("Departman :");

        jLabel4.setText("Maas :");

        calisanEkleButton.setText("Yeni Çalışan Ekle");
        calisanEkleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calisanEkleButtonActionPerformed(evt);
            }
        });

        messageField.setForeground(new java.awt.Color(255, 0, 0));
        messageField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setText("Ara : ");

        calisanGüncelleButton.setText("Çalışan Güncelle");
        calisanGüncelleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calisanGüncelleButtonActionPerformed(evt);
            }
        });

        calisanSilButton.setText("Çalışan Sil");
        calisanSilButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                calisanSilButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(searchingField, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departmentField)
                                    .addComponent(salaryField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameField)
                                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calisanEkleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calisanGüncelleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calisanSilButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calisanEkleButton)
                        .addGap(18, 18, 18)
                        .addComponent(calisanGüncelleButton)
                        .addGap(18, 18, 18)
                        .addComponent(calisanSilButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salaryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(messageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dinamikArama(String ara)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        
        calisanTablosu.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    private void searchingFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_searchingFieldKeyReleased
    {//GEN-HEADEREND:event_searchingFieldKeyReleased
        String ara = searchingField.getText();
        
        dinamikArama(ara);
    }//GEN-LAST:event_searchingFieldKeyReleased

    private void calisanEkleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calisanEkleButtonActionPerformed
    {//GEN-HEADEREND:event_calisanEkleButtonActionPerformed
        messageField.setText("");
        
        String ad = nameField.getText();
        String soyad = surnameField.getText();
        String departman = departmentField.getText();
        String maas = salaryField.getText();
        
        islemler.calisanEkle(ad, soyad, departman, maas);
        
        messageField.setText("Yeni Çalışan Başarı ile Eklendi!");
        
        tabloDoldur();
    }//GEN-LAST:event_calisanEkleButtonActionPerformed

    private void calisanTablosuMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_calisanTablosuMouseClicked
    {//GEN-HEADEREND:event_calisanTablosuMouseClicked
        int selectedRow = calisanTablosu.getSelectedRow();
        
        nameField.setText(model.getValueAt(selectedRow, 1).toString());
        surnameField.setText(model.getValueAt(selectedRow, 2).toString());
        departmentField.setText(model.getValueAt(selectedRow, 3).toString());
        salaryField.setText(model.getValueAt(selectedRow, 4).toString());      
    }//GEN-LAST:event_calisanTablosuMouseClicked

    private void calisanGüncelleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calisanGüncelleButtonActionPerformed
    {//GEN-HEADEREND:event_calisanGüncelleButtonActionPerformed
        messageField.setText("");
        
        String ad = nameField.getText();
        String soyad = surnameField.getText();
        String departman = departmentField.getText();
        String maas = salaryField.getText();
        
        int selectedRow = calisanTablosu.getSelectedRow();
        
        if (selectedRow == -1)
        {
            if (model.getRowCount() == 0)
            {
                messageField.setText("Tablo Şu Anda Boş...");
            }
            else
            {
                messageField.setText("Lutfen Güncellenecek Satırı Seçiniz...");
            }
        }
        else
        {
            int id = (int) model.getValueAt(selectedRow, 0);
            
            islemler.calisanGuncelle(id,ad,soyad,departman,maas);
         
            tabloDoldur();
            
            messageField.setText("Çalışan Başarı ile Güncellendi!!!");
        }        
    }//GEN-LAST:event_calisanGüncelleButtonActionPerformed

    private void calisanSilButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_calisanSilButtonActionPerformed
    {//GEN-HEADEREND:event_calisanSilButtonActionPerformed
        messageField.setText("");
        
        int selectedRow = calisanTablosu.getSelectedRow();
        
        if (selectedRow == -1)
        {
            if (model.getRowCount() == 0)
            {
                messageField.setText("Tablo Şu Anda Boş...");
            }
            else
            {
                messageField.setText("Lutfen Silenecek Satırı Seçiniz...");
            }
        }
        else
        {
            int id = (int) model.getValueAt(selectedRow, 0);
            
            islemler.calisanSil(id);
            
            tabloDoldur();
            
            messageField.setText("Çalışan Başarı ile Silindi!!!");
            
            nameField.setText("");
            surnameField.setText("");
            departmentField.setText("");
            salaryField.setText("");
        }
    }//GEN-LAST:event_calisanSilButtonActionPerformed

    
    public void tabloDoldur()
    {
        model.setRowCount(0);
        
        ArrayList<Calisan> calisanlar;
        
        calisanlar = islemler.calisanlariGetir();
        
        if (calisanlar != null)
        {
            for (Calisan c : calisanlar)
            {
                Object eklenecek[] = {c.getId(),c.getAd(),c.getSoyad(),c.getDepartman(),c.getMaas()};
                
                model.addRow(eklenecek);
            }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Main Part">
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
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }// </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calisanEkleButton;
    private javax.swing.JButton calisanGüncelleButton;
    private javax.swing.JButton calisanSilButton;
    private javax.swing.JTable calisanTablosu;
    private javax.swing.JTextField departmentField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel messageField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JTextField searchingField;
    private javax.swing.JTextField surnameField;
    // End of variables declaration//GEN-END:variables
}
