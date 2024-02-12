package com.demo.training.apicontroller;



import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.training.entity.BooksEO;
import com.demo.training.service.BooksService;

@ExtendWith(MockitoExtension.class)
class FetchBooksApiControllerTest {
	
	@InjectMocks
	FetchBooksApiController fetchBooksApiController;
	
	@Mock
	BooksService booksService;
	
	@Test
	public void getTests() throws Exception {
		when(booksService.getAllBooks()).thenReturn(getBooksTest());
		assertNotNull(fetchBooksApiController.getAllBooks());
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
