package view;

// Sessão importação.
import javax.swing.JDialog;

/**
 * Classe que define a tela ~ Listagem de Projeto(s).
 * @author Vinicius Tavano Ferreira.
 * @since Classe criada em 07/09/2017.
 */
public class ViewListagem extends JDialog {

    /**
     * Creates new form FrameListagemPacientes
     * @param lista
     * @param owner
     * @param modal
     */
    public ViewListagem(String lista, java.awt.Frame owner, boolean modal) {
        super(owner, modal);
        initComponents();
        taListagemProjetos.setText(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListagemProjetos = new javax.swing.JTextArea();
        lbListagemOrcamentos = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        btFecharListagem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        taListagemProjetos.setEditable(false);
        taListagemProjetos.setColumns(20);
        taListagemProjetos.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taListagemProjetos.setForeground(new java.awt.Color(0, 153, 255));
        taListagemProjetos.setRows(5);
        jScrollPane1.setViewportView(taListagemProjetos);

        lbListagemOrcamentos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbListagemOrcamentos.setForeground(new java.awt.Color(102, 102, 102));
        lbListagemOrcamentos.setText("Listagem ");

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(lbListagemOrcamentos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbListagemOrcamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        painelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btFecharListagem.setText("Fechar");
        btFecharListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharListagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btFecharListagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btFecharListagem)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(546, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btFecharListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharListagemActionPerformed
        dispose();
    }//GEN-LAST:event_btFecharListagemActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFecharListagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbListagemOrcamentos;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTextArea taListagemProjetos;
    // End of variables declaration//GEN-END:variables
}
