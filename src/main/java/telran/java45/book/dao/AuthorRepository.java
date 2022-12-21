package telran.java45.book.dao;

import java.util.Optional;

import telran.java45.book.model.Author;

public interface AuthorRepository{
	Optional<Author> findById(String authorName);
	
	Author save(Author author);

	void delete(Author author);

}
