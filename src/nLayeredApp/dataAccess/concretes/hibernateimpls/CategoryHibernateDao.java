package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryHibernateDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile guncellendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile silindi");
		
	}

}
