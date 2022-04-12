package telas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

public class NewJFrameTelaCadastro extends javax.swing.JFrame {

    public NewJFrameTelaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        lblNome = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtSenhaCadastro = new javax.swing.JPasswordField();
        txtRepitaSenha = new javax.swing.JPasswordField();
        lblSenha3 = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        cmbComboBoxCargos = new javax.swing.JComboBox<>();

        label1.setText("label1");

        setTitle("Cadastro de Usuário");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(120, 166, 233));
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 30, 120, 30);

        txtName.setBackground(new java.awt.Color(252, 232, 222));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(150, 30, 240, 30);

        lblSenha.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(120, 166, 233));
        lblSenha.setText("Cargo");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 180, 120, 30);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(20, 260, 100, 30);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(290, 260, 100, 30);

        txtSenhaCadastro.setBackground(new java.awt.Color(252, 232, 222));
        getContentPane().add(txtSenhaCadastro);
        txtSenhaCadastro.setBounds(150, 80, 240, 30);

        txtRepitaSenha.setBackground(new java.awt.Color(252, 232, 222));
        txtRepitaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepitaSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtRepitaSenha);
        txtRepitaSenha.setBounds(150, 130, 240, 30);

        lblSenha3.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        lblSenha3.setForeground(new java.awt.Color(120, 166, 233));
        lblSenha3.setText("Confirme a senha");
        getContentPane().add(lblSenha3);
        lblSenha3.setBounds(20, 130, 120, 30);

        lblSenha1.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        lblSenha1.setForeground(new java.awt.Color(120, 166, 233));
        lblSenha1.setText("Senha");
        getContentPane().add(lblSenha1);
        lblSenha1.setBounds(20, 80, 120, 30);

        cmbComboBoxCargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Balconista", "Caixa" }));
        cmbComboBoxCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComboBoxCargosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbComboBoxCargos);
        cmbComboBoxCargos.setBounds(150, 180, 100, 22);

        setSize(new java.awt.Dimension(424, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRepitaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepitaSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepitaSenhaActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        NewJFrameTelaLogin telaLogin;

        telaLogin = new NewJFrameTelaLogin();
        telaLogin.setVisible(true);

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String regExp = "^[A-Z-a-z]{5}";
        String regExpPassword = "[A-Z-a-z]{5}[0-9]{1}";

        /* COMEÇO TESTS BIBLIOTECAS      */
        Date date = new Date();
        Locale local = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dimension = tk.getScreenSize();

        System.out.println(date.toString());
        System.out.println(local.getDisplayCountry());
        System.out.println(local.getLanguage());
        System.out.println("A resolução do seu sistema é: " + dimension.width + " X " + dimension.height);

        if (dimension.width == 1366 && dimension.height == 768) {
            System.out.println("dimensão padrão");
        } else {
            System.out.println("a sua altura não é 768 e a sua largura não é 1366");
        }
        /* /FIM TESTS BIBLIOTECAS      */
        
        if (txtName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome do usuário");
            txtName.requestFocus();
            return;
        }
        if (txtName.getText().trim().length() > 10) {
            JOptionPane.showMessageDialog(null, "Erro o nome do usuário precisa ter até 10 caracteres");
            return;
        }
        if (!txtName.getText().trim().toString().matches(regExp)) {
            JOptionPane.showMessageDialog(null, "Erro o nome do usuário está inválido");
            return;
        }
        if (!txtSenhaCadastro.getText().trim().toString().matches(regExpPassword)) {
            JOptionPane.showMessageDialog(null, "Erro senha precisa de 5 caracteres e 1 número");
            return;
        }
        if (txtSenhaCadastro.getPassword().toString().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha a senha ");
            txtSenhaCadastro.requestFocus();
            return;
        }

        try {

            Connection conexao;
            PreparedStatement st;
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/padaria", "postgres", "root");

            if (txtRepitaSenha.getText().equals(txtSenhaCadastro.getText())) {

                st = conexao.prepareStatement("INSERT INTO usuarios VALUES (?, ?, ?)");

                st.setString(1, txtName.getText().trim());
                st.setString(2, txtSenhaCadastro.getText().trim());
                st.setString(3, cmbComboBoxCargos.getSelectedItem().toString().trim());
                st.executeUpdate();

                txtName.setText("");
                txtRepitaSenha.setText("");
                txtSenhaCadastro.setText("");
                cmbComboBoxCargos.requestFocus();

                JOptionPane.showMessageDialog(btnCadastrar, " user created ");
            } else {
                JOptionPane.showMessageDialog(btnCadastrar, " erro as senhas não são iguais! ");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnCadastrar, "driver not found !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnCadastrar, "error SQLException, params NOT FOUND !" + ex.getMessage());
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cmbComboBoxCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComboBoxCargosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbComboBoxCargosActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameTelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbComboBoxCargos;
    private java.awt.Label label1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblSenha3;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtRepitaSenha;
    private javax.swing.JPasswordField txtSenhaCadastro;
    // End of variables declaration//GEN-END:variables
}
