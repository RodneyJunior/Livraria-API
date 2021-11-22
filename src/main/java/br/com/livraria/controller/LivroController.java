package br.com.livraria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.dto.LivroDto;
import br.com.livraria.dto.LivroForm;
import br.com.livraria.modelo.Livro;

@RestController
@RequestMapping("/livros")
public class LivroController {

	private List<Livro> livros = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping
	public List<LivroDto> listar() {
		
		return livros
				.stream()
				.map(l ->modelMapper.map(l, LivroDto.class))
				.collect(Collectors.toList());
		
		
	}
	@PostMapping
	public void cadastrar(@RequestBody @Valid LivroForm dto) {	
		Livro livro = modelMapper.map(dto, Livro.class);	
		livros.add(livro);
	}
}
