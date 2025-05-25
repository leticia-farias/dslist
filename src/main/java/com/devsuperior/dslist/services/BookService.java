package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.BookDTO;
import com.devsuperior.dslist.dto.BookMinDTO;
import com.devsuperior.dslist.entities.Book;
import com.devsuperior.dslist.projections.BookMinProjection;
import com.devsuperior.dslist.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Transactional(readOnly = true)
	public BookDTO findById(Long id) {
		Book result = bookRepository.findById(id).get();
		BookDTO dto = new BookDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<BookMinDTO> findAll() {
		List<Book> result = bookRepository.findAll();
		List<BookMinDTO> dto = result.stream().map(x -> new BookMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<BookMinDTO> findByList(Long listId) {
		List<BookMinProjection> result = bookRepository.searchByList(listId);
		return result.stream().map(x -> new BookMinDTO(x)).toList();
	}
}
