package com.sriteja.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sriteja.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}