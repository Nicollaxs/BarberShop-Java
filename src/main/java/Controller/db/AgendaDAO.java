package Controller.db;

import javax.persistence.EntityManager;

import Modelo.Agendamento;

public class AgendaDAO {

    EntityManager em;

    public AgendaDAO(EntityManager em) {
        this.em = em;
    }

    public void salvarAgenda(Agendamento agenda) {
        em.persist(agenda);
    }

}
