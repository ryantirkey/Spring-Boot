
package com.ty;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


import com.ty.entity.Employee;
import com.ty.repo.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaJpaRepoSortingPaginationQbe19Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt=SpringApplication.run(SpringDataJpaJpaRepoSortingPaginationQbe19Application.class, args);
		EmployeeRepository repo=cxt.getBean(EmployeeRepository.class);
		
//		Employee e1 = new Employee(1, "Orlen", 5000.00, "Male", "Sales");
//		Employee e2 = new Employee(2, "Charles", 15000.00, "Male", "Admin");
//		Employee e3 = new Employee(3, "Smith", 25000.00, "Male", "Marketing");
//		Employee e4 = new Employee(4, "Cathy", 35000.00, "Fe-Male", "Account");
//		Employee e5 = new Employee(5, "Robert", 45000.00, "Male", "HR");
//		Employee e6 = new Employee(6, "David", 55000.00, "Male", "Manager");
//		
//		repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6));
//		System.out.println("Record saved...");
		
//		-----------------------------------------------------------------------------------
		
//		SortingAndPaginationRepository has 2 method-
//		findAll(Sort sort)         - for sorting 
//		findAll(Pageable pageable) - for pagination
		
//		-----------------------------------------------------------------------------------
//		Sorting
//		Sort sort=Sort.by("empSalary","emppName").descending();
//		List<Employee> emp=repo.findAll(sort);
//		for(Employee e : emp) {
//			System.out.println(e);
//		}
//		-----------------------------------------------------------------------------------
//		Pagination
		
//		int pageno=2;
//		PageRequest page=PageRequest.of(pageno -1, 3);
//		Page<Employee> emp= repo.findAll(page);  // this return page object
//		
//		List<Employee> e = emp.getContent(); //we will slice record based on pageno and return list object
//		for(Employee e1: e) {
//			System.out.println(e1);
//		}
		
//		-----------------------------------------------------------------------------------
//		QueryByExample
		
		Employee emp= new Employee();
		emp.setEmpGender("Male"); //this data will come from UI
		emp.setEmpDept("Admin");  //this data will come from UI
		
		Example<Employee> e =Example.of(emp);
		
		List<Employee> em= repo.findAll(e);
		
		for(Employee e1: em) {
			System.out.println(e1);
		}
	
	}

}
