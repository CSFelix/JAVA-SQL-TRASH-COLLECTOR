package personagens;

// Imports
import java.awt.Color; // oferece cores à lixeira
import java.awt.Graphics; // desenha a lixeira em 2D
import java.util.Random; // sorteia um inteiro aleatório (usado para definir cor 
// inicial da lixeira e na ação Trocar_Cor)

public final class Lixeira {
    /* Atributos */
    public final int COMPRIMENTO = 75;
    public final int ALTURA = 100;
    public  int posicao_y;
    private int posicao_x;
        
    private int id; // identificador da lixeira
    private int pontos = 0; // todo jogo começa com pontos zerados
    private int vida = 5; // todo jogo começa com três vidas
    
    private Color[] cores = new Color[10]; // armazena as dez cores da lixeira
    /*
        * Azul -> Papel
        * Amarela -> Metal
        * Vermelha -> Plástico
        * Verde -> Vidro
        * Cinza -> Não Reciclável
        * Marrom -> Orgânico
        * Laranja -> Perigoso
        * Roxa -> Radioativo
        * Branca -> Hospitalar
        * Preta -> Madeira
    */
    private Color cor_atual; // armazena cor atual da lixeira
    
    private int dificuldade; // dificuldade do jogo
    /*
        * 0 -> Fácil
        * 1 -> Médio
        * 2 -> Difícil
    */
    
    /* Propriedades */
    // posicao_y
    public int getPosicao_y() {
        return (this.posicao_y);
    }
    
    public void setPosicao_y(int y) {
        this.posicao_y = y;
    }
    
    // posicao_x
    public int getPosicao_x() {
        return posicao_x;
    }

    public void setPosicao_x(int posicao_x) {
        this.posicao_x = posicao_x;
    }

    // id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // pontos
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    // vida
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    // cores[10]
    public Color getCores(int index) {
        return cores[index];
    }

    public void setCores() {
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

    // cor_atual
    public Color getCor_atual() {
        return cor_atual;
    }

    public void setCor_atual(int index) {
        this.cor_atual = this.getCores(index);
    }
    
    // dificuldade
    private int getDificuldade() {
        return (this.dificuldade);
    }
    
    private void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    } 
    
    /* Métodos */
    
    /*Ganhar_Pontos
     * Obtenção de pontos:
        * Fácil -> 5 em 5
        * Médio -> 15 em 15
        * Difícil -> 30 em 30
    
      - Assintótica: O(1)
    */
    public void Ganhar_Pontos() {
        // Definição da dificuldade do jogo e incremento dos pontos
        int incremento;
        
        switch(this.getDificuldade()) {
            // Fácil
            case 0:
                incremento = 5;
                break;
                
            // Médio
            case 1:
                incremento = 15;
                break;
            
            // Difícil
            default:
                incremento = 25;
                break;
        }
        
        // Incremento da pontuação
        this.setPontos(this.getPontos() + incremento);
    }
    
    /*Perder_Pontos
     * Obtenção de pontos:
      * dificuldade = 0 -> 5 em 5 (fácil)
      * dificuldade = 1 -> 15 em 15 (médio)
      * dificuldade = 2 -> 25 em 25 (difícil)
    
      - Assintótica: O(1)
    */
    public void Perder_Pontos() {
        // Definição da dificuldade do jogo e incremento dos pontos
        int decremento;
        
        switch(this.getDificuldade()) {
            // Fácil
            case 0:
                decremento = 5;
                break;
            
            // Médio
            case 1:
                decremento = 15;
                break;
                
            // Difícil
            default:
                decremento = 25;
                break;
        }
        
        // Incremento da pontuação
        
        // Se após implementar incremento pontuação for maior ou igual a zero
        // Pontuação é decrementada
        if (this.getPontos() - decremento > 0) {
            this.setPontos(this.getPontos() - decremento);
        }
        
        // Caso contrário, será zerada
        else {         
            this.setPontos(0);
        } 
    }
    
    /*Ganhar_Vida
     * Vida é incrementada de 1 em 1
     - Assintótica: O(1)
    */
    public void Ganhar_Vida() {
        this.setVida(this.getVida() + 1);
    }
    
    /*Perder_Vida
     * Vida é decrementada de 1 em 1
     - Assintótica: O(1)
    */
    public void Perder_Vida() {
        this.setVida(this.getVida() - 1);
    }
    
    /*Mover (deslizamento do mouse)
     * Movimentação da lixeira
     - Assintótica: O(1)
    */
    public void Mover(int nova_posicao) {
        // Definição do incremento
        int incremento;
        
        // Se a nova posição for menor que zero
        // Posição da lixeira será zerada
        if(nova_posicao < 0) {
            incremento = 0;
        }
        
        // Caso seja maior que 900
        // Posição da lixeira será o máximo permitido
        else if(nova_posicao + this.COMPRIMENTO > 900) {
            incremento = 900 - this.COMPRIMENTO;
        }
        
        // Caso contrário, posição será a nova determinada
        else {
            incremento = nova_posicao;
        }
        
        // Incremento da posição
        this.setPosicao_x(incremento);
    }
    
    /*Trocar_Cor (clique do mouse)
     * Trocar cor da lixeira
     - Assintótica: O(1)
    */
    public void Trocar_Cor() {
        // Escolha da lixeira
        /*
         * dificuldade = 0 -> fácil (4 lixeiras)
         * dificuldade = 1 -> médio (7 lixeiras)
         * dificuldade = 2 -> difícil (10 lixeiras)
        */
        Random gerador = new Random(); // gerador de números aleatórios
        int numero_aleatorio; // armazena o número aleatório
        
        // Verificação da dificuldade
        switch(this.getDificuldade()) {
            // Fácil
            case 0:
                numero_aleatorio = gerador.nextInt(4); // 0 - 3
                break;
             
            // Médio
            case 1:
                numero_aleatorio = gerador.nextInt(7); // 0 - 6
                break;
            
            // Difícil
            default:
                numero_aleatorio = gerador.nextInt(10); // 0 - 9
                break;
        }
        
        // Atribuições da identificação da lixeira e de sua cor
        // A "id" corresponde à index da cor no array "Cores"
        this.setId(numero_aleatorio);
        this.setCor_atual(this.getId());
    }
    
    /*paint
        * Desenha a lixeira
        - Assintótica: O(1)
    */
    public void paint(Graphics g) {
        g.setColor(this.getCor_atual());
        g.fillRect(this.getPosicao_x(), this.getPosicao_y(), this.COMPRIMENTO, this.ALTURA);
    }
    
    /* Construtor */
    
    // Usado no frame "JOGAR"
    public Lixeira(int dificuldade) {
        // Definição das posições "x" e "y"
        this.setPosicao_y(500);
        this.setPosicao_x(400);
        
        // Definição dos complementos
        this.setCores(); // memória de cores
        this.Trocar_Cor(); // definição da cor inicial
        this.setDificuldade(dificuldade); // definição da dificuldade do jogo
    }
    
    // Usado no frame "WIKI"
    public Lixeira(int x, int y, int index) {
        // Memória de cores
        this.setCores();

        // Define posições "x" e "y"
        this.setPosicao_x(x);
        this.setPosicao_y(y);
        
        // Define cor da lixeira
        this.setCor_atual(index);
    }
}

