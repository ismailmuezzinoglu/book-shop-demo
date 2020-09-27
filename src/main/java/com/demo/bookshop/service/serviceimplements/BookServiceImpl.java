package com.demo.bookshop.service.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookshop.entity.Book;
import com.demo.bookshop.repository.BookRepository;
import com.demo.bookshop.service.serviceinterface.IBookService;

/**
 * The business logic of book operations
 * 
 */

@Service
public class BookServiceImpl implements IBookService {

	private BookRepository bookRepository;

	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	/**
	 * Getting the book object by id
	 * 
	 * @param id The id of current book
	 * @return book
	 * 
	 */
	@Override
	public Book findById(Long id) {
		Optional<Book> result = bookRepository.findById(id);

		Book book = null;
		if (result.isPresent()) {
			book = result.get();
		} else {
			// didn't find
			// throw Exception
		}

		return book;
	}

	@Override
	public void save(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void deleteById(Long id) {
		bookRepository.deleteById(id);
	}

}
