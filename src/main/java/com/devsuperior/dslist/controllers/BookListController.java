package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.BookListDTO;
import com.devsuperior.dslist.dto.BookMinDTO;
import com.devsuperior.dslist.services.BookListService;
import com.devsuperior.dslist.services.BookService;

@RestController
@RequestMapping(value = "/lists")
public class BookListController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private BookListService bookListService;
	
	@GetMapping
	public List<BookListDTO> findAll() {
		List<BookListDTO> result = bookListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/books")
	public List<BookMinDTO> findByList(@PathVariable Long listId) {
		List<BookMinDTO> result = bookService.findByList(listId);
		return result;
	}
}
