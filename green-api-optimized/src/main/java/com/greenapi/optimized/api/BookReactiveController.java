package com.greenapi.optimized.api;

import com.greenapi.optimized.repo.BookReactiveRepository;
import com.greenapi.optimized.service.BookServiceReactif;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reactive/books")
@Slf4j
public class BookReactiveController {
    private final BookServiceReactif bookService;
    private final BookReactiveRepository repo;

    public BookReactiveController(BookServiceReactif bookService, BookReactiveRepository repo) {
        this.bookService = bookService;
        this.repo = repo;
    }
}
