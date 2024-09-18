package com.nt.repository;



import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
