package com.greenapi.optimized.service;

import com.greenapi.optimized.domain.Book;
import com.greenapi.optimized.repo.BookReactiveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceReactif {
    private final BookReactiveRepository repo;

    public BookServiceReactif(BookReactiveRepository repo) {
        this.repo = repo;
    }

    // Cache la LISTE complète des livres sous le cache "books" (valeur concrète)

    public List<Book> findAllCachedList() {
        return repo.findAll().collectList().block();
    }
}

