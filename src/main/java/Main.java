import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Controller.db.JPAUtil;
import Controller.db.UsuarioDAO;
import Modelo.Usuario;
import View.Login;

public class Main {

	public static void main(String[] args) {
		Login login = new Login();
		login.exibirLogin();
	}

}
