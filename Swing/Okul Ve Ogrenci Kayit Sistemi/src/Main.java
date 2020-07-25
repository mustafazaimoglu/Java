
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame
{
    static ArrayList<Student> studentList = new ArrayList<>();
    static ArrayList<School> schoolList = new ArrayList<>();

    public static ArrayList<Student> getStudentList()
    {
        return studentList;
    }

    public static void setStudentList(ArrayList<Student> studentList)
    {
        Main.studentList = studentList;
    }

    public static ArrayList<School> getSchoolList()
    {
        return schoolList;
    }

    public static void setSchoolList(ArrayList<School> schoolList)
    {
        Main.schoolList = schoolList;
    }

    
    public Main()
    {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ogrenciBul = new javax.swing.JButton();
        ogrenciEkle = new javax.swing.JButton();
        ogrenciSil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ogrenciAdiText = new javax.swing.JTextField();
        sinifiText = new javax.swing.JTextField();
        okulText = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci ve Okul Kayit Sistemi");
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        ogrenciBul.setText("Öğrenci Bul");
        ogrenciBul.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ogrenciBulActionPerformed(evt);
            }
        });

        ogrenciEkle.setText("Öğrenci Ekle");
        ogrenciEkle.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ogrenciEkleActionPerformed(evt);
            }
        });

        ogrenciSil.setText("Öğrenci Sil");
        ogrenciSil.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ogrenciSilActionPerformed(evt);
            }
        });

        jLabel1.setText("Öğrenci Adı : ");

        jLabel3.setText("Sınıfı :");

        jLabel4.setText("Okulu :");

        ogrenciAdiText.setEditable(false);

        sinifiText.setEditable(false);

        okulText.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ogrenciAdiText, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(sinifiText)
                    .addComponent(okulText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ogrenciEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrenciSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrenciBul, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciBul)
                    .addComponent(jLabel1)
                    .addComponent(ogrenciAdiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ogrenciEkle)
                    .addComponent(sinifiText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ogrenciSil)
                    .addComponent(okulText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ogrenciBulActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ogrenciBulActionPerformed
    {//GEN-HEADEREND:event_ogrenciBulActionPerformed
        String bul = JOptionPane.showInputDialog("Lutfen Bulmak İstediğiniz Öğrencinin İsmini Giriniz :");
        int i = 0;
        boolean bulmak = false;
        
        for (Student s : studentList)
        {
            if (s.getOgrenciIsmi().equalsIgnoreCase(bul.trim()))
            {
                bulmak = true;
                break;
            }
            i++;
        }
        
        if (bulmak == true)
        {
            ogrenciAdiText.setText(studentList.get(i).getOgrenciIsmi());
            sinifiText.setText(studentList.get(i).getSinif());
            okulText.setText(schoolList.get(i).getOkulIsmi());
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Aradıgınız Ögrenci Bulunamadı!!!");
            
        }
    }//GEN-LAST:event_ogrenciBulActionPerformed

    private void ogrenciEkleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ogrenciEkleActionPerformed
    {//GEN-HEADEREND:event_ogrenciEkleActionPerformed
        Adder add = new Adder();
        
        add.setVisible(true);
    }//GEN-LAST:event_ogrenciEkleActionPerformed

    private void ogrenciSilActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ogrenciSilActionPerformed
    {//GEN-HEADEREND:event_ogrenciSilActionPerformed
        
        
        String bul = JOptionPane.showInputDialog("Lutfen Silmek İstediğiniz Öğrencinin İsmini Giriniz :");
        int i = 0;
        boolean bulmak = false;
        
        for (Student s : studentList)
        {
            if (s.getOgrenciIsmi().equalsIgnoreCase(bul.trim()))
            {
                bulmak = true;
                break;
            }
            i++;
        }
        
        if (bulmak == true)
        {
            studentList.remove(i);
            schoolList.remove(i);
            ogrenciAdiText.setText("");
            sinifiText.setText("");
            okulText.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Silmek İstediğiniz Ögrenci Bulunamadı!!!");    
        }   
    }//GEN-LAST:event_ogrenciSilActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ogrenciAdiText;
    private javax.swing.JButton ogrenciBul;
    private javax.swing.JButton ogrenciEkle;
    private javax.swing.JButton ogrenciSil;
    private javax.swing.JTextField okulText;
    private javax.swing.JTextField sinifiText;
    // End of variables declaration//GEN-END:variables
}
