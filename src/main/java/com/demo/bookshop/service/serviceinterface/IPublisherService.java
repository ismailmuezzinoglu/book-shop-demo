package com.demo.bookshop.service.serviceinterface;

import java.util.List;

import com.demo.bookshop.entity.Publisher;

public interface IPublisherService {

	public Publisher findById(Long id);

	public List<Publisher> findAll();

	public void save(Publisher publisher);

	public void deleteById(Long id);

}
