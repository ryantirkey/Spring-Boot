package com.ty.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ty.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
//	FindBy methods
//	public List<Book> findByBookPriceGreaterThan(double price);
//	
//	public List<Book> findByBookPriceLessThan(Double price);
//	
//	public List<Book> findByBookNameEquals(String s);
	
//	-------------------------------------------------------------------------
	
//	Custom Queries
	
	@Query(value = "select * from book", nativeQuery = true) //SQL query
	public List<Book> getAllBook();
	
	@Query(value = "from Book") //HQL query
	public List<Book> getBooks();

}
