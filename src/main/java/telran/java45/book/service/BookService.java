package telran.java45.book.service;

import telran.java45.book.dto.AuthorDto;
import telran.java45.book.dto.BookDto;

public interface BookService {
	boolean addBook(BookDto bookDto);
	
	BookDto findBookByIsbn(String isbn);
	
	BookDto remove(String isbn);
	
	BookDto updateBook(String isbn, String title);
	
	Iterable<BookDto> findBooksByAuthor(String authorName);
	
	Iterable<BookDto> findBooksByPublisher(String publisherName);
	
	Iterable<AuthorDto> findBookAuthors(String isbn);
	
	Iterable<String> findPublishersByAuthor(String authorName);
	
	AuthorDto removeAuthor(String authorName);
}
