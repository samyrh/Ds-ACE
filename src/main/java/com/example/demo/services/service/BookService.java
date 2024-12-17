package com.example.demo.services.service;


import com.example.demo.dao.entity.Book;
import com.example.demo.dao.repository.BookRepository;
import com.example.demo.dto.BookDTO;
import com.example.demo.services.manager.BookManager;
import com.example.demo.services.mappers.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements BookManager {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookMapper bookMapper;


    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book plane = bookMapper.fromBookDtoToBook(bookDTO);

        // Save Entity
        plane = bookRepository.save(plane);

        // Convert Entity back to DTO and return
        return bookMapper.fromBookToBookDto(plane);
    }

    @Override
    public List<BookDTO> getBooksByTitle(String title) {
        List<Book> books = bookRepository.findByTitle(title);
        List<BookDTO> bookDTOS = new ArrayList<>();
        for (Book book : books) {
            bookDTOS.add(bookMapper.fromBookToBookDto(book));
        }
        return bookDTOS;
    }
}
