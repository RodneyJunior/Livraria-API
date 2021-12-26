package br.com.livraria.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.livraria.dto.LivroDto;
import br.com.livraria.dto.LivroForm;
import br.com.livraria.modelo.Livro;
import br.com.livraria.repository.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepository;

	private ModelMapper modelMapper = new ModelMapper();
	
	public Page<LivroDto> Listar(Pageable paginacao) {
		Page<Livro> livros = livroRepository.findAll(paginacao);
		return livros.map(t ->modelMapper.map(t, LivroDto.class));
		
	}
	
	@Transactional
	public LivroDto Cadastrar(LivroForm frm)
	{
			Livro livro = modelMapper.map(frm, Livro.class);
			livro.setId(null);
			livroRepository.save(livro);
			
			return modelMapper.map(livro, LivroDto.class);
	}
	
}
