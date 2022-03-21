/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmahasiswa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Menu extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private Boolean isUpdate = false;
    private int selectedID = -1;
    private ArrayList<Mahasiswa> listMhs;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        listMhs = new ArrayList<>();
        //Dummy
        listMhs.add(new Mahasiswa("1111", "Aaaa", "A"));
        listMhs.add(new Mahasiswa("2222", "Bbbb", "B"));
        listMhs.add(new Mahasiswa("3333", "Cccc", "C"));
        // Set Table
        TabelMhs.setModel(setTable());
        // Hide Delete button
        btnDelete.setVisible(false);
    }

    public final DefaultTableModel setTable() {
        Object[] column = {"NIM", "Nama", "Nilai"};
        DefaultTableModel dataTabel = new DefaultTableModel(null, column);
        for (int i = 0; i < listMhs.size(); i++) {
            Object[] row = new Object[3];
            row[0] = listMhs.get(i).getNim();
            row[1] = listMhs.get(i).getNama();
            row[2] = listMhs.get(i).getNilai();

            dataTabel.addRow(row);
        }

        return dataTabel;
    }

    public void insertData() {
        // Get Data
        String nim = txtFieldNim.getText();
        String nama = txtFieldNama.getText();
        String nilai = txtFieldNilai.getText();
        
        if((nama.isBlank()) || (nim.isBlank()) || (nilai.isBlank())){
            System.out.println("Insert Fail!");
            JOptionPane.showMessageDialog(null, "Input data tidak lengkap");
        }
        else{
            listMhs.add(new Mahasiswa(nim, nama, nilai));
            //Update Table
            TabelMhs.setModel(setTable());

            System.out.println("Insert Success!");
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        }
    }

    public void updateData() {
        // Get Data
        String nim = txtFieldNim.getText();
        String nama = txtFieldNama.getText();
        String nilai = txtFieldNilai.getText();
        //System.out.println(nim + nama + nilai);

        listMhs.get(selectedID).setNim(nim);
        listMhs.get(selectedID).setNama(nama);
        listMhs.get(selectedID).setNilai(nilai);
        
        //Update Table
        TabelMhs.setModel(setTable());

        System.out.println("Update Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
    }

    public void deleteData() {
        listMhs.remove(TabelMhs.getSelectedRow());
        //Update Table
        TabelMhs.setModel(setTable());
        
        System.out.println("Delete Success!");
        JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelUtama = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtFieldNim = new javax.swing.JTextField();
        lblNim = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        txtFieldNama = new javax.swing.JTextField();
        lblNilai = new javax.swing.JLabel();
        txtFieldNilai = new javax.swing.JTextField();
        scrlPane = new javax.swing.JScrollPane();
        TabelMhs = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setText("Daftar Mahasiswa");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtFieldNim.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFieldNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNimActionPerformed(evt);
            }
        });

        lblNim.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNim.setText("NIM");

        lblNama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNama.setText("Nama");

        txtFieldNama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNamaActionPerformed(evt);
            }
        });

        lblNilai.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNilai.setText("Nilai");

        txtFieldNilai.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtFieldNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNilaiActionPerformed(evt);
            }
        });

        TabelMhs.setAutoCreateRowSorter(true);
        TabelMhs.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TabelMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelMhs.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabelMhs.setUpdateSelectionOnSort(false);
        TabelMhs.setVerifyInputWhenFocusTarget(false);
        TabelMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMhsMouseClicked(evt);
            }
        });
        scrlPane.setViewportView(TabelMhs);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUtamaLayout = new javax.swing.GroupLayout(PanelUtama);
        PanelUtama.setLayout(PanelUtamaLayout);
        PanelUtamaLayout.setHorizontalGroup(
            PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUtamaLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlPane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelUtamaLayout.createSequentialGroup()
                        .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitle)
                            .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelUtamaLayout.createSequentialGroup()
                                    .addComponent(lblNama)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelUtamaLayout.createSequentialGroup()
                                    .addComponent(lblNim)
                                    .addGap(55, 55, 55)
                                    .addComponent(txtFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUtamaLayout.createSequentialGroup()
                                    .addComponent(lblNilai)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtFieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnDelete)
                            .addComponent(btnCancel))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        PanelUtamaLayout.setVerticalGroup(
            PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUtamaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle)
                .addGap(26, 26, 26)
                .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNim)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNilai)
                    .addComponent(btnDelete))
                .addGap(42, 42, 42)
                .addComponent(scrlPane, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelUtama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNimActionPerformed

    private void txtFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNamaActionPerformed

    private void txtFieldNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNilaiActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (isUpdate == false)
            insertData();
        else {
            updateData();
            btnAdd.setText("Add");
            btnDelete.setVisible(false);
            this.isUpdate = false;
        }
        txtFieldNim.setText(null);
        txtFieldNama.setText(null);
        txtFieldNilai.setText(null);
    }//GEN-LAST:event_btnAddActionPerformed

    private void TabelMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMhsMouseClicked
        // TODO add your handling code here:
        this.isUpdate = true;

        //Get Selected Data
        int row = TabelMhs.getSelectedRow();
        String selectedNim = (TabelMhs.getModel().getValueAt(row, 0).toString());
        String selectedNama = (TabelMhs.getModel().getValueAt(row, 1).toString());
        String selectedNilai = (TabelMhs.getModel().getValueAt(row, 2).toString());

        for (int i = 0; i < listMhs.size(); i++) {
            if (selectedNim.equals(listMhs.get(i).getNim())) {
                selectedID = i;
                break;
            }
        }

        //System.out.println(selectedID);
        txtFieldNim.setText(selectedNim);
        txtFieldNama.setText(selectedNama);
        txtFieldNilai.setText(selectedNilai);

        btnAdd.setText("Update");
        btnDelete.setVisible(true);
    }//GEN-LAST:event_TabelMhsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (isUpdate == true) {
            deleteData();
            btnAdd.setText("Add");
            btnDelete.setVisible(false);
            this.isUpdate = false;
            txtFieldNim.setText(null);
            txtFieldNama.setText(null);
            txtFieldNilai.setText(null);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        btnAdd.setText("Add");
        btnDelete.setVisible(false);
        this.isUpdate = false;
        txtFieldNim.setText(null);
        txtFieldNama.setText(null);
        txtFieldNilai.setText(null);
    }//GEN-LAST:event_btnCancelActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelUtama;
    private javax.swing.JTable TabelMhs;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNilai;
    private javax.swing.JLabel lblNim;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scrlPane;
    private javax.swing.JTextField txtFieldNama;
    private javax.swing.JTextField txtFieldNilai;
    private javax.swing.JTextField txtFieldNim;
    // End of variables declaration//GEN-END:variables
}
