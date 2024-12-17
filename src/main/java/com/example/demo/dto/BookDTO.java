package com.example.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BookDTO {

    private String title;
    private String publisher;
    private String publishedDate;
    private double price;
    private String resume;


}
