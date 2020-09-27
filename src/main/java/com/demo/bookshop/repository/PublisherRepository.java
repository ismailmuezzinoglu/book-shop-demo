package com.demo.bookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookshop.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
