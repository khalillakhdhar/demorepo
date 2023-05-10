package com.repo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repo.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
List<Categorie> findByCategoryContaining(String category); // %LIKE%
}
