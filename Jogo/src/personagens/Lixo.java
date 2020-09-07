package personagens;

// Imports
import java.awt.image.BufferedImage; // armazena imagem
import java.io.File; // carrega imagem do computador
import javax.imageio.ImageIO; // transforma a imagem em bits
import java.io.IOException; // exceção se caso a imagem não for encontrada


import conexao_banco.Conexao; // conexão com o banco de dados

import java.awt.Graphics;
import java.util.Random;
import javax.swing.JOptionPane;


public final class Lixo {
    /* Atributos */
    private final int COMPRIMENTO = 70;
    private final int ALTURA = 70;
    private final int HINTS = 0;
    private int posicao_x; // definida aleatoriamente
    private int posicao_y = 0;
    
    private int velocidade; // definida aleatoriamente
    
    private int id; // identificador do lixo
    private int dificuldade; // identificador da dificuldade
    private BufferedImage imagem; // armazena imagem do lixo
    
    private Conexao conexao; // conexão com banco de dados
    private Lixeira lixeira; // lixeira controlada pelo jogador
    
    /* Propriedades */
    
    // posicao_x
    public int getPosicao_x() {
        return posicao_x;
    }

    public void setPosicao_x(int posicao_x) {
        this.posicao_x = posicao_x;
    }
    
    // posicao_y
    public int getPosicao_y() {
        return posicao_y;
    }

    public void setPosicao_y(int posicao_y) {
        this.posicao_y = posicao_y;
    }
    
    // velocidade
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // dificuldade
    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    // imagem
    protected BufferedImage getImagem() {
        return (this.imagem);
    }
    
    protected void setImagem() {
        // Busca da imagem no banco de dados
        this.setConexao(new Conexao());
        
        try {
            this.getConexao().Selecionar_Lixos(this.getDificuldade()); // busca da imagem
            this.imagem = ImageIO.read(new File(this.getConexao().getPersonagens(this.getId()))); // armazenamento
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        this.getConexao().Limpar_Memoria_Personagens(); // exclui na RAM todas as imagens coletadas no banco
    }
    
    // conexao
    public Conexao getConexao() {
        return (this.conexao);
    }
    
    public void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }
    
    // lixeira
    public Lixeira getLixeira() {
        return (this.lixeira);
    }
    
    public void setLixeira(Lixeira lixeira) {
        this.lixeira = lixeira;
    }
    
    // Métodos
    
    /*Definir_Posicao_X
     * Sorteia uma posição_x aleatória de 0 até 875
     - Assintótica: O(1)
    */
    public void Definir_Posicao_X() {
        Random gerador = new Random(); // gerador do número aleatório
        this.setPosicao_x(gerador.nextInt(875));
    }
    
    /*Definir_Velocidade
     * Sorteia uma velocidade aleatória
     - Assintótica: O(1)
    */
    public void Definir_Velocidade() {
        Random gerador = new Random();
        // Deve-se somar a velocidade com 5 caso ela seja 0
        this.setVelocidade(gerador.nextInt(3) + 5); 
    }
    
    /*Mover
     * Movimentação do lixo
     - Assintótica: O(1)
    */
    public void Mover(Lixeira lixeira) {
        // Condições
        boolean limite_y = this.getPosicao_y() + this.getVelocidade() >= 500; // lixo atingiu sua altura limite?
        boolean coletado1 = this.getPosicao_y() + this.ALTURA >= lixeira.getPosicao_y(); // lixo está numa altura maior ou igual à da lixeira?
        boolean coletado2 = this.getPosicao_x() + this.COMPRIMENTO >= lixeira.getPosicao_x(); // lixo entre a posição x da lixeira?
        boolean coletado3 = this.getPosicao_x() <= lixeira.getPosicao_x() + lixeira.COMPRIMENTO; // lixo entre a posição x da lixeira?
        boolean coletado4 = this.getId() == lixeira.getId(); // id do lixo é igual à da lixeira?
        
        // Movimento
        
        // Se lixo não foi coletado ou não atingiu seu limite de altura
        // Continuará caindo
        if(!((limite_y) || (coletado1 && coletado2 && coletado3))) {
            this.setPosicao_y(this.getPosicao_y() + this.getVelocidade());
        }
        
        // Caso contrário, terá sua posição y zerada
        // E sua posição x alterada aleatoriamente
        else {
            // Lixo coletado
            if(coletado1 && coletado2 && coletado3) {
                // Caso a id dele for igual à da Lixeira
                // Jogador ganha pontos
                if(coletado4) {
                    this.getLixeira().Ganhar_Pontos();                  
                }
                
                // Caso contrário, perde tanto pontos quanto vida
                else {
                    this.getLixeira().Perder_Pontos();
                    this.getLixeira().Perder_Vida();
                }
            }
            
            // Lixo não coletado
            else {
                // Se o lixo perdido for do mesmo tipo da lixeira
                // Jogador perde vida
                if (this.getId() == this.getLixeira().getId()) {
                    this.getLixeira().Perder_Vida();
                }
            }
            
            // Redefinição da posição x e y e da velocidade      
            this.Definir_Posicao_X();
            this.setPosicao_y(0);
            this.Definir_Velocidade();
        }
           
    }
    
    /*paint*/
    public void paint(Graphics g) {
        g.drawImage(this.getImagem().getScaledInstance(this.COMPRIMENTO, this.ALTURA, this.HINTS), this.getPosicao_x(), this.getPosicao_y(), null);
        this.Mover(this.getLixeira());
    }
    
    // Construtor
    public Lixo(int dificuldade, int id, Lixeira lixeira) {
        this.Definir_Posicao_X();
        this.Definir_Velocidade();
        this.setDificuldade(dificuldade);
        this.setId(id);
        this.setLixeira(lixeira);
        this.setImagem();
    }

  
}
