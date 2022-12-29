package com.sriteja.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Table(name = "Books")
@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Book {

    @JsonProperty(value = "book_id",required = false)
    @Column(name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   // @SequenceGenerator(name = "book_id_seq",sequenceName = "book_id_sequence")
    @Id
    private Long bookId;

    @JsonProperty("book_title")
    @Column(name = "BOOK_TITLE")
    private String bookTitle;

    @JsonProperty("book_price")
    @Column(name = "BOOK_PRICE")
    private BigDecimal bookPrice;

    @JsonProperty("book_author")
    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;

}