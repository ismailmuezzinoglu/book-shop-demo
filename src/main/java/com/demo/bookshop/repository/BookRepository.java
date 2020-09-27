package com.demo.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookshop.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
