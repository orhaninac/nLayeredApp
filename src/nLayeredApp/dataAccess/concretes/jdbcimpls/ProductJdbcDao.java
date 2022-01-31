package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao {

	@Override
	public void add(Product product) {
		//jdbc kodlari
		System.out.println("JDBC ile eklendi.");
		
	}

	@Override
	public void update(Product product) {
		System.out.println("JDBC ile guncellendi.");
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("JDBC ile silindi.");
		
	}

}
