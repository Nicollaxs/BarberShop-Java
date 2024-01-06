package Controller;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mysql.cj.QueryResult;

import Controller.Helper.AgendaHelper;
import Controller.db.JPAUtil;
import Modelo.Agendamento;
import Modelo.Servico;
import View.Agenda;
import java.util.List;

public class AgendaController {

    private Agenda agenda;
    private AgendaHelper agendaHelper;
    private EntityManager em = JPAUtil.getEnityManager();

    public AgendaController(Agenda agenda) {
        this.agenda = agenda;
        this.agendaHelper = new AgendaHelper(agenda);
    }

    public void salvaAgenda() {

        int valor = agenda.getValor();
        String nome = agenda.getNome();
        String data = agenda.getData();
        String hora = agenda.getHora();
        String obs = agenda.getObservacao();
        Servico servico = agenda.getServico();

        Agendamento agendamento = new Agendamento(nome, servico, valor, data, hora, obs);
        em.getTransaction().begin();
        em.persist(agendamento);
        em.getTransaction().commit();
        em.close();

    }

    public List<Agendamento> listar() {
        String jpql = "Select e From Agendamento e";
        Query query = em.createQuery(jpql);
        List<Agendamento> listaAgendamento = query.getResultList();
        return listaAgendamento;
    }
}
