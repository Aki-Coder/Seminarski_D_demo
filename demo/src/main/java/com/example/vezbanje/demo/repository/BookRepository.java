package com.example.vezbanje.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.vezbanje.demo.model.BookEntity;

//repository je jedan od layera da bi pravili restove

public interface BookRepository extends CrudRepository<BookEntity, Long> {
	
	@Override
	BookEntity save(BookEntity book);
	
	boolean findById(final boolean b);

}
