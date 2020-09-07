package frames;

// Imports
import panels.Fundo_Padrao;
import conexao_banco.Conexao;

import javax.swing.JOptionPane;

public class Recordes_Jogador extends Frame_Template0 {
    /* Atributos */
    private Conexao conexao;
    private Frame_Template0 nova_janela;
    
    /* Propriedades */
    public Conexao getConexao() {
        return (this.conexao);
    }
    
    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }
    
    /* Construtor */
    public Recordes_Jogador() {
        // Inicialização das configurações padr~eos do JFrame e da superclasse
        initComponents();
        this.Preencher_Rank(); // preenchimento do painel de rank
        super.Config_Padrao();
    }

    // Métodos
    
    /*Preencher_Rank*/
    private void Preencher_Rank() {
        // Conexão ao banco de dados
        this.setConexao(new Conexao());
        
        // Realização da busca de dados
        try {
            // Selecionamento dos dados referentes aos recordes dp jogador
            this.getConexao().Selecionar_Rank(3);
            
            // Coluna "Jogador"
            this.txt_jogador_recordes0.setText(this.conexao.getJogadores(0));
            this.txt_jogador_recordes1.setText(this.conexao.getJogadores(1));
            this.txt_jogador_recordes2.setText(this.conexao.getJogadores(2));
            
            // Coluna "Pontos"
            this.txt_pontos_recordes0.setText(this.conexao.getPontos(0));
            this.txt_pontos_recordes1.setText(this.conexao.getPontos(1));
            this.txt_pontos_recordes2.setText(this.conexao.getPontos(2));
            
            // Coluna "Data"
            this.txt_data_recordes0.setText(this.conexao.getDatas(0));
            this.txt_data_recordes1.setText(this.conexao.getDatas(1));
            this.txt_data_recordes2.setText(this.conexao.getDatas(2));
            
            // Limpar memória do query
            this.conexao.Limpar_Memoria_Rank();
        }
        
        // Caso houver erros: Mensagem de erro é exibida
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new Fundo_Padrao();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar_ranks = new javax.swing.JButton();
        btn_voltar_modo_jogo = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        txt_jogador_recordes0 = new javax.swing.JLabel();
        txt_jogador_recordes1 = new javax.swing.JLabel();
        txt_jogador_recordes2 = new javax.swing.JLabel();
        txt_pontos_recordes0 = new javax.swing.JLabel();
        txt_pontos_recordes1 = new javax.swing.JLabel();
        txt_pontos_recordes2 = new javax.swing.JLabel();
        txt_data_recordes0 = new javax.swing.JLabel();
        txt_data_recordes1 = new javax.swing.JLabel();
        txt_data_recordes2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_jogador_dificil3 = new javax.swing.JLabel();
        txt_jogador_dificil4 = new javax.swing.JLabel();
        txt_jogador_dificil5 = new javax.swing.JLabel();
        btn_jogar_dificil = new javax.swing.JButton();
        btn_jogar_facil = new javax.swing.JButton();
        btn_jogar_medio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("RECORDES JOGADOR");

        btn_voltar_ranks.setText("< VOLTAR RANKS");
        btn_voltar_ranks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar_ranksActionPerformed(evt);
            }
        });

        btn_voltar_modo_jogo.setText("< VOLTAR MODO JOGO");
        btn_voltar_modo_jogo.setToolTipText("");
        btn_voltar_modo_jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltar_modo_jogoActionPerformed(evt);
            }
        });

        painel2.setBackground(new java.awt.Color(90, 251, 108));

        txt_jogador_recordes0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_recordes0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes0.setText("jLabel2");

        txt_jogador_recordes1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_recordes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes1.setText("jLabel2");

        txt_jogador_recordes2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_recordes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes2.setText("jLabel2");

        txt_pontos_recordes0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_recordes0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_recordes0.setText("jLabel2");

        txt_pontos_recordes1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_recordes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_recordes1.setText("jLabel2");

        txt_pontos_recordes2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_recordes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_recordes2.setText("jLabel2");

        txt_data_recordes0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_recordes0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_recordes0.setText("jLabel2");

        txt_data_recordes1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_recordes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_recordes1.setText("jLabel2");

        txt_data_recordes2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_recordes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_recordes2.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PONTOS");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("DATA");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("JOGADOR");

        txt_jogador_dificil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil3.setText("FÁCIL");

        txt_jogador_dificil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil4.setText("MÉDIO");

        txt_jogador_dificil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil5.setText("DIFÍCIL");
        txt_jogador_dificil5.setToolTipText("");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_jogador_dificil3)
                            .addComponent(txt_jogador_dificil4)
                            .addComponent(txt_jogador_dificil5))
                        .addGap(81, 81, 81)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_jogador_recordes1)
                            .addComponent(txt_jogador_recordes0)
                            .addComponent(txt_jogador_recordes2))
                        .addGap(173, 173, 173)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pontos_recordes1)
                            .addComponent(txt_pontos_recordes0)
                            .addComponent(txt_pontos_recordes2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)))
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_data_recordes0)
                    .addComponent(jLabel3)
                    .addComponent(txt_data_recordes1)
                    .addComponent(txt_data_recordes2))
                .addGap(51, 51, 51))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_data_recordes0)
                            .addComponent(txt_pontos_recordes0))
                        .addGap(18, 18, 18)
                        .addComponent(txt_data_recordes1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_data_recordes2)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jogador_recordes0)
                            .addComponent(txt_jogador_dificil3))
                        .addGap(18, 18, 18)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jogador_dificil4)
                            .addComponent(txt_jogador_recordes1)
                            .addComponent(txt_pontos_recordes1))
                        .addGap(18, 18, 18)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jogador_dificil5)
                            .addComponent(txt_jogador_recordes2)
                            .addComponent(txt_pontos_recordes2))
                        .addGap(20, 20, 20))))
        );

        btn_jogar_dificil.setText("JOGAR DIFÍCIL");
        btn_jogar_dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogar_dificilActionPerformed(evt);
            }
        });

        btn_jogar_facil.setText("JOGAR FÁCIL");
        btn_jogar_facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogar_facilActionPerformed(evt);
            }
        });

        btn_jogar_medio.setText("JOGAR MÉDIO");
        btn_jogar_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogar_medioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_voltar_ranks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_voltar_modo_jogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(246, 246, 246))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(btn_jogar_facil)
                        .addGap(102, 102, 102)
                        .addComponent(btn_jogar_medio)
                        .addGap(90, 90, 90)
                        .addComponent(btn_jogar_dificil)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_voltar_ranks))
                .addGap(18, 18, 18)
                .addComponent(btn_voltar_modo_jogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_jogar_dificil)
                    .addComponent(btn_jogar_medio)
                    .addComponent(btn_jogar_facil))
                .addGap(202, 202, 202))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Clique no botão "VOLTAR RANKS"
    private void btn_voltar_ranksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar_ranksActionPerformed
        this.nova_janela = new Ranks_Menu();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltar_ranksActionPerformed
    
    // Clique no botão "VOLTAR MODO JOGO"
    private void btn_voltar_modo_jogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltar_modo_jogoActionPerformed
        this.nova_janela = new Jogar_Menu();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltar_modo_jogoActionPerformed
    
    // Clique no botão "Jogar_Facil"
    private void btn_jogar_facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogar_facilActionPerformed
        this.nova_janela = new Jogar(0);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_jogar_facilActionPerformed

    // Clique no botão "Jogar_Médio"
    private void btn_jogar_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogar_medioActionPerformed
        this.nova_janela = new Jogar(1);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_jogar_medioActionPerformed

    // Clique no botão "Jogar_Difícil"
    private void btn_jogar_dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogar_dificilActionPerformed
        this.nova_janela = new Jogar(2);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_jogar_dificilActionPerformed

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
            java.util.logging.Logger.getLogger(Recordes_Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recordes_Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recordes_Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recordes_Jogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recordes_Jogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_jogar_dificil;
    private javax.swing.JButton btn_jogar_facil;
    private javax.swing.JButton btn_jogar_medio;
    private javax.swing.JButton btn_voltar_modo_jogo;
    private javax.swing.JButton btn_voltar_ranks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel2;
    private javax.swing.JLabel txt_data_recordes0;
    private javax.swing.JLabel txt_data_recordes1;
    private javax.swing.JLabel txt_data_recordes2;
    private javax.swing.JLabel txt_jogador_dificil3;
    private javax.swing.JLabel txt_jogador_dificil4;
    private javax.swing.JLabel txt_jogador_dificil5;
    private javax.swing.JLabel txt_jogador_recordes0;
    private javax.swing.JLabel txt_jogador_recordes1;
    private javax.swing.JLabel txt_jogador_recordes2;
    private javax.swing.JLabel txt_pontos_recordes0;
    private javax.swing.JLabel txt_pontos_recordes1;
    private javax.swing.JLabel txt_pontos_recordes2;
    // End of variables declaration//GEN-END:variables
}
