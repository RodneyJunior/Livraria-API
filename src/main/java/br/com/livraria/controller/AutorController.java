package br.com.livraria.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.livraria.dto.AutorDto;
import br.com.livraria.dto.AutorForm;
import br.com.livraria.service.AutorService;

@RestController
@RequestMapping("/autores")
public class AutorController {

	@Autowired
	private AutorService service;
	
	@GetMapping
	public Page<AutorDto> listar(@PageableDefault(size = 10) Pageable paginacao) {
		return service.Listar(paginacao);		
	}
	@PostMapping
	public  ResponseEntity<AutorDto> cadastrar(@RequestBody AutorForm frm, UriComponentsBuilder uriBuilder) {	
		AutorDto autorDto = service.Cadastrar(frm);
		 URI uri = uriBuilder.path("/autores/{id}").buildAndExpand(autorDto.getId()).toUri(); 
			return ResponseEntity.created(uri).body(autorDto);
	}
}


	 
	 
	