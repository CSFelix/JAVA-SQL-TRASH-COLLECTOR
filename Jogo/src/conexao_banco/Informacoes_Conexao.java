package conexao_banco;

// Imports

public abstract class Informacoes_Conexao {
    /*
        Esta classe é apenas para definir porta, usuário e senha do banco
    de dados. As informações contidas aqui podem ser modificadas conforme
    necessidade.
        Nem tive o trabalho de encriptar a senha '-'. Estava pensando em
    salvar estas informações encriptadas num arquivo txt. Quem sabe numa
    outra eventualidade?!
    */
    
    // Atributos
    public static String PORTA = "5432";
    public static String USUARIO = "postgres";
    public static String SENHA = "unip";
}
