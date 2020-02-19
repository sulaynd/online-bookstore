package com.loulysoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.loulysoft.onlinebookstore.entity.Book;

//add multiple cross origin urls in spring boot
//@CrossOrigin(origins = {"http://localhost:4200", "http://someserver:8080"})

@CrossOrigin("http://localhost:4200")// for all request  inside this class, allowed all request from localhost:4200
public interface BookRepository extends JpaRepository<Book, Long> {

}
