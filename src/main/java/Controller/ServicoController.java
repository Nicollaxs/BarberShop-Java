package Controller;

import javax.persistence.EntityManager;

import Controller.Helper.AgendaHelper;
import Controller.db.AgendaDAO;
import Controller.db.JPAUtil;
import Modelo.Servico;
import View.Agenda;

public class ServicoController {

    private Agenda agenda;
    private AgendaHelper agendaHelper;
    private EntityManager em = JPAUtil.getEnityManager();

    public ServicoController(Agenda agenda) {
        this.agenda = agenda;
        this.agendaHelper = new AgendaHelper(agenda);
    }

    public void salvaAgenda() {
        AgendaDAO agendaDAO = new AgendaDAO(em);
        Servico servico = agendaHelper.obterServico();
        em.getTransaction().begin();
        agendaDAO.salvarAgenda(servico);
        em.getTransaction().commit();
        em.close();
    }
}
