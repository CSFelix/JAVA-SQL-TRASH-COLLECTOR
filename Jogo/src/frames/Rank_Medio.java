package frames;

// Imports
import panels.Fundo_Padrao;
import conexao_banco.Conexao;

import javax.swing.JOptionPane;

public class Rank_Medio extends Frame_Template0 {
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
    public Rank_Medio() {
        // Inicialização das configurações padrões do JFrame e da superclasse
        initComponents();
        this.Preencher_Rank(); // preenchimento do painel de rank
        super.Config_Padrao();
    }

    // Métodos
    
    /*Preencher_Rank*/
    private void Preencher_Rank() {
        // Conexão ao banco de dados
        this.conexao = new Conexao();
        
        // Realização da busca de dados
        try {
            // Selecionamento dos dados referentes à dificuldade "Médio"
            this.conexao.Selecionar_Rank(1);
            
            // Coluna "Jogador"
            this.txt_jogador_medio0.setText(this.conexao.getJogadores(0));
            this.txt_jogador_medio1.setText(this.conexao.getJogadores(1));
            this.txt_jogador_medio2.setText(this.conexao.getJogadores(2));
            this.txt_jogador_medio3.setText(this.conexao.getJogadores(3));
            this.txt_jogador_medio4.setText(this.conexao.getJogadores(4));
            this.txt_jogador_medio5.setText(this.conexao.getJogadores(5));
            this.txt_jogador_medio6.setText(this.conexao.getJogadores(6));
            this.txt_jogador_medio7.setText(this.conexao.getJogadores(7));
            this.txt_jogador_medio8.setText(this.conexao.getJogadores(8));
            this.txt_jogador_medio9.setText(this.conexao.getJogadores(9));
        
            // Coluna "Pontos"
            this.txt_pontos_medio0.setText(this.conexao.getPontos(0));
            this.txt_pontos_medio1.setText(this.conexao.getPontos(1));
            this.txt_pontos_medio2.setText(this.conexao.getPontos(2));
            this.txt_pontos_medio3.setText(this.conexao.getPontos(3));
            this.txt_pontos_medio4.setText(this.conexao.getPontos(4));
            this.txt_pontos_medio5.setText(this.conexao.getPontos(5));
            this.txt_pontos_medio6.setText(this.conexao.getPontos(6));
            this.txt_pontos_medio7.setText(this.conexao.getPontos(7));
            this.txt_pontos_medio8.setText(this.conexao.getPontos(8));
            this.txt_pontos_medio9.setText(this.conexao.getPontos(9));
        
            // Coluna "Data"
            this.txt_data_medio0.setText(this.conexao.getDatas(0));
            this.txt_data_medio1.setText(this.conexao.getDatas(1));
            this.txt_data_medio2.setText(this.conexao.getDatas(2));
            this.txt_data_medio3.setText(this.conexao.getDatas(3));
            this.txt_data_medio4.setText(this.conexao.getDatas(4));
            this.txt_data_medio5.setText(this.conexao.getDatas(5));
            this.txt_data_medio6.setText(this.conexao.getDatas(6));
            this.txt_data_medio7.setText(this.conexao.getDatas(7));
            this.txt_data_medio8.setText(this.conexao.getDatas(8));
            this.txt_data_medio9.setText(this.conexao.getDatas(9));
        
            // Limpar memória do query
            this.conexao.Limpar_Memoria_Rank();
        } 
        
        // Caso houver erros: Mensagem de erro é exibida
        catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex);
        }
    }
    
    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new Fundo_Padrao();
        jLabel1 = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        painel6 = new javax.swing.JPanel();
        txt_jogador_medio0 = new javax.swing.JLabel();
        txt_jogador_medio1 = new javax.swing.JLabel();
        txt_jogador_medio2 = new javax.swing.JLabel();
        txt_jogador_medio3 = new javax.swing.JLabel();
        txt_jogador_medio4 = new javax.swing.JLabel();
        txt_jogador_medio5 = new javax.swing.JLabel();
        txt_jogador_medio6 = new javax.swing.JLabel();
        txt_jogador_medio7 = new javax.swing.JLabel();
        txt_jogador_medio8 = new javax.swing.JLabel();
        txt_jogador_medio9 = new javax.swing.JLabel();
        txt_pontos_medio0 = new javax.swing.JLabel();
        txt_pontos_medio1 = new javax.swing.JLabel();
        txt_pontos_medio2 = new javax.swing.JLabel();
        txt_pontos_medio3 = new javax.swing.JLabel();
        txt_pontos_medio4 = new javax.swing.JLabel();
        txt_pontos_medio5 = new javax.swing.JLabel();
        txt_pontos_medio6 = new javax.swing.JLabel();
        txt_pontos_medio7 = new javax.swing.JLabel();
        txt_pontos_medio8 = new javax.swing.JLabel();
        txt_pontos_medio9 = new javax.swing.JLabel();
        txt_data_medio0 = new javax.swing.JLabel();
        txt_data_medio1 = new javax.swing.JLabel();
        txt_data_medio2 = new javax.swing.JLabel();
        txt_data_medio3 = new javax.swing.JLabel();
        txt_data_medio4 = new javax.swing.JLabel();
        txt_data_medio5 = new javax.swing.JLabel();
        txt_data_medio6 = new javax.swing.JLabel();
        txt_data_medio7 = new javax.swing.JLabel();
        txt_data_medio8 = new javax.swing.JLabel();
        txt_data_medio9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_jogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("RANK MÉDIO");

        btn_voltar.setText("< VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        painel6.setBackground(new java.awt.Color(90, 251, 108));

        txt_jogador_medio0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio0.setText("jLabel2");

        txt_jogador_medio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio1.setText("jLabel2");

        txt_jogador_medio2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio2.setText("jLabel2");

        txt_jogador_medio3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio3.setText("jLabel2");

        txt_jogador_medio4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio4.setText("jLabel2");

        txt_jogador_medio5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio5.setText("jLabel2");

        txt_jogador_medio6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio6.setText("jLabel2");

        txt_jogador_medio7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio7.setText("jLabel2");

        txt_jogador_medio8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio8.setText("jLabel2");

        txt_jogador_medio9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_medio9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_medio9.setText("jLabel2");

        txt_pontos_medio0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio0.setText("jLabel2");

        txt_pontos_medio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio1.setText("jLabel2");

        txt_pontos_medio2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio2.setText("jLabel2");

        txt_pontos_medio3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio3.setText("jLabel2");

        txt_pontos_medio4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio4.setText("jLabel2");

        txt_pontos_medio5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio5.setText("jLabel2");

        txt_pontos_medio6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio6.setText("jLabel2");

        txt_pontos_medio7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio7.setText("jLabel2");

        txt_pontos_medio8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio8.setText("jLabel2");

        txt_pontos_medio9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_medio9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_medio9.setText("jLabel2");

        txt_data_medio0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio0.setText("jLabel2");

        txt_data_medio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio1.setText("jLabel2");

        txt_data_medio2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio2.setText("jLabel2");

        txt_data_medio3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio3.setText("jLabel2");

        txt_data_medio4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio4.setText("jLabel2");

        txt_data_medio5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio5.setText("jLabel2");

        txt_data_medio6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio6.setText("jLabel2");

        txt_data_medio7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio7.setText("jLabel2");

        txt_data_medio8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio8.setText("jLabel2");

        txt_data_medio9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_medio9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_medio9.setText("jLabel2");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("PONTOS");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("DATA");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("JOGADOR");

        javax.swing.GroupLayout painel6Layout = new javax.swing.GroupLayout(painel6);
        painel6.setLayout(painel6Layout);
        painel6Layout.setHorizontalGroup(
            painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel6Layout.createSequentialGroup()
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_jogador_medio9)
                            .addComponent(txt_jogador_medio7)
                            .addComponent(txt_jogador_medio5)
                            .addComponent(txt_jogador_medio4)
                            .addComponent(txt_jogador_medio3)
                            .addComponent(txt_jogador_medio2)
                            .addComponent(txt_jogador_medio1)
                            .addComponent(txt_jogador_medio0)
                            .addComponent(txt_jogador_medio6)
                            .addComponent(txt_jogador_medio8))
                        .addGap(187, 187, 187)
                        .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pontos_medio0)
                            .addComponent(txt_pontos_medio1)
                            .addComponent(txt_pontos_medio2)
                            .addComponent(txt_pontos_medio3)
                            .addComponent(txt_pontos_medio4)
                            .addComponent(txt_pontos_medio5)
                            .addComponent(txt_pontos_medio6)
                            .addComponent(txt_pontos_medio7)
                            .addComponent(txt_pontos_medio8)
                            .addComponent(txt_pontos_medio9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE))
                    .addGroup(painel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(147, 147, 147)))
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(119, 119, 119))
                    .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel6Layout.createSequentialGroup()
                            .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_data_medio0)
                                .addComponent(txt_data_medio1))
                            .addGap(119, 119, 119))
                        .addGroup(painel6Layout.createSequentialGroup()
                            .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_data_medio2)
                                .addComponent(txt_data_medio3)
                                .addComponent(txt_data_medio4)
                                .addComponent(txt_data_medio5)
                                .addComponent(txt_data_medio6)
                                .addComponent(txt_data_medio7)
                                .addComponent(txt_data_medio8)
                                .addComponent(txt_data_medio9))
                            .addContainerGap()))))
            .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel6Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel16)
                    .addContainerGap(535, Short.MAX_VALUE)))
        );
        painel6Layout.setVerticalGroup(
            painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_medio0)
                    .addComponent(txt_pontos_medio0)
                    .addComponent(txt_data_medio0))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_medio1)
                    .addComponent(txt_pontos_medio1)
                    .addComponent(txt_data_medio1))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_medio2)
                    .addComponent(txt_pontos_medio2)
                    .addComponent(txt_data_medio2))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_medio3)
                    .addComponent(txt_pontos_medio3)
                    .addComponent(txt_jogador_medio3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_medio4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_medio4)
                    .addComponent(txt_data_medio4))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_medio5)
                    .addComponent(txt_pontos_medio5)
                    .addComponent(txt_jogador_medio5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_medio6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_medio6)
                    .addComponent(txt_data_medio6))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_medio7)
                    .addComponent(txt_pontos_medio7)
                    .addComponent(txt_jogador_medio7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_medio8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_medio8)
                    .addComponent(txt_data_medio8))
                .addGap(18, 18, 18)
                .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_medio9)
                    .addComponent(txt_pontos_medio9)
                    .addComponent(txt_jogador_medio9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(painel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel6Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel16)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        btn_jogar.setText("JOGAR");
        btn_jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(331, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_jogar)
                .addGap(109, 109, 109))
            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelLayout.createSequentialGroup()
                    .addGap(115, 115, 115)
                    .addComponent(painel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btn_voltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(btn_jogar)
                .addGap(73, 73, 73))
            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelLayout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(painel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Clique no botão "VOLTAR"
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        this.nova_janela = new Ranks_Menu();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    // Clique no botão "Jogar"
    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
        this.nova_janela = new Jogar(1);
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_jogarActionPerformed

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
            java.util.logging.Logger.getLogger(Rank_Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rank_Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rank_Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rank_Medio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rank_Medio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel6;
    private javax.swing.JLabel txt_data_medio0;
    private javax.swing.JLabel txt_data_medio1;
    private javax.swing.JLabel txt_data_medio2;
    private javax.swing.JLabel txt_data_medio3;
    private javax.swing.JLabel txt_data_medio4;
    private javax.swing.JLabel txt_data_medio5;
    private javax.swing.JLabel txt_data_medio6;
    private javax.swing.JLabel txt_data_medio7;
    private javax.swing.JLabel txt_data_medio8;
    private javax.swing.JLabel txt_data_medio9;
    private javax.swing.JLabel txt_jogador_medio0;
    private javax.swing.JLabel txt_jogador_medio1;
    private javax.swing.JLabel txt_jogador_medio2;
    private javax.swing.JLabel txt_jogador_medio3;
    private javax.swing.JLabel txt_jogador_medio4;
    private javax.swing.JLabel txt_jogador_medio5;
    private javax.swing.JLabel txt_jogador_medio6;
    private javax.swing.JLabel txt_jogador_medio7;
    private javax.swing.JLabel txt_jogador_medio8;
    private javax.swing.JLabel txt_jogador_medio9;
    private javax.swing.JLabel txt_pontos_medio0;
    private javax.swing.JLabel txt_pontos_medio1;
    private javax.swing.JLabel txt_pontos_medio2;
    private javax.swing.JLabel txt_pontos_medio3;
    private javax.swing.JLabel txt_pontos_medio4;
    private javax.swing.JLabel txt_pontos_medio5;
    private javax.swing.JLabel txt_pontos_medio6;
    private javax.swing.JLabel txt_pontos_medio7;
    private javax.swing.JLabel txt_pontos_medio8;
    private javax.swing.JLabel txt_pontos_medio9;
    // End of variables declaration//GEN-END:variables
}
