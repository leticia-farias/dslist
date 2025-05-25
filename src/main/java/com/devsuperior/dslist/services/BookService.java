package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.BookMinDTO;
import com.devsuperior.dslist.entities.Book;
import com.devsuperior.dslist.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<BookMinDTO> findAll() {
		List<Book> result = bookRepository.findAll();
		List<BookMinDTO> dto = result.stream().map(x -> new BookMinDTO(x)).toList();
		return dto;
	}
}
