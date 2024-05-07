/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.datamoviecontroller;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author M S I
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    datamoviecontroller mc;
    public MainView() {
        initComponents();
        mc = new datamoviecontroller(this);
        mc.isitabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextnilai = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMovie = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextjudul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextalur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextpenokohan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextakting = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonsimpan = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtonhapus = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();

        jTextnilai.setEditable(false);
        jTextnilai.setForeground(new java.awt.Color(242, 242, 242));
        jTextnilai.setCaretColor(new java.awt.Color(242, 242, 242));
        jTextnilai.setDisabledTextColor(new java.awt.Color(242, 242, 242));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelMovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabelMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMovieMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMovie);

        jLabel1.setText("Judul");

        jLabel2.setText("Alur");

        jLabel3.setText("Penokohan");

        jLabel4.setText("Akting");

        jLabel5.setForeground(new java.awt.Color(242, 242, 242));
        jLabel5.setText("Nilai");

        jButtonsimpan.setText("Simpan");
        jButtonsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsimpanActionPerformed(evt);
            }
        });

        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });

        jButtonhapus.setText("Hapus");
        jButtonhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonhapusActionPerformed(evt);
            }
        });

        jButtonclear.setText("CLEAR DATABASE");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextjudul, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextalur, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextpenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextakting, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonsimpan)
                                .addGap(38, 38, 38)
                                .addComponent(jButtonupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonhapus))
                            .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextjudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextalur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextpenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextakting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonsimpan)
                            .addComponent(jButtonupdate)
                            .addComponent(jButtonhapus))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonclear)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        // TODO add your handling code here:
   String judul = jTextjudul.getText();
    double alur = Double.parseDouble(jTextalur.getText());
    double penokohan = Double.parseDouble(jTextpenokohan.getText());
    double akting = Double.parseDouble(jTextakting.getText());
    double nilai = (alur + penokohan + akting) / 3.0; 
    jTextnilai.setText(String.valueOf(nilai));
    mc.update(judul, alur, penokohan, akting, nilai);
    mc.isitabel();
    
    String ObjButtons[]={"OK"};
    int PromptResult = JOptionPane.showOptionDialog(null, "Data berhasil diupdate", "Update Data", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[0]);
    
    if (PromptResult == JOptionPane.OK_OPTION) {
    
    } 
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        String ObjButtons[]={"Yes","No"};
    int PromptResult = JOptionPane.showOptionDialog(null, "Apakah Anda yakin ingin menghapus seluruh data?", "Konfirmasi Clear", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
    
    if (PromptResult == JOptionPane.YES_OPTION) {
        mc.clear();
        mc.isitabel();
    } 
        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void tabelMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMovieMouseClicked
        // TODO add your handling code here:
    int baris = tabelMovie.getSelectedRow();
    jTextjudul.setText(tabelMovie.getValueAt(baris, 0).toString());
    jTextalur.setText(tabelMovie.getValueAt(baris, 1).toString());
    jTextpenokohan.setText(tabelMovie.getValueAt(baris, 2).toString());
    jTextakting.setText(tabelMovie.getValueAt(baris, 3).toString());
    jTextnilai.setText(tabelMovie.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_tabelMovieMouseClicked

    private void jButtonsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsimpanActionPerformed
        // TODO add your handling code here:
    String judul = jTextjudul.getText();
    double alur = Double.parseDouble(jTextalur.getText());
    double penokohan = Double.parseDouble(jTextpenokohan.getText());
    double akting = Double.parseDouble(jTextakting.getText());
    double nilai = (alur + penokohan + akting) / 3.0; 
    jTextnilai.setText(String.valueOf(nilai));
    mc.insert(judul, alur, penokohan, akting, nilai);
    mc.isitabel();
        
    String ObjButtons[]={"OK"};
    int PromptResult = JOptionPane.showOptionDialog(null, "Data berhasil ditambahkan", "Tambah Data", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[0]);
    
    if (PromptResult == JOptionPane.OK_OPTION) {
    
    } 
     
    }//GEN-LAST:event_jButtonsimpanActionPerformed

    private void jButtonhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonhapusActionPerformed
        // TODO add your handling code here:
    String ObjButtons[]={"Yes","No"};
    int PromptResult = JOptionPane.showOptionDialog(null, "Apakah Anda yakin ingin menghapus?", "Konfirmasi Hapus", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
    
    if (PromptResult == JOptionPane.YES_OPTION) {
        String judul = jTextjudul.getText();
    mc.delete(judul);
    mc.isitabel();
    } 
    
    }//GEN-LAST:event_jButtonhapusActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonhapus;
    private javax.swing.JButton jButtonsimpan;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextakting;
    private javax.swing.JTextField jTextalur;
    private javax.swing.JTextField jTextjudul;
    private javax.swing.JTextField jTextnilai;
    private javax.swing.JTextField jTextpenokohan;
    private javax.swing.JTable tabelMovie;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextakting() {
        return jTextakting;
    }

    public void setjTextakting(JTextField jTextakting) {
        this.jTextakting = jTextakting;
    }

    public JTextField getjTextalur() {
        return jTextalur;
    }

    public void setjTextalur(JTextField jTextalur) {
        this.jTextalur = jTextalur;
    }

    public JTextField getjTextjudul() {
        return jTextjudul;
    }

    public void setjTextjudul(JTextField jTextjudul) {
        this.jTextjudul = jTextjudul;
    }

    public JTextField getjTextnilai() {
        return jTextnilai;
    }

    public void setjTextnilai(JTextField jTextnilai) {
        this.jTextnilai = jTextnilai;
    }

    public JTextField getjTextpenokohan() {
        return jTextpenokohan;
    }

    public void setjTextpenokohan(JTextField jTextpenokohan) {
        this.jTextpenokohan = jTextpenokohan;
    }

    public JTable getTabelMovie() {
        return tabelMovie;
    }

    public void setTabelMovie(JTable tabelMovie) {
        this.tabelMovie = tabelMovie;
    }


}
