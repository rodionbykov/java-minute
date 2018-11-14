package com.rodionbykov.springboot.memcachedemo.controllers;

import com.rodionbykov.springboot.memcachedemo.model.Book;
import com.rodionbykov.springboot.memcachedemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public List<Book> books() {
        return service.findAll();
    }

    @GetMapping("/books/{title}")
    public List<Book> booksByTitle(@PathVariable String title, @RequestHeader(value="X-Id") String xid) {
        return service.findByTitle(title, xid);
    }

    @DeleteMapping("/books/{title}")
    public void deleteAndRecache(@PathVariable String title) {
        service.deleteAndRecache(title);
    }

}
