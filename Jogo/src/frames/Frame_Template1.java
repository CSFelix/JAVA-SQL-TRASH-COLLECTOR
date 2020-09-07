package frames;

// Imports

public abstract class Frame_Template1 extends javax.swing.JFrame {
    /* Atributos */
    private final int COMPRIMENTO = 350;
    private final int ALTURA = 225;
    private final String NOME_JOGO = "TRASH ROYALE";  
    
    /* Métodos */
    protected void Config_Padrao() {
        this.setSize(this.COMPRIMENTO, this.ALTURA); // Definir tamanho do frame
        this.setTitle(this.NOME_JOGO); // Definir título ao frame
        this.setDefaultCloseOperation(super.EXIT_ON_CLOSE); // Encerrar frame ao fechar frame
        this.setResizable(false); // Impossibilitar redimensionamento do frame
        this.setLocationRelativeTo(null); // Centrar frame no centro da tela
        this.setVisible(true); // torna frame visível
    }
    
    /* Construtor */
    public Frame_Template1() {}
}
