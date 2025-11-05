package com.greenapi.optimized.service;

import com.greenapi.optimized.domain.Book;
import com.greenapi.optimized.repo.BookRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    private final BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> findAllCached() {
        return repo.findAll();
    }
}

