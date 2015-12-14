package controller;

import java.util.List;

import javax.inject.Inject;

import dao.DAO;
import exception.InvalidModelException;
import model.Model;
import service.Service;

public class ModelWS<T extends Model> {
	
	@Inject
	private Service<T> service;
	
	public void create(T entity) {
		DAO<T> dao;
		try {
			dao = service.getDao(entity);
			dao.create(entity);
		} catch (InvalidModelException e) {
			e.printStackTrace();
		}
	}
	
	public T find(Long id) {
		return service.getDao().find(id);
	}
	
	public void update(T entity) {
		DAO<T> dao;
		try {
			dao = service.getDao(entity);
			dao.update(entity);
		} catch (InvalidModelException e) {
			e.printStackTrace();
		}
	}
	
	public void delete(T entity) {
		service.getDao().delete(entity);
	}
	
	public List<T> findAll() {
		return service.getDao().findAll();
	}
}
