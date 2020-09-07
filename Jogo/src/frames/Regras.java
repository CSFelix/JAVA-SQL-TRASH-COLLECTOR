package frames;

// Imports
import panels.Fundo_Padrao;

public class Regras extends Frame_Template0 {
    /* Atributos */
    private Frame_Template0 nova_janela;
    
    /* Construtor */
    public Regras() {
        // Inicialização das configuraç~eos padrões do JFrame e da superclasse
        initComponents();
        this.lbl_welcome.setText("Seja bem-vindo ao " + super.NOME_JOGO);
        super.Config_Padrao();
    }

    // Personalização dos componenetes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new Fundo_Padrao();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        lbl_welcome = new javax.swing.JLabel();
        txt_jogador_recordes1 = new javax.swing.JLabel();
        txt_jogador_recordes2 = new javax.swing.JLabel();
        txt_jogador_recordes3 = new javax.swing.JLabel();
        txt_jogador_recordes4 = new javax.swing.JLabel();
        txt_jogador_recordes5 = new javax.swing.JLabel();
        txt_jogador_recordes6 = new javax.swing.JLabel();
        txt_jogador_recordes7 = new javax.swing.JLabel();
        txt_jogador_recordes8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("REGRAS");

        btn_voltar.setText("< VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        painel2.setBackground(new java.awt.Color(90, 251, 108));

        lbl_welcome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_welcome.setText("Seja bem-vindo ao Trash Royale");

        txt_jogador_recordes1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_jogador_recordes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes1.setText("Para cada nível de dificuldade, mais cores de lixeira são liberadas e mais rápidas são as quedas dos lixos.");

        txt_jogador_recordes2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_jogador_recordes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes2.setText("Mouse:: movimentam lixeira para a direita e esquerda");

        txt_jogador_recordes3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_jogador_recordes3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes3.setText("Clique: troca cor da lixeira");

        txt_jogador_recordes4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_recordes4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes4.setText("- COMANDOS");

        txt_jogador_recordes5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_jogador_recordes5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes5.setText("Médio: Papel, Plástico, Vidro, Metal, Orgânico e Não-Reciclável");

        txt_jogador_recordes6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_recordes6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes6.setText("- DIFICULDADES");

        txt_jogador_recordes7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_jogador_recordes7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes7.setText("Fácil: Papel, Plástico, Vidro e Metal");

        txt_jogador_recordes8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_jogador_recordes8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_recordes8.setText("Difícil: Papel, Plástico, Vidro, Metal, Orgânico, Não-Reciclável, Hospitalar, Radioativo, Perigoso e Madeira");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lbl_welcome))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_jogador_recordes3)
                            .addComponent(txt_jogador_recordes2)))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_jogador_recordes1)
                            .addComponent(txt_jogador_recordes7)
                            .addComponent(txt_jogador_recordes5)
                            .addComponent(txt_jogador_recordes8))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(txt_jogador_recordes4)
                    .addContainerGap(665, Short.MAX_VALUE)))
            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(txt_jogador_recordes6)
                    .addContainerGap(641, Short.MAX_VALUE)))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_welcome)
                .addGap(46, 46, 46)
                .addComponent(txt_jogador_recordes2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_jogador_recordes3)
                .addGap(62, 62, 62)
                .addComponent(txt_jogador_recordes1)
                .addGap(18, 18, 18)
                .addComponent(txt_jogador_recordes7)
                .addGap(18, 18, 18)
                .addComponent(txt_jogador_recordes5)
                .addGap(18, 18, 18)
                .addComponent(txt_jogador_recordes8)
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel2Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(txt_jogador_recordes4)
                    .addContainerGap(313, Short.MAX_VALUE)))
            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel2Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(txt_jogador_recordes6)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_voltar))
                .addGap(74, 74, 74)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Clique no botão "VOLTAR"
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        this.nova_janela = new Inicio();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel2;
    private javax.swing.JLabel txt_jogador_recordes1;
    private javax.swing.JLabel txt_jogador_recordes2;
    private javax.swing.JLabel txt_jogador_recordes3;
    private javax.swing.JLabel txt_jogador_recordes4;
    private javax.swing.JLabel txt_jogador_recordes5;
    private javax.swing.JLabel txt_jogador_recordes6;
    private javax.swing.JLabel txt_jogador_recordes7;
    private javax.swing.JLabel txt_jogador_recordes8;
    // End of variables declaration//GEN-END:variables
}
