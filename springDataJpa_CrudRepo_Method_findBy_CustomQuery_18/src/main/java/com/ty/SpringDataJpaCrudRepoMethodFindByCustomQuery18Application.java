package com.ty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ty.entity.Book;
import com.ty.repo.BookRepository;

@SpringBootApplication
public class SpringDataJpaCrudRepoMethodFindByCustomQuery18Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringDataJpaCrudRepoMethodFindByCustomQuery18Application.class, args);
		BookRepository repo=context.getBean(BookRepository.class);
		System.out.println(repo);
		
//		Book b1= new Book();
//		b1.setBookId(102);
//		b1.setBookName("React");
//		b1.setBookPrice(500.00);
//		repo.save(b1);
//		Upsert method (save + update), 
//		first it will check for record if not found then it will create insert query 
//		but if record found it will create update query
		
//		-------------------------------------------------------------------------
//		Book b1= new Book();
//		b1.setBookId(103);
//		b1.setBookName("Angular");
//		b1.setBookPrice(2500.00);
//		
//		Book b2= new Book();
//		b2.setBookId(104);
//		b2.setBookName("Vue");
//		b2.setBookPrice(1500.00);
		
//		Two ways to use list obj;
//		List<Book> li= new ArrayList<Book>();
//		li.add(b1);
//		li.add(b2);
//		repo.saveAll(li);
//		or
//		repo.saveAll(Arrays.asList(b1,b2)); //this collection method also create list obj and add obj into it
//		------------------------------------------------------------------------
		
//		boolean status=repo.existsById(101);
//		System.out.println(status);
//		-----------------------------------------------------------------------
		
//		long count=repo.count();
//		System.out.println(count);
//		or
//		System.out.println(repo.count());
		
//		---------------------------------------------------------------------------
		
//		Optional<Book> find=repo.findById(103);
//		System.out.println(find.get());
//		Optional is a class similar to list, get() method is used to get record from the list
		
//		---------------------------------------------------------------------------
		
//		Iterable<Book> findAllById=repo.findAllById(Arrays.asList(101,103));
//		for(Book b : findAllById) {
//			System.out.println(b);
//		}
//		---------------------------------------------------------------------------
		
//		Iterable<Book> findAll=repo.findAll();
//		for(Book b: findAll) {
//			System.out.println(b);
//		}
//		-----------------------------------------------------------------------------
		
//		repo.deleteById(101);
//		-----------------------------------------------------------------------------
		
//		repo.deleteAllById(Arrays.asList(102,103));
//		------------------------------------------------------------------------------
		
//		FindBy Methods - 
//		List<Book> findBy=repo.findByBookPriceGreaterThan(1000.00);
//		System.out.println(findBy);
		
//		List<Book> findBy=repo.findByBookPriceLessThan(1600.00);
//		System.out.println(findBy);
		
//		List<Book> findBy=repo.findByBookNameEquals("Vue");
//		System.out.println(findBy);
		
//		---------------------------------------------------------------------------------
		
//		Custom Queries
//		List<Book> li=repo.getAllBook();
//		for(Book b : li) {
//			System.out.println(b);
//		}
//		-------------------------------------------------------------------------------
		
		List<Book> li=repo.getBooks();
		for(Book b : li) {
			System.out.println(b);
		}
		
		
	}

}
