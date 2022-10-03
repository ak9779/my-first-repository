package com.javatraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatraining.entity.Book;
import com.javatraining.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	
	public List<Book> getAllBooks() {
		List<Book> allBooks = (List<Book>) bookRepo.findAll();
		allBooks.forEach(b -> b.setAuthor(b.getAuthor() + "-b"));
		return allBooks;
	}
}