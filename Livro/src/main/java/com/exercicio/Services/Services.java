package com.exercicio.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio.entities.Livro;
import com.exercicio.properties.Repository;

@Service
public class Services {
	
	private final Repository repository;
	@Autowired
	public Services(Repository repository) {
		this.repository = repository;
	}

	// inserir Livro
	public Livro getLivro(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	//inserir produto
	public Livro saveLivro(Livro livro) {
    return repository.save(livro);
	}

	// listar produto por id
	public Livro setLivroById(Long id) {
		return repository.findById(id).orElse(null);
	}

	// listar todos os produtos
	public List<Livro> getAllLivro() {
		return repository.findAll();
	}

	// apagar produto
	public void deleteLivro(Long id) {
		repository.deleteById(id);
	}
	// fazendo o update do jogo com o optional
		public Livro updateJogo(Long id, Livro novoLivro) {
	        Optional<Livro> LivroOptional = repository.findById(id);
	        if (LivroOptional.isPresent()) {
	        	Livro LivroExistente = LivroOptional.get();
	           	LivroExistente.setId(novoLivro.getId());
	        	LivroExistente.setdescricao(novoLivro.getdescricao());
	        	
	            return repository.save(LivroExistente); 
	        } else {
	            return null; 
	        }
	    }
}


