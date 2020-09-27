package com.demo.bookshop.service.serviceinterface;

import java.util.List;

import com.demo.bookshop.entity.Author;

public interface IAuthorService {

	public Author findById(Long id);

	public List<Author> findAll();

	public void save(Author author);

	public void deleteById(Long id);

}
