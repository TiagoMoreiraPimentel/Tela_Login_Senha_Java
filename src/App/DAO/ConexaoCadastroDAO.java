package App.DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoCadastroDAO {

    // metodo que conecta com o banco de dados
    public Connection ConectacadastroBD() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:3306/cadastroteste?user=root&password=153351153351";

            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO: " + erro.getMessage());
        }

        return conn;
    }

}
