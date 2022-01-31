package nLayeredApp.core.dataAccess;

public interface CrudRepository<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);

}
