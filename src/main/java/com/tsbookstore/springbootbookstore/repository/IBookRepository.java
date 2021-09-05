package com.tsbookstore.springbootbookstore.repository;

import com.tsbookstore.springbootbookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBookRepository extends JpaRepository<Book, Long> {

}
