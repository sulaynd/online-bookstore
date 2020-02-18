package com.loulysoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.loulysoft.onlinebookstore.entity.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {

}
