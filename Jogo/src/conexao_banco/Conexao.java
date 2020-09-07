package conexao_banco;

// Imports
import java.sql.Connection; // Gerencia conexão com banco de dados
import java.sql.DriverManager; // Realiza a tradução dos comandos JAVA para SQL e vice-versa
import java.sql.PreparedStatement; // Prepara comando SQL para ser executado
import java.sql.ResultSet; // Armazena resultados de busca (SELECT) no banco
import java.sql.SQLException; // Exceção durante execução de scripts

import javax.swing.JOptionPane;

public final class Conexao {
    /* Atributos */
    
    /*Objetos para conexão e manipulação de dados no banco*/
    private Connection conexao; // objeto da conexão
    private PreparedStatement stamento; // objeto que prepara comandos SQL paraexecução
    private ResultSet coleta; // objeto que armazena os resultados de busca (SELECT) no banco
    
    /*Textos*/
    private String query; // Armazena o script a ser executado
    
    /*Dados referentes às execuções dos scripts nas tabelas "rank_facil", "rank_medio", "rank_dificil" e "recordes_jogador"*/
    private final int DADOS_COLETADOS_DIFICULDADES = 10; // Quantidade máxima de linhas selecionadas nas tabelas de dificuldades
    private final int DADOS_COLETADOS_RECORDES = 3; // Quantidade máxima de linhas selecionadas na tabela de recordes
    private final int DADOS_COLETADOS_LIXOS = 20; // Quantidade máxima de linhas selecionadas na tabela de personagens
    
    private String[] jogadores = new String[this.DADOS_COLETADOS_DIFICULDADES]; // Armazena os dados contidos na coluna "jogadores" (ranks)
    private String[] pontos = new String[this.DADOS_COLETADOS_DIFICULDADES]; // Armazena os dados contidos na coluna "pontos" (ranks)
    private String[] datas = new String[this.DADOS_COLETADOS_DIFICULDADES]; // Armazena os dados contidos na coluna "data_jogo" (ranks)
    
    private String cenario; // Armazena o dado contido na coluna "diretório" (imagens cenários)
    private String[] personagens = new String[this.DADOS_COLETADOS_LIXOS]; // Armazena os dados contidos na coluna "diretório" (iamgens personagens)
    
    /* Propriedades */
    
    // conexao
    private Connection getConexao() {
        return (this.conexao);
    }
    
    private void setConexao(Connection driver) {
        this.conexao = driver;
    }
    
    // stamento
    private PreparedStatement getStamento() {
        return (this.stamento);
    }
    
    private void setStamento(Connection stamento, String query) throws SQLException {
        this.stamento = this.getConexao().prepareStatement(query);
    }
    
    // consulta
    private ResultSet getColeta() {
        return (this.coleta);
    }
    
    private void setColeta() throws SQLException {
        this.coleta = this.getStamento().executeQuery();
    }
    
    // query
    private String getQuery() {
        return(this.query);
    }
    
    private void setQuery(String query) {
        this.query = query;
    }
    
    // jogadores
    public String getJogadores(int index) {
        return (this.jogadores[index]);
    }
    
    private void setJogadores(int index, String dado) {
        this.jogadores[index] = dado;
    }
    
    // pontos
    public String getPontos(int index) {
        return (this.pontos[index]);
    }
    
    private void setPontos(int index, String dado) {
        this.pontos[index] = dado;
    }
    
    // datas
    public String getDatas(int index) {
        return (this.datas[index]);
    }
    
    private void setDatas(int index, String dado) {
        this.datas[index] = dado;
    }
    
    // cenario
    public String getCenario() {
        return (this.cenario);
    }
    
    private void setCenario(String dado) {
        this.cenario = dado;
    }
    
    // personagem
    public String getPersonagens(int index) {
        return (this.personagens[index]);
    }
    
    private void setPersonagens(int index, String dado) {
        this.personagens[index] = dado;
    }
    
    // Métodos
    
    /* Testar_Conexao:
        * Testa conexão no banco de dados.
        * Se for bem sucedida, retorn "true",caso contrário, "false"
        - Assintóitica: O(1)
    */
    public boolean Testar_Conexao() {
        // Conexão com o banco
        try {
            Class.forName("org.postgresql.Driver"); // Driver PostgreSQL
            
            this.setConexao(DriverManager.getConnection(
                    "jdbc:postgresql://localhost:" + Informacoes_Conexao.PORTA + "/aps_semestre_3", 
                    Informacoes_Conexao.USUARIO, 
                    Informacoes_Conexao.SENHA)); // Passagem de "porta", "usuário" e "senha" para login no banco de dados
            
            this.getConexao().close(); // fechamento da conexão
            
            // Retorno
            return(true);
        } 
        
        // Classe de Driver incorreta ou Porta/Senha/Usuário incorretos
        catch (ClassNotFoundException | SQLException ex) {
            return(false);
        }
    }
    
