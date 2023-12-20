package Controller;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import Controller.Helper.LoginHelper;
import Controller.db.JPAUtil;
import Modelo.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() throws SQLException {
        EntityManager em = JPAUtil.getEnityManager();
        Usuario usuario = helper.obterModelo();

        Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha");
        query.setParameter("nome", usuario.getNome());
        query.setParameter("senha", usuario.getSenha());

        try {
            Usuario usuarioDoBanco = (Usuario) query.getSingleResult();
            if (usuarioDoBanco != null) {
                MenuPrincipal menu = new MenuPrincipal();
                view.dispose();
                menu.exibirMenuPrincipal();
            }
        } catch (

        NoResultException e) {
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos", "Erro de Login",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    public void fizTarefa() {
        System.out.println("Busquei algo no banco de dados");
        System.out.println(view.getUsuario());
    }

}
