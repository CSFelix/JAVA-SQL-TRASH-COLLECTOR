package panels;

// Imports
import frames.Frame_Template2;
import frames.Informacoes_Lixeiras;
import personagens.Lixeira;

import java.awt.Graphics;

import conexao_banco.Conexao;

public class Fundo_Wiki extends Panel_Template0 {
    /* Atributos */
    private Lixeira[] lixeiras = new Lixeira[10];
    private Frame_Template2 nova_janela;
    private Conexao conexao;
    
    /* Propriedades */
    
    // lixeiras
    public Lixeira getLixeiras(int index) {
        return (this.lixeiras[index]);
    }
    
    public void setLixeiras() {
        // Coluna 1
        this.lixeiras[0] = new Lixeira(200, 150, 0);
        this.lixeiras[1] = new Lixeira(200, 300, 1);
        this.lixeiras[2] = new Lixeira(200, 450, 2);
        
        // Coluna 2
        this.lixeiras[3] = new Lixeira(375, 150, 3);
        this.lixeiras[4] = new Lixeira(375, 300, 4);
        this.lixeiras[5] = new Lixeira(375, 450, 5);
        
        // Coluna 3
        this.lixeiras[6] = new Lixeira(550, 150, 6);
        this.lixeiras[7] = new Lixeira(550, 300, 7);
        this.lixeiras[8] = new Lixeira(550, 450, 8);
    
        // Coluna 4
        this.lixeiras[9] = new Lixeira(725, 300, 9);
    }
    
