package com.demo.training.apicontroller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.training.entity.BooksEO;
import com.demo.training.model.Books;
import com.demo.training.service.BooksService;

@RestController
public class FetchBooksApiController{

	@Autowired
	BooksService booksService;
	
	
	@GetMapping(value="/getBooks")
	public List<BooksEO> getAllBooks() throws Exception{
		List<BooksEO> booksEOList = booksService.getAllBooks();
		/*if(CollectionUtils.isEmpty(booksEOList))
			return new ResponseEntity<>(booksEOList,HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);*/
		return booksEOList;
	}
	
	
}
