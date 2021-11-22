package br.com.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.modelo.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long> {

}
