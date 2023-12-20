package Controller.db;

import javax.persistence.EntityManager;

import Modelo.Servico;

public class AgendaDAO {

    EntityManager em;

    public AgendaDAO(EntityManager em) {
        this.em = em;
    }

    public void salvarAgenda(Servico servico) {
        em.persist(servico);
    }

}
