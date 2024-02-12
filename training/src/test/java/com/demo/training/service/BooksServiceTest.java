package com.demo.training.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.training.entity.BooksEO;
import com.demo.training.repo.BooksRepo;

@ExtendWith(MockitoExtension.class)
public class BooksServiceTest {

	@InjectMocks
	BooksService booksService;
	
	@Mock
	BooksRepo booksRepo;
	
	@Test
	public void getBookTestService() {
		when(booksRepo.findAll()).thenReturn(getBooksTest());
		assertNotNull(booksService.getAllBooks());
	}
	
	@Test
	public void getBookException() {
		doThrow(new RuntimeException("")).when(booksRepo).findAll();
		Assertions.assertThrows(Exception.class, ()->{
			booksService.getAllBooks();
		});
	}
	
	private List<BooksEO> getBooksTest() {
		List<BooksEO> booksList = new ArrayList<>();
		BooksEO booksEO = new BooksEO();
		booksEO.setBookId(8l);
		booksEO.setBookName("book8");
		booksEO.setAuthor("AUTHOR8");
		booksList.add(booksEO);
		return booksList;
	}
}
