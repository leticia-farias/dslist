package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.BookListDTO;
import com.devsuperior.dslist.entities.BookList;
import com.devsuperior.dslist.repositories.BookListRepository;

@Service
public class BookListService {

	@Autowired
	private BookListRepository bookListRepository;
	
	@Transactional(readOnly = true)
	public List<BookListDTO> findAll() {
		List<BookList> result = bookListRepository.findAll();
		return result.stream().map(x -> new BookListDTO(x)).toList();
	}
}
