package App.DAO;

import App.entities.ValidarLogin;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// clase que consulta as informações no banco de dados
public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(ValidarLogin objvalidarlogin) {

        conn = new ConexaoDAO().ConectaBD();

        try {
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ? ";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objvalidarlogin.getLogin());
            pstm.setString(2, objvalidarlogin.getSenha());

            ResultSet rs = pstm.executeQuery();

            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro.getMessage());
            return null;
        }

    }

}
