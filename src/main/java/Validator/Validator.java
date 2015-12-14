package Validator;

import model.Model;

public interface Validator<T extends Model> {

	boolean validate(T entity);
}
