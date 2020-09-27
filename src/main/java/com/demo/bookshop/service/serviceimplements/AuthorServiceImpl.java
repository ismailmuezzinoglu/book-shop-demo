package com.demo.bookshop.service.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookshop.entity.Author;
import com.demo.bookshop.repository.AuthorRepository;
import com.demo.bookshop.service.serviceinterface.IAuthorService;

/**
 * The business logic of author operations
 * 
 */

@Service
public class AuthorServiceImpl implements IAuthorService {

	private AuthorRepository authorRepository;

	@Autowired
	public AuthorServiceImpl(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	@Override
	public List<Author> findAll() {
		return authorRepository.findAll();
	}

	/**
	 * Getting the author object by id
	 * 
	 * @param id The id of current author
	 * @return author
	 * 
	 */
	@Override
	public Author findById(Long id) {
		Optional<Author> result = authorRepository.findById(id);

		Author author = null;
		if (result.isPresent()) {
			author = result.get();
		} else {
			// didn't find
			// throw Exception
		}

		return author;
	}

	@Override
	public void save(Author author) {
		authorRepository.save(author);
	}

	@Override
	public void deleteById(Long id) {
		authorRepository.deleteById(id);
	}

}
