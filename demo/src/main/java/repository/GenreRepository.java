package repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import model.GenreEntity;

//repository je jedan od layera da bi pravili restove

public interface GenreRepository extends CrudRepository<GenreEntity, Long> {
	
	
	//pozvace se u sevisu
	
	//vratice listu GenreEntity
	@Override
	List<GenreEntity> findAll();
	
	//vrednost koju mu prosledimo gleda sa kolonom name u Zanr tabeli
	GenreEntity findDistincByName(String name);

	//@Query(value = "select entity_table.name from entity_table", nativeQuery = true)
}
