package Controller.Helper;

import Modelo.Servico;
import View.Agenda;

public class AgendaHelper {
    private final Agenda agenda;

    public AgendaHelper(Agenda agenda) {
        this.agenda = agenda;
    }

    public Servico obterServico() {
        Servico servico = new Servico(agenda.getId(), agenda.getObservacao(), agenda.getValor());
        return servico;
    }

}
