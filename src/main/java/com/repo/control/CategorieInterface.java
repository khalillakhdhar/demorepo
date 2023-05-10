package com.repo.control;

import java.util.List;

import com.repo.entities.Categorie;

public interface CategorieInterface {
	
	public List<Categorie> getAllCategories();
	public Categorie addOneCategory(Categorie categorie);
	public Categorie getCategoryWithId(int id);
	public void deleteOne(int id);
	public List<Categorie> searchByCategory(String categorie);
	
	

}
