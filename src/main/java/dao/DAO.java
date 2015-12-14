package dao;

import java.util.List;

import javax.persistence.EntityManager;

import model.Model;
import utils.EntityManagerUtil;

public class DAO<T extends Model> {

	private Class<T> klazz;
	
	public DAO(Class<T> klazz) {
		EntityManagerUtil.criarConexao();
		this.klazz = klazz;
	}
	
	public void create(T entity) {
		
	}
	
	public T find(Long id) {
		
		EntityManager em = EntityManagerUtil.criarEntityManager();
		return em.find(klazz, id);
	}
	
	public List<T> findAll() {
		return null;
	}
	
	public void update(T entity) {
		
	}
	
	public void delete(T entity) {
		
	}
	
}
