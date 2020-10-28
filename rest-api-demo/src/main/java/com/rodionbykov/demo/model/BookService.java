package com.rodionbykov.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public ArrayList<Book> getAll(){
        ArrayList<Book> result = new ArrayList<>();

        try{
            result = new ArrayList<>(bookRepository.findAll());
        }catch (Exception e){
            e.printStackTrace();
        }

        return result;
    }

}
