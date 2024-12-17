package com.example.demo.web.controllers;


import com.example.demo.dto.BookDTO;
import com.example.demo.services.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookController {

    @Autowired
    private BookService bookService;


    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO bookDTO) {
        return bookService.saveBook(bookDTO);
    }

    @QueryMapping
    public List<BookDTO> getBooksByTitle(@Argument String title){
        return bookService.getBooksByTitle(title);
    }

}
