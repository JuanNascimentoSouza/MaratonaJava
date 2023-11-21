package mysqlconnection.DAO;

import mysqlconnection.conexao.Conexao;
import mysqlconnection.entity.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario) {

        String sql = "INSERT INTO USUARIO (NOME,LOGIN,SENHA,EMAIL) VALUES (?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString( 1, usuario.getNome());
            ps.setString( 2, usuario.getNome());
            ps.setString( 3, usuario.getNome());
            ps.setString( 4, usuario.getNome());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
