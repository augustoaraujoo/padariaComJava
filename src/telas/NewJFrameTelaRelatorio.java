package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrameTelaRelatorio extends javax.swing.JFrame {

    DefaultTableModel defTable;

    public NewJFrameTelaRelatorio() {
        initComponents();

        txtNomeProduto.setVisible(false);
        lblNome.setVisible(false);
        txtCategoriaProduto.setVisible(false);
        lblCategoriaProduto.setVisible(false);
        defTable = (DefaultTableModel) tableProdutos.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbOpcoes = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        txtCategoriaProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCategoriaProduto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        cmbOpcoes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "geral", "categoria", "nome" }));
        cmbOpcoes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOpcoesItemStateChanged(evt);
            }
        });
        cmbOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbOpcoes);
        cmbOpcoes.setBounds(100, 20, 100, 25);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(280, 65, 90, 30);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Categoria", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 119, 400, 260);

        txtCategoriaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategoriaProduto);
        txtCategoriaProduto.setBounds(140, 70, 110, 22);

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeProduto);
        txtNomeProduto.setBounds(140, 70, 107, 22);

        lblNome.setText("Nome produto");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 70, 120, 16);

        lblCategoriaProduto.setText("Categoria Produto");
        getContentPane().add(lblCategoriaProduto);
        lblCategoriaProduto.setBounds(20, 70, 120, 16);

        jLabel1.setText("Opções");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 53, 16);

        setSize(new java.awt.Dimension(416, 415));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCategoriaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaProdutoActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // pegar tipo cmb
        // dados input
        // retornar no tableLista

        String tipo;
        tipo = cmbOpcoes.getSelectedItem().toString();

        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5433/padaria", "postgres", "root");

            if (tipo.equalsIgnoreCase("geral")) {
                st = conexao.prepareStatement("SELECT * FROM produtos");
                resultado = st.executeQuery();
                
                defTable.setRowCount(0);
                
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("código_produto"), resultado.getString("nome_produto"), resultado.getString("categoria_produto"), resultado.getString("preço_produto")};
                    defTable.addRow(linha);
                }
            } else if (tipo.equalsIgnoreCase("categoria")) {
                st = conexao.prepareStatement("SELECT * FROM produtos WHERE categoria_produto=?");
                
                st.setString(1, txtCategoriaProduto.getText());
                
                resultado = st.executeQuery();
                
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("código_produto"), resultado.getString("nome_produto"), resultado.getString("categoria_produto"), resultado.getString("preço_produto")};
                    defTable.addRow(linha);
                }
            } else if (tipo.equalsIgnoreCase("nome")) {
                
                st = conexao.prepareStatement("SELECT * FROM produtos WHERE nome_produto=?");
                
                st.setString(1, txtNomeProduto.getText());
                
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("código_produto"), resultado.getString("nome_produto"), resultado.getString("categoria_produto"), resultado.getString("preço_produto")};
                    defTable.addRow(linha);
                }
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Você não tem o driver na biblioteca " + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Algum parâmetro do BD está incorreto" + ex.getMessage());
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcoesActionPerformed


    }//GEN-LAST:event_cmbOpcoesActionPerformed

    private void cmbOpcoesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOpcoesItemStateChanged

        String tipo;
        tipo = cmbOpcoes.getSelectedItem().toString();
        if (tipo.equalsIgnoreCase("categoria")) {
            txtNomeProduto.setVisible(false);
            lblNome.setVisible(false);
            txtCategoriaProduto.setVisible(true);
            lblCategoriaProduto.setVisible(true);

        } else if (tipo.equalsIgnoreCase("nome")) {
            txtNomeProduto.setVisible(true);
            lblNome.setVisible(true);
            txtCategoriaProduto.setVisible(false);
            lblCategoriaProduto.setVisible(false);

        } else if (tipo.equalsIgnoreCase("geral")) {
            txtNomeProduto.setVisible(false);
            lblNome.setVisible(false);
            txtCategoriaProduto.setVisible(false);
            lblCategoriaProduto.setVisible(false);

        }
    }//GEN-LAST:event_cmbOpcoesItemStateChanged

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
            java.util.logging.Logger.getLogger(NewJFrameTelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameTelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameTelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbOpcoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoriaProduto;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtCategoriaProduto;
    private javax.swing.JTextField txtNomeProduto;
    // End of variables declaration//GEN-END:variables
}
