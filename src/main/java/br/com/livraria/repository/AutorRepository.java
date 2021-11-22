package br.com.livraria.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.livraria.dto.LivroPorAutorDto;
import br.com.livraria.modelo.Autor;


public interface AutorRepository extends JpaRepository<Autor, Integer>{
	
	/*@Query("SELECT new br.com.alura.carteira.dto.LivroPorAutorDto("
			+ "t.ticker, "
			+ "sum(A.quantidade)," 
			+ "sum(t.quantidade)* 1.0/ (select sum(t2.quantidade)from Transacao t2) * 1.0)  "
			+ "from Autor A group by ticker")
	List<LivroPorAutorDto> relatorioLivrosPorAutor();*/
	
	}
