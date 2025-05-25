package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.BookList;

public interface BookListRepository extends JpaRepository<BookList, Long>{
	
}
