package com.cfp.views;

// Sessão de importação.
import com.cfp.controllers.ControllerReceita;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.cfp.models.Receita;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.cfp.models.User;
import com.cfp.utils.DocumentoLimitado;

/**
 * Classe que define a tela ~ Receita.
 * @author Vinicius Tavano Ferreira.
 * @since Classe criada em 07/09/2018.
 */
public class ViewReceita extends javax.swing.JFrame {

    private List<Receita> receitas;
    private Receita receita;
    private final User user;

    /**
     * Creates new form FormProjeto
     * @param user
     */
    public ViewReceita(User user) {
        initComponents();
        this.user = user;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        setLocation(400, 100);//(x,y)
        this.setLocationRelativeTo(null);
        tfCodigo.setEditable(true);
        this.atualizarTabela();
        this.btExcluir.setEnabled(false);
        this.btLimpar.setEnabled(false);
        tfDescricao.setDocument(new DocumentoLimitado(25));
    }

    private ViewReceita() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelProjeto = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbAtivo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        cbAtivo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbReceita = new javax.swing.JTable();
        painelBotoes = new javax.swing.JPanel();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        btListagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 255, 51));
        setLocation(new java.awt.Point(400, 100));
        setResizable(false);

        painelProjeto.setBackground(new java.awt.Color(255, 255, 255));
        painelProjeto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados da Receita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(102, 102, 102))); // NOI18N

        lbCodigo.setForeground(new java.awt.Color(0, 153, 255));
        lbCodigo.setText("Código:");

        lbDescricao.setForeground(new java.awt.Color(0, 153, 255));
        lbDescricao.setText("Descrição:");

        lbAtivo.setForeground(new java.awt.Color(0, 153, 255));
        lbAtivo.setText("Ativo:");

        tfCodigo.setBackground(new java.awt.Color(227, 218, 218));
        tfCodigo.setFocusable(false);

        cbAtivo.setBackground(new java.awt.Color(255, 255, 204));
        cbAtivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "N" }));
        cbAtivo.setSelectedIndex(-1);
        cbAtivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAtivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelProjetoLayout = new javax.swing.GroupLayout(painelProjeto);
        painelProjeto.setLayout(painelProjetoLayout);
        painelProjetoLayout.setHorizontalGroup(
            painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProjetoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelProjetoLayout.createSequentialGroup()
                        .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(lbDescricao))
                        .addGap(79, 79, 79)
                        .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelProjetoLayout.setVerticalGroup(
            painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelProjetoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAtivo)
                    .addComponent(cbAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbReceita.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbReceita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descrição", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbReceita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReceitaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbReceita);
        if (tbReceita.getColumnModel().getColumnCount() > 0) {
            tbReceita.getColumnModel().getColumn(0).setMinWidth(60);
            tbReceita.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));
        painelBotoes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(0, 153, 255));
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("Incluir ou modificar uma receita");
        btSalvar.setName("btSalvar"); // NOI18N
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(0, 153, 255));
        btExcluir.setText("Excluir");
        btExcluir.setToolTipText("Deletar uma receita");
        btExcluir.setName("btSalvar"); // NOI18N
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(0, 153, 255));
        btLimpar.setText("Limpar");
        btLimpar.setToolTipText("Limpar os campos da tela");
        btLimpar.setName("btSalvar"); // NOI18N
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenu.setForeground(new java.awt.Color(0, 153, 255));
        btMenu.setText("Voltar");
        btMenu.setToolTipText("Voltar à tela de menu");
        btMenu.setName("btSalvar"); // NOI18N
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        btListagem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btListagem.setForeground(new java.awt.Color(0, 153, 255));
        btListagem.setText("Listagem");
        btListagem.setToolTipText("Listar todas as receitas");
        btListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btListagem)
                .addGap(26, 26, 26)
                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btMenu)
                    .addComponent(btListagem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(495, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        this.salvarProjeto();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbProjetoVetoableChange(java.beans.PropertyChangeEvent evt) throws java.beans.PropertyVetoException {
        System.out.println("Printando");
    }

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        this.removerProjeto();
        this.limparCampos();
        this.atualizarTabela();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        this.limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        //Invoca a tela ~ Cockpit.
        new ViewMenu(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void tbReceitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReceitaMouseClicked
        int row = this.tbReceita.getSelectedRow();
        this.receita = this.receitas.get(row);
        this.popularCampos();
    }//GEN-LAST:event_tbReceitaMouseClicked

    private void btListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListagemActionPerformed
//        ResultSet rs;
        String listagem = "Código\t\t\tDescrição\t\t\tAtivo";
        listagem = listagem + "\n================================================================";
        try{
            List<Receita> listaReceitas = ControllerReceita.buscarListaReceitas();
            for (Receita p : listaReceitas) {
                listagem = listagem + "\n"
                        + p.getIntCodigo().toString() + "\t\t\t"
                        + p.getStrDescricao() + "\t\t"
                        + p.getStrAtivo();
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Banco de Dados!");
        }
        

        
        
//        try {
//            rs = ControllerReceita.buscarTodasReceitas();
//            while (rs.next()) {
//                listagem = listagem + "\n"
//                        + rs.getString("codigo") + "\t"
//                        + rs.getString("descricao") + "\t\t"
//                        + rs.getString("ativo");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ViewReceita.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewReceita.class.getName()).log(Level.SEVERE, null, ex);
//        }
        ViewListagem flp = new ViewListagem(listagem, this, true);
        flp.setVisible(true);

    }//GEN-LAST:event_btListagemActionPerformed

    private void cbAtivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAtivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAtivoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReceita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReceita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btListagem;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbAtivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAtivo;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelProjeto;
    private javax.swing.JTable tbReceita;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    // End of variables declaration//GEN-END:variables

    private void salvarProjeto() {
        if (!isCamposValidos()) {
            return;
        }
        
        Integer codigo = tfCodigo.getText().isEmpty() ? null : Integer.parseInt(tfCodigo.getText());
        String nome = this.tfDescricao.getText();
        String etapa = (String) this.cbAtivo.getSelectedItem();

        if (this.receita == null) {
            this.receita = new Receita();
        }
        this.receita.setIntCodigo(codigo);
        this.receita.setStrDescricao(nome);
        this.receita.setStrAtivo(etapa);

        try {
            ControllerReceita.inserirProjeto(this.receita);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ViewReceita.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparCampos();
        this.atualizarTabela();
    }

    private void removerProjeto() {
        Integer codProjeto = Integer.parseInt(tfCodigo.getText());
        try {
            ControllerReceita.excluirProjeto(codProjeto);
        } catch (SQLException ex) {
            Logger.getLogger(ViewReceita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ViewReceita.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limparCampos();
    }
  
    private void limparCampos() {
        this.tfCodigo.setText("");
        this.tfDescricao.setText("");
        this.cbAtivo.setSelectedIndex(-1);

        this.tfCodigo.setEnabled(true);
        this.btExcluir.setEnabled(false);
        this.btLimpar.setEnabled(false);

    }

    private boolean isCamposValidos() {
        boolean isValido = false;

        if (this.tfDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome é obrigatório");
        } else if (this.cbAtivo.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(this, "Etapa é obrigatório");
        } else {
            isValido = true;
        }
        return isValido;
    }

    private void atualizarTabela() {
        String[] colunas = {"Código", "Descrição", "Ativo"};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(colunas);

        try {
            this.receitas = ControllerReceita.lista();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        for (Receita p : this.receitas) {
            tableModel.addRow(p.getValueAsObject());
        }
        this.tbReceita.setModel(tableModel);
    }

    private void popularCampos() {

        if (this.receita != null) {
            this.tfCodigo.setText(this.receita.getIntCodigo().toString());
            this.tfDescricao.setText(this.receita.getStrDescricao());
            this.cbAtivo.setSelectedItem(this.receita.getStrAtivo());
        }
        
        this.btExcluir.setEnabled(true);
        this.btLimpar.setEnabled(true);
        this.tfCodigo.setEnabled(false);
    }

}//fim do ViewReceita