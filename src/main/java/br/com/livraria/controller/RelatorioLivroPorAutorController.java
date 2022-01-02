package br.com.livraria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livraria.dto.LivroPorAutorDto;
import br.com.livraria.service.LivroPorAutorService;

@RestController
@RequestMapping("/relatorio")
public class RelatorioLivroPorAutorController {
	
	@Autowired
	private LivroPorAutorService service;

	@GetMapping("/livrosporautor")
	public List<LivroPorAutorDto> relatorioLivrosPorAutor() {
		return service.relatorioLivrosPorAutor();		

}
}
