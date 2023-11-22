package com.exercicio.properties;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.entities.Livro;

	public interface Repository extends JpaRepository <Livro, Long>{
}