    /* Conectar:
     * Realização da conexão no banco para execução de scripts
     - Assintótica: O(1)
    */
    private void Conectar() {
        // Conexão bem sucedida
        try {
            Class.forName("org.postgresql.Driver"); // Driver PostgreSQL
            
            this.setConexao(DriverManager.getConnection(
                    "jdbc:postgresql://localhost:" + Informacoes_Conexao.PORTA + "/aps_semestre_3", 
                    Informacoes_Conexao.USUARIO, 
                    Informacoes_Conexao.SENHA)); // Passagem de "porta", "usuário" e "senha" para login no banco de dados
        } 
        
        // Classe de Driver incorreta ou Porta/Senha/Usuário incorretos
        catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);           
        }
    }
    
    /* Selecionar_Rank:
      * Seleciona linhas referents às tabelas de rank: "rank_facil", "rank_medio", "rank_dificil" e "recordes_jogadores"
      * Sempre selecionará as dez primeiras linhas encontradas
    
      - Parâmetro (index: int):
      * index = 0 -> rank_facil
      * = 1 -> rank_medio
      * = 2 -> rank_dificil
      * = 3 -> recordes_jogador
         
      - Assintótica: O(10)
    */
    public void Selecionar_Rank(int index) {    
        // Definição de qual tabela será feita a consulta dos dados
        switch(index) {
            // Tabela "rank_facil"
            case 0:
                this.setQuery(
                "SELECT jogador, CAST(pontos AS VARCHAR), TO_CHAR(data_jogo, \'DD/MM/YYYY\') AS data_jogo "
                + "FROM rank_facil "
                + "ORDER BY CAST(pontos AS INT) DESC "
                + "LIMIT " + Integer.toString(this.DADOS_COLETADOS_DIFICULDADES) + ";");
                break;
            
            // Tabela "rank_medio"
            case 1:
                this.setQuery(
                "SELECT jogador, CAST(pontos AS VARCHAR), TO_CHAR(data_jogo, \'DD/MM/YYYY\') AS data_jogo "
                + "FROM rank_medio "
                + "ORDER BY CAST(pontos AS INT) DESC "
                + "LIMIT " + Integer.toString(this.DADOS_COLETADOS_DIFICULDADES) + ";");
                break;
                
            // Tabela "rank_dificil"
            case 2:
                this.setQuery(
                "SELECT jogador, CAST(pontos AS VARCHAR), TO_CHAR(data_jogo, \'DD/MM/YYYY\') AS data_jogo "
                + "FROM rank_dificil "
                + "ORDER BY CAST(pontos AS INT) DESC "
                + "LIMIT " + Integer.toString(this.DADOS_COLETADOS_DIFICULDADES) + ";");
                break;
                
            // Tabela "recordes_jogador"
            default:
                this.setQuery(
                "SELECT jogador, CAST(pontos AS VARCHAR), TO_CHAR(data_jogo, \'DD/MM/YYYY\') AS data_jogo "
                + "FROM recordes_jogador "
                + "ORDER BY id_dificuldade ASC "
                + "LIMIT " + Integer.toString(this.DADOS_COLETADOS_RECORDES) + ";");            
        }
    
        // Coleta dos dados no banco
        try {
            this.Conectar();
            this.setStamento(this.getConexao(), this.getQuery()); // Preparação do query
            this.setColeta(); // Armazenação do query
            
            // Passagem dos dados obtidos no query para os arrays
            int i = 0;
            while(this.getColeta().next()) {
                this.setJogadores(i, this.getColeta().getString("jogador"));
                this.setPontos(i, this.getColeta().getString("pontos"));
                this.setDatas(i, this.getColeta().getString("data_jogo"));
                i++;
            } 
        }
        
        // Execução má sucedida
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);           
        }
        
        // Fechamento tanto do script quanto da conexão com o banco
        finally {
            try {
                this.stamento.close();
                this.conexao.close(); 
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
        
    /*Verificar_Rank
     * Verifica se jogador bateu algum placar do rank
     - Assintótica: 0(1)
    */
    public boolean Verificar_Rank(int pontos, int dificuldade) {
        boolean check = false; // informa se jogador bateu algum recorde (true) ou não (false)
        
        // Definição de qual tabela será feita a consulta
        switch(dificuldade) {
            // Fácil
            case 0:
                this.setQuery(
                "SELECT pontos " +
                "FROM rank_facil " +
                "ORDER BY pontos DESC " +
                "LIMIT 1 OFFSET 9");
                break;
                
            // Médio
            case 1:
                this.setQuery(
                "SELECT pontos " +
                "FROM rank_medio " +
                "ORDER BY pontos DESC " +
                "LIMIT 1 OFFSET 9");
                break;
                
            // Difícil
            default:
                this.setQuery(
                "SELECT pontos " +
                "FROM rank_dificil " +
                "ORDER BY pontos DESC " +
                "LIMIT 1 OFFSET 9");
                break;
        }
        
        // Coleta dos dados no banco
        try {       
            this.Conectar();
            this.setStamento(this.getConexao(), this.getQuery()); // Preparação do query
            this.setColeta(); // Armazenação do query  
            this.getColeta().next();
            
            if(this.getColeta().getInt("pontos") <= pontos) {
                check = true;
            }
        }
        
        // Erro de coleta
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        // Fechamento tanto do script quanto da conexão com o banco
        finally {
            try {
                this.stamento.close();
                this.conexao.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
     
        }
        // Retorno do resultado
        // true -> jogador bateu recorde e será adicionado no rank
        // false -> jogador não bateu recorde e não será adicionado no rank
        return(check);
    }
    /*Gravar_Rank
     * Grava dado no banco
     - Assintótica: O(1)
    */
    public void Gravar_Rank(int dificuldade, String jogador, int pontos) {     
        // Definição de qual tabela será feita a consulta
        switch(dificuldade) {
            // Fácil
            case 0:
                this.setQuery(
                        "INSERT INTO rank_facil(jogador, pontos, data_jogo) "
                        + "VALUES(UPPER(?), ?, NOW())");
                break;
                
            // Médio
            case 1:
                this.setQuery(
                        "INSERT INTO rank_medio(jogador, pontos, data_jogo) "
                        + "VALUES(UPPER(?), ?, NOW())");
                break;
                
            // Difícil
            default:
                this.setQuery(
                        "INSERT INTO rank_dificil(jogador, pontos, data_jogo) "
                        + "VALUES(UPPER(?), ?, NOW())");
                break;
        }
        
        // Execução bem sucedida do query
        try {      
            this.Conectar();
            this.setStamento(this.getConexao(), this.getQuery()); // Preparação do query
            
            // Preenchimento dos dados a serem gravados no banco
            this.getStamento().setString(1, jogador);
            this.getStamento().setInt(2, pontos);
            
            // Execução do query
            this.getStamento().executeUpdate();
        }
        
        // Execução má sucedida
        catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
        
        // Fechamento tanto do script quanto da conexão com o banco
        finally {
            try {
                this.stamento.close();
                this.conexao.close();       
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    } 
    
    /*Verificar_Recordes
        * Verifica se algum recorde do jogador foi batido
        - Assintótica: O(1)
    */
    public boolean Verificar_Recordes(int dificuldade, int pontos)  {
        boolean check = false; // retorno
        
        // Definição da dificuldade
        switch(dificuldade) {
            // Fácil
            case 0:
                this.setQuery(
                        "SELECT pontos "
                        + "FROM recordes_jogador "
                        + "WHERE id_dificuldade = 1"
                );
                break;
            
            // Médio
            case 1:
                this.setQuery(
                        "SELECT pontos "
                        + "FROM recordes_jogador "
                        + "WHERE id_dificuldade = 2"
                );
                break;
                
            // Difícil
            default:
                this.setQuery(
                        "SELECT pontos "
                        + "FROM recordes_jogador "
                        + "WHERE id_dificuldade = 3"
                );
                break;
        }
        
        try {
            this.Conectar();
            this.setStamento(this.getConexao(), this.getQuery()); // preparação do query
            this.setColeta(); // armazenamento do query
            this.getColeta().next(); // seleção do ponto armazenado na coleta
            
            if (this.getColeta().getInt("pontos") < pontos) {
                check = true;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            try {
                this.getStamento().close();
                this.getConexao().close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        
        // Retorno
        return(check);
    }
    
    /*Gravar_Recorde
        * Grava recorde do jogador
        - Assintótica: O(1)
    */
    public void Gravar_Recorde(int dificuldade, String jogador, int pontos)  {
        // Definição da dificuldade
        switch(dificuldade) {
            // Fácil
            case 0:
                this.setQuery(
                        "UPDATE recordes_jogador "
                        + "SET jogador = UPPER(?), pontos = ?, data_jogo = NOW() "
                        + "WHERE id_dificuldade = 1;"
                );
                break;
            
            // Médio
            case 1:
                this.setQuery(
                        "UPDATE recordes_jogador "
                        + "SET jogador = UPPER(?), pontos = ?, data_jogo = NOW() "
                        + "WHERE id_dificuldade = 2;"
                );
                break;
                
            // Difícil
            default:
                this.setQuery(
                        "UPDATE recordes_jogador "
                        + "SET jogador = UPPER(?), pontos = ?, data_jogo = NOW() "
                        + "WHERE id_dificuldade = 3;"
                );
                break;
        }
        
        try {
            this.Conectar();
            this.setStamento(this.getConexao(), this.getQuery()); // Preparação do query
            
            // Preenchimento dos dados a serem gravados no banco
            this.getStamento().setString(1, jogador);
            this.getStamento().setInt(2, pontos);
            
            // Execução do query
            this.getStamento().executeUpdate();
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally {
            try {
                this.getStamento().close();
                this.getConexao().close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    /*Selecionar_Fundo
     * Seleciona diretório do fundo padrão do jogo
     - Assintótica: O(1)
    */
    public void Selecionar_Cenario() {
        this.Conectar();
        this.setQuery("SELECT diretorio FROM imagens_cenarios WHERE id_cenario = 1");
        
        // Execução bem-sucedida do query
        try {
            this.setStamento(this.getConexao(), this.getQuery()); // preparação do query
            this.setColeta(); // armazenamento do query
            
            // Passagem dos dados obtidos no query para o array
            this.getColeta().next();
            this.setCenario(this.getColeta().getString("diretorio"));
            int i = 0;
 
        } 
        
        // Execução má sucedida
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        // Fechamento tanto do script quanto da conexão com o banco
        finally {
            try {
                this.stamento.close();
                this.conexao.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }

    /*Selecionar_Lixos
     * Busca pelas imagens dos lixos
     - Assintótica: O(1)
    */
    public void Selecionar_Lixos(int dificuldade) {
        // Definição do query
        switch(dificuldade) {
            // Fácil
            case 0:
                this.setQuery("SELECT diretorio FROM imagens_personagem "
                + "WHERE id_personagem BETWEEN 1 AND 4 "
                + "ORDER BY id_personagem");
                break;
            
            // Médio
            case 1:
                this.setQuery("SELECT diretorio FROM imagens_personagem "
                + "WHERE id_personagem BETWEEN 1 AND 7 "
                + "ORDER BY id_personagem");
                break;
                
            // Difícil
            default:
                this.setQuery("SELECT diretorio FROM imagens_personagem "
                + "WHERE id_personagem BETWEEN 1 AND 10 "
                + "ORDER BY id_personagem");
                break;
        }     
        
        // Coleta das imagens
        try {
            this.Conectar();
            this.setStamento(this.getConexao(), this.getQuery()); // preparação do query
            this.setColeta(); // armazenamento do query
            
            // Passagem dos dados obtidos no query para o array
            int i = 0;
            while(this.getColeta().next()) {
                this.setPersonagens(i, this.getColeta().getString("diretorio"));
                i++;
            }
        } 
        
        // Execução má sucedida
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        // Fechamento tanto do script quanto da conexão com o banco
        finally {
            try {
                this.stamento.close();
                this.conexao.close();
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }
    
    /*Limpar_Memoria_Rank
     * Retira todos os dados armazenados nos arrays "jogadores", "pontos" e "datas"
     - Assintótica: O(10)
    */
    public void Limpar_Memoria_Rank() {
        for(int i = 0; i < this.jogadores.length; i++) {
            this.setJogadores(i, null);
            this.setPontos(i, null);
            this.setDatas(i, null);
        }
    }
    
    /*Limpar_Memoria_Cenarios
     * Retira todos os dados armazenados no array "cenarios"
     - Assintótica: O(3)
    */
    public void Limpar_Memoria_Cenario() {
       this.setCenario(null);
    }
    
    /*Limapr_Memoria_Personagens
     * Retira todos os dados armazenados np array "personagens"
     - Assintótica: O(20)
    */
    public void Limpar_Memoria_Personagens() {
        for(int i = 0; i < this.personagens.length; i++) {
            this.setPersonagens(i, null);
        }
    }
    
    // Construtor
    public Conexao() {} 
}
