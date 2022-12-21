package telran.java45.book.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import telran.java45.book.model.Author;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Optional<Author> findById(String authorName) {
		return Optional.ofNullable(em.find(Author.class, authorName));
	}

	@Override
	@Transactional
	public Author save(Author author) {
		em.persist(author);
		return author;
	}

	@Override
	@Transactional
	public void delete(Author author) {
		em.remove(author);

	}

}
