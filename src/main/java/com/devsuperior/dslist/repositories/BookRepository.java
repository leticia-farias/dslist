package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Book;
import com.devsuperior.dslist.projections.BookMinProjection;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	// consulta personalizada
	@Query(nativeQuery = true, value = """
			SELECT tb_book.id, tb_book.title, tb_book.writer, tb_book.score, tb_book.img_url AS imgUrl,
				tb_belonging.position
			FROM tb_book
			INNER JOIN tb_belonging ON tb_book.id = tb_belonging.book_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<BookMinProjection> searchByList(Long listId);
}
