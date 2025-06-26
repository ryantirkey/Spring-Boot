package com.ty.repo;

import org.springframework.data.repository.CrudRepository;

import com.ty.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
