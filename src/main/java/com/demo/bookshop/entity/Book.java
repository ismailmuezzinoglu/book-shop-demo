package com.demo.bookshop.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String bookTitle;

	private String subTitleOfBook;

	private String seriesNameOfBook;

	private String isbn;

	private String bookInfo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;

	@ManyToOne(fetch = FetchType.LAZY)
	private Publisher publisher;
}
