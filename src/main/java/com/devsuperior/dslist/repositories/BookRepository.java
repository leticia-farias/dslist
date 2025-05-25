package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
