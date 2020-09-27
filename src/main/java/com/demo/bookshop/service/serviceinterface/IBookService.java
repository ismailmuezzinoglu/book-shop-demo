package com.demo.bookshop.service.serviceinterface;

import java.util.List;

import com.demo.bookshop.entity.Book;

public interface IBookService {

	public Book findById(Long id);

	public List<Book> findAll();

	public void save(Book book);

	public void deleteById(Long id);

}
