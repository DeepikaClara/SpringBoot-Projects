package com.java.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.model.Books;
import com.java.repository.BooksRepository;

@Service
public class BooksService {
@Autowired
BooksRepository booksRepository;

public List<Books> getAllbooks() {
	List<Books> books=new ArrayList<>();
	booksRepository.findAll().forEach(books1->books.add(books1));
	return books;
}

public Books getBooksbyId(int bookId) {
return booksRepository.findById(bookId).get();	
}

public void delete(int bookId) {
	booksRepository.deleteById(bookId);
}

public void save(Books books) {
	booksRepository.save(books);
	}

public void updateBooks(int bookId, Books books) {
	booksRepository.save(books);
	
}


}
