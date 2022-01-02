package br.com.livraria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.livraria.dto.LivroPorAutorDto;
import br.com.livraria.modelo.Livro;

public interface LivroRepository  extends JpaRepository<Livro, Long> {

	@Query("SELECT new br.com.livraria.dto.LivroPorAutorDto( "
			+ "l.autor.nome, "
			+ "count(*), "
			+ "count(*) * 1.0/(select count(*) from Livro l2 ) * 1.0) "
			+ "from Livro l "
			+ "group by l.autor")
	List<LivroPorAutorDto> relatorioLivrosPorAutor();
}




