package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.Books;
import com.java.service.BooksService;

@RestController
public class BooksController {
@Autowired
BooksService booksService;
@GetMapping("/book")
private List<Books> getAllBooks()
{
	return booksService.getAllbooks();
}
@GetMapping("/book/{bookId}")
private Books getBooks(@PathVariable("bookId")int bookId)
{
	return booksService.getBooksbyId(bookId);
}
@DeleteMapping("/book/{bookId}")
private void deleteBooks(@PathVariable("bookId") int bookId)
{
	 booksService.delete(bookId);
}
@PostMapping("/book")
private int saveBooks(@RequestBody Books books)
{
	 booksService.save(books);
	 return books.getBookId();
}
@PutMapping("/book/{bookId}")
private void updateBooks(@PathVariable("bookId") int bookId,@RequestBody Books books)
{
booksService.updateBooks(bookId,books);

}
}
