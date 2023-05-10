package com.repo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.entities.Categorie;
import com.repo.repositories.CategorieRepository;

@Service
public class CategorieService implements CategorieInterface {

	@Autowired
	CategorieRepository categorieRepository;
	
	
	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return categorieRepository.findAll();
	}

	@Override
	public Categorie addOneCategory(Categorie categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}

	@Override
	public Categorie getCategoryWithId(int id) {
		// TODO Auto-generated method stub
		return categorieRepository.findById(id).get();
	}

	@Override
	public void deleteOne(int id) {
		// TODO Auto-generated method stub
		categorieRepository.deleteById(id);

	}

	@Override
	public List<Categorie> searchByCategory(String categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.findByCategoryContaining(categorie);
		

	}

}
