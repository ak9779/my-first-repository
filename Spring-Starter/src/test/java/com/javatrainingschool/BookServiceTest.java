package com.javatrainingschool;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.javatraining.LibrarySpringBootApplication;
import com.javatraining.entity.Book;
import com.javatraining.repository.BookRepository;
import com.javatraining.service.BookService;

@SpringBootTest(classes=LibrarySpringBootApplication.class)
public class BookServiceTest {
	
	@Mock 
	BookRepository bookRepo;
	
	@InjectMocks
	BookService bookService = new BookService();
	
	@Test
	public void testGetAllBooks() {
		
		List<Book> books = new ArrayList<>();
		Book b = new Book(1, "Learn Java", "Abc", 100, "borrowed");
		books.add(b);
		Book b1 = new Book(2, "Aaao kitaab padhe", "aveimanyu", 420, "borrowed");
		books.add(b1);
		
		when(bookRepo.findAll()).thenReturn(books);
		List<Book> result = bookService.getAllBooks();
		
		
		
		
		
		
//		
//		Assertions.assertNotEquals(null, result);
//		Assertions.assertTrue(result.get(0).getName().endsWith("-b"));
//		Assertions.assertEquals("Learn Java-b", result.get(0).getName());
//		Assertions.assertEquals("Aaao kitaab padhe-b", result.get(1).getName());
		
		
	//	int size=books.size();
//		for (int i =0; i< size;i++) {
			Assertions.assertNotEquals(null, result);
			Assertions.assertTrue(result.get(1).getAuthor().endsWith("-b"));
			Assertions.assertEquals("aveimanyu-b", result.get(1).getAuthor());
			
//		}		
		
	}
}