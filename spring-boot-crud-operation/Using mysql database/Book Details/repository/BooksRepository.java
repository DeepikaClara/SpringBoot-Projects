package com.java.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.model.Books;

public interface BooksRepository extends CrudRepository<Books,Integer>{

}
