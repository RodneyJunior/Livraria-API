package br.com.livraria.controller;

import java.net.URI;

import javax.validation.Valid;

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

import br.com.livraria.dto.LivroDto;
import br.com.livraria.dto.LivroForm;
import br.com.livraria.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

	@Autowired
	private LivroService service;

	@GetMapping
	public Page<LivroDto> listar(@PageableDefault(size = 10) Pageable paginacao) {
		return service.Listar(paginacao);				
	}
	@PostMapping
	public ResponseEntity<LivroDto> cadastrar(@RequestBody @Valid LivroForm frm, UriComponentsBuilder uriBuilder) {	//@RequestBody AutorForm frm, UriComponentsBuilder uriBuilder
		
		LivroDto dto = service.Cadastrar(frm);
		 URI uri = uriBuilder.path("/livros/{id}").buildAndExpand(dto.getId()).toUri(); 
			return ResponseEntity.created(uri).body(dto);
	}
}
