/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaclientes;

import MenuPrincipal.*;

/**
 *
 * @author pedro11
 */
public class FormBusca extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public FormBusca() {
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

        tfCPF = new javax.swing.JFormattedTextField();
        jButton3Retornar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2Imagem = new javax.swing.JLabel();
        jLabel1Titulo = new javax.swing.JLabel();
        jLabel7CPF = new javax.swing.JLabel();
        PlanoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        try {
            tfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });
        getContentPane().add(tfCPF);
        tfCPF.setBounds(120, 130, 140, 26);

        jButton3Retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_ic_keyboard_return_48px_352473.png"))); // NOI18N
        jButton3Retornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3RetornarMouseClicked(evt);
            }
        });
        jButton3Retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3RetornarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Retornar);
        jButton3Retornar.setBounds(30, 40, 60, 30);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rsz_iconfinder_search-80px_510919.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(50, 180, 140, 60);

        jLabel2Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rsz_1rsz_kisspng-dog-grooming-puppy-cat-pet-white-dog-5a70ac435552b05161753115173335713495.png"))); // NOI18N
        jLabel2Imagem.setToolTipText("");
        getContentPane().add(jLabel2Imagem);
        jLabel2Imagem.setBounds(470, 220, 280, 250);

        jLabel1Titulo.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("Buscar Cliente");
        getContentPane().add(jLabel1Titulo);
        jLabel1Titulo.setBounds(110, 30, 410, 60);

        jLabel7CPF.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 18)); // NOI18N
        jLabel7CPF.setText("CPF:");
        getContentPane().add(jLabel7CPF);
        jLabel7CPF.setBounds(50, 130, 70, 30);

        PlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/WhatsApp Image 2018-12-06 at 15.50.28.jpeg"))); // NOI18N
        getContentPane().add(PlanoDeFundo);
        PlanoDeFundo.setBounds(0, -60, 1240, 690);

        setSize(new java.awt.Dimension(639, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton3RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3RetornarActionPerformed
        
    }//GEN-LAST:event_jButton3RetornarActionPerformed

    private void jButton3RetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3RetornarMouseClicked
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3RetornarMouseClicked

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
                new FormBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlanoDeFundo;
    private javax.swing.JButton jButton3Retornar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JLabel jLabel2Imagem;
    private javax.swing.JLabel jLabel7CPF;
    private javax.swing.JFormattedTextField tfCPF;
    // End of variables declaration//GEN-END:variables
}
