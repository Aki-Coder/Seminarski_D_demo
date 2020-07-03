package com.example.vezbanje.demo.mapper;

import org.springframework.web.bind.annotation.Mapping;

import com.example.vezbanje.demo.dto.BookDto;
import com.example.vezbanje.demo.model.BookEntity;


@Mapper
public interface BookMapper {

	//metoda koja dto mapira na stvarnu knjigu
	//source koje je polje
	//target na koje polje zelimo da namapiramo
	//polja su isto u dto i bookentity pa se isto zovu
	@Mappings({@Mapping(source = "id",target = "id"), @Mapping(source = "title",target = "title"),
			   @Mapping(source = "price", target = "price"), @Mapping(source = "author", target = "author")})
	BookEntity map(BookDto bookDto);
	
	
	//koja knjigu mapira u dto
	@Mappings({@Mapping(source="id",target="id"), @Mapping(source="title",target="titile"),
			   @Mapping(source="price", target="price"),@Mapping(source="author",target="author")})
	BookDto mapToDto(BookEntity bookEntity);
}
