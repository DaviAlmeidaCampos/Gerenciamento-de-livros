	package com.exercicio.entities;
	import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Table;
@Entity
@Table(name = "Livro")
public class Livro {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;   

	    private String descricao;
	   
	    private String isbn;
	    
	    public Livro() {
	    	
	    }
	    public Livro(Long id, String descricao, String isbn ) {
	    	super();
	    	this.id = id;
	    	this.descricao = descricao;
	    	this.isbn = isbn;
	    }
		//geter
		//setters
	    public Long getId() {
			return id;
		}

		public Long setId (Long id) {
			this.id = id;
		}

		public String getdecricao() {
			return descricao;
		}
		
		public void setisbn(String isbn) {
			this.isbn = isbn;
		}
	}