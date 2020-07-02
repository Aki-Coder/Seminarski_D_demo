package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.BookService;

//najvisi layer koji se pogodi

@RestController

//nas resur /book tj knjiga
@RequestMapping(value = "/book")
public class BookController {
	
	//u kontroler ubaci service
	@Autowired
	BookService bookService;

	//akcije vezane za knjigu kreiranje i pronalazanje na osnovu zadatog id
}