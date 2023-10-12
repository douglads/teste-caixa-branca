/**
 * A classe User representa um usuário e fornece métodos para autenticação
 * e interação com um banco de dados MySQL.
 */

package Login; // Define o pacote da classe

import java.sql.Connection; // Importa a classe Connection
import java.sql.DriverManager; // Importa a classe DriverManager
import java.sql.ResultSet; // Importa a classe ResultSet
import java.sql.Statement; // Importa a classe Statement

public class User { // Declara a classe User

    /**
     * Conecta ao banco de dados MySQL.
     *
     * @return A conexão com o banco de dados ou null em caso de erro.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC do MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            
            // URL de conexão com o banco de dados
            String url = "jdbc.mysql://127.0.0.1/test?user=lopes&password=123";
            
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Lida com exceções, como ClassNotFoundException, SQLException, etc.
        }
        return conn; // Retorna a conexão
    }

    // Variáveis de instância
    public String nome = "";
    public boolean result = false;

    /**
     * Verifica se um usuário com o login e a senha fornecidos existe no banco de dados.
     *
     * @param login O nome de usuário.
     * @param senha A senha do usuário.
     * @return true se o usuário existe, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Instrução SQL
        Connection conn = conectarBD(); // Conecta ao banco de dados
        
        // INSTRUÇÃO SQL para verificar a existência do usuário
        sql += "select nome from usuarios ";
        sql += "where login ='" + login + "' ";
        sql += "and senha ='" + senha + "';";
        
        try {
            Statement st = conn.createStatement(); // Cria um objeto Statement para a consulta
            ResultSet rs = st.executeQuery(sql); // Executa a consulta
            
            // Se um resultado for encontrado, o usuário existe
            if (rs.next()) {
                result = true; // Define o resultado como true
                nome = rs.getString(nome); // Obtém o nome do usuário
            }
        } catch (Exception e) {
            // Lida com exceções, como SQLException, SQLException, etc.
        }
        return result; // Retorna o se o usuário existe ou não
    }
}
