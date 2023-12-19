
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Usuario;
import View.Login;

public class Main {

	public static void main(String[] args) {

/* 		Usuario pessoa = new Usuario(0, "FristUser", "M", "15/04/2000 14:30", "6198753", "email.com.br", "666", "123",
				"null");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("barbershop");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit(); */

		Login login = new Login();
		login.exibirLogin();
	}

}
