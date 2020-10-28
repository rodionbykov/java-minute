package com.rodionbykov.demo.controllers;

import com.rodionbykov.demo.model.Book;
import com.rodionbykov.demo.model.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
        ArrayList<Book> result = bookService.getAll();

        return result;
    }

}
