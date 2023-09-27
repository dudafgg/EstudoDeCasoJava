import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/exercicios";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void criarProcessador() {

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS processadores (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descricao VARCHAR(100)," +
                    "velocidade DOUBLE" +
                    ")";

            try (PreparedStatement stmt = conn.prepareStatement(createTableSQL)) {
                stmt.executeUpdate();
                System.out.println("\nTabela criada com sucesso");
            }

        } catch (SQLException e) {
            System.out.println("\nErro ao criar tabela: " + e.getMessage());
        }
    }

    public static void criarComputador() {

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS computadores (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descricao VARCHAR(100)," +
                    "marca VARCHAR(100)" +
                    ")";

            try (PreparedStatement stmt = conn.prepareStatement(createTableSQL)) {
                stmt.executeUpdate();
                System.out.println("\nTabela criada com sucesso");
            }

        } catch (SQLException e) {
            System.out.println("\nErro ao criar tabela: " + e.getMessage());
        }
    }

    public static void criarSistemaOperacional() {

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {

            String createTableSQL = "CREATE TABLE IF NOT EXISTS sistemas (" +
                    "Id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "descricao VARCHAR(100)," +
                    "versao VARCHAR(100)" +
                    ")";

            try (PreparedStatement stmt = conn.prepareStatement(createTableSQL)) {
                stmt.executeUpdate();
                System.out.println("\nTabela criada com sucesso");
            }

        } catch (SQLException e) {
            System.out.println("\nErro ao criar tabela: " + e.getMessage());
        }
    }

    public static void inserirProcessador(Processador processador) { // Método que insere os processadores no banco de
                                                                     // dados

        criarProcessador(); // Chama o método criarProcessador() para criar a tabela processadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de
                                                                                      // dados
                PreparedStatement stmt = conn
                        .prepareStatement("INSERT INTO processadores(nome, descricao, velocidade) VALUES (?, ?, ?)")) {

            stmt.setString(1, processador.getNome());
            stmt.setString(2, processador.getDescricao());
            stmt.setDouble(3, processador.getVelocidade());

            stmt.executeUpdate();
            System.out.println("Dados inseridos");

        } catch (SQLException e) {
            System.out.println("Erros ao inserir dados: " + e.getMessage());
        }
    }

    public static void inserirComputador(Computador computador) { // Método que insere os processadores no banco de
                                                                  // dados

        criarComputador(); // Chama o método criarProcessador() para criar a tabela processadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de
                                                                                      // dados
                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO computadores(nome, descricao, marca) VALUES (?, ?, ?)")) {

            // Substitue as interrogações pelos valores que o usuário inseriu
            stmt.setString(1, computador.getNome());
            stmt.setString(2, computador.getDescricao());
            stmt.setString(3, computador.getMarca());

            stmt.executeUpdate(); // Executa o código sql 'INSERT INTO'
            System.out.println("Dados inseridos"); // Mensagem caso os dados sejam inseridos com sucesso

        } catch (SQLException e) {
            System.out.println("Erros ao inserir dados: " + e.getMessage()); // Mensagem caso ocorra algum erro ao
                                                                             // inserir os dados
        }
    }

    public static void inserirSistemaOperacional(SistemaOperacional sistemaOperacional) { // Método que insere os
                                                                                          // processadores no banco de
        // dados

        criarProcessador(); // Chama o método criarProcessador() para criar a tabela processadores

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD); // Cria uma conexão com o banco de
                                                                                      // dados
                PreparedStatement stmt = conn.prepareStatement(
                        "INSERT INTO sistemas(nome, descricao, versao) VALUES (?, ?, ?)")) {

            // Substitue as interrogações pelos valores que o usuário inseriu
            stmt.setString(1, sistemaOperacional.getNome());
            stmt.setString(2, sistemaOperacional.getDescricao());
            stmt.setString(3, sistemaOperacional.getVersao());

            stmt.executeUpdate(); // Executa o código sql 'INSERT INTO'
            System.out.println("Dados inseridos"); // Mensagem caso os dados sejam inseridos com sucesso

        } catch (SQLException e) {
            System.out.println("Erros ao inserir dados: " + e.getMessage()); // Mensagem caso ocorra algum erro ao
                                                                             // inserir os dados
        }
    }
}