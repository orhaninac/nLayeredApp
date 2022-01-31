package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductHibernateDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile kaydedildi.");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

}
