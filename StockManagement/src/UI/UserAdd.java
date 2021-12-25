/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rutheim
 */
public class UserAdd extends javax.swing.JFrame {

    /**
     * Creates new form UserAdd
     */
    public UserAdd() {
        initComponents();
        SelectPers();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PersonelTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        PersonelPosition = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        PersonelNo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PersonelName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        PersonelSurname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PersonelAddress = new javax.swing.JTextField();
        PersonelBD = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PersonelPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-add-fingerprint-90.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-arrow-pointing-left-30.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PersonelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "prsNo", "prsAdi", "prsSoyadi", "prsAdresi", "prsPozisyon", "prsŞifresi", "prsDogumTarihi"
            }
        ));
        PersonelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonelTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PersonelTable);

        jButton3.setText("Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        PersonelPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        PersonelPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelPositionActionPerformed(evt);
            }
        });

        jLabel13.setText("Personel No");

        PersonelNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelNoActionPerformed(evt);
            }
        });

        jLabel14.setText("Personel Adı");

        PersonelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelNameActionPerformed(evt);
            }
        });

        jLabel15.setText("Personel Soyadı");

        PersonelSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelSurnameActionPerformed(evt);
            }
        });

        jLabel16.setText("Personel Adresi");

        PersonelBD.setToolTipText("");

        jLabel17.setText("Personel Doğum Tarihi");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("X");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("-");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel3.setText("Pozisyonu");

        PersonelPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonelPasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("Şifre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(PersonelNo)
                                .addComponent(PersonelName)
                                .addComponent(PersonelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(PersonelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(PersonelBD)
                                .addComponent(PersonelPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12))
                                .addComponent(PersonelPassword))
                            .addComponent(jLabel4))
                        .addGap(119, 119, 119))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PersonelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PersonelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PersonelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PersonelBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonelSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PersonelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton2)
                        .addComponent(jButton1)))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Connection Con=null;
Statement St=null;
ResultSet Rs=null;

public void SetNull()
{
PersonelNo.setText(null);
PersonelName.setText(null);
PersonelSurname.setText(null);
PersonelAddress.setText(null);
PersonelBD.setText(null);
PersonelPosition.setSelectedItem(null);
PersonelPassword.setText(null);

}
public void SelectPers()
{
    try {
        Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
        St=Con.createStatement();
        Rs=St.executeQuery("Select * from PERSONELTBL");
        PersonelTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
    }
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
                PreparedStatement add=Con.prepareStatement("INSERT INTO PERSONELTBL VALUES (?,?,?,?,?,?,?)");
                add.setInt(1,Integer.valueOf(PersonelNo.getText()));
                add.setString(2,PersonelName.getText());
                add.setString(3,PersonelSurname.getText());
                add.setString(4,PersonelAddress.getText());           
                add.setString(5,PersonelPosition.getSelectedItem().toString());     
                add.setString(6,PersonelPassword.getText());  
                add.setString(7,PersonelBD.getText());
                int row =add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Personel Başarıyla Eklendi.");
                Con.close();
                SetNull();
                SelectPers();
                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(PersonelNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Lütfen Silinecek Personeli Giriniz.");
        }
        else
        {
            try {
                Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
                String no=PersonelNo.getText();
                    String Query="DELETE FROM root.PERSONELTBL WHERE PERSONELNO="+no;
                Statement Add= Con.createStatement();
                Add.execute(Query);
                SelectPers();
                SetNull();
                JOptionPane.showMessageDialog(this,"Personel Başarıyla Silinmiştir.");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(PersonelNo.getText().isEmpty() || PersonelName.getText().isEmpty() || PersonelSurname.getText().isEmpty() || PersonelAddress.getText().isEmpty() || PersonelBD.getText().isEmpty() || PersonelPassword.getText().isEmpty())
        {
        JOptionPane.showMessageDialog(this,"Bilgi Eksik.");
        }
        else
        {
            try {
                Con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB1","root","123456789");
                String UpdateQuery="UPDATE root.PERSONELTBL SET PERSONELNAME='"+PersonelName.getText()+"'"+",PERSONELSURNAME='"+PersonelSurname.getText()+"'"+",PERSONELADDRESS='"+PersonelAddress.getText()+"'"+",PERSONELBD='"+PersonelBD.getText()+"'"+",PERSONELPOSITION='"+PersonelPosition.getSelectedItem().toString()+"'"+",PERSONELPASSWORD='"+PersonelPassword.getText()+"'"+"WHERE PERSONELNO="+PersonelNo.getText();
                Statement Add=Con.createStatement();
                Add.execute(UpdateQuery);
                JOptionPane.showMessageDialog(this,"Personel Başarıyla Güncellendi.");
                SelectPers();
                SetNull();
            }catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PersonelPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonelPositionActionPerformed

    private void PersonelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonelNameActionPerformed

    private void PersonelNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonelNoActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          new LoginPage().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void PersonelPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonelPasswordActionPerformed

    private void PersonelSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonelSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PersonelSurnameActionPerformed

    private void PersonelTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonelTableMouseClicked
    DefaultTableModel model=(DefaultTableModel)PersonelTable.getModel();
    int index=PersonelTable.getSelectedRow();
    PersonelNo.setText(model.getValueAt(index,0).toString());
    PersonelName.setText(model.getValueAt(index,1).toString());
    PersonelSurname.setText(model.getValueAt(index,2).toString());
    PersonelAddress.setText(model.getValueAt(index,3).toString());
    PersonelBD.setText(model.getValueAt(index,6).toString());
    PersonelPassword.setText(model.getValueAt(index,5).toString());
    
    }//GEN-LAST:event_PersonelTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PersonelAddress;
    private javax.swing.JTextField PersonelBD;
    private javax.swing.JTextField PersonelName;
    private javax.swing.JTextField PersonelNo;
    private javax.swing.JTextField PersonelPassword;
    private javax.swing.JComboBox<String> PersonelPosition;
    private javax.swing.JTextField PersonelSurname;
    private javax.swing.JTable PersonelTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
