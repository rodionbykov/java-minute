package com.rodionbykov.springboot.memcachedemo.services;

import com.rodionbykov.springboot.memcachedemo.model.Book;
import com.rodionbykov.springboot.memcachedemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public List<Book> findByTitle(String title, String xid) { return repository.findByTitle(title, xid); }

    public List<Book> deleteAndRecache(String title) { return repository.deleteAndRecache(title); }

}