package com.cfp.views;

//Sessão de importação.
import com.cfp.controllers.ControllerRecurso;
import com.cfp.controllers.ControllerAtividade;
import com.cfp.controllers.ControllerReceita;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import com.cfp.models.User;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JRResultSetDataSource;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JasperViewer;

/**
 * Classe que define a tela ~ Acesso.
 * @author Vinicius Tavano Ferreira
 * @since Classe criada em 20/08/2017
 */
public class ViewMenuRelatorio extends javax.swing.JFrame {

    User user = new User();  
    
    public ViewMenuRelatorio(User user) {
        initComponents();
        this.user = user;
        this.lbCodUser.setText(this.user.getCodUser());
        this.lbDescName.setText(this.user.getDescName());
    }

    private ViewMenuRelatorio() {
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

        painelCabMenu = new javax.swing.JPanel();
        lbCabecalhoMenu = new javax.swing.JLabel();
        painelLinhaMenu = new javax.swing.JPanel();
        painelMenu = new javax.swing.JPanel();
        painelBotoes = new javax.swing.JPanel();
        btPercentual = new javax.swing.JButton();
        btProjeto = new javax.swing.JButton();
        btOrcamento = new javax.swing.JButton();
        btProjetoRecurso = new javax.swing.JButton();
        btHoraProjeto = new javax.swing.JButton();
        btRecurso = new javax.swing.JButton();
        painelCabNomeRE = new javax.swing.JPanel();
        lbOla = new javax.swing.JLabel();
        lbCodNameDesc = new javax.swing.JLabel();
        lbCodUser = new javax.swing.JLabel();
        lbDescName = new javax.swing.JLabel();
        lbBusinessMan = new javax.swing.JLabel();
        btMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        painelCabMenu.setBackground(new java.awt.Color(255, 255, 255));

        lbCabecalhoMenu.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        lbCabecalhoMenu.setForeground(new java.awt.Color(0, 153, 255));
        lbCabecalhoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCabecalhoMenu.setText("Relatório(s)");
        lbCabecalhoMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        painelLinhaMenu.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout painelLinhaMenuLayout = new javax.swing.GroupLayout(painelLinhaMenu);
        painelLinhaMenu.setLayout(painelLinhaMenuLayout);
        painelLinhaMenuLayout.setHorizontalGroup(
            painelLinhaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelLinhaMenuLayout.setVerticalGroup(
            painelLinhaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout painelCabMenuLayout = new javax.swing.GroupLayout(painelCabMenu);
        painelCabMenu.setLayout(painelCabMenuLayout);
        painelCabMenuLayout.setHorizontalGroup(
            painelCabMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLinhaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCabecalhoMenu)
                .addContainerGap())
        );
        painelCabMenuLayout.setVerticalGroup(
            painelCabMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbCabecalhoMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelLinhaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        painelMenu.setBackground(new java.awt.Color(255, 255, 255));

        painelBotoes.setBackground(new java.awt.Color(255, 255, 255));
        painelBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        btPercentual.setBackground(new java.awt.Color(102, 102, 102));
        btPercentual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btPercentual.setForeground(new java.awt.Color(255, 255, 255));
        btPercentual.setText("Percentuais");
        btPercentual.setToolTipText("Click para exibir o relatório");
        btPercentual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPercentualActionPerformed(evt);
            }
        });

        btProjeto.setBackground(new java.awt.Color(102, 102, 102));
        btProjeto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btProjeto.setForeground(new java.awt.Color(255, 255, 255));
        btProjeto.setText("Projetos");
        btProjeto.setToolTipText("Click para exibir o relatório");
        btProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProjetoActionPerformed(evt);
            }
        });

        btOrcamento.setBackground(new java.awt.Color(102, 102, 102));
        btOrcamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btOrcamento.setForeground(new java.awt.Color(255, 255, 255));
        btOrcamento.setText("Atividades");
        btOrcamento.setToolTipText("Click para exibir o relatório");
        btOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOrcamentoActionPerformed(evt);
            }
        });

        btProjetoRecurso.setBackground(new java.awt.Color(102, 102, 102));
        btProjetoRecurso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btProjetoRecurso.setForeground(new java.awt.Color(255, 255, 255));
        btProjetoRecurso.setText("Alocação");
        btProjetoRecurso.setToolTipText("Click para exibir o relatório");
        btProjetoRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProjetoRecursoActionPerformed(evt);
            }
        });

        btHoraProjeto.setBackground(new java.awt.Color(102, 102, 102));
        btHoraProjeto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btHoraProjeto.setForeground(new java.awt.Color(255, 255, 255));
        btHoraProjeto.setText("Horas Estimadas");
        btHoraProjeto.setToolTipText("Click para exibir o relatório");
        btHoraProjeto.setPreferredSize(new java.awt.Dimension(213, 27));
        btHoraProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoraProjetoActionPerformed(evt);
            }
        });

        btRecurso.setBackground(new java.awt.Color(102, 102, 102));
        btRecurso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btRecurso.setForeground(new java.awt.Color(255, 255, 255));
        btRecurso.setText("Recursos");
        btRecurso.setToolTipText("Click para exibir o relatório");
        btRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addComponent(btPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btHoraProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btProjetoRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btOrcamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btProjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btHoraProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btProjetoRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        painelCabNomeRE.setBackground(new java.awt.Color(255, 255, 255));
        painelCabNomeRE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        lbOla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbOla.setForeground(new java.awt.Color(102, 102, 102));
        lbOla.setText("Olá,");

        lbCodNameDesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbCodNameDesc.setForeground(new java.awt.Color(102, 102, 102));
        lbCodNameDesc.setText("ID:");

        lbCodUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbCodUser.setForeground(new java.awt.Color(102, 102, 102));
        lbCodUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbCodUser.setText("ID");

        lbDescName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbDescName.setForeground(new java.awt.Color(102, 102, 102));
        lbDescName.setText("Nome Usuario");

        lbBusinessMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman72.png"))); // NOI18N

        javax.swing.GroupLayout painelCabNomeRELayout = new javax.swing.GroupLayout(painelCabNomeRE);
        painelCabNomeRE.setLayout(painelCabNomeRELayout);
        painelCabNomeRELayout.setHorizontalGroup(
            painelCabNomeRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabNomeRELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBusinessMan)
                .addGap(18, 18, 18)
                .addComponent(lbOla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescName, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lbCodNameDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelCabNomeRELayout.setVerticalGroup(
            painelCabNomeRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabNomeRELayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(painelCabNomeRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBusinessMan, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCabNomeRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodNameDesc)
                        .addComponent(lbOla)
                        .addComponent(lbDescName)
                        .addComponent(lbCodUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btMenu.setBackground(new java.awt.Color(102, 102, 102));
        btMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMenu.setForeground(new java.awt.Color(255, 255, 255));
        btMenu.setText("Voltar");
        btMenu.setToolTipText("Voltar à tela de menu");
        btMenu.setName("btSalvar"); // NOI18N
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGroup(painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMenuLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelMenuLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(painelCabNomeRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(painelCabNomeRE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btMenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCabMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelCabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(777, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        //Invoca a tela ~ Cockpit.
        new ViewAtividade(this.user).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btMenuActionPerformed

    private void btProjetoRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProjetoRecursoActionPerformed
//        ResultSet rs;
//        try {
//            JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
//            Map parametros = new HashMap();
//            
//            //rs = ControllerRecurso.buscarTodosFuncionarios();
//            rs = ControllerRecurso.buscarHorasEstimadasEmProjetos();
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//            //JasperReport relProjetos = JasperCompileManager.compileReport("C:\\Users\\vtffa\\Desktop\\Projeto POO Av - P2\\Divisão de trabalho entre equipe de desenvolvedores de software ~ V.03.01\\src\\report\\MyReports\\bin\\ResourceReport.jrxml");
//            //JasperPrint impressao = JasperFillManager.fillReport(relProjetos, null, jrRS);
//            // O código abaixo irá invocar o formulário em modo binário e não trará as expressões condicionais definidas no .jrxml.
//            
//            Object con = ControllerRecurso.getConnection();
//            parametros.put("REPORT_CONNECTION",con);
//
//            JasperPrint impressao = JasperFillManager.fillReport("C:\\Users\\vtffa\\Desktop\\TCC\\EngSoft\\src\\report\\MyReports\\AlocacaoRecursoBarChart.jasper", parametros, jrRS);
//            JasperViewer jrViewer = new JasperViewer(impressao,false);
//            //jrViewer.setVisible(true);
//            //jrViewer.toFront();
//            viewer.setSize(1200,750); 
//            viewer.setLocationRelativeTo(null); 
//            viewer.getContentPane().add(jrViewer.getContentPane()); 
//            viewer.setVisible(true); 
//        } catch (SQLException | JRException ex) {
//            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewMenuRelatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btProjetoRecursoActionPerformed

    private void btHoraProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoraProjetoActionPerformed
//        ResultSet rs;
//        try { 
//            JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
//            Map parametros = new HashMap();
//            // trocar para ControllerAtividade
//            rs = ControllerReceita.buscarHorasProjetos();
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//            //JasperReport relProjetos = JasperCompileManager.compileReport("C:\\Users\\vtffa\\Desktop\\Projeto POO Av - P2\\Divisão de trabalho entre equipe de desenvolvedores de software ~ V.03.01\\src\\report\\MyReports\\bin\\ProjetosRecursos.jrxml");
//            //JasperPrint impressao = JasperFillManager.fillReport(relProjetos, null, jrRS);
//            // O código abaixo irá invocar o formulário em modo binário e não trará as expressões condicionais definidas no .jrxml.
//
//            Object con = ControllerReceita.getConnection();
//            parametros.put("REPORT_CONNECTION",con);
//
//            JasperPrint impressao = JasperFillManager.fillReport("C:\\Users\\vtffa\\Desktop\\TCC\\EngSoft\\src\\report\\MyReports\\AtuacaoProjeto.jasper", parametros, jrRS);
//            JasperViewer jrViewer = new JasperViewer(impressao,false);
//             
//            viewer.setSize(1200,750);  
//            viewer.setLocationRelativeTo(null); 
//            viewer.getContentPane().add(jrViewer.getContentPane()); 
//            viewer.setVisible(true); 
//            //jrViewer.setVisible(true);
//            //jrViewer.toFront(); 
//        } catch (SQLException | JRException ex) {
//            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewMenuRelatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btHoraProjetoActionPerformed

    private void btOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOrcamentoActionPerformed
//        ResultSet rs;
//        try { 
//            JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
//            Map parametros = new HashMap();
//            // trocar para ControllerAtividade
//            rs = ControllerReceita.buscarAtividadesRecursos();
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//            //JasperReport relProjetos = JasperCompileManager.compileReport("C:\\Users\\vtffa\\Desktop\\Projeto POO Av - P2\\Divisão de trabalho entre equipe de desenvolvedores de software ~ V.03.01\\src\\report\\MyReports\\bin\\ProjetosRecursos.jrxml");
//            //JasperPrint impressao = JasperFillManager.fillReport(relProjetos, null, jrRS);
//            // O código abaixo irá invocar o formulário em modo binário e não trará as expressões condicionais definidas no .jrxml.
//
//            Object con = ControllerReceita.getConnection();
//            parametros.put("REPORT_CONNECTION",con);
//
//            JasperPrint impressao = JasperFillManager.fillReport("C:\\Users\\vtffa\\Desktop\\TCC\\EngSoft\\src\\report\\MyReports\\AtividadesRecursos.jasper", parametros, jrRS);
//            JasperViewer jrViewer = new JasperViewer(impressao,false);
//             
//            viewer.setSize(1200,750);  
//            viewer.setLocationRelativeTo(null); 
//            viewer.getContentPane().add(jrViewer.getContentPane()); 
//            viewer.setVisible(true); 
//            //jrViewer.setVisible(true);
//            //jrViewer.toFront(); 
//        } catch (SQLException | JRException ex) {
//            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewMenuRelatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btOrcamentoActionPerformed

    private void btProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProjetoActionPerformed
//        ResultSet rs;
//        try {
//            JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
//            Map parametros = new HashMap();
//            
//            rs = ControllerReceita.buscarTodasReceitas();
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//            //JasperReport relProjetos = JasperCompileManager.compileReport("C:\\Users\\vtffa\\Desktop\\Projeto POO Av - P2\\Divisão de trabalho entre equipe de desenvolvedores de software ~ V.03.01\\src\\report\\MyReports\\bin\\ProjetoReal.jrxml");
//            //JasperPrint impressao = JasperFillManager.fillReport(relProjetos, null, jrRS);
//            // O código abaixo irá invocar o formulário em modo binário e não trará as expressões condicionais definidas no .jrxml.
//            
//            Object con = ControllerReceita.getConnection();
//            parametros.put("REPORT_CONNECTION",con);
//
//            JasperPrint impressao = JasperFillManager.fillReport("C:\\Users\\vtffa\\Desktop\\TCC\\EngSoft\\src\\report\\MyReports\\ProjectsList.jasper", parametros, jrRS);
//            JasperViewer jrViewer = new JasperViewer(impressao,false);
//            //jrViewer.setVisible(true);
//            //jrViewer.toFront();
//            viewer.setSize(1200,750); 
//            viewer.setLocationRelativeTo(null); 
//            viewer.getContentPane().add(jrViewer.getContentPane()); 
//            viewer.setVisible(true); 
//        } catch (SQLException | JRException ex) {
//            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewMenuRelatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btProjetoActionPerformed

    private void btPercentualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPercentualActionPerformed
//        ResultSet rs;
//        try {
//            JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
//            Map parametros = new HashMap();
//            
//            //rs = ControllerRecurso.buscarTodosFuncionarios();
//            rs = ControllerRecurso.buscarHorasEstimadasEmProjetos();
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//            //JasperReport relProjetos = JasperCompileManager.compileReport("C:\\Users\\vtffa\\Desktop\\Projeto POO Av - P2\\Divisão de trabalho entre equipe de desenvolvedores de software ~ V.03.01\\src\\report\\MyReports\\bin\\ResourceReport.jrxml");
//            //JasperPrint impressao = JasperFillManager.fillReport(relProjetos, null, jrRS);
//            // O código abaixo irá invocar o formulário em modo binário e não trará as expressões condicionais definidas no .jrxml.
//            
//            Object con = ControllerRecurso.getConnection();
//            parametros.put("REPORT_CONNECTION",con);
//
//            JasperPrint impressao = JasperFillManager.fillReport("C:\\Users\\vtffa\\Desktop\\Controle Financeiro Pessoal\\Controle Financeiro Pessoal - Desktop\\src\\report\\MyReports\\RecursoProjetoBarChart.jasper", parametros, jrRS);
//            JasperViewer jrViewer = new JasperViewer(impressao,false);
//            //jrViewer.setVisible(true);
//            //jrViewer.toFront();
//            viewer.setSize(1200,750); 
//            viewer.setLocationRelativeTo(null); 
//            viewer.getContentPane().add(jrViewer.getContentPane()); 
//            viewer.setVisible(true); 
//        } catch (SQLException | JRException ex) {
//            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewMenuRelatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btPercentualActionPerformed

    private void btRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecursoActionPerformed
//        ResultSet rs;
//        try {
//            JDialog viewer = new JDialog(new javax.swing.JFrame(),"Visualização do Relatório", true);
//            Map parametros = new HashMap();
//            
//            rs = ControllerRecurso.buscarTodosFuncionarios();
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);
//            //JasperReport relProjetos = JasperCompileManager.compileReport("C:\\Users\\vtffa\\Desktop\\Projeto POO Av - P2\\Divisão de trabalho entre equipe de desenvolvedores de software ~ V.03.01\\src\\report\\MyReports\\bin\\ResourceReport.jrxml");
//            //JasperPrint impressao = JasperFillManager.fillReport(relProjetos, null, jrRS);
//            // O código abaixo irá invocar o formulário em modo binário e não trará as expressões condicionais definidas no .jrxml.
//            
//            Object con = ControllerRecurso.getConnection();
//            parametros.put("REPORT_CONNECTION",con);
//
//            JasperPrint impressao = JasperFillManager.fillReport("C:\\Users\\vtffa\\Desktop\\TCC\\EngSoft\\src\\report\\MyReports\\ResourcesList.jasper", parametros, jrRS);
//            JasperViewer jrViewer = new JasperViewer(impressao,false);
//            //jrViewer.setVisible(true);
//            //jrViewer.toFront();
//            viewer.setSize(1200,750); 
//            viewer.setLocationRelativeTo(null); 
//            viewer.getContentPane().add(jrViewer.getContentPane()); 
//            viewer.setVisible(true); 
//        } catch (SQLException | JRException ex) {
//            Logger.getLogger(ViewMenu.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ViewMenuRelatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btRecursoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            @Override
            public void run() {
                new ViewMenuRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHoraProjeto;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btOrcamento;
    private javax.swing.JButton btPercentual;
    private javax.swing.JButton btProjeto;
    private javax.swing.JButton btProjetoRecurso;
    private javax.swing.JButton btRecurso;
    private javax.swing.JLabel lbBusinessMan;
    private javax.swing.JLabel lbCabecalhoMenu;
    private javax.swing.JLabel lbCodNameDesc;
    private javax.swing.JLabel lbCodUser;
    private javax.swing.JLabel lbDescName;
    private javax.swing.JLabel lbOla;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelCabMenu;
    private javax.swing.JPanel painelCabNomeRE;
    private javax.swing.JPanel painelLinhaMenu;
    private javax.swing.JPanel painelMenu;
    // End of variables declaration//GEN-END:variables
}
