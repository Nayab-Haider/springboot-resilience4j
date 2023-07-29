package com.rajesh.librarymanangement.controller;

import java.util.List;

import com.rajesh.librarymanangement.model.Book;
import com.rajesh.librarymanangement.service.LibrarymanagementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library")
public class LibrarymanagementController {

    @Autowired
    private LibrarymanagementService librarymanagementService;
    @PostMapping
    public String addBook(@RequestBody Book book){
        return librarymanagementService.addBook(book);
    }

    @GetMapping ("/ratelimit")
    public List<Book> getBookwithRateLimit(){
        return librarymanagementService.getBookwithRateLimit();
    }

    @GetMapping
    public List<Book> getSellersList() {
        return librarymanagementService.getBookList();
    }
    @GetMapping ("/bulkhead")
    public List<Book> getSellersListBulkhead() {
        return librarymanagementService.getBookListBulkhead();
    }
}