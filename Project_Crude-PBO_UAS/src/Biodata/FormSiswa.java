package Biodata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

public class FormSiswa extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = Koneksi_Database.DataBase.DataBase();
    
    public FormSiswa() {
        initComponents();
        judul();
        tampilData("");
        
        btnHps.setEnabled(false);
        btnUpt.setEnabled(false);
    }
    
    public void judul() {
        Object[] judul = {
          "Nama", "Nim", "Jenis Kelamin", "Tahun Ajaran", "Semester", "Matakuliah","Kelompok"
        };
        tabModel = new DefaultTableModel(null, judul);
        tbSiswa.setModel(tabModel);
    }
    public void reset() {
        txtNama.setText("");
        txtNim.setText("");
        cbJenis.setSelectedItem("Laki-Laki"); 
        txtTahun.setText("");
        txtSemester.setText("");
        txtMatkul.setText("");
        txtKelompok.setText("");
        
        btnSave.setEnabled(true); 
    }

    private String originalKodeMatkul;
    
public void tampilData(String where) {
  try {
    st = cn.createStatement();
    tabModel.getDataVector().removeAllElements();
    tabModel.fireTableDataChanged();
    rs = st.executeQuery("SELECT * FROM db_Siswa " + where);
    
    while (rs.next()) {
      Object[] data = {
        rs.getString("Nama"),
        rs.getString("Nim"),
        rs.getString("Jenis Kelamin"),
        rs.getString("Semester"),
        rs.getString("Tahun Ajaran"),
        rs.getString("Matakuliah"),
        rs.getString("Kelompok"),
        
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSiswa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbJenis = new javax.swing.JComboBox<>();
        txtNama = new javax.swing.JTextField();
        txtNim = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtSemester = new javax.swing.JTextField();
        txtMatkul = new javax.swing.JTextField();
        txtKelompok = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpt = new javax.swing.JButton();
        btnHps = new javax.swing.JButton();
        btnRst = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Nim", "Jenis Kelamin", "Tahun Ajaran", "Semester", "Matakuliah", "Kelompok"
            }
        ));
        tbSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSiswa);

        jLabel1.setText("Nama  :");

        jLabel2.setText("Nim  :");

        jLabel3.setText("Jenis Kelamin  :");

        jLabel4.setText("Tahun Ajaran  :");

        jLabel5.setText("Semster   :");

        jLabel6.setText("Matakuliah  :");

        jLabel7.setText("Kelompok  :");

        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNimActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpt.setText("Update");
        btnUpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUptActionPerformed(evt);
            }
        });

        btnHps.setText("Hapus");
        btnHps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHpsMouseClicked(evt);
            }
        });
        btnHps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHpsActionPerformed(evt);
            }
        });

        btnRst.setText("Reset");
        btnRst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbJenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNama)
                            .addComponent(txtNim)
                            .addComponent(txtTahun)
                            .addComponent(txtSemester)
                            .addComponent(txtMatkul)
                            .addComponent(txtKelompok))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(28, 28, 28)
                        .addComponent(btnUpt)
                        .addGap(37, 37, 37)
                        .addComponent(btnHps)
                        .addGap(36, 36, 36)
                        .addComponent(btnRst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpt)
                    .addComponent(btnHps)
                    .addComponent(btnRst))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNimActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    try {
        String sql = "INSERT INTO db_Siswa (`Nama`, `Nim`, `Jenis Kelamin`, `Tahun Ajaran`, `Semester`, `Matakuliah`, `Kelompok`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, txtNama.getText());
        ps.setString(2, txtNim.getText());
        ps.setString(3, cbJenis.getSelectedItem().toString());
        ps.setString(4, txtTahun.getText());
        ps.setString(5, txtSemester.getText());
        ps.setString(6, txtMatkul.getText());
        ps.setString(7, txtKelompok.getText());
        ps.executeUpdate();
        tampilData("");
        JOptionPane.showMessageDialog(null, "Simpan Berhasil");
        txtNama.setText("");
        txtNim.setText("");
        cbJenis.setSelectedItem("Laki-Laki");
        txtTahun.setText("");
        txtSemester.setText("");
        txtKelompok.setText("");
    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSiswaMouseClicked
        // TODO add your handling code here:
    txtNama.setText(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 0).toString());
    txtNim.setText(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 1).toString());
    cbJenis.setSelectedItem(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 2).toString());
    txtTahun.setText(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 3).toString());
    txtSemester.setText(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 4).toString());
    txtMatkul.setText(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 5).toString());
    txtKelompok.setText(tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 6).toString());

    originalKodeMatkul = tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 0).toString();
    
    btnSave.setEnabled(false);
    btnHps.setEnabled(true);
    btnUpt.setEnabled(true);
    }//GEN-LAST:event_tbSiswaMouseClicked

    private void btnUptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUptActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE db_Siswa SET `Nama`=?, `Nim`=?, `Jenis Kelamin`=?, `Tahun Ajaran`=?, `Semester`=?, `Matakuliah`=?, `Kelompok`=? WHERE `Nama`=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, txtNama.getText());
            ps.setString(2, txtNim.getText());
            ps.setString(3, cbJenis.getSelectedItem().toString()); // Pastikan ini sesuai dengan 'Gasal' atau 'Genap'
            ps.setString(4, txtTahun.getText());
            ps.setString(5, txtSemester.getText());
            ps.setString(6, txtMatkul.getText());
            ps.setString(7, txtKelompok.getText());
            ps.setString(8, originalKodeMatkul); // Gunakan original Kode Matkul sebagai kunci
            ps.executeUpdate();
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUptActionPerformed

    private void btnHpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHpsActionPerformed
        // TODO add your handling code here:
            try {
                int jawab;
                if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                    String sql = "DELETE FROM db_Siswa WHERE `Nama`=?";
                    PreparedStatement ps = cn.prepareStatement(sql);
                    ps.setString(1, tbSiswa.getValueAt(tbSiswa.getSelectedRow(), 0).toString()); 
                    ps.executeUpdate();
                    tampilData("");
                    JOptionPane.showMessageDialog(null, "Hapus Berhasil");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnHpsActionPerformed

    private void btnHpsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHpsMouseClicked
        // TODO add your handling code here:
         try {
            int jawab;

            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
              st = cn.createStatement();
              st.executeUpdate("DELETE FROM db_Siswa WHERE Nama='"
                  + tabModel.getValueAt(tbSiswa.getSelectedRow(), 0) + "'");
              tampilData("");

            }
          } catch (Exception e) {
            e.printStackTrace();
          }
    }//GEN-LAST:event_btnHpsMouseClicked

    private void btnRstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRstActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnRstActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHps;
    private javax.swing.JButton btnRst;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpt;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbSiswa;
    private javax.swing.JTextField txtKelompok;
    private javax.swing.JTextField txtMatkul;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNim;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
