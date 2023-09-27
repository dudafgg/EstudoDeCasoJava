import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaSQL {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/exercicios";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void ConsultaProcessador() { // Método que consulta as informações na tabela sistemas

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM processadores");
                ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) { // Loop que faz o código percorrer todas as linhas da tabela

                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                double velocidade = resultSet.getDouble("velocidade");

                // Imprime o valor das variáveis
                System.out.println("\nID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Descrição " + descricao);
                System.out.println("Velocidade: " + velocidade);
            }

        } catch (SQLException e) {
            System.out.println("\nErro na consulta: " + e.getMessage()); // Mensagem caso ocarra algum erro na consulta
        }
    }

    public static void ConsultaComputador() { // Método que consulta as informações na tabela sistemas

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM computadores");
                ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) { // Loop que faz o código percorrer todas as linhas da tabela

                // Consulta os valores das colunas da tabela e armazena esses valores em
                // variáveis
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                String marca = resultSet.getString("marca");

                // Imprime o valor das variáveis
                System.out.println("\nID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Descrição:  " + descricao);
                System.out.println("Marca: " + marca);
            }

        } catch (SQLException e) {
            System.out.println("\nErro na consulta: " + e.getMessage()); // Mensagem caso ocarra algum erro na consulta
        }
    }

    public static void ConsultaSistemaOperacional() { // Método que consulta as informações na tabela sistemas

        try (Connection conn = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM sistemas");
                ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) { // Loop que faz o código percorrer todas as linhas da tabela

                // Consulta os valores das colunas da tabela e armazena esses valores em
                // variáveis
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String descricao = resultSet.getString("descricao");
                String versao = resultSet.getString("versao");

                // Imprime o valor das variáveis
                System.out.println("\nID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Descrição: " + descricao);
                System.out.println("Versão: " + versao);
            }

        } catch (SQLException e) {
            System.out.println("\nErro na consulta: " + e.getMessage()); // Mensagem caso ocarra algum erro na consulta
        }
    }
}