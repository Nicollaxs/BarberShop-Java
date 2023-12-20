package Controller.db;

import javax.persistence.EntityManager;

import Modelo.Usuario;

public class UsuarioDAO {

    private EntityManager em;

    public UsuarioDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.em.persist(usuario);
    }
}
