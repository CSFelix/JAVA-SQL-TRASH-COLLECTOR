package panels;

// Imports
import java.awt.image.BufferedImage; // Armazena imagem
import java.io.File; // Leitura de arquivos (imagem)
import java.io.IOException; // Exceção caso um diretório de arquivo for informado incorretamente
import javax.imageio.ImageIO; // Transforma imagem em BufferedImage

import java.awt.Graphics; // Desenha panel
import javax.swing.JOptionPane;

import conexao_banco.Conexao; // conexão com o banco de dados

public abstract class Panel_Template0 extends javax.swing.JPanel {
    /* Atributos */
    protected final int COMPRIMENTO = 900;
    protected final int ALTURA = 700;
    protected final int HINTS = 0;
    protected final int POSICAO_X = 0;
    protected final int POSICAO_Y = 0;
    private Conexao conexao; 
    private BufferedImage imagem; // armazena imagem de fundo
    
    /* Propriedades */
    
    // conexao
    protected Conexao getConexao() {
        return (this.conexao);
    }
    
    protected void setConexao(Conexao conexao) {
        this.conexao = conexao;
    }
    
    // imagem
    protected BufferedImage getImagem() {
        return (this.imagem);
    }
    
    protected void setImagem() {
        try {
            this.setConexao(new Conexao());
            this.getConexao().Selecionar_Cenario();
            this.imagem = ImageIO.read(new File(this.getConexao().getCenario()));
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    // Métodos
    @Override
    protected void paintComponent(Graphics g) {
        // "Desenha" a imagem de fundo no painel
        super.paintComponent(g);
        g.drawImage(this.getImagem().getScaledInstance(this.COMPRIMENTO, this.ALTURA, this.HINTS), this.POSICAO_X, this.POSICAO_Y, null);
    }
   
    // Construtor
    public Panel_Template0() {}
}
