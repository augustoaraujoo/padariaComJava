package telas;

import javax.swing.JOptionPane;

public class NewJFrameTelaMenu extends javax.swing.JFrame {

    public NewJFrameTelaMenu() {
        initComponents();
    }

    public NewJFrameTelaMenu(String nome, String cargo) {
        initComponents();
        if (cargo.equalsIgnoreCase("Caixa") || cargo.equalsIgnoreCase("Balconista")) {
            verificaCargoUsuario();
            lblSaudacao.setText("Welcome ," + nome);
        } else if (cargo.equalsIgnoreCase("Gerente")) {
            lblSaudacao.setText("Welcome " + cargo + ":" + nome);
        }
    }

    private void verificaCargoUsuario() {
        itmRelatoriosProdutos.setEnabled(true);
        itmCadastrarProdutos.setEnabled(false);
        itmAlterarProdutos.setEnabled(false);
        itmExcluirProdutos.setEnabled(false);
        itmCadastrarFuncionario.setEnabled(false);
        imtAtualizarFuncionario.setEnabled(false);
        itmExcluirFuncionario.setEnabled(false);
        itmRelatorioFuncionario.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        barMenu = new javax.swing.JMenuBar();
        mnuProdutos = new javax.swing.JMenu();
        itmCadastrarProdutos = new javax.swing.JMenuItem();
        itmAlterarProdutos = new javax.swing.JMenuItem();
        itmExcluirProdutos = new javax.swing.JMenuItem();
        itmRelatoriosProdutos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionario = new javax.swing.JMenuItem();
        itmExcluirFuncionario = new javax.swing.JMenuItem();
        imtAtualizarFuncionario = new javax.swing.JMenuItem();
        itmRelatorioFuncionario = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        getContentPane().setLayout(null);

        lblSaudacao.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(220, 0, 190, 30);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Residencia\\Desktop\\pane-scaled-1-600x400.jpg")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -20, 410, 320);

        mnuProdutos.setMnemonic('P');
        mnuProdutos.setText("Produtos");
        mnuProdutos.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N

        itmCadastrarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, 0));
        itmCadastrarProdutos.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmCadastrarProdutos.setText("Cadastrar");
        itmCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmCadastrarProdutos);

        itmAlterarProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, 0));
        itmAlterarProdutos.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmAlterarProdutos.setText("Alterar");
        itmAlterarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmAlterarProdutos);

        itmExcluirProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, 0));
        itmExcluirProdutos.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmExcluirProdutos.setText("Excluir");
        itmExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmExcluirProdutos);

        itmRelatoriosProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, 0));
        itmRelatoriosProdutos.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmRelatoriosProdutos.setText("Relatórios");
        itmRelatoriosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatoriosProdutosActionPerformed(evt);
            }
        });
        mnuProdutos.add(itmRelatoriosProdutos);

        barMenu.add(mnuProdutos);

        mnuFuncionarios.setMnemonic('F');
        mnuFuncionarios.setText("Funcionários");
        mnuFuncionarios.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N

        itmCadastrarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DOWN, 0));
        itmCadastrarFuncionario.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmCadastrarFuncionario.setText("Cadastrar ");
        itmCadastrarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        itmCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionarioActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionario);

        itmExcluirFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_UP, 0));
        itmExcluirFuncionario.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmExcluirFuncionario.setText("Excluir ");
        itmExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionarioActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmExcluirFuncionario);

        imtAtualizarFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, 0));
        imtAtualizarFuncionario.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        imtAtualizarFuncionario.setText("Atualizar");
        imtAtualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imtAtualizarFuncionarioActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(imtAtualizarFuncionario);

        itmRelatorioFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_RIGHT, 0));
        itmRelatorioFuncionario.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmRelatorioFuncionario.setText("Relatórios");
        itmRelatorioFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRelatorioFuncionarioActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmRelatorioFuncionario);

        barMenu.add(mnuFuncionarios);

        mnuAjuda.setMnemonic('A');
        mnuAjuda.setText("Ajuda");
        mnuAjuda.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N

        itmManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmManual.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        itmManual.setText("Manual");
        mnuAjuda.add(itmManual);

        barMenu.add(mnuAjuda);

        setJMenuBar(barMenu);

        setSize(new java.awt.Dimension(426, 357));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRelatoriosProdutosActionPerformed

    private void itmCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarFuncionarioActionPerformed

    private void itmExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirFuncionarioActionPerformed

    private void imtAtualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imtAtualizarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imtAtualizarFuncionarioActionPerformed

    private void itmRelatorioFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatorioFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmRelatorioFuncionarioActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameTelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenu;
    private javax.swing.JMenuItem imtAtualizarFuncionario;
    private javax.swing.JMenuItem itmAlterarProdutos;
    private javax.swing.JMenuItem itmCadastrarFuncionario;
    private javax.swing.JMenuItem itmCadastrarProdutos;
    private javax.swing.JMenuItem itmExcluirFuncionario;
    private javax.swing.JMenuItem itmExcluirProdutos;
    private javax.swing.JMenuItem itmManual;
    private javax.swing.JMenuItem itmRelatorioFuncionario;
    private javax.swing.JMenuItem itmRelatoriosProdutos;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    // End of variables declaration//GEN-END:variables
}
