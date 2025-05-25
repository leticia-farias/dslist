package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Book;
import com.devsuperior.dslist.projections.BookMinProjection;

public class BookMinDTO {

	private Long id;
	private String title;
	private String writer;
	private Double score;
	private String imgUrl;	
	
	public BookMinDTO() {
	}

	public BookMinDTO(Book entity) {
		id = entity.getId();
		title = entity.getTitle();
		writer = entity.getWriter();
		score = entity.getScore();
		imgUrl = entity.getImgUrl();
	}
	
	public BookMinDTO(BookMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		writer = projection.getWriter();
		score = projection.getScore();
		imgUrl = projection.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}
}
