package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.BookList;

public class BookListDTO {

	private Long id;
	private String name;
	
	public BookListDTO() {
	}

	public BookListDTO(BookList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
