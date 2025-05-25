package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // anotation que configura a classe para ser uma tabela do banco
@Table(name = "tb_book") // customiza o nome da tabela
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name = "book_year") // customiza o nome da coluna pq year é uma palavra reservada do sql, ent pode dar problema se deixar
	private Integer year;
	private String writer;
	private String publisher;
	private Double score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT") // para aceitar mais de 255 carcteres
	private String longDescription;
	
	// Construtores
	public Book() {
	}

	public Book(Long id, String title, Integer year, String writer, String publisher, Double score, String imgUrl,
			String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.writer = writer;
		this.publisher = publisher;
		this.score = score;
		this.imgUrl = imgUrl;
		this.longDescription = longDescription;
	}

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	// Métodos para comparar objetos
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}
}
