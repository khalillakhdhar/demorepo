package com.repo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.repo.entities.Categorie;

@RestController
@RequestMapping("categorie")
public class CategorieController {

	@Autowired
	CategorieService categorieService;
	@GetMapping
	public List<Categorie> getAll()
	{
		return categorieService.getAllCategories();
	}
	@GetMapping("/{id}")
	public Categorie getOne(@PathVariable Integer id)
	{
		return categorieService.getCategoryWithId(id);
	}
	@PostMapping
	public Categorie addOne(@RequestBody Categorie categorie)
	{
		return categorieService.addOneCategory(categorie);
	}
	@DeleteMapping("/{id}")
	public void deleteCategorie(@PathVariable Integer id)
	{
		categorieService.deleteOne(id);
	}
	
}
