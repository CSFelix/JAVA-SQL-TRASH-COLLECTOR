package frames;

// Imports
import panels.Fundo_Padrao;
import conexao_banco.Conexao;

import javax.swing.JOptionPane;

public class Rank_Facil extends Frame_Template0 {
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
    public Rank_Facil() {
        // Inicialização das configurações padrões do JFrame e da superclasse
        initComponents();
        this.Preencher_Rank(); // preenchimento do painel de rank
        super.Config_Padrao();
    }
    
    // Métodos
    
    /*Preencher_Rank*/
    private void Preencher_Rank() {
        // Conexão ao banco de dados e realização do query
        this.setConexao(new Conexao());
        try {
            // Selecionamento dos dados referentes à dificuldade "Fácil"
            this.conexao.Selecionar_Rank(0);
            
            // Coluna "Jogador"
            this.txt_jogador_facil0.setText(this.conexao.getJogadores(0));
            this.txt_jogador_facil1.setText(this.conexao.getJogadores(1));
            this.txt_jogador_facil2.setText(this.conexao.getJogadores(2));
            this.txt_jogador_facil3.setText(this.conexao.getJogadores(3));
            this.txt_jogador_facil4.setText(this.conexao.getJogadores(4));
            this.txt_jogador_facil5.setText(this.conexao.getJogadores(5));
            this.txt_jogador_facil6.setText(this.conexao.getJogadores(6));
            this.txt_jogador_facil7.setText(this.conexao.getJogadores(7));
            this.txt_jogador_facil8.setText(this.conexao.getJogadores(8));
            this.txt_jogador_facil9.setText(this.conexao.getJogadores(9));
        
            // Coluna "Pontos"
            this.txt_pontos_facil0.setText(this.conexao.getPontos(0));
            this.txt_pontos_facil1.setText(this.conexao.getPontos(1));
            this.txt_pontos_facil2.setText(this.conexao.getPontos(2));
            this.txt_pontos_facil3.setText(this.conexao.getPontos(3));
            this.txt_pontos_facil4.setText(this.conexao.getPontos(4));
            this.txt_pontos_facil5.setText(this.conexao.getPontos(5));
            this.txt_pontos_facil6.setText(this.conexao.getPontos(6));
            this.txt_pontos_facil7.setText(this.conexao.getPontos(7));
            this.txt_pontos_facil8.setText(this.conexao.getPontos(8));
            this.txt_pontos_facil9.setText(this.conexao.getPontos(9));
        
            // Coluna "Data"
            this.txt_data_facil0.setText(this.conexao.getDatas(0));
            this.txt_data_facil1.setText(this.conexao.getDatas(1));
            this.txt_data_facil2.setText(this.conexao.getDatas(2));
            this.txt_data_facil3.setText(this.conexao.getDatas(3));
            this.txt_data_facil4.setText(this.conexao.getDatas(4));
            this.txt_data_facil5.setText(this.conexao.getDatas(5));
            this.txt_data_facil6.setText(this.conexao.getDatas(6));
            this.txt_data_facil7.setText(this.conexao.getDatas(7));
            this.txt_data_facil8.setText(this.conexao.getDatas(8));
            this.txt_data_facil9.setText(this.conexao.getDatas(9));
        
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
        btn_voltar = new javax.swing.JButton();
        painel2 = new javax.swing.JPanel();
        txt_jogador_facil0 = new javax.swing.JLabel();
        txt_jogador_facil1 = new javax.swing.JLabel();
        txt_jogador_facil2 = new javax.swing.JLabel();
        txt_jogador_facil3 = new javax.swing.JLabel();
        txt_jogador_facil4 = new javax.swing.JLabel();
        txt_jogador_facil5 = new javax.swing.JLabel();
        txt_jogador_facil6 = new javax.swing.JLabel();
        txt_jogador_facil7 = new javax.swing.JLabel();
        txt_jogador_facil8 = new javax.swing.JLabel();
        txt_jogador_facil9 = new javax.swing.JLabel();
        txt_pontos_facil0 = new javax.swing.JLabel();
        txt_pontos_facil1 = new javax.swing.JLabel();
        txt_pontos_facil2 = new javax.swing.JLabel();
        txt_pontos_facil3 = new javax.swing.JLabel();
        txt_pontos_facil4 = new javax.swing.JLabel();
        txt_pontos_facil5 = new javax.swing.JLabel();
        txt_pontos_facil6 = new javax.swing.JLabel();
        txt_pontos_facil7 = new javax.swing.JLabel();
        txt_pontos_facil8 = new javax.swing.JLabel();
        txt_pontos_facil9 = new javax.swing.JLabel();
        txt_data_facil0 = new javax.swing.JLabel();
        txt_data_facil1 = new javax.swing.JLabel();
        txt_data_facil2 = new javax.swing.JLabel();
        txt_data_facil3 = new javax.swing.JLabel();
        txt_data_facil4 = new javax.swing.JLabel();
        txt_data_facil5 = new javax.swing.JLabel();
        txt_data_facil6 = new javax.swing.JLabel();
        txt_data_facil7 = new javax.swing.JLabel();
        txt_data_facil8 = new javax.swing.JLabel();
        txt_data_facil9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_jogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("RANK FÁCIL");

        btn_voltar.setText("< VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        painel2.setBackground(new java.awt.Color(90, 251, 108));

        txt_jogador_facil0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil0.setText("jLabel2");

        txt_jogador_facil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil1.setText("jLabel2");

        txt_jogador_facil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil2.setText("jLabel2");

        txt_jogador_facil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil3.setText("jLabel2");

        txt_jogador_facil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil4.setText("jLabel2");

        txt_jogador_facil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil5.setText("jLabel2");

        txt_jogador_facil6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil6.setText("jLabel2");

        txt_jogador_facil7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil7.setText("jLabel2");

        txt_jogador_facil8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil8.setText("jLabel2");

        txt_jogador_facil9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_facil9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_facil9.setText("jLabel2");

        txt_pontos_facil0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil0.setText("jLabel2");

        txt_pontos_facil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil1.setText("jLabel2");

        txt_pontos_facil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil2.setText("jLabel2");

        txt_pontos_facil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil3.setText("jLabel2");

        txt_pontos_facil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil4.setText("jLabel2");

        txt_pontos_facil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil5.setText("jLabel2");

        txt_pontos_facil6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil6.setText("jLabel2");

        txt_pontos_facil7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil7.setText("jLabel2");

        txt_pontos_facil8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil8.setText("jLabel2");

        txt_pontos_facil9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_facil9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_facil9.setText("jLabel2");

        txt_data_facil0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil0.setText("jLabel2");

        txt_data_facil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil1.setText("jLabel2");

        txt_data_facil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil2.setText("jLabel2");

        txt_data_facil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil3.setText("jLabel2");

        txt_data_facil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil4.setText("jLabel2");

        txt_data_facil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil5.setText("jLabel2");

        txt_data_facil6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil6.setText("jLabel2");

        txt_data_facil7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil7.setText("jLabel2");

        txt_data_facil8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil8.setText("jLabel2");

        txt_data_facil9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_facil9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_facil9.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("PONTOS");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("DATA");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("JOGADOR");

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_jogador_facil9)
                            .addComponent(txt_jogador_facil7)
                            .addComponent(txt_jogador_facil5)
                            .addComponent(txt_jogador_facil4)
                            .addComponent(txt_jogador_facil3)
                            .addComponent(txt_jogador_facil2)
                            .addComponent(txt_jogador_facil1)
                            .addComponent(txt_jogador_facil0)
                            .addComponent(txt_jogador_facil6)
                            .addComponent(txt_jogador_facil8))
                        .addGap(187, 187, 187)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pontos_facil0)
                            .addComponent(txt_pontos_facil1)
                            .addComponent(txt_pontos_facil2)
                            .addComponent(txt_pontos_facil3)
                            .addComponent(txt_pontos_facil4)
                            .addComponent(txt_pontos_facil5)
                            .addComponent(txt_pontos_facil6)
                            .addComponent(txt_pontos_facil7)
                            .addComponent(txt_pontos_facil8)
                            .addComponent(txt_pontos_facil9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE))
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(147, 147, 147)))
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(119, 119, 119))
                    .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_data_facil0)
                                .addComponent(txt_data_facil1))
                            .addGap(119, 119, 119))
                        .addGroup(painel2Layout.createSequentialGroup()
                            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_data_facil2)
                                .addComponent(txt_data_facil3)
                                .addComponent(txt_data_facil4)
                                .addComponent(txt_data_facil5)
                                .addComponent(txt_data_facil6)
                                .addComponent(txt_data_facil7)
                                .addComponent(txt_data_facil8)
                                .addComponent(txt_data_facil9))
                            .addContainerGap()))))
            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel2Layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jLabel4)
                    .addContainerGap(535, Short.MAX_VALUE)))
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_facil0)
                    .addComponent(txt_pontos_facil0)
                    .addComponent(txt_data_facil0))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_facil1)
                    .addComponent(txt_pontos_facil1)
                    .addComponent(txt_data_facil1))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_facil2)
                    .addComponent(txt_pontos_facil2)
                    .addComponent(txt_data_facil2))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_facil3)
                    .addComponent(txt_pontos_facil3)
                    .addComponent(txt_jogador_facil3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_facil4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_facil4)
                    .addComponent(txt_data_facil4))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_facil5)
                    .addComponent(txt_pontos_facil5)
                    .addComponent(txt_jogador_facil5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_facil6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_facil6)
                    .addComponent(txt_data_facil6))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_facil7)
                    .addComponent(txt_pontos_facil7)
                    .addComponent(txt_jogador_facil7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_facil8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_facil8)
                    .addComponent(txt_data_facil8))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_facil9)
                    .addComponent(txt_pontos_facil9)
                    .addComponent(txt_jogador_facil9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painel2Layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jLabel4)
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
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_jogar)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(228, 228, 228)
                            .addComponent(jLabel1))
                        .addGroup(painelLayout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_voltar))
                .addGap(28, 28, 28)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_jogar)
                .addContainerGap(109, Short.MAX_VALUE))
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
    
    // Clique no botão "VOLTAR"
    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        this.nova_janela = new Ranks_Menu();
        this.nova_janela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    // Clique no botão "Jogar"
    private void btn_jogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jogarActionPerformed
        this.nova_janela = new Jogar(0);
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
            java.util.logging.Logger.getLogger(Rank_Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rank_Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rank_Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rank_Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rank_Facil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_jogar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel2;
    private javax.swing.JLabel txt_data_facil0;
    private javax.swing.JLabel txt_data_facil1;
    private javax.swing.JLabel txt_data_facil2;
    private javax.swing.JLabel txt_data_facil3;
    private javax.swing.JLabel txt_data_facil4;
    private javax.swing.JLabel txt_data_facil5;
    private javax.swing.JLabel txt_data_facil6;
    private javax.swing.JLabel txt_data_facil7;
    private javax.swing.JLabel txt_data_facil8;
    private javax.swing.JLabel txt_data_facil9;
    private javax.swing.JLabel txt_jogador_facil0;
    private javax.swing.JLabel txt_jogador_facil1;
    private javax.swing.JLabel txt_jogador_facil2;
    private javax.swing.JLabel txt_jogador_facil3;
    private javax.swing.JLabel txt_jogador_facil4;
    private javax.swing.JLabel txt_jogador_facil5;
    private javax.swing.JLabel txt_jogador_facil6;
    private javax.swing.JLabel txt_jogador_facil7;
    private javax.swing.JLabel txt_jogador_facil8;
    private javax.swing.JLabel txt_jogador_facil9;
    private javax.swing.JLabel txt_pontos_facil0;
    private javax.swing.JLabel txt_pontos_facil1;
    private javax.swing.JLabel txt_pontos_facil2;
    private javax.swing.JLabel txt_pontos_facil3;
    private javax.swing.JLabel txt_pontos_facil4;
    private javax.swing.JLabel txt_pontos_facil5;
    private javax.swing.JLabel txt_pontos_facil6;
    private javax.swing.JLabel txt_pontos_facil7;
    private javax.swing.JLabel txt_pontos_facil8;
    private javax.swing.JLabel txt_pontos_facil9;
    // End of variables declaration//GEN-END:variables
}
