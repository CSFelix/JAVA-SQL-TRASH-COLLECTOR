package frames;

// Imports

public class Placar_Nao_Batido extends Frame_Template1 {
    /* Atributos */
    private static int DIFICULDADE;
    private static String PONTOS;
    
    private Frame_Template0 nova_janela;
    
    /* Construtor */
    public Placar_Nao_Batido(int dificuldade, String pontos) {
        // Inicializa as configurações padrões do JFrame e da superclasse
        this.DIFICULDADE = dificuldade;
        this.PONTOS = pontos;
        
        initComponents();
        this.lbl_pontos.setText(this.PONTOS);
        super.Config_Padrao();
    }

    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        lbl_pontos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_rank = new javax.swing.JButton();
        btn_jogar = new javax.swing.JButton();
        btn_dificuldade = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(255, 255, 255));

        lbl_pontos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_pontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pontos.setText("PONTOS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FIM DE JOGO");
        jLabel2.setToolTipText("");

        btn_rank.setText("RANK");
        btn_rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rankActionPerformed(evt);
            }
        });

        btn_jogar.setText("JOGAR");
        btn_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogarActionPerformed(evt);
            }
        });

        btn_dificuldade.setText("DIFICULDADE");
        btn_dificuldade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dificuldadeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PONTOS");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_dificuldade)
                .addGap(37, 37, 37)
                .addComponent(btn_rank)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btn_jogar)
                .addGap(24, 24, 24))
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pontos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(lbl_pontos)
                .addGap(57, 57, 57)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dificuldade)
                    .addComponent(btn_rank)
                    .addComponent(btn_jogar))
                .addGap(24, 24, 24))
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

    // Clique no botão "Jogar"
    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
        this.nova_janela = new Jogar(this.DIFICULDADE);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_jogarActionPerformed

    // Clique no botão "Rank"
    private void btn_rankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rankActionPerformed
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
    }//GEN-LAST:event_btn_rankActionPerformed
    
    // Clique no botão "Dificuldade"
    private void btn_dificuldadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dificuldadeActionPerformed
        this.nova_janela = new Jogar_Menu();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_dificuldadeActionPerformed

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
            java.util.logging.Logger.getLogger(Placar_Nao_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Placar_Nao_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Placar_Nao_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Placar_Nao_Batido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Placar_Nao_Batido(Placar_Nao_Batido.DIFICULDADE, Placar_Nao_Batido.PONTOS).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dificuldade;
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_rank;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_pontos;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
