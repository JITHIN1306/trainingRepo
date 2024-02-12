package com.demo.training.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.training.entity.BooksEO;

@Repository
public interface BooksRepo extends JpaRepository<BooksEO,Long>{

}
