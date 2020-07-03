package com.example.vezbanje.demo.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class GenreEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name = "Genre_Books", joinColumns = {@JoinColumn(name = "genre_id")},
				inverseJoinColumns = {@JoinColumn(name = "book_id")})
	
	private Set<BookEntity> books;
	


	public GenreEntity() {
		
	}
	
	public GenreEntity(final Builder builder) {
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	static class Builder{
		
		public static Builder builder() {
			return new Builder();
		}
		
		public Builder withId(final Long id) {
			
			return this;
		}
		
		public Builder withName(final String name) {
			return this;
		}
		
		public Builder withBooks(final Set<BookEntity> books) {
			return this;
		}
		
		public GenreEntity build() {
			return new GenreEntity(this);
		}
	}
	
	
	
	
	
	
	

}
