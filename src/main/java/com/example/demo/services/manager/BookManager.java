package com.example.demo.services.manager;

import com.example.demo.dto.BookDTO;

import java.util.List;

public interface BookManager {


    public BookDTO saveBook(BookDTO bookDTO);

    public List<BookDTO> getBooksByTitle(String title);
}
