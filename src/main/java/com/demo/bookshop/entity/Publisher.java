package com.demo.bookshop.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long publisherId;

	private String publisherName;

	private String publisherInfo;

	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
	private Set<Book> books;

	public Publisher() {

	}

	public Publisher(String publisherName, String publisherInfo, Set<Book> books) {
		super();
		this.publisherName = publisherName;
		this.publisherInfo = publisherInfo;
		this.books = books;
	}

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherInfo() {
		return publisherInfo;
	}

	public void setPublisherInfo(String publisherInfo) {
		this.publisherInfo = publisherInfo;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
}
