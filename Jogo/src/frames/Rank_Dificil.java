package frames;

// Imports
import panels.Fundo_Padrao;
import conexao_banco.Conexao;

import javax.swing.JOptionPane;

public class Rank_Dificil extends Frame_Template0 {
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
    public Rank_Dificil() {
        // Inicialização das configurações padrões do JFrame e da superclasse
        initComponents();
        this.Preencher_Rank(); // preenchimento do painel de rank
        super.Config_Padrao();
    }

    /* Métodos */
    
    /*Preencher_Rank*/
    private void Preencher_Rank() {
        // Conexão ao banco de dados e realização do query
        this.setConexao(new Conexao());
        
        try {
            // Selecionamento dos dados referentes à dificuldade "Difícil"
            this.conexao.Selecionar_Rank(2);
            
            // Coluna "Jogador"
            this.txt_jogador_dificil0.setText(this.conexao.getJogadores(0));
            this.txt_jogador_dificil1.setText(this.conexao.getJogadores(1));
            this.txt_jogador_dificil2.setText(this.conexao.getJogadores(2));
            this.txt_jogador_dificil3.setText(this.conexao.getJogadores(3));
            this.txt_jogador_dificil4.setText(this.conexao.getJogadores(4));
            this.txt_jogador_dificil5.setText(this.conexao.getJogadores(5));
            this.txt_jogador_dificil6.setText(this.conexao.getJogadores(6));
            this.txt_jogador_dificil7.setText(this.conexao.getJogadores(7));
            this.txt_jogador_dificil8.setText(this.conexao.getJogadores(8));
            this.txt_jogador_dificil9.setText(this.conexao.getJogadores(9));
        
            // Coluna "Pontos"
            this.txt_pontos_dificil0.setText(this.conexao.getPontos(0));
            this.txt_pontos_dificil1.setText(this.conexao.getPontos(1));
            this.txt_pontos_dificil2.setText(this.conexao.getPontos(2));
            this.txt_pontos_dificil3.setText(this.conexao.getPontos(3));
            this.txt_pontos_dificil4.setText(this.conexao.getPontos(4));
            this.txt_pontos_dificil5.setText(this.conexao.getPontos(5));
            this.txt_pontos_dificil6.setText(this.conexao.getPontos(6));
            this.txt_pontos_dificil7.setText(this.conexao.getPontos(7));
            this.txt_pontos_dificil8.setText(this.conexao.getPontos(8));
            this.txt_pontos_dificil9.setText(this.conexao.getPontos(9));
        
            // Coluna "Data"
            this.txt_data_dificil0.setText(this.conexao.getDatas(0));
            this.txt_data_dificil1.setText(this.conexao.getDatas(1));
            this.txt_data_dificil2.setText(this.conexao.getDatas(2));
            this.txt_data_dificil3.setText(this.conexao.getDatas(3));
            this.txt_data_dificil4.setText(this.conexao.getDatas(4));
            this.txt_data_dificil5.setText(this.conexao.getDatas(5));
            this.txt_data_dificil6.setText(this.conexao.getDatas(6));
            this.txt_data_dificil7.setText(this.conexao.getDatas(7));
            this.txt_data_dificil8.setText(this.conexao.getDatas(8));
            this.txt_data_dificil9.setText(this.conexao.getDatas(9));
        
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
        txt_jogador_dificil0 = new javax.swing.JLabel();
        txt_jogador_dificil1 = new javax.swing.JLabel();
        txt_jogador_dificil2 = new javax.swing.JLabel();
        txt_jogador_dificil3 = new javax.swing.JLabel();
        txt_jogador_dificil4 = new javax.swing.JLabel();
        txt_jogador_dificil5 = new javax.swing.JLabel();
        txt_jogador_dificil6 = new javax.swing.JLabel();
        txt_jogador_dificil7 = new javax.swing.JLabel();
        txt_jogador_dificil8 = new javax.swing.JLabel();
        txt_jogador_dificil9 = new javax.swing.JLabel();
        txt_pontos_dificil0 = new javax.swing.JLabel();
        txt_pontos_dificil1 = new javax.swing.JLabel();
        txt_pontos_dificil2 = new javax.swing.JLabel();
        txt_pontos_dificil3 = new javax.swing.JLabel();
        txt_pontos_dificil4 = new javax.swing.JLabel();
        txt_pontos_dificil5 = new javax.swing.JLabel();
        txt_pontos_dificil6 = new javax.swing.JLabel();
        txt_pontos_dificil7 = new javax.swing.JLabel();
        txt_pontos_dificil8 = new javax.swing.JLabel();
        txt_pontos_dificil9 = new javax.swing.JLabel();
        txt_data_dificil0 = new javax.swing.JLabel();
        txt_data_dificil1 = new javax.swing.JLabel();
        txt_data_dificil2 = new javax.swing.JLabel();
        txt_data_dificil3 = new javax.swing.JLabel();
        txt_data_dificil4 = new javax.swing.JLabel();
        txt_data_dificil5 = new javax.swing.JLabel();
        txt_data_dificil6 = new javax.swing.JLabel();
        txt_data_dificil7 = new javax.swing.JLabel();
        txt_data_dificil8 = new javax.swing.JLabel();
        txt_data_dificil9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_jogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("RANK DIFÍCIL");

        btn_voltar.setText("< VOLTAR");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        painel2.setBackground(new java.awt.Color(90, 251, 108));

        txt_jogador_dificil0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil0.setText("jLabel2");

        txt_jogador_dificil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil1.setText("jLabel2");

        txt_jogador_dificil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil2.setText("jLabel2");

        txt_jogador_dificil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil3.setText("jLabel2");

        txt_jogador_dificil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil4.setText("jLabel2");

        txt_jogador_dificil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil5.setText("jLabel2");

        txt_jogador_dificil6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil6.setText("jLabel2");

        txt_jogador_dificil7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil7.setText("jLabel2");

        txt_jogador_dificil8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil8.setText("jLabel2");

        txt_jogador_dificil9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_jogador_dificil9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_jogador_dificil9.setText("jLabel2");

        txt_pontos_dificil0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil0.setText("jLabel2");

        txt_pontos_dificil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil1.setText("jLabel2");

        txt_pontos_dificil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil2.setText("jLabel2");

        txt_pontos_dificil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil3.setText("jLabel2");

        txt_pontos_dificil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil4.setText("jLabel2");

        txt_pontos_dificil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil5.setText("jLabel2");

        txt_pontos_dificil6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil6.setText("jLabel2");

        txt_pontos_dificil7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil7.setText("jLabel2");

        txt_pontos_dificil8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil8.setText("jLabel2");

        txt_pontos_dificil9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_pontos_dificil9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_pontos_dificil9.setText("jLabel2");

        txt_data_dificil0.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil0.setText("jLabel2");

        txt_data_dificil1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil1.setText("jLabel2");

        txt_data_dificil2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil2.setText("jLabel2");

        txt_data_dificil3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil3.setText("jLabel2");

        txt_data_dificil4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil4.setText("jLabel2");

        txt_data_dificil5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil5.setText("jLabel2");

        txt_data_dificil6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil6.setText("jLabel2");

        txt_data_dificil7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil7.setText("jLabel2");

        txt_data_dificil8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil8.setText("jLabel2");

        txt_data_dificil9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_data_dificil9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_data_dificil9.setText("jLabel2");

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
                            .addComponent(txt_jogador_dificil9)
                            .addComponent(txt_jogador_dificil7)
                            .addComponent(txt_jogador_dificil5)
                            .addComponent(txt_jogador_dificil4)
                            .addComponent(txt_jogador_dificil3)
                            .addComponent(txt_jogador_dificil2)
                            .addComponent(txt_jogador_dificil1)
                            .addComponent(txt_jogador_dificil0)
                            .addComponent(txt_jogador_dificil6)
                            .addComponent(txt_jogador_dificil8))
                        .addGap(187, 187, 187)
                        .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pontos_dificil0)
                            .addComponent(txt_pontos_dificil1)
                            .addComponent(txt_pontos_dificil2)
                            .addComponent(txt_pontos_dificil3)
                            .addComponent(txt_pontos_dificil4)
                            .addComponent(txt_pontos_dificil5)
                            .addComponent(txt_pontos_dificil6)
                            .addComponent(txt_pontos_dificil7)
                            .addComponent(txt_pontos_dificil8)
                            .addComponent(txt_pontos_dificil9))
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
                                .addComponent(txt_data_dificil0)
                                .addComponent(txt_data_dificil1))
                            .addGap(119, 119, 119))
                        .addGroup(painel2Layout.createSequentialGroup()
                            .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_data_dificil2)
                                .addComponent(txt_data_dificil3)
                                .addComponent(txt_data_dificil4)
                                .addComponent(txt_data_dificil5)
                                .addComponent(txt_data_dificil6)
                                .addComponent(txt_data_dificil7)
                                .addComponent(txt_data_dificil8)
                                .addComponent(txt_data_dificil9))
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
                    .addComponent(txt_jogador_dificil0)
                    .addComponent(txt_pontos_dificil0)
                    .addComponent(txt_data_dificil0))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_dificil1)
                    .addComponent(txt_pontos_dificil1)
                    .addComponent(txt_data_dificil1))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_dificil2)
                    .addComponent(txt_pontos_dificil2)
                    .addComponent(txt_data_dificil2))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_dificil3)
                    .addComponent(txt_pontos_dificil3)
                    .addComponent(txt_jogador_dificil3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_dificil4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_dificil4)
                    .addComponent(txt_data_dificil4))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_dificil5)
                    .addComponent(txt_pontos_dificil5)
                    .addComponent(txt_jogador_dificil5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_dificil6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_dificil6)
                    .addComponent(txt_data_dificil6))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_dificil7)
                    .addComponent(txt_pontos_dificil7)
                    .addComponent(txt_jogador_dificil7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jogador_dificil8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pontos_dificil8)
                    .addComponent(txt_data_dificil8))
                .addGap(18, 18, 18)
                .addGroup(painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data_dificil9)
                    .addComponent(txt_pontos_dificil9)
                    .addComponent(txt_jogador_dificil9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(btn_jogar)
                        .addGap(152, 152, 152)))
                .addGap(107, 107, 107))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_voltar))
                .addGap(35, 35, 35)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_jogar)
                .addContainerGap(94, Short.MAX_VALUE))
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
        this.nova_janela = new Jogar(2);
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
            java.util.logging.Logger.getLogger(Rank_Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rank_Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rank_Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rank_Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rank_Dificil().setVisible(true);
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
    private javax.swing.JLabel txt_data_dificil0;
    private javax.swing.JLabel txt_data_dificil1;
    private javax.swing.JLabel txt_data_dificil2;
    private javax.swing.JLabel txt_data_dificil3;
    private javax.swing.JLabel txt_data_dificil4;
    private javax.swing.JLabel txt_data_dificil5;
    private javax.swing.JLabel txt_data_dificil6;
    private javax.swing.JLabel txt_data_dificil7;
    private javax.swing.JLabel txt_data_dificil8;
    private javax.swing.JLabel txt_data_dificil9;
    private javax.swing.JLabel txt_jogador_dificil0;
    private javax.swing.JLabel txt_jogador_dificil1;
    private javax.swing.JLabel txt_jogador_dificil2;
    private javax.swing.JLabel txt_jogador_dificil3;
    private javax.swing.JLabel txt_jogador_dificil4;
    private javax.swing.JLabel txt_jogador_dificil5;
    private javax.swing.JLabel txt_jogador_dificil6;
    private javax.swing.JLabel txt_jogador_dificil7;
    private javax.swing.JLabel txt_jogador_dificil8;
    private javax.swing.JLabel txt_jogador_dificil9;
    private javax.swing.JLabel txt_pontos_dificil0;
    private javax.swing.JLabel txt_pontos_dificil1;
    private javax.swing.JLabel txt_pontos_dificil2;
    private javax.swing.JLabel txt_pontos_dificil3;
    private javax.swing.JLabel txt_pontos_dificil4;
    private javax.swing.JLabel txt_pontos_dificil5;
    private javax.swing.JLabel txt_pontos_dificil6;
    private javax.swing.JLabel txt_pontos_dificil7;
    private javax.swing.JLabel txt_pontos_dificil8;
    private javax.swing.JLabel txt_pontos_dificil9;
    // End of variables declaration//GEN-END:variables
}
