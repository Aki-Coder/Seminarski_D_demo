package com.example.vezbanje.demo.dto;

import java.math.BigDecimal;

public class BookDto {
	private final Long id;
	private final String title;
	private final String author;
	private final BigDecimal price;
	
	public BookDto(final BookDto book) {
		id = book.getId();
		title = book.getTitle();
		author = book.getAuthor();
		price = book.getPrice();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	

}
