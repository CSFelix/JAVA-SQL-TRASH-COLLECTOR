package frames;

// Imports
import java.awt.Color;
import javax.swing.JOptionPane;
import panels.Fundo_Padrao;

public class Jogar_Menu extends Frame_Template0 {
    /* Classes Privadas */
    class Colorir_Botao extends Thread {
        /* Atributos */
        Color[] cores = new Color[10];
        int index_cor = 0;
        
        /* Propriedades */
        
        // cores
        Color getCores(int index) {
            return (this.cores[index]);
        }
        
        void setCores() {
            this.cores[0] = new Color(0, 0, 255); // Azul (Papel)
            this.cores[1] = new Color(0, 128, 0); // Verde (Vidro)
            this.cores[2] = new Color (255,255,0);// Amarelo (Metal)
            this.cores[3] = new Color (255,0,0);// Vermelho (Plástico)
            this.cores[4] = new Color(128,128,128);// Cinza (Não-Reciclável)
            this.cores[5] = new Color(139,69,19);// Marrom (Orgânico)
            this.cores[6] = new Color(128,0,128);// Roxo (Radioativo)
            this.cores[7] = new Color(255,140,0);// Laranja (Perigoso)
            this.cores[8] = new Color(255, 255, 255); // Branco (Hospitalar)
            this.cores[9] = new Color(0, 0, 0); // Preto (Madeira)
        }
        
        // index_cor
        int getIndex_cor() {
            return (this.index_cor);
        }
        
        void setIndex_cor() {
            this.index_cor = (index_cor + 1 > 9) ? 0 : index_cor + 1;
        }
        
        /* Construtor */
        Colorir_Botao() {
            this.setCores();
        }
        
        /* Run */
        public void run() {
            while(true) {
                try {
                    btn_wiki.setBackground(this.getCores(this.getIndex_cor()));
                    this.setIndex_cor();               
                    Colorir_Botao.sleep(500);
                
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    
    /* Atributos */
    private Frame_Template0 nova_janela;
    
    /* Construtor */
    public Jogar_Menu() { 
        // Inicialização das configurações padrões do JFrame e da superclasse
        initComponents();
        super.Config_Padrao();
        Colorir_Botao cb = new Colorir_Botao();
        cb.start();
    }

    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new Fundo_Padrao();
        btn_facil = new javax.swing.JButton();
        btn_medio = new javax.swing.JButton();
        btn_dificil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_recordes = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        btn_wiki = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_facil.setText("FÁCIL");
        btn_facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facilActionPerformed(evt);
            }
        });

        btn_medio.setText("MÉDIO");
        btn_medio.setActionCommand("");
        btn_medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_medioActionPerformed(evt);
            }
        });

        btn_dificil.setText("DIFÍCIL");
        btn_dificil.setActionCommand("");
        btn_dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dificilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("DIFICULDADE");

        btn_recordes.setText("RECORDES");
        btn_recordes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recordesActionPerformed(evt);
            }
        });

        btn_voltar.setText("< VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_wiki.setText("WIKI");
        btn_wiki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_wikiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_facil, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_recordes, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(btn_wiki, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_wiki)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_recordes)
                    .addComponent(btn_voltar)
                    .addComponent(jLabel1))
                .addGap(128, 128, 128)
                .addComponent(btn_facil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btn_medio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btn_dificil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
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

    // Clieque no botão "VOLTAR"
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        this.nova_janela = new Inicio();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed
    
    // Clique no botão "RECORDES"
    private void btn_recordesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recordesActionPerformed
        this.nova_janela = new Recordes_Jogador();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_recordesActionPerformed
    
    // Clique no botão "FÁCIL"
    private void btn_facilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facilActionPerformed
        this.nova_janela = new Jogar(0);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_facilActionPerformed
    
    // Clique no botão "MÉDIO"
    private void btn_medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_medioActionPerformed
        this.nova_janela = new Jogar(1);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_medioActionPerformed
    
    // Clique no botão "DIFÍCIL"
    private void btn_dificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dificilActionPerformed
        this.nova_janela = new Jogar(2);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_dificilActionPerformed
    
    // Clique no botão "WIKI"
    private void btn_wikiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_wikiActionPerformed
        this.nova_janela = new Wiki();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_wikiActionPerformed

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
            java.util.logging.Logger.getLogger(Jogar_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogar_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogar_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogar_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogar_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dificil;
    private javax.swing.JButton btn_facil;
    private javax.swing.JButton btn_medio;
    private javax.swing.JButton btn_recordes;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JButton btn_wiki;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
