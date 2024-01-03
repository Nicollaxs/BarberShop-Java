import javax.persistence.EntityManager;

import Controller.db.JPAUtil;
import Modelo.Agendamento;
import Modelo.Servico;
import View.Login;

public class Main {

	public static void main(String[] args) {
		Login login = new Login();
		login.exibirLogin();

		// EntityManager em = JPAUtil.getEnityManager();

		// Agendamento agenda = new Agendamento("Nicollas", Servico.CABELO, 30,
		// "03/01/2024 14:00", "");
		// em.getTransaction().begin();
		// em.persist(agenda);
		// em.getTransaction().commit();
		// em.close();

	}

}
