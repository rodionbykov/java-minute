package com.rodionbykov.springboot.memcachedemo.repository;

import com.rodionbykov.springboot.memcachedemo.model.Book;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    List<Book> findByTitle(String title, String xid);

    List<Book> deleteAndRecache(String title);
}