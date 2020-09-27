package com.demo.bookshop.service.serviceimplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookshop.entity.Publisher;
import com.demo.bookshop.repository.PublisherRepository;
import com.demo.bookshop.service.serviceinterface.IPublisherService;

/**
 * The business logic of publisher operations
 * 
 */

@Service
public class PublisherServiceImpl implements IPublisherService {

	private PublisherRepository publisherRepository;

	@Autowired
	public PublisherServiceImpl(PublisherRepository publisherRepository) {
		this.publisherRepository = publisherRepository;
	}

	@Override
	public List<Publisher> findAll() {
		return publisherRepository.findAll();
	}

	/**
	 * Getting the publisher object by id
	 * 
	 * @param id The id of current publisher
	 * @return publisher
	 * 
	 */
	@Override
	public Publisher findById(Long id) {
		Optional<Publisher> result = publisherRepository.findById(id);

		Publisher publisher = null;
		if (result.isPresent()) {
			publisher = result.get();
		} else {
			// didn't find
			// throw Exception
		}

		return publisher;
	}

	@Override
	public void save(Publisher publisher) {
		publisherRepository.save(publisher);
	}

	@Override
	public void deleteById(Long id) {
		publisherRepository.deleteById(id);
	}

}
