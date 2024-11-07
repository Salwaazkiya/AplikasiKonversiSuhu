
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class KonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form KonversiSuhu
     */
    public KonversiSuhu() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSuhu = new javax.swing.JTextField();
        boxSuhu = new javax.swing.JComboBox<>();
        btnKonversi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        rCelcius = new javax.swing.JRadioButton();
        rReamur = new javax.swing.JRadioButton();
        rFahrenheit = new javax.swing.JRadioButton();
        txtHasil = new javax.swing.JTextField();
        rKelvin = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Aplikasi Konversi Suhu");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Konversi Suhu Form"));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Input Suhu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 135, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        txtSuhu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSuhuKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 5, 0, 0);
        jPanel2.add(txtSuhu, gridBagConstraints);

        boxSuhu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Suhu", "Celcius", "Fahrenheit", "Kelvin", "Reamur" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 31;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel2.add(boxSuhu, gridBagConstraints);

        btnKonversi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKonversi.setText("KONVERSI");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel2.add(btnKonversi, gridBagConstraints);

        jLabel3.setText("Konversi ke Suhu :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 97, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        buttonGroup1.add(rCelcius);
        rCelcius.setText("Celcius");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 5, 0, 0);
        jPanel2.add(rCelcius, gridBagConstraints);

        buttonGroup1.add(rReamur);
        rReamur.setText("Reamur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 0);
        jPanel2.add(rReamur, gridBagConstraints);

        buttonGroup1.add(rFahrenheit);
        rFahrenheit.setText("Fahrenheit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel2.add(rFahrenheit, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 65, 0);
        jPanel2.add(txtHasil, gridBagConstraints);

        buttonGroup1.add(rKelvin);
        rKelvin.setText("Kelvin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(rKelvin, gridBagConstraints);

        jLabel4.setText("Hasil Konversi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 120, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        jPanel2.add(btnHapus, gridBagConstraints);

        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 83);
        jPanel2.add(btnKeluar, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        try {
        double nilaiSuhu = Double.parseDouble(txtSuhu.getText());
        String skalaKonversi = (String) boxSuhu.getSelectedItem();
        
        double hasilKonversi = 0.0;

        // Cek arah konversi berdasarkan RadioButton yang dipilih
        if (rCelcius.isSelected()) {
            // Jika konversi dari Celcius ke skala lain
            switch (skalaKonversi) {
                case "Fahrenheit":
                    hasilKonversi = (nilaiSuhu * 9/5) + 32;
                    break;
                case "Kelvin":
                    hasilKonversi = nilaiSuhu + 273.15;
                    break;
                case "Reamur":
                    hasilKonversi = nilaiSuhu * 4/5;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilih skala konversi yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
        } else if (rFahrenheit.isSelected()) {
            // Jika konversi dari skala lain ke Celcius
            switch (skalaKonversi) {
                case "Celcius":
                    hasilKonversi = (nilaiSuhu - 32) * 5/9;
                    break;
                case "Kelvin":
                    hasilKonversi = (nilaiSuhu - 32) * 5/9 + 273.15;
                    break;
                case "Reamur":
                    hasilKonversi = (nilaiSuhu - 32) * 4/9;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilih skala konversi yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
        } else if (rKelvin.isSelected()) {
            // Jika konversi dari skala lain ke Celcius
            switch (skalaKonversi) {
                case "Celcius":
                    hasilKonversi = nilaiSuhu - 273.15;
                    break;
                case "Fahrenheit":
                    hasilKonversi = (nilaiSuhu - 273.15) * 9/5 + 32;
                    break;
                case "Reamur":
                    hasilKonversi = (nilaiSuhu - 273.15) * 4/5;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilih skala konversi yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
        } else if (rReamur.isSelected()) {
            // Jika konversi dari skala lain ke Celcius
            switch (skalaKonversi) {
                case "Celcius":
                    hasilKonversi = nilaiSuhu * 5/4;
                    break;
                case "Fahrenheit":
                    hasilKonversi = (nilaiSuhu * 9/4) + 32;
                    break;
                case "Kelvin":
                    hasilKonversi = nilaiSuhu * 5/4 + 273.15;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Pilih skala konversi yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih arah konversi dengan RadioButton!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Tampilkan hasil konversi pada JLabel
        txtHasil.setText((String.valueOf(hasilKonversi)));
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
    }// TODO add your handling code here:
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void txtSuhuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuhuKeyTyped
         char karakter = evt.getKeyChar();
        // Memeriksa karakter yang dimasukkan apakah bukan angka atau tanda titik
        if (!Character.isDigit(karakter) && karakter != '.') {
            evt.consume(); // Mengabaikan karakter yang bukan angka atau tanda titik
        }

        // Membatasi hanya satu tanda titik untuk input desimal
        if (karakter == '.' && txtSuhu.getText().contains(".")) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuhuKeyTyped

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        txtSuhu.setText("");
        txtHasil.setText("");
    
    // Mengatur ulang JComboBox ke pilihan pertama
    boxSuhu.setSelectedIndex(0);
    
    // Menghapus pilihan JRadioButton dengan ButtonGroup
    buttonGroup1.clearSelection();        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSuhu;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKonversi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rCelcius;
    private javax.swing.JRadioButton rFahrenheit;
    private javax.swing.JRadioButton rKelvin;
    private javax.swing.JRadioButton rReamur;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtSuhu;
    // End of variables declaration//GEN-END:variables
}