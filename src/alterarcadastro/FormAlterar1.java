/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alterarcadastro;

import buscaclientes.*;
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
 * @author pedro11
 */
public class FormAlterar1 extends javax.swing.JFrame {
    private Connection conn;
    /**
     * Creates new form Menu
     */
    public FormAlterar1() {
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

        tfCPF = new javax.swing.JFormattedTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        jLabel7CPF1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3Nome = new javax.swing.JLabel();
        jLabel5Idade = new javax.swing.JLabel();
        tfIdade = new javax.swing.JFormattedTextField();
        jButton3Retornar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
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
        tfCPF.setBounds(130, 123, 140, 26);

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(tfTelefone);
        tfTelefone.setBounds(210, 289, 140, 26);

        jLabel7CPF1.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 18)); // NOI18N
        jLabel7CPF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_phone_3325016 (1).png"))); // NOI18N
        jLabel7CPF1.setText("Novo Telefone:");
        getContentPane().add(jLabel7CPF1);
        jLabel7CPF1.setBounds(30, 260, 190, 80);

        tfNome.setToolTipText("");
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(tfNome);
        tfNome.setBounds(180, 175, 300, 26);

        jLabel3Nome.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 18)); // NOI18N
        jLabel3Nome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_user_309035.png"))); // NOI18N
        jLabel3Nome.setText("Novo Nome:");
        getContentPane().add(jLabel3Nome);
        jLabel3Nome.setBounds(28, 175, 170, 22);

        jLabel5Idade.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 18)); // NOI18N
        jLabel5Idade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_birthday-cake_1608875.png"))); // NOI18N
        jLabel5Idade.setText("Nova Idade:");
        getContentPane().add(jLabel5Idade);
        jLabel5Idade.setBounds(30, 230, 160, 30);

        try {
            tfIdade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfIdade);
        tfIdade.setBounds(180, 233, 40, 26);

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

        jButtonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_check-box-outline_326561.png"))); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirmarMouseClicked(evt);
            }
        });
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(30, 380, 170, 60);

        jLabel2Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rsz_1doge.png"))); // NOI18N
        jLabel2Imagem.setToolTipText("");
        getContentPane().add(jLabel2Imagem);
        jLabel2Imagem.setBounds(410, 210, 280, 250);

        jLabel1Titulo.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 1, 36)); // NOI18N
        jLabel1Titulo.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Titulo.setText("Alterar Cliente");
        getContentPane().add(jLabel1Titulo);
        jLabel1Titulo.setBounds(110, 30, 410, 60);

        jLabel7CPF.setFont(new java.awt.Font("DejaVu Math TeX Gyre", 0, 18)); // NOI18N
        jLabel7CPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/iconfinder_carnet-male_416923.png"))); // NOI18N
        jLabel7CPF.setText("CPF:");
        getContentPane().add(jLabel7CPF);
        jLabel7CPF.setBounds(30, 120, 80, 30);

        PlanoDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/WhatsApp Image 2018-12-06 at 15.50.28.jpeg"))); // NOI18N
        getContentPane().add(PlanoDeFundo);
        PlanoDeFundo.setBounds(0, -60, 1240, 690);

        setSize(new java.awt.Dimension(639, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void jButton3RetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3RetornarActionPerformed
        
    }//GEN-LAST:event_jButton3RetornarActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarMouseClicked
        // TODO add your handling code here:
        String cpf;
        String nome;
        int idade;
        String telefone;
        cpf = tfCPF.getText();
        nome = tfNome.getText();
        if(tfIdade.getText().equals("  ")){
            JOptionPane.showMessageDialog(null, "Favor preencher todos os campos.");
            return;
        }
        idade = Integer.parseInt(tfIdade.getText());
        telefone = tfTelefone.getText();
        // JOptionPane.showMessageDialog(this,"Buscado: " + cpf);
        if (cpf.equals("") || nome.equals("") || tfIdade.getText().equals("  ") || telefone.equals("")){
           JOptionPane.showMessageDialog(null, "Favor preencher todos os campos.");
           return;
        }
        OperacoesBD op = new OperacoesBD();
        try{
            tfCPF.setText("");
            tfNome.setText("");
            tfIdade.setText("");
            tfTelefone.setText("");
            Cliente c = new Cliente();
            c = op.buscarCPF(conn, cpf);
            op.alterarTelefone(conn, nome, idade, telefone, cpf);
            JOptionPane.showMessageDialog(this,"Cadastro atualizado");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(this,"Cliente Não Encontrado");
            Logger.getLogger(FormBusca.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Cliente Não Encontrado");
            Logger.getLogger(FormBusca.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonConfirmarMouseClicked

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void jButton3RetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3RetornarMouseClicked
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3RetornarMouseClicked

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

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
                new FormAlterar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PlanoDeFundo;
    private javax.swing.JButton jButton3Retornar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1Titulo;
    private javax.swing.JLabel jLabel2Imagem;
    private javax.swing.JLabel jLabel3Nome;
    private javax.swing.JLabel jLabel5Idade;
    private javax.swing.JLabel jLabel7CPF;
    private javax.swing.JLabel jLabel7CPF1;
    private javax.swing.JFormattedTextField tfCPF;
    private javax.swing.JFormattedTextField tfIdade;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
