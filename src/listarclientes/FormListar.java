/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarclientes;

import MenuPrincipal.*;
import cadastroclientes.Cliente;
import cadastroclientes.Conexao;
import cadastroclientes.OperacoesBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro11, vinality
 */
public class FormListar extends javax.swing.JFrame {
    private Connection conn;
    /**
     * Creates new form Menu
     */
    public FormListar() {
        initComponents();
        conn = Conexao.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneBusca = new javax.swing.JTextPane();
        jButton3Retornar = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jLabel2Imagem = new javax.swing.JLabel();
        jLabel1Titulo = new javax.swing.JLabel();
        PlanoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jTextPaneBusca);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 300, 300);

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

        jButtonListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rsz_iconfinder_search-80px_510919.png"))); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonListarMouseClicked(evt);
            }
        });
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonListar);
        jButtonListar.setBounds(30, 400, 140, 60);

        jLabel2Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rsz_1kisspng-chihuahua-puppy-dog-breed-companion-dog-toy-dog-5b58711a2bfad91481800915325227781802.png"))); // NOI18N
        jLabel2Imagem.setToolTipText("");
        getContentPane().add(jLabel2Imagem);
        jLabel2Imagem.setBounds(440, 220, 280, 250);

        jLabel1Titulo.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("Listar Clientes");
        getContentPane().add(jLabel1Titulo);
        jLabel1Titulo.setBounds(110, 30, 410, 60);

        PlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/WhatsApp Image 2018-12-06 at 15.50.28.jpeg"))); // NOI18N
        getContentPane().add(PlanoDeFundo);
        PlanoDeFundo.setBounds(0, -60, 1240, 690);

        setSize(new java.awt.Dimension(639, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButton3RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3RetornarActionPerformed
        
    }//GEN-LAST:event_jButton3RetornarActionPerformed

    private void jButton3RetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3RetornarMouseClicked
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3RetornarMouseClicked

    private void jButtonListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonListarMouseClicked
        // TODO add your handling code here:       
        OperacoesBD op = new OperacoesBD();
        try{
            op.listarClientes(conn);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Clientes Não Encontrados");
            Logger.getLogger(FormListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonListarMouseClicked

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
                new FormListar().setVisible(true);
                // Astalala
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlanoDeFundo;
    private javax.swing.JButton jButton3Retornar;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JLabel jLabel2Imagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneBusca;
    // End of variables declaration//GEN-END:variables
}