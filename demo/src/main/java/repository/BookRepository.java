package repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import model.BookEntity;

//repository je jedan od layera da bi pravili restove

public interface BookRepository extends CrudRepository<BookEntity, Long> {
	
	@Override
	BookEntity save(BookEntity book);
	
	@Override
	Optional<BookEntity> findById(final Long id);

}
