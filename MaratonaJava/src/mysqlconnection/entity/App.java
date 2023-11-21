package mysqlconnection.entity;

import mysqlconnection.DAO.UsuarioDAO;

public class App {
    public static void main(String[] args) {
        Usuario u = new Usuario();
        u.setNome("Rogerio");
        u.setLogin("rogerio");
        u.setSenha("1234");
        u.setEmail("rogerio@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);

    }
}
