package br.com.livraria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import org.modelmapper.ModelMapper;

import br.com.livraria.dto.AutorDto;
import br.com.livraria.dto.AutorForm;
import br.com.livraria.modelo.Autor;
import br.com.livraria.repository.AutorRepository;


public class AutorService {

	@Autowired
	private AutorRepository autorRepository;

	private ModelMapper modelMapper = new ModelMapper();
	
	public Page<AutorDto> Listar(Pageable paginacao) {
		Page<Autor> autores = autorRepository.findAll(paginacao);
		return autores.map(t ->modelMapper.map(t, AutorDto.class));
		
	}
	
	@Transactional
	public AutorDto Cadastrar(AutorForm dto)
	{
			Autor autor = modelMapper.map(dto, Autor.class);
			autor.setId(null);
			autorRepository.save(autor);
			
			return modelMapper.map(autor, AutorDto.class);
	}
	
}


