/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasiproduk;

/**
 *
 * @author HP
 */
public class PengelolaanPembayaran extends javax.swing.JFrame {

    /**
     * Creates new form PengelolaanPembayaran
     */
    public PengelolaanPembayaran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Det_Pemb = new javax.swing.JLabel();
        Nama_Pemb = new javax.swing.JLabel();
        edtNama_Pemb = new javax.swing.JTextField();
        Email_Pemb = new javax.swing.JLabel();
        edtEmail_Pemb = new javax.swing.JTextField();
        Telp_Pemb = new javax.swing.JLabel();
        edtTelp_Pemb = new javax.swing.JTextField();
        Alamat_Peng = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edtAlamat_Peng = new javax.swing.JTextArea();
        Ringk_Bel = new javax.swing.JLabel();
        Tot_Harg = new javax.swing.JLabel();
        Tot_Harg1 = new javax.swing.JLabel();
        Ongkir1 = new javax.swing.JLabel();
        Ongkir = new javax.swing.JLabel();
        Method_Pemb = new javax.swing.JLabel();
        cbPemb_CashOf = new javax.swing.JCheckBox();
        btnPemb_Transfer = new javax.swing.JCheckBox();
        btnPemb_COD = new javax.swing.JCheckBox();
        btnPemb_Cashbon = new javax.swing.JCheckBox();
        btnProses = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Det_Pemb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Det_Pemb.setText("DETAIL PEMBELI");

        Nama_Pemb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Nama_Pemb.setText("Nama Pembeli");

        Email_Pemb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Email_Pemb.setText("Email Pembeli");

        Telp_Pemb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Telp_Pemb.setText("Telepon/Handphone");

        edtTelp_Pemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTelp_PembActionPerformed(evt);
            }
        });

        Alamat_Peng.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Alamat_Peng.setText("Alamat Pengiriman");

        edtAlamat_Peng.setColumns(20);
        edtAlamat_Peng.setRows(5);
        jScrollPane1.setViewportView(edtAlamat_Peng);

        Ringk_Bel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Ringk_Bel.setText("Ringkasan Belanjaan");

        Tot_Harg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Tot_Harg.setText("Total Harga");

        Tot_Harg1.setText("Label Buat Harga");

        Ongkir1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Ongkir1.setText("Ongkos Kirim");

        Ongkir.setText("Label Buat Ongkir");

        Method_Pemb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Method_Pemb.setText("Metode Pembayaran");

        cbPemb_CashOf.setText("Cash On Office");

        btnPemb_Transfer.setText("Transfer");

        btnPemb_COD.setText("Cash On Delivery");

        btnPemb_Cashbon.setText("CashBon");

        btnProses.setText("Proses Pembelian");

        btnClear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Det_Pemb)
                    .addComponent(Nama_Pemb)
                    .addComponent(edtNama_Pemb)
                    .addComponent(Email_Pemb)
                    .addComponent(edtEmail_Pemb)
                    .addComponent(Telp_Pemb)
                    .addComponent(edtTelp_Pemb)
                    .addComponent(Alamat_Peng)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ongkir1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(Ongkir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Ringk_Bel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Tot_Harg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Tot_Harg1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(251, 251, 251))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Method_Pemb)
                            .addComponent(cbPemb_CashOf)
                            .addComponent(btnPemb_Transfer)
                            .addComponent(btnPemb_COD)
                            .addComponent(btnPemb_Cashbon)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProses)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Det_Pemb)
                    .addComponent(Ringk_Bel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama_Pemb)
                    .addComponent(Tot_Harg)
                    .addComponent(Tot_Harg1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNama_Pemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ongkir1)
                    .addComponent(Ongkir))
                .addGap(8, 8, 8)
                .addComponent(Email_Pemb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtEmail_Pemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Method_Pemb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telp_Pemb)
                    .addComponent(cbPemb_CashOf))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtTelp_Pemb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPemb_Transfer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alamat_Peng)
                    .addComponent(btnPemb_COD))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnPemb_Cashbon)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProses)
                            .addComponent(btnClear))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtTelp_PembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTelp_PembActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTelp_PembActionPerformed

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
            java.util.logging.Logger.getLogger(PengelolaanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengelolaanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengelolaanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengelolaanPembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengelolaanPembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat_Peng;
    private javax.swing.JLabel Det_Pemb;
    private javax.swing.JLabel Email_Pemb;
    private javax.swing.JLabel Method_Pemb;
    private javax.swing.JLabel Nama_Pemb;
    private javax.swing.JLabel Ongkir;
    private javax.swing.JLabel Ongkir1;
    private javax.swing.JLabel Ringk_Bel;
    private javax.swing.JLabel Telp_Pemb;
    private javax.swing.JLabel Tot_Harg;
    private javax.swing.JLabel Tot_Harg1;
    private javax.swing.JButton btnClear;
    private javax.swing.JCheckBox btnPemb_COD;
    private javax.swing.JCheckBox btnPemb_Cashbon;
    private javax.swing.JCheckBox btnPemb_Transfer;
    private javax.swing.JButton btnProses;
    private javax.swing.JCheckBox cbPemb_CashOf;
    private javax.swing.JTextArea edtAlamat_Peng;
    private javax.swing.JTextField edtEmail_Pemb;
    private javax.swing.JTextField edtNama_Pemb;
    private javax.swing.JTextField edtTelp_Pemb;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
