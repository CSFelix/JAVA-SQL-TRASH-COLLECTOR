package frames;

// Imports
import conexao_banco.Conexao;
import javax.swing.JOptionPane;


public class Placar_Batido extends Frame_Template1 {
    /* Atributos */
    public static int DIFICULDADE;
    public static int PONTOS;
    
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
    public Placar_Batido(int dificuldade, int pontos) {
        this.DIFICULDADE = dificuldade;
        this.PONTOS = pontos;
        
        initComponents();
        this.lbl_pontos.setText(Integer.toString(this.PONTOS));
        super.Config_Padrao();
    }

    // Definição dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_pontos = new javax.swing.JLabel();
        btn_proximo = new javax.swing.JButton();
        txt_jogador = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FIM DE JOGO");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PONTOS");
        jLabel3.setToolTipText("");

        lbl_pontos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_pontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pontos.setText("PONTOS");

        btn_proximo.setText("PRÓXIMO >");
        btn_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximoActionPerformed(evt);
            }
        });

        txt_jogador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DIGITE SEU NOME:");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_proximo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_pontos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbl_pontos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_proximo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_jogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Clique no botão "Próximo"
    private void btn_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximoActionPerformed
        // Nome do jogador com tamanho errado 
        //(deve ter três caracteres para estar certo)
        this.txt_jogador.setText(this.txt_jogador.getText().replace(" ", "")); // retira espaços do nome
        if (this.txt_jogador.getText().length() != 3) {
            JOptionPane.showMessageDialog(null, "O nome do jogador deve ter três caracteres sem espaços!");
        }
        
        // Nome do jogador com tamanho certo (três caracteres)
        else {
            // Conexão e gravação no banco de dados
            this.setConexao(new Conexao());
            
            try {
                // Gravação do recorde no rank da dificuldade
                this.conexao.Gravar_Rank(this.DIFICULDADE, this.txt_jogador.getText(), this.PONTOS);
                
                // Verificação se o jogador bateu o próprio recorde
                if(this.conexao.Verificar_Recordes(this.DIFICULDADE, this.PONTOS)) {
                    // Gravação do recorde do jogador em seu histórico
                    this.conexao.Gravar_Recorde(this.DIFICULDADE, this.txt_jogador.getText(), this.PONTOS);
                }
                
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            // Instanciação do frame de Rank
            switch(this.DIFICULDADE) {
                // Fácil
                case 0:
                    this.nova_janela = new Rank_Facil();                   
                    break;
                    
                // Médio
                case 1:
                    this.nova_janela = new Rank_Medio();                   
                    break;
                    
                // Difícil
                default:
                    this.nova_janela = new Rank_Dificil();                   
                    break;
            }
            
            this.nova_janela.setVisible(true); // abre novo frame
            this.setVisible(false); // fecha frame atual
        }
    }//GEN-LAST:event_btn_proximoActionPerformed

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
            java.util.logging.Logger.getLogger(Placar_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Placar_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Placar_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Placar_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Placar_Batido(Placar_Batido.DIFICULDADE, Placar_Batido.PONTOS).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_proximo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_pontos;
    private javax.swing.JTextField txt_jogador;
    // End of variables declaration//GEN-END:variables
}
