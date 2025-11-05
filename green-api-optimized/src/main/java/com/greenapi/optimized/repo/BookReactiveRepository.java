package com.greenapi.optimized.repo;

import com.greenapi.optimized.domain.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookReactiveRepository extends ReactiveCrudRepository<Book, Long> {
    // TODO : add custom queries
}

