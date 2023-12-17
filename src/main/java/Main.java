
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Modelo.Pessoa;
import Modelo.Usuario;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Usuario(0, "", "");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("barbershop");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
	}

}
