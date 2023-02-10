package App.DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

// classe responsavel por realizar a conexao com os objetos do banco de dados
public class ConexaoDAO {

    // metodo que conecta com o banco de dados
    public Connection ConectaBD() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:3306/validacao?user=root&password=153351153351";

            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO: " + erro.getMessage());
        }

        return conn;
    }
}
