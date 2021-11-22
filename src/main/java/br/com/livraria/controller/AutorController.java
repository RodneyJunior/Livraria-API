package br.com.livraria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.dto.AutorDto;
import br.com.livraria.dto.AutorForm;
import br.com.livraria.modelo.Autor;

@RestController
@RequestMapping("/autores")
public class AutorController {

	private List<Autor> autores = new ArrayList<>();
	private ModelMapper modelMapper = new ModelMapper();

	@GetMapping
	public List<AutorDto> listar() {
		return autores
				.stream()
				.map(l ->modelMapper.map(l, AutorDto.class))
				.collect(Collectors.toList());
	
		
		
	}
	@PostMapping
	public void cadastrar(@RequestBody AutorForm frm) {	
		Autor autor = modelMapper.map(frm, Autor.class);	
		autores.add(autor);
	}
}
