package Form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class Table extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.Koneksi();
    
   public Table() {
        initComponents();
        judul();
        tampilData("");
        
        BtnHps.setEnabled(false);
        BtnUpt.setEnabled(false);
    }
    

    public void judul() {
  Object[] judul = {
    "Kode Matkul", "Nama Matkul", "Semester", "Tahun Ajaran", "Kelompok", "SKS"
  };
  tabModel = new DefaultTableModel(null, judul);
  tableMahasiswa.setModel(tabModel);
}
    public void reset() {
        txtKode.setText("");
        txtNama.setText("");
        txtSemester.setSelectedItem("Gasal"); 
        txtTahun.setText("");
        txtKelompok.setText("");
        txtSks.setText("");
        btnSave.setEnabled(true); 
    }

    private String originalKodeMatkul;
    
public void tampilData(String where) {
  try {
    st = cn.createStatement();
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();
    rs = st.executeQuery("SELECT * FROM tb_mahasiswa " + where);
    
    while (rs.next()) {
      Object[] data = {
        rs.getString("Kode Matkul"),
        rs.getString("Nama Matkul"),
        rs.getString("Semester"),
        rs.getString("Tahun Ajaran"),
        rs.getString("Kelompok"),
        rs.getString("SKS"),
      };
        
        tabModel.addRow(data);
    }
  } catch(Exception e) {
    e.printStackTrace();
  }
  
  

}



  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKelompok = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtSks = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        BtnRst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JComboBox<>();
        BtnHps = new javax.swing.JButton();
        BtnUpt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Matkul");

        jLabel2.setText("Nama Matkul");

        jLabel3.setText("Semester");

        jLabel4.setText("Tahun Ajaran");

        jLabel5.setText("Kelompok");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        BtnRst.setText("Reset");
        BtnRst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRstMouseClicked(evt);
            }
        });
        BtnRst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRstActionPerformed(evt);
            }
        });

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Matkul", "Nama Matkul", "Semster", "Tahun Ajaran", "Kelompok", "SKS"
            }
        ));
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        jLabel7.setText("SKS");

        txtSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasal", "Genap" }));
        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });

        BtnHps.setText("Hapus");
        BtnHps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnHpsMouseClicked(evt);
            }
        });
        BtnHps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHpsActionPerformed(evt);
            }
        });

        BtnUpt.setText("Update");
        BtnUpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(BtnUpt)
                        .addGap(18, 18, 18)
                        .addComponent(BtnHps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRst)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKelompok)
                                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(txtNama))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(txtKode))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(BtnRst)
                    .addComponent(BtnHps)
                    .addComponent(BtnUpt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
        String sql = "INSERT INTO tb_mahasiswa (`Kode Matkul`, `Nama Matkul`, `Semester`, `Tahun Ajaran`, `Kelompok`, `Sks`) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, txtKode.getText());
        ps.setString(2, txtNama.getText());
        ps.setString(3, txtSemester.getSelectedItem().toString()); 
        ps.setString(4, txtTahun.getText());
        ps.setString(5, txtKelompok.getText());
        ps.setString(6, txtSks.getText());
        ps.executeUpdate();
        tampilData("");
        JOptionPane.showMessageDialog(null, "Simpan Berhasil");
        txtKode.setText("");
        txtNama.setText("");
        txtSemester.setSelectedItem("Gasal");
        txtTahun.setText("");
        txtKelompok.setText("");
        txtSks.setText("");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnSaveMouseClicked

    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMahasiswaMouseClicked
        // TODO add your handling code here:                                        
    txtKode.setText(tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 0).toString());
    txtNama.setText(tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 1).toString());
    txtSemester.setSelectedItem(tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 2).toString());
    txtTahun.setText(tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 3).toString());
    txtKelompok.setText(tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 4).toString());
    txtSks.setText(tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 5).toString());

    originalKodeMatkul = tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 0).toString();
    
    btnSave.setEnabled(false);
    BtnHps.setEnabled(true);
    BtnUpt.setEnabled(true);

    }//GEN-LAST:event_tableMahasiswaMouseClicked

    private void BtnHpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHpsActionPerformed
        // TODO add your handling code here:                                  
    try {
        int jawab;
        if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
            String sql = "DELETE FROM tb_mahasiswa WHERE `Kode Matkul`=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, tableMahasiswa.getValueAt(tableMahasiswa.getSelectedRow(), 0).toString()); 
            ps.executeUpdate();
            tampilData("");
            JOptionPane.showMessageDialog(null, "Hapus Berhasil");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnHpsActionPerformed

    private void BtnHpsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnHpsMouseClicked
        // TODO add your handling code here:
         try {
    int jawab;
    
    if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
      st = cn.createStatement();
      st.executeUpdate("DELETE FROM tb_mahasiswa WHERE Kode Matkul='"
          + tabModel.getValueAt(tableMahasiswa.getSelectedRow(), 0) + "'");
      tampilData("");

    }
  } catch (Exception e) {
    e.printStackTrace();
  }
    }//GEN-LAST:event_BtnHpsMouseClicked

    private void BtnUptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUptActionPerformed
        // TODO add your handling code here:
    try {
        String sql = "UPDATE tb_mahasiswa SET `Kode Matkul`=?, `Nama Matkul`=?, `Semester`=?, `Tahun Ajaran`=?, `Kelompok`=?, `Sks`=? WHERE `Kode Matkul`=?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, txtKode.getText());
        ps.setString(2, txtNama.getText());
        ps.setString(3, txtSemester.getSelectedItem().toString()); // Pastikan ini sesuai dengan 'Gasal' atau 'Genap'
        ps.setString(4, txtTahun.getText());
        ps.setString(5, txtKelompok.getText());
        ps.setString(6, txtSks.getText());
        ps.setString(7, originalKodeMatkul); // Gunakan original Kode Matkul sebagai kunci
        ps.executeUpdate();
        tampilData("");
        JOptionPane.showMessageDialog(null, "Update Berhasil");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BtnUptActionPerformed

    private void BtnRstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRstActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_BtnRstActionPerformed

    private void BtnRstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRstMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnRstMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windwos".equals(info.getName())) {
                    
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Table().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHps;
    private javax.swing.JButton BtnRst;
    private javax.swing.JButton BtnUpt;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField txtKelompok;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JComboBox<String> txtSemester;
    private javax.swing.JTextField txtSks;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
