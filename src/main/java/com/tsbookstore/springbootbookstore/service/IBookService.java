package com.tsbookstore.springbootbookstore.service;

import com.tsbookstore.springbootbookstore.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
