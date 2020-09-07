package panels;

// Imports
import java.awt.Graphics;

import personagens.Lixeira;
import personagens.Lixo;

public final class Fundo_Jogar extends Panel_Template0 {
    /* Atributos */
    private int dificuldade;
    public Lixeira lixeira;
    public static boolean JOGANDO = true;
    /*
     * true -> jogo em andamento
     * false -> jogo pausdao ou finalizado
    */
    private Lixo[] lixos;
    /*
        * Fáci -> 4 posições (papel, metal, vidro, plástico)
        * Médio -> 7 posições (fácil + orgânico, não reciclável, radioativo)
        * Difícil -> 10 posições (médio + hospitalar, madeira, perigoso)
    */
    
    /* Propriedades */
    // dificuldade
    public int getDificuldade() {
        return (this.dificuldade);
    }
    
    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    // lixeira
    public Lixeira getLixeira() {
        return (this.lixeira);
    }
    
    public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }
    
    // lixos
    public Lixo getLixos(int index) {
        return (this.lixos[index]);
    }
    
    public void setLixos(int index, Lixo lixo) {
        this.lixos[index] = lixo;
    }
    
    /* Construtor */
    public Fundo_Jogar(int dificuldade, Lixeira lixeira) {
        // Configurações dos componentes
        this.setDificuldade(dificuldade);
        this.setLixeira(lixeira);
        
        switch(this.dificuldade) {
            // Fácil
            case 0:
                this.lixos = new Lixo[4];
                this.setLixos(0, new Lixo(this.getDificuldade(), 0, this.getLixeira())); // papel
                this.setLixos(1, new Lixo(this.getDificuldade(), 1, this.getLixeira())); // vidro
                this.setLixos(2, new Lixo(this.getDificuldade(), 2, this.getLixeira())); // metal
                this.setLixos(3, new Lixo(this.getDificuldade(), 3, this.getLixeira())); // plástico                             
                break;
            
            // Médio
            case 1:
                this.lixos = new Lixo[7];
                this.setLixos(0, new Lixo(this.getDificuldade(), 0, this.getLixeira())); // papel
                this.setLixos(1, new Lixo(this.getDificuldade(), 1, this.getLixeira())); // vidro
                this.setLixos(2, new Lixo(this.getDificuldade(), 2, this.getLixeira())); // metal
                this.setLixos(3, new Lixo(this.getDificuldade(), 3, this.getLixeira())); // plástico 
                this.setLixos(4, new Lixo(this.getDificuldade(), 4, this.getLixeira())); // não reciclável
                this.setLixos(5, new Lixo(this.getDificuldade(), 5, this.getLixeira())); // orgânico
                this.setLixos(6, new Lixo(this.getDificuldade(), 6, this.getLixeira())); // radioativo 
                break;
                
            // Difícil
            default:
                this.lixos = new Lixo[10];
                this.setLixos(0, new Lixo(this.getDificuldade(), 0, this.getLixeira())); // papel
                this.setLixos(1, new Lixo(this.getDificuldade(), 1, this.getLixeira())); // vidro
                this.setLixos(2, new Lixo(this.getDificuldade(), 2, this.getLixeira())); // metal
                this.setLixos(3, new Lixo(this.getDificuldade(), 3, this.getLixeira())); // plástico 
                this.setLixos(4, new Lixo(this.getDificuldade(), 4, this.getLixeira())); // não reciclável
                this.setLixos(5, new Lixo(this.getDificuldade(), 5, this.getLixeira())); // orgânico
                this.setLixos(6, new Lixo(this.getDificuldade(), 6, this.getLixeira())); // radioativo 
                this.setLixos(7, new Lixo(this.getDificuldade(), 7, this.getLixeira())); // perigoso
                this.setLixos(8, new Lixo(this.getDificuldade(), 8, this.getLixeira())); // hospitalar
                this.setLixos(9, new Lixo(this.getDificuldade(), 9, this.getLixeira())); // madeira
                break;           
        }
        
        // Inicilização das configurações padrões do JPanel
        initComponents();
        
        // Carregamento da imagem
        this.setImagem();
        
    }
    
    
    /*paint*/
    public void paint(Graphics g) {
        // Desenhar imagem de fundo e Lixeira
        g.drawImage(this.getImagem().getScaledInstance(super.COMPRIMENTO, super.ALTURA, super.HINTS), super.POSICAO_X, super.POSICAO_Y, null);
        this.getLixeira().paint(g);
        
        // Desenhar Lixos de acordo com a dificuldade do jogo
        switch(this.getDificuldade()) {
            // Fácil
            case 0:
                // Desenhar lixos
                this.getLixos(0).paint(g);
                this.getLixos(1).paint(g);
                this.getLixos(2).paint(g);
                this.getLixos(3).paint(g);
               
                // Se jogador ter vidas e status do jogo for true
                // Os lixos se movem
                if (this.getLixeira().getVida() > 0 && this.JOGANDO) {
                    // Iniciar movimentação dos lixos
                    this.getLixos(0).Mover(this.getLixeira()); 
                    this.getLixos(1).Mover(this.getLixeira());
                    this.getLixos(2).Mover(this.getLixeira());
                    this.getLixos(3).Mover(this.getLixeira());
                }
                break;
                
            // Médio
            case 1:
                // Desenhar lixos
                this.getLixos(0).paint(g);
                this.getLixos(1).paint(g);
                this.getLixos(2).paint(g);
                this.getLixos(3).paint(g);
                this.getLixos(4).paint(g);
                this.getLixos(5).paint(g);
                this.getLixos(6).paint(g);

                // Se jogador ter vidas e status do jogo for true
                // Os lixos se movem
                if (this.getLixeira().getVida() > 0 && this.JOGANDO) {
                    // Iniciar movimentação dos lixos
                    this.getLixos(0).Mover(this.getLixeira()); 
                    this.getLixos(1).Mover(this.getLixeira());
                    this.getLixos(2).Mover(this.getLixeira());
                    this.getLixos(3).Mover(this.getLixeira());
                    this.getLixos(4).Mover(this.getLixeira());
                    this.getLixos(5).Mover(this.getLixeira());
                    this.getLixos(6).Mover(this.getLixeira());
                }
                break;
                
            // Difícil
            default:
                // Desenhar lixos
                this.getLixos(0).paint(g);
                this.getLixos(1).paint(g);
                this.getLixos(2).paint(g);
                this.getLixos(3).paint(g);
                this.getLixos(4).paint(g);
                this.getLixos(5).paint(g);
                this.getLixos(6).paint(g);
                this.getLixos(7).paint(g);
                this.getLixos(8).paint(g);
                this.getLixos(9).paint(g);
                
                // Se jogador ter vidas e status do jogo for true
                // Os lixos se movem
                if (this.getLixeira().getVida() > 0 && this.JOGANDO) {
                    // Iniciar movimentação dos lixos
                    this.getLixos(0).Mover(this.getLixeira()); 
                    this.getLixos(1).Mover(this.getLixeira());
                    this.getLixos(2).Mover(this.getLixeira());
                    this.getLixos(3).Mover(this.getLixeira());
                    this.getLixos(4).Mover(this.getLixeira());
                    this.getLixos(5).Mover(this.getLixeira());
                    this.getLixos(6).Mover(this.getLixeira());
                    this.getLixos(7).Mover(this.getLixeira());
                    this.getLixos(8).Mover(this.getLixeira());
                    this.getLixos(9).Mover(this.getLixeira());
                }
                break;
        }
        
        // Se jogador ter vidas e status do jogo for true
        // Frames continuam sendo atualizados
        if(this.getLixeira().getVida() > 0 && this.JOGANDO) {
            repaint();
        }
    }
    
    // Personalização dos componentes
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Movimento do Mouse na janela
    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // Se jogador ter vidas, posição do mouse é passada à posição x
        // da lixeira e a mesma é atualizada no frame
        if(this.getLixeira().getVida() > 0 && this.JOGANDO) {
            this.getLixeira().Mover(evt.getX());
            repaint();
        }
    }//GEN-LAST:event_formMouseMoved

    // Clique do mouse na janela
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // Se jogador ter vidas, uma nova cor é atribuída à lixeira
        // e a mesma é atualizada no frame
        if (this.getLixeira().getVida() > 0 && this.JOGANDO) {
            this.getLixeira().Trocar_Cor();
            repaint();
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
