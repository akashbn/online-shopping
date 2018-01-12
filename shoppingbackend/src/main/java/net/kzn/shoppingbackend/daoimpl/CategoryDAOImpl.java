package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		category.setId(1);
		category.setName("Television");
		category.setDescription("For televison");
		category.setImageURL("cat_1.png");

		categories.add(category);

		category = new Category();

		category.setId(2);
		category.setName("Mobile");
		category.setDescription("For Mobile");
		category.setImageURL("cat_2.png");

		categories.add(category);

		
		
		category = new Category();

		category.setId(3);
		category.setName("Laptop");
		category.setDescription("For Laptop");
		category.setImageURL("cat_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {

		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories)
		{
			if(category.getId() == id) return category;
		}
		
		return null;
	}

}
