package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.BookListDTO;
import com.devsuperior.dslist.services.BookListService;

@RestController
@RequestMapping(value = "/lists")
public class BookListController {

	@Autowired
	private BookListService bookListService;
	
	@GetMapping
	public List<BookListDTO> findAll() {
		List<BookListDTO> result = bookListService.findAll();
		return result;
	}
}
