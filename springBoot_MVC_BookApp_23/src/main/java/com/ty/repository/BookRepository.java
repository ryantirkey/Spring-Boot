package com.ty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
