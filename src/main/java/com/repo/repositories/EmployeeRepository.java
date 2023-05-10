package com.repo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.repo.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	List<Employee>  findByAgeGreaterThan(int age);
	List<Employee> findByNom(String nom); // findBy[nomDuParamétre] retourne une liste s'il n'est pas unique
	Employee findByEmail(String email); // renvoie une instance puisque Email est unique
	Employee findByEmailAndMdp(String email,String mdp);
	List<Employee> findByNomOrPrenom(String nom,String prenom);
}
