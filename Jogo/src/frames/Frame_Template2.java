package frames;

// Imports

public class Frame_Template2 extends javax.swing.JFrame{
    /* Atributos */
    private final int COMPRIMENTO = 530;
    private final int ALTURA = 345;
    private final String NOME_JOGO = "TRASH ROYALE";  
    
    /* Métodos */
    protected void Config_Padrao() {
        this.setSize(this.COMPRIMENTO, this.ALTURA); // Definir tamanho do frame
        this.setTitle(this.NOME_JOGO); // Definir título ao frame
        this.setDefaultCloseOperation(super.DISPOSE_ON_CLOSE); // Encerrar frame ao fechar frame
        this.setResizable(false); // Impossibilitar redimensionamento do frame
        this.setLocationRelativeTo(null); // Centrar frame no centro da tela
        this.setVisible(true); // torna frame visível
    }
    
    /* Construtor */
    public Frame_Template2() {}
}
