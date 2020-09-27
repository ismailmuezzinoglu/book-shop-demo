package com.demo.bookshop.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	private String subTitle;

	private String seriesName;

	private String isbn;

	private String bookInfo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;

	@ManyToOne(fetch = FetchType.LAZY)
	private Publisher publisher;
	
	public Book() {
	}

	public Book(String title, String subTitle, String seriesName, String isbn, String bookInfo,
			Author author, Publisher publisher) {
		super();
		this.title = title;
		this.subTitle = subTitle;
		this.seriesName = seriesName;
		this.isbn = isbn;
		this.bookInfo = bookInfo;
		this.author = author;
		this.publisher = publisher;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gettitle() {
		return title;
	}

	public void settitle(String title) {
		this.title = title;
	}

	public String getsubTitle() {
		return subTitle;
	}

	public void setsubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getseriesName() {
		return seriesName;
	}

	public void setseriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(String bookInfo) {
		this.bookInfo = bookInfo;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}