    // conexao
    public Conexao getConexao() {
        return (this.conexao);
    }
    
    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }
    /* paint */
    public void paint(Graphics g) {
        // Desenha imagem de fundo
        g.drawImage(this.getImagem().getScaledInstance(super.COMPRIMENTO, super.ALTURA, super.HINTS), super.POSICAO_X, super.POSICAO_Y, null);
        
        // Desenha lixeiras
        
        /* Coluna 1 */
        this.getLixeiras(0).paint(g);
        this.getLixeiras(1).paint(g);
        this.getLixeiras(2).paint(g);
        
        /* Coluna 2 */
        this.getLixeiras(3).paint(g);
        this.getLixeiras(4).paint(g);
        this.getLixeiras(5).paint(g);
        
        /* Coluna 3 */
        this.getLixeiras(6).paint(g);
        this.getLixeiras(7).paint(g);
        this.getLixeiras(8).paint(g);
    
        /* Coluna 4 */
        this.getLixeiras(9).paint(g);
    }
    
    /* Construtor */
    public Fundo_Wiki() {
        // Inicialização dos componentes
        initComponents();
        
        // Set da imagem de fundo e das lixeiras
        this.setImagem();
        this.setLixeiras();
        
        // Seleção dos lixos
        this.setConexao(new Conexao());
        this.getConexao().Selecionar_Lixos(2);
    }

    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 898, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Clique do mouse
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /* Condições */
        boolean lixeira0 = (evt.getX() >= 200 && evt.getX() <= 275) && (evt.getY() >= 150 && evt.getY() <= 250); // papel
        boolean lixeira1 = (evt.getX() >= 200 && evt.getX() <= 275) && (evt.getY() >= 300 && evt.getY() <= 400); // vidro
        boolean lixeira2 = (evt.getX() >= 200 && evt.getX() <= 275) && (evt.getY() >= 450 && evt.getY() <= 550); // metal
        boolean lixeira3 = (evt.getX() >= 375 && evt.getX() <= 450) && (evt.getY() >= 150 && evt.getY() <= 250); // plástico
        boolean lixeira4 = (evt.getX() >= 375 && evt.getX() <= 450) && (evt.getY() >= 300 && evt.getY() <= 400); // não reciclável
        boolean lixeira5 = (evt.getX() >= 375 && evt.getX() <= 450) && (evt.getY() >= 450 && evt.getY() <= 550); // orgânico
        boolean lixeira6 = (evt.getX() >= 550 && evt.getX() <= 625) && (evt.getY() >= 150 && evt.getY() <= 250); // radioativo
        boolean lixeira7 = (evt.getX() >= 550 && evt.getX() <= 625) && (evt.getY() >= 300 && evt.getY() <= 400); // perigoso
        boolean lixeira8 = (evt.getX() >= 550 && evt.getX() <= 625) && (evt.getY() >= 450 && evt.getY() <= 550); // hospitalar
        boolean lixeira9 = (evt.getX() >= 725 && evt.getX() <= 800) && (evt.getY() >= 300 && evt.getY() <= 400); // madeira
        
        /* Informações para o frame */
        String titulo;
        String descricao;
        String lixo0, lixo1, lixo2;
        String imagem;
        
        /* Verificação se alguma lixeira foi clicada */
        if (lixeira0 || lixeira1 || lixeira2 || lixeira3 || lixeira4 || lixeira5
            || lixeira6 || lixeira7 || lixeira8 || lixeira9) {
            
            // Atribuição das informações
            
            /* Papel */
            if (lixeira0) {
                titulo = "PAPEL -> AZUL";
                descricao = "Nesta lixeira são descartados lixos relacionados a papéis";
                lixo0 = "Folhas de caderno";
                lixo1 = "Jornal";
                lixo2 = "Papelão";
                imagem = this.getConexao().getPersonagens(0);
            }
            
            /* Vidro */
            else if (lixeira1) {
                titulo = "VIDRO -> VERDE";
                descricao = "Nesta lixeira são descartados lixos relacionados a vidros e porcelanas";
                lixo0 = "Lâmpadas";
                lixo1 = "Garrafas de Vidro";
                lixo2 = "Janelas";
                imagem = this.getConexao().getPersonagens(1);
            }
            
            /* Metal */
            else if (lixeira2) {
                titulo = "METAL -> AMARELA";
                descricao = "Nesta lixeira são descartados lixos relacionados a metais e alumínios";
                lixo0 = "Tampinahs de garrafas";
                lixo1 = "Panelas";
                lixo2 = "Latinhas de refrigerante";
                imagem = this.getConexao().getPersonagens(2);
            }
            
            /* Plástico */
            else if (lixeira3) {
                titulo = "PLÁSTICO -> VERMELHA";
                descricao = "Nesta lixeira são descartados lixos relacionados a plásticos";
                lixo0 = "Embalagens";
                lixo1 = "Sacolas plásticas";
                lixo2 = "Garrafas pets";
                imagem = this.getConexao().getPersonagens(3);
            }
            
            /* Não Reciclável */
            else if (lixeira4) {
                titulo = "NÃO RECICLÁVEL -> CINZA";
                descricao = "Nesta lixeira são descartados lixos que não podem ser reciclados";
                lixo0 = "Fraldas de bebês";
                lixo1 = "Fósforos";
                lixo2 = "Chicletes";
                imagem = this.getConexao().getPersonagens(4);
            }
            
            /* Orgânico */
            else if (lixeira5) {
                titulo = "ORGÂNICO -> MARROM";
                descricao = "Nesta lixeira são descartados alimentos";
                lixo0 = "Vegetais";
                lixo1 = "Restos de alimentos";
                lixo2 = "Cascas de frutas";
                imagem = this.getConexao().getPersonagens(5);
            }
            
            /* Radioativo */
            else if (lixeira6) {
                titulo = "RADIOATIVO -> ROXA";
                descricao = "Nesta lixeira são descartados objetos radioativos";
                lixo0 = "Placas de raio-x";
                lixo1 = "Contrastes";
                lixo2 = "Urânio";
                imagem = this.getConexao().getPersonagens(6);
            }
            
            /* Perigoso */
            else if (lixeira7) {
                titulo = "PERIGOSO -> LARANJA";
                descricao = "Nesta lixeira são descartados lixos eletrônicos";
                lixo0 = "Capacitores";
                lixo1 = "Baterias";
                lixo2 = "Pilhas";
                imagem = this.getConexao().getPersonagens(7);
            }
            
            /* Hospitalar */
            else if (lixeira8) {
                titulo = "HOSPITALAR -> BRANCA";
                descricao = "Nesta lixeira são descartados lixos hospitalares";
                lixo0 = "Máscaras de operação";
                lixo1 = "Luvas";
                lixo2 = "Seringas";
                imagem = this.getConexao().getPersonagens(8);
            }
            
            /* Madeira */
            else {
                titulo = "MADEIRA -> PRETA";
                descricao = "Nesta lixeira são descartados lixos de madeira";
                lixo0 = "Madeira pintada";
                lixo1 = "Troncos de árvores";
                lixo2 = "Palitos de picolé";
                imagem = this.getConexao().getPersonagens(9);
            }
            
            // Instanciação do frame "Informacoes_Lixeiras"
            this.nova_janela = new Informacoes_Lixeiras(titulo, descricao, lixo0, lixo1, lixo2, imagem);
            this.nova_janela.setVisible(true);
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}