package com.ty;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ty.entity.Book;
import com.ty.repo.BookRepository;

@SpringBootApplication
public class SpringDataJpa17Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(SpringDataJpa17Application.class, args);
		BookRepository repository=ctxt.getBean(BookRepository.class);
		System.out.println(repository.getClass().getName()); //jdk.proxy2.$Proxy96 this class is the implementation class, provided during run time
		
//		To INSERT into Database
//		Book b= new Book();
//		b.setBookId(101);
//		b.setBookName("Spring");
//		b.setBookPrice(200.00);
//		
//		repository.save(b);
		
//		To FIND into Database
		Optional<Book> findById = repository.findById(101);
		System.out.println(findById.get());
	}

}
