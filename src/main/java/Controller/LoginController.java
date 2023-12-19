package Controller;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import Controller.Helper.LoginHelper;
import Modelo.Usuario;
import View.Login;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    public void entrarNoSistema() throws SQLException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("barbershop");
        EntityManager em = factory.createEntityManager();
        Usuario usuario = helper.obterModelo();

        Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome = :nome AND u.senha = :senha");
        query.setParameter("nome", usuario.getNome());
        query.setParameter("senha", usuario.getSenha());

        try {
            Usuario usuarioDoBanco = (Usuario) query.getSingleResult();
            if (usuarioDoBanco != null) {
                JOptionPane.showMessageDialog(view, "Você entrou no sistema", "Login feito", 0);
            }
        } catch (NoResultException e) {
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
