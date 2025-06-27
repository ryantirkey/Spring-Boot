package com.ty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ty.entity.Employee;
import com.ty.repo.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaJpaRepoTimeStamp20Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt=SpringApplication.run(SpringDataJpaJpaRepoTimeStamp20Application.class, args);
		EmployeeRepository repo=cxt.getBean(EmployeeRepository.class);
		
		Employee e1= new Employee();
		e1.setEmpId(105);
		e1.setEmpGender("Male");
		e1.setEmpDept("Engineer");
		e1.setEmpSalary(2000.00);
		e1.setEmpName("Ryan");
		
		repo.save(e1);
	}

}
