/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removercadastro;

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
public class FormRemove extends javax.swing.JFrame {
    private Connection conn;
    /**
     * Creates new form Menu
     */
    public FormRemove() {
        initComponents();
        conn = Conexao.getConnection();
        jTextPaneRemove.setEnabled(false);
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
        jTextPaneRemove = new javax.swing.JTextPane();
        tfCPF = new javax.swing.JFormattedTextField();
        jButton3Retornar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2Imagem = new javax.swing.JLabel();
        jLabel1Titulo = new javax.swing.JLabel();
        jLabel7CPF = new javax.swing.JLabel();
        PlanoDeFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setViewportView(jTextPaneRemove);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 260, 190);

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
        tfCPF.setBounds(130, 133, 140, 26);

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
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseClicked(evt);
            }
        });
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(40, 180, 140, 60);

        jLabel2Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rsz_sad-dog-png-4.png"))); // NOI18N
        jLabel2Imagem.setToolTipText("");
        getContentPane().add(jLabel2Imagem);
        jLabel2Imagem.setBounds(400, 260, 280, 250);

        jLabel1Titulo.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("Remover Cliente");
        getContentPane().add(jLabel1Titulo);
        jLabel1Titulo.setBounds(110, 30, 410, 60);

        jLabel7CPF.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 18)); // NOI18N
        jLabel7CPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_carnet-male_416923.png"))); // NOI18N
        jLabel7CPF.setText("CPF:");
        getContentPane().add(jLabel7CPF);
        jLabel7CPF.setBounds(50, 130, 90, 30);

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

    private void jButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseClicked
        // TODO add your handling code here:
        String cpf;
        cpf = tfCPF.getText();

        jTextPaneRemove.setEnabled(true);
        jTextPaneRemove.setEditable(false);
        OperacoesBD op = new OperacoesBD();
        jTextPaneRemove.setText("");
        try{
            Cliente c = new Cliente();
            int resposta;
            Object[] options = {"Sim", "Não"};
            c = op.buscarCPF(conn, cpf);
            jTextPaneRemove.setText("Nome: " + c.getNome() + "\n"+ "CPF: " + c.getCpf() + "\n" + "Idade: " + c.getIdade() + "\n" + "Telefone: " + c.getTelefone()); 
            resposta = JOptionPane.showOptionDialog( null,"Confirma a exlcusão do cliente?", "Exclusão",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            
            if(resposta == 0){
                op.removerCliente(conn, c.getCpf());
                JOptionPane.showMessageDialog(this,"Cliente Removido!");
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Cliente Não Encontrado");
            Logger.getLogger(FormRemove.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Cliente Não Encontrado");
            Logger.getLogger(FormRemove.class.getName()).log(Level.SEVERE, null, e);
        }
        
        jTextPaneRemove.setText("");
        tfCPF.setText("");
    }//GEN-LAST:event_jButtonBuscarMouseClicked

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
                new FormRemove().setVisible(true);
                // Astalala
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneRemove;
    private javax.swing.JFormattedTextField tfCPF;
    // End of variables declaration//GEN-END:variables
}
