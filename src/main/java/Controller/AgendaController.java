package Controller;

import javax.persistence.EntityManager;

import Controller.Helper.AgendaHelper;
import Controller.db.AgendaDAO;
import Controller.db.JPAUtil;
import Modelo.Servico;
import View.Agenda;

public class AgendaController {

    private Agenda agenda;
    private AgendaHelper agendaHelper;
    private EntityManager em = JPAUtil.getEnityManager();

    public AgendaController(Agenda agenda) {
        this.agenda = agenda;
        this.agendaHelper = new AgendaHelper(agenda);
    }

    public void salvaAgenda() {

    }
}