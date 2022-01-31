package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryJdbcDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile eklendi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("JDBC ile guncellendi");
	}

	@Override
	public void delete(Category category) {
		System.out.println("JDBC ile silindi");
		
	}

}
