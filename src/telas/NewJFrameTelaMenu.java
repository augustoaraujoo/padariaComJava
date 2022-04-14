package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class NewJFrameTelaMenu extends javax.swing.JFrame {

    public NewJFrameTelaMenu() {
        initComponents();
    }

    public NewJFrameTelaMenu(String nome, String cargo) {
        initComponents();
        initializeMethodSetFalse();

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

    private void initializeMethodSetFalse() {
        pnlCadastrarProdutos.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSaudacao = new javax.swing.JLabel();
        pnlCadastrarProdutos = new javax.swing.JPanel();
        lblPrecoProduto = new javax.swing.JLabel();
        txtPrecoProduto = new javax.swing.JTextField();
        lblCodigoProduto = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        lblMarcaProduto = new javax.swing.JLabel();
        txtCodigoProduto = new javax.swing.JTextField();
        txtCategoriaProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
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

        lblSaudacao.setBackground(new java.awt.Color(51, 51, 51));
        lblSaudacao.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        lblSaudacao.setForeground(new java.awt.Color(0, 151, 224));
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(220, 0, 190, 30);

        pnlCadastrarProdutos.setLayout(null);

        lblPrecoProduto.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        lblPrecoProduto.setText("preço do produto");
        pnlCadastrarProdutos.add(lblPrecoProduto);
        lblPrecoProduto.setBounds(10, 140, 110, 30);

        txtPrecoProduto.setBackground(new java.awt.Color(204, 204, 204));
        txtPrecoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoProdutoActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtPrecoProduto);
        txtPrecoProduto.setBounds(130, 140, 150, 30);

        lblCodigoProduto.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        lblCodigoProduto.setText("Código do produto");
        pnlCadastrarProdutos.add(lblCodigoProduto);
        lblCodigoProduto.setBounds(10, 20, 110, 30);

        lblNomeProduto.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        lblNomeProduto.setText("Nome do produto");
        pnlCadastrarProdutos.add(lblNomeProduto);
        lblNomeProduto.setBounds(10, 60, 110, 30);

        lblMarcaProduto.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        lblMarcaProduto.setText("Categoria  produto");
        pnlCadastrarProdutos.add(lblMarcaProduto);
        lblMarcaProduto.setBounds(10, 100, 110, 30);

        txtCodigoProduto.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProdutoActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtCodigoProduto);
        txtCodigoProduto.setBounds(130, 20, 150, 30);

        txtCategoriaProduto.setBackground(new java.awt.Color(204, 204, 204));
        txtCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProdutoActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(txtCategoriaProduto);
        txtCategoriaProduto.setBounds(130, 100, 150, 30);

        txtNomeProduto.setBackground(new java.awt.Color(204, 204, 204));
        pnlCadastrarProdutos.add(txtNomeProduto);
        txtNomeProduto.setBounds(130, 60, 150, 30);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnCadastrar);
        btnCadastrar.setBounds(130, 180, 100, 30);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        pnlCadastrarProdutos.add(btnConsultar);
        btnConsultar.setBounds(10, 180, 100, 30);

        getContentPane().add(pnlCadastrarProdutos);
        pnlCadastrarProdutos.setBounds(0, 40, 410, 240);

        lblBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Residencia\\Desktop\\pane-scaled-1-600x400.jpg")); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -20, 410, 330);

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
        pnlCadastrarProdutos.setVisible(true);
        btnConsultar.setVisible(false);
        btnCadastrar.setVisible(true);
    }//GEN-LAST:event_itmCadastrarProdutosActionPerformed

    private void itmAlterarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarProdutosActionPerformed
    }//GEN-LAST:event_itmAlterarProdutosActionPerformed

    private void itmExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirProdutosActionPerformed

    private void itmRelatoriosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRelatoriosProdutosActionPerformed

        pnlCadastrarProdutos.setVisible(true);
        btnCadastrar.setVisible(false);
        btnConsultar.setVisible(true);


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
        //método ... /

    }//GEN-LAST:event_itmRelatorioFuncionarioActionPerformed

    private void txtCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProdutoActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Connection conexao;
        PreparedStatement st;
        ResultSet rs;

        if (txtCodigoProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO NOME VAZIO | INVÁLIDO ");
            return;
        }

        if (txtPrecoProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO CAMPO VAZIO ");
            return;
        }
        if (txtNomeProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO CAMPO VAZIO ");
            return;

        }
        if (txtCategoriaProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ERRO CAMPO VAZIO ");
            return;
        }

        try {
            Class.forName("org.postgresql.Driver");
            try {
                conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/padaria", "postgres", "root");
                st = conexao.prepareStatement("INSERT INTO PRODUTOS VALUES (?,?,?,?)");

                st.setString(1, txtCategoriaProduto.getText().trim());
                st.setString(2, txtNomeProduto.getText().trim());
                st.setDouble(3, Double.parseDouble(txtPrecoProduto.getText().trim()));
                st.setString(4, txtCodigoProduto.getText().trim());
                st.executeUpdate();

            } catch (SQLException ex) {
                if (ex.getErrorCode() == 0) {
                    JOptionPane.showMessageDialog(null, " ERRO: O Código já existe " + "crie outro" + ex.getMessage() + ex.getErrorCode());
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, " ERRO " + ex.getMessage() + ex.getErrorCode());
                    return;
                }
            }

        } catch (ClassNotFoundException ex) {
            //0 in postgres error / duplicate primary key

            JOptionPane.showMessageDialog(null, " erro " + ex.getMessage());
            return;
        }

        txtCategoriaProduto.setText("");
        txtNomeProduto.setText("");
        txtPrecoProduto.setText("");
        txtCodigoProduto.setText("");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtPrecoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoProdutoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if (txtCodigoProduto.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o código do produto");
            txtCodigoProduto.requestFocus();
            return;
        }
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet rs;

            Class.forName("org.postgresql.Driver");

            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/padaria", "postgres", "root");
            st = conexao.prepareStatement("SELECT * FROM produtos where código_produto=?");
            System.out.println("nome_produto");

            st.setString(1, txtCodigoProduto.getText());
            rs = st.executeQuery();

            if (rs.next()) {
                txtNomeProduto.setText(rs.getString("nome_produto"));
                txtCategoriaProduto.setText(rs.getString("categoria_produto"));
                txtPrecoProduto.setText(rs.getString("preço_produto"));

            } else {
                JOptionPane.showMessageDialog(null, "Produto n”ao encontrado");
                txtCodigoProduto.requestFocus();
                return;
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca");
            return;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto");
            return;
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProdutoActionPerformed

    }//GEN-LAST:event_txtCategoriaProdutoActionPerformed

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
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultar;
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
    private javax.swing.JLabel lblCodigoProduto;
    private javax.swing.JLabel lblMarcaProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblPrecoProduto;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuProdutos;
    private javax.swing.JPanel pnlCadastrarProdutos;
    private javax.swing.JTextField txtCategoriaProduto;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPrecoProduto;
    // End of variables declaration//GEN-END:variables
}
