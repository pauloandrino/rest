package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerUtil {
private static EntityManagerFactory emf;
private static EntityManager em;
	
	public static void criarConexao() {
		emf = Persistence.createEntityManagerFactory("RestPu");
	}
	
	public static EntityManager criarEntityManager() {
		if (em == null || !em.isOpen()) {
			em = emf.createEntityManager();
		}
		return em;
	}
	
	public static void fechaConexao() {
		emf.close();
	}
}
