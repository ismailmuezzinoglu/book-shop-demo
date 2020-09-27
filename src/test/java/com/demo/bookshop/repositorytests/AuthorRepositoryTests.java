package com.demo.bookshop.repositorytests;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.bookshop.entity.Author;
import com.demo.bookshop.entity.Book;
import com.demo.bookshop.repository.AuthorRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AuthorRepositoryTests {

	@Autowired
	private AuthorRepository authorRepository;

	@Test
	public void testSaveAuthorWithBooks() {

		Set<Book> bookList = new HashSet<Book>();
		Author author = new Author("firstName", "surName", "authorInfo", null);
		
		bookList.add(new Book("bookTitle", "subTitleOfBook", "seriesNameOfBook", "isbn", "bookInfo", author, null));
		bookList.add(new Book("bookTitle2", "subTitleOfBook2", "seriesNameOfBook2", "isbn2", "bookInfo2", author, null));
		author.setBooks(bookList);
		
		Author authorActual = authorRepository.save(author);
		
		assertEquals(authorActual, authorRepository.findById(authorActual.getId()).get());
	}

}
