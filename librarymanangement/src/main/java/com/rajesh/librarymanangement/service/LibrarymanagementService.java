package com.rajesh.librarymanangement.service;

import java.util.List;

import com.rajesh.librarymanangement.model.Book;

public interface LibrarymanagementService {

    String addBook(Book book);
    List<Book> getBookwithRateLimit();
    List<Book> getBookList();
    List<Book> getBookListBulkhead();
}