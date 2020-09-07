package frames;

// Imports
import javax.swing.JOptionPane;
import panels.Fundo_Jogar;
import personagens.Lixeira;

import conexao_banco.Conexao;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Jogar extends Frame_Template0 {
    /* Atributos */
    private static int DIFICULDADE;
    private boolean jogando = true;
    private boolean mensagem = true;
    
    private Lixeira lixeira;
    private Conexao conexao = new Conexao();
  
    private Frame_Template0 nova_janela; // Jogar_Menu
    private Frame_Template1 nova_janela_placar; // placar batido e não batido
    
    
    /* Propriedades */
    // jogando
    public boolean getJogando() {
        return (this.jogando);
    }
    
    public void setJogando(boolean jogando) {
        this.jogando = jogando;
    }
    
    // mensagem
    public boolean getMensagem() {
        return (this.mensagem);
    }
    
    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }
    
    // lixeira
    public Lixeira getLixeira() {
        return (this.lixeira);
    }
    
    public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }
    
    // conexao
    public Conexao getConexao() {
        return (this.conexao);
    }
    
    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }
    
    /* Métodos */
    
    /* Mostrar_Alvo
        * Mostra lixo a ser coletado pelo usuário
        - Assintótica: O(1)
    */
    private void Mostrar_Alvo() {
        ImageIcon img = new ImageIcon(this.getConexao().getPersonagens(this.getLixeira().getId())); // seleciona diretório da imagem
        Image image = img.getImage(); // transformação de ImageIcon em Image
        Image alvo = image.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH); // define tamanho da imagem
        lbl_alvo.setIcon(new ImageIcon(alvo)); // envia imagem para label
    }
    
    /* Construtor */
    public Jogar(int dificuldade) {
        // Definição da dificuldade
        /*
         0 -> fácil
         1 -> médio
         2 -> difíicl
        */
        this.DIFICULDADE = dificuldade;
        this.setLixeira(new Lixeira(this.DIFICULDADE));
        this.getConexao().Selecionar_Lixos(this.DIFICULDADE);
        
        // Inicializa as configurações padrões do JFrame e da superclasse
        initComponents();
        this.Mostrar_Alvo();
        super.Config_Padrao();
       
    }

    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        painel = new Fundo_Jogar(this.DIFICULDADE, this.getLixeira());
        btn_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_pontos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_vidas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_alvo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        painel.setBackground(new java.awt.Color(0, 204, 51));
        painel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                painelMouseMoved(evt);
            }
        });
        painel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        getContentPane().add(painel);
        painel.setBounds(0, 54, 890, 740);

        btn_voltar.setText("< VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_voltar);
        btn_voltar.setBounds(0, 0, 110, 23);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("VIDAS:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(437, 0, 45, 45);

        lbl_pontos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_pontos.setText("PONTOS:");
        getContentPane().add(lbl_pontos);
        lbl_pontos.setBounds(290, 0, 62, 53);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("PONTOS:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(222, 0, 62, 53);

        lbl_vidas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl_vidas.setText("VIDAS");
        getContentPane().add(lbl_vidas);
        lbl_vidas.setBounds(492, 14, 41, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("ALVO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 14, 41, 17);

        lbl_alvo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(lbl_alvo);
        lbl_alvo.setBounds(690, 0, 90, 57);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Clique no botão "VOLTAR"
    // Ao clicar nele, jogo é pausado e mensagem aparece perguntando se jogador quer sair mesmo do jogo
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // Pausa do jogo
        Fundo_Jogar.JOGANDO = false;
        
        // Mensagem se jogador quer sair do jogo ou não
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair do jogo?", "Encerrar Jogo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        
        // Clicando em sim, frame de "jogar_menu" é instanciado
        if(resposta == JOptionPane.YES_OPTION) {
            this.nova_janela = new Jogar_Menu();
            this.nova_janela.setVisible(true);
            this.setVisible(false);
        }
    
        // Jogo despausado
        Fundo_Jogar.JOGANDO = true;
    }//GEN-LAST:event_btn_voltarActionPerformed

    // Movimento do mouse
    private void painelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseMoved
        // Atualização do placar e ponto
        if (jogando) {
            this.lbl_pontos.setText(Integer.toString(this.getLixeira().getPontos()));
            this.lbl_vidas.setText(Integer.toString(this.getLixeira().getVida()));          
        }
        
        // Quando a vida do jogador for zerada
        // Jogo termina e é reaizada verificação se jogador bateu algum recorde
        if (this.getLixeira().getVida() == 0) {
            this.jogando = false;
            
            try {
                // Jogador bateu algum placar
                if (this.getConexao().Verificar_Rank(Integer.parseInt(this.lbl_pontos.getText()), this.DIFICULDADE)) {
                    this.nova_janela_placar = new Placar_Batido(Jogar.DIFICULDADE, Integer.parseInt(this.lbl_pontos.getText()));
                }
                // Jogador não bateu placar
                else {
                    this.nova_janela_placar = new Placar_Nao_Batido(this.DIFICULDADE, this.lbl_pontos.getText());     
                }
                
            } 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            finally {
               this.nova_janela_placar.setVisible(true); // abre novo frame
               this.setVisible(false); // fecha o frame atual
            }
        }
    }//GEN-LAST:event_painelMouseMoved

    // Clique do mouse no painel
    private void painelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseClicked
       this.Mostrar_Alvo();
    }//GEN-LAST:event_painelMouseClicked

   
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
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogar(Jogar.DIFICULDADE).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_alvo;
    private javax.swing.JLabel lbl_pontos;
    private javax.swing.JLabel lbl_vidas;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
