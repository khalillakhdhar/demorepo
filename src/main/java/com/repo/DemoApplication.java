package com.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.repo.control.CategorieService;
import com.repo.control.EmployeeService;
import com.repo.entities.Categorie;
import com.repo.entities.Employee;
import com.repo.repositories.EmployeeRepository;

@SpringBootApplication
// pour exécuter un code java ici on a toujours besoin d'implementer l'interface 
// CommandLineRunner et puis de mettre nos codes sous void run
public class DemoApplication implements CommandLineRunner  {
	// injection de la dépendence EmployeeRepository => la repo n'est pas instanciable 
	// n'est pas une class
	//@Autowired 
	//EmployeeRepository employeeRepository; // mauvaise pratique
	// main est une classe java # repo qui est une interface
	// main n'est pas injectable # repo est injectable => (injectable) je peux l'annoté avec @autowired
	/* => couplage fort : on a deux objets java 
	 * 1- de couches différente (exécution , persistance) => complexité du couplage+3
	 * 2- nature différente class+ inteface // si même nature => complexité du couplage+1 sinon complexité du couplage+2
	 * 3- comportement d'injection différent // si les deux sont injectable complexité du couplage+0 sinon complexité du couplage+1
	 * =>résultat abus de la mêmoire

//=> la bonne pratique c'est injecter au milieu la repos dans un Service (classe injectable) de couche controle
 * 
la bonne solution pour le couplage:
*/
	
@Autowired
EmployeeService employeeService; // affaiblie la dépendence et le couplage en appelant une classe du 
// niveau supérieur à celui de la repository et injectable cas 1 couplage =6 cas 2 couplage totale = 3
	

@Autowired
CategorieService categorieService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("hello spring am here");
	Employee emp1=employeeService.createOneEmployee(new Employee(1,"Lakhdhar","Khalil","khalil@gmail.com","azerty",19,"user"));
	System.out.println(emp1.toString()+" is added");
categorieService.addOneCategory(new Categorie(1,"formation"));
		
	}

}
