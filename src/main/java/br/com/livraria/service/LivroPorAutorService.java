package br.com.livraria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.livraria.dto.LivroPorAutorDto;
import br.com.livraria.repository.LivroRepository;

@Service
public class LivroPorAutorService {

	@Autowired
	private LivroRepository livroRepository;	
	
	public List<LivroPorAutorDto> relatorioLivrosPorAutor() {
		
		return livroRepository.relatorioLivrosPorAutor();
		
	}	
}
