package App.DAO;

import App.entities.CadastrodeClientes;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroClientesDAO {
    
    Connection conn;

    public void cadastrarClientes(CadastrodeClientes objcadastrodeclientes) {

        conn = new ConexaoCadastroDAO().ConectacadastroBD();

        try {
    
            String sql = "insert into cadastroclientes (nome_cliente, endereco_cliente, email_cliente) values (?, ?, ?)";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadastrodeclientes.getNome());
            pstm.setString(2, objcadastrodeclientes.getEndereco());
            pstm.setString(3, objcadastrodeclientes.getEmail());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoCadastroDAO: " + erro.getMessage());

        }

    }
    
}
