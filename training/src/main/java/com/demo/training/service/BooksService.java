package com.demo.training.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.demo.training.entity.BooksEO;
import com.demo.training.model.Books;
import com.demo.training.repo.BooksRepo;

@Service
public class BooksService {

	@Autowired
	BooksRepo booksRepo;
	
	
	public List<BooksEO> getAllBooks() {
		try {
		List<BooksEO> booksEO = booksRepo.findAll();
		return booksEO;
		}catch(Exception exc) {
			throw exc;
		}
	}
}
