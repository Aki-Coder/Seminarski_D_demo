package com.example.vezbanje.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vezbanje.demo.dto.BookDto;
import com.example.vezbanje.demo.mapper.BookMapper;
import com.example.vezbanje.demo.model.BookEntity;
import com.example.vezbanje.demo.repository.BookRepository;

//klasa koja implemantira service
@Service
public class BookServiceImpl implements BookService {
	
	//u service ubaci repozitorijum
	//autowierd bookrepository
	@Autowired
	
	//koristimo metode koje se u njemu nalaze
	public BookRepository bookRepo;
	
	@Autowired
	private BookMapper bookMapper;
	
	//prosledicemo dto objekat
	@Override
	//dobijamo dto objekat
	public BookDto save(final BookDto bookDto) {
		//trazim od repos findById
		//ako je null i nije pronasao ne postiji u bazi
		if(bookRepo.findById(bookDto.getId() == null)) {
			//zelimo da kreiramo novi,to radi save metoda
			//dobijemo dto objekat koji moramo da pretvorimo u pravi u BookeEntity
			//zato pravimo mapper koji mapira na pravi book entitet
			bookRepo.save(bookMapper.map(bookDto));
			return bookDto;		
		}
		return null;
		
	}
	
	@Override
	public BookDto getById(final Long id) {
		//idi na repo nadji mi knjigu sa tim id-jem i 		uzmi je
		final BookEntity bookEntity = bookRepo.findById(id).get();
		//pretvori je u dto, stavrni entitet u dto
		return bookMapper.mapToDto(bookEntity);
	}
}
