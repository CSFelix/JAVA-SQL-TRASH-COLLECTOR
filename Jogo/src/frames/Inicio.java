package frames;

// Imports
import javax.swing.JOptionPane;
import panels.Fundo_Padrao; // classe pai

import conexao_banco.Conexao;
import conexao_banco.Informacoes_Conexao;

public final class Inicio extends Frame_Template0 {
    /* Atributos */
    private Conexao conexao;
    private Frame_Template0 nova_janela; // pode ser Jogar_Menu, Ranks_Menu Regras
    
    /* Propriedades */
    // conexao
    public Conexao getConexao() {
        return (this.conexao);
    }
    
    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }
    
    /* Construtor */
    public Inicio() {
        // Inicializa as configurações padrões do JFrame
        initComponents();
        
        // Deixa os componentes relacioados à conexão com o banco invisível
        this.lbl_titulo.setText(this.NOME_JOGO);
        this.btn_conexao.setVisible(false);
        this.painel_conexao.setVisible(false);
        
        // Setamento das informações de "porta", "usuário" e "senha" da conexão com o banco
        this.txt_porta.setText(Informacoes_Conexao.PORTA);
        this.txt_usuario.setText(Informacoes_Conexao.USUARIO);
        this.txt_senha.setText(Informacoes_Conexao.SENHA);
        
        // Inicializa as configurações padrões da super classe
        super.Config_Padrao();
    }

    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new Fundo_Padrao();
        btn_jogar = new javax.swing.JButton();
        btn_ranks = new javax.swing.JButton();
        btn_regras = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        btn_conexao = new javax.swing.JButton();
        painel_conexao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_porta = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_jogar.setText("JOGAR");
        btn_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogarActionPerformed(evt);
            }
        });

        btn_ranks.setText("RANKS");
        btn_ranks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ranksActionPerformed(evt);
            }
        });

        btn_regras.setText("REGRAS");
        btn_regras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regrasActionPerformed(evt);
            }
        });

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("NOME DO JOGO");
        lbl_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_tituloMousePressed(evt);
            }
        });

        btn_conexao.setText("º");
        btn_conexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conexaoActionPerformed(evt);
            }
        });

        painel_conexao.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("PORTA:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("SENHA:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("USUÁRIO:");

        btn_gravar.setText("GRAVAR");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        txt_senha.setToolTipText("");

        javax.swing.GroupLayout painel_conexaoLayout = new javax.swing.GroupLayout(painel_conexao);
        painel_conexao.setLayout(painel_conexaoLayout);
        painel_conexaoLayout.setHorizontalGroup(
            painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_conexaoLayout.createSequentialGroup()
                .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_conexaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_gravar))
                    .addGroup(painel_conexaoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_porta)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txt_senha))))
                .addContainerGap())
        );
        painel_conexaoLayout.setVerticalGroup(
            painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_conexaoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_porta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(painel_conexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_gravar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(painel_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_ranks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_jogar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_regras, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                        .addGap(299, 299, 299))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btn_conexao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo)
                    .addComponent(btn_conexao))
                .addGap(144, 144, 144)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btn_jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btn_ranks, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painel_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_regras, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
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
    
    // Clique no botão "RANKS"
    private void btn_ranksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ranksActionPerformed
        // Frame apenas é carregado se a conexão com o banco for bem sucedida
        // Caso não for, uma mensagem de erro é exibida
        this.setConexao(new Conexao());
        
        if (this.getConexao().Testar_Conexao()) {
            this.nova_janela = new Ranks_Menu();
            this.nova_janela.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_ranksActionPerformed

    // Clique no botão "JOGAR"
    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
        // Frame apenas é carregado se a conexão com o banco for bem sucedida
        // Caso não for, uma mensagem de erro é exibida
        this.setConexao(new Conexao());
        
        if (this.getConexao().Testar_Conexao()) {
            this.nova_janela  = new Jogar_Menu();
            this.nova_janela.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btn_jogarActionPerformed
    
    // Clique no botão "REGRAS"
    private void btn_regrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regrasActionPerformed
        this.nova_janela = new Regras();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regrasActionPerformed

    // Clique no botão "º" (conexão)
    private void btn_conexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conexaoActionPerformed
       this.painel_conexao.setVisible(true);
    }//GEN-LAST:event_btn_conexaoActionPerformed

    // Clique no título do jogo
    private void lbl_tituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_tituloMousePressed
        // Se botão de conexão está invisível, ele torna-se visível
        if (!this.btn_conexao.isVisible()) {
            this.btn_conexao.setVisible(true);
        }
        // Caso contrário, invisível
        else {
            this.btn_conexao.setVisible(false);
        }
    }//GEN-LAST:event_lbl_tituloMousePressed
    
    // Clique no botão "CANCELAR" (conexão)
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // Painel de conexão tronar-se invisível
        this.painel_conexao.setVisible(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    // Clique no botão "GRAVAR" (conexão)
    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        // Gravação das informações de conexão com o banco de dados
        Informacoes_Conexao.PORTA = this.txt_porta.getText();
        Informacoes_Conexao.USUARIO = this.txt_usuario.getText();
        Informacoes_Conexao.SENHA = String.valueOf(this.txt_senha.getPassword()); // é necessário transformar o formato de senah em String
        
        // Teste de conexão
        this.setConexao(new Conexao());
        this.getConexao().Testar_Conexao();
        
        // Se a conexão for bem sucedida, painel de conexão torna-se invisível
        if (this.getConexao().Testar_Conexao()) {
            JOptionPane.showMessageDialog(null, "Conectado ao banco de dados");
            this.painel_conexao.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Banco de dados não encontrado. Verifique se a porta, usuário e senha estão corretos");
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_conexao;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_ranks;
    private javax.swing.JButton btn_regras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel_conexao;
    private javax.swing.JTextField txt_porta;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
