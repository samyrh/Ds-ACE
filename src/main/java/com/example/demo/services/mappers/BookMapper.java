package com.example.demo.services.mappers;

import com.example.demo.dao.entity.Book;
import com.example.demo.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {



    private final ModelMapper mapper = new ModelMapper();


    public Book fromBookDtoToBook(BookDTO bookDTO) {
        return mapper.map(bookDTO, Book.class);  // Using ModelMapper for automatic mapping
    }


    public BookDTO fromBookToBookDto(Book book) {
        return mapper.map(book, BookDTO.class);  // Using ModelMapper for automatic mapping
    }
}
