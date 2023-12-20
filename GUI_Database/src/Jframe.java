
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



/**
 *
 * @author khalifardy
 */

public class Jframe extends javax.swing.JFrame {

    /**
     * Creates new form Jframe
     */
    ArrayList<Mahasiswa> lstMahasiswa = new ArrayList<>();
    DefaultListModel lstnamaMahasiswa = new DefaultListModel();
    public Jframe() {
        initComponents();
        jLabel5.setText("");
                        //jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel6.setText("");
        jLabel7.setText("");
        showlits();
        listmahasiwa.setModel(lstnamaMahasiswa);
        
        listmahasiwa.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Check if the selection is adjusting (to avoid firing the event twice)
                if (!e.getValueIsAdjusting()) {
                    int index = listmahasiwa.getSelectedIndex();

                    if (index != -1) {
                        // Update JLabels based on the selected Employee
                        jLabel5.setText(lstMahasiswa.get(index).getNama());
                        //jLabel1.setHorizontalAlignment(SwingConstants.LEFT);
                        jLabel6.setText(lstMahasiswa.get(index).getNim());
                        jLabel7.setText(lstMahasiswa.get(index).getProdi());
                    }
                }
            }
        });
        
    }
    
    public void showlits(){
        try{
            Database db = new Database();
            String sql = "select * from tabel_mahasiswa";
            ResultSet rs = db.getData(sql);
            while(rs.next()){
                Mahasiswa obj = new Mahasiswa(rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getString("prodi"));
                if (!lstMahasiswa.contains(obj)) {
                lstMahasiswa.add(obj);

                // Check if the Mahasiswa's name is not already present in the DefaultListModel
                    if (!lstnamaMahasiswa.contains(rs.getString("nama"))) {
                        lstnamaMahasiswa.addElement(rs.getString("nama"));
                        }
                }
  
            }
        }
        catch(SQLException ex){
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabinput = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listmahasiwa = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        updatebutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        NIMfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        namafield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ifbutton = new javax.swing.JRadioButton();
        sebutton = new javax.swing.JRadioButton();
        itbutton = new javax.swing.JRadioButton();
        dsbutton = new javax.swing.JRadioButton();
        savebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listmahasiwa);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Detail Mahasiswa");

        jLabel2.setText("NIM");

        jLabel3.setText("Nama");

        jLabel4.setText("Prodi");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        updatebutton.setText("Refresh");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(updatebutton)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatebutton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel5.getAccessibleContext().setAccessibleName("");

        tabinput.addTab("Daftar Mahasiswa", jPanel1);

        jLabel8.setText("NIM");

        jLabel9.setText("NAMA");

        namafield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namafieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Prodi");

        ifbutton.setText("IF");
        ifbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifbuttonActionPerformed(evt);
            }
        });

        sebutton.setText("SE");
        sebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sebuttonActionPerformed(evt);
            }
        });

        itbutton.setText("IT");
        itbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itbuttonActionPerformed(evt);
            }
        });

        dsbutton.setText("DS");
        dsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dsbuttonActionPerformed(evt);
            }
        });

        savebutton.setText("SImpan");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(savebutton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NIMfield)
                        .addComponent(namafield, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ifbutton)
                            .addComponent(itbutton))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dsbutton)
                            .addComponent(sebutton))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NIMfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(namafield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ifbutton)
                    .addComponent(sebutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itbutton)
                    .addComponent(dsbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(savebutton)
                .addGap(52, 52, 52))
        );

        tabinput.addTab("Input Mahasiswa", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabinput)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabinput)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namafieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namafieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namafieldActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
        String prodi="";
        if (ifbutton.isSelected()){
            prodi = ifbutton.getText();
        };
        
        if (itbutton.isSelected()){
            prodi = itbutton.getText();
        };
        
        if (sebutton.isSelected()){
            prodi = sebutton.getText();
        };
        
        if(NIMfield.getText().equals("") || NIMfield.getText().isEmpty()||namafield.getText().equals("") || namafield.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"field tidak boleh kosong");
        }else{
            String nama = namafield.getText();
            String nim = NIMfield.getText();
            try{
                Mahasiswa obj = new Mahasiswa(nim,nama,prodi);
                obj.insert_mahasiswa();            
            }
            catch(SQLException ex){
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Task berhasil ditambahkan");
            namafield.setText("");
            NIMfield.setText("");
        }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        // TODO add your handling code here:
        showlits();
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void ifbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifbuttonActionPerformed
        // TODO add your handling code here:
        if (ifbutton.isSelected()){
            dsbutton.setSelected(false);
            itbutton.setSelected(false);
            sebutton.setSelected(false);
        }
    }//GEN-LAST:event_ifbuttonActionPerformed

    private void sebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sebuttonActionPerformed
        // TODO add your handling code here:
        if (sebutton.isSelected()){
            dsbutton.setSelected(false);
            itbutton.setSelected(false);
            ifbutton.setSelected(false);
        }
    }//GEN-LAST:event_sebuttonActionPerformed

    private void itbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itbuttonActionPerformed
        // TODO add your handling code here:
        if (itbutton.isSelected()){
            dsbutton.setSelected(false);
            ifbutton.setSelected(false);
            sebutton.setSelected(false);
        }
    }//GEN-LAST:event_itbuttonActionPerformed

    private void dsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dsbuttonActionPerformed
        // TODO add your handling code here:
        if (dsbutton.isSelected()){
            ifbutton.setSelected(false);
            itbutton.setSelected(false);
            sebutton.setSelected(false);
        }
    }//GEN-LAST:event_dsbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIMfield;
    private javax.swing.JRadioButton dsbutton;
    private javax.swing.JRadioButton ifbutton;
    private javax.swing.JRadioButton itbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listmahasiwa;
    private javax.swing.JTextField namafield;
    private javax.swing.JButton savebutton;
    private javax.swing.JRadioButton sebutton;
    private javax.swing.JTabbedPane tabinput;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
