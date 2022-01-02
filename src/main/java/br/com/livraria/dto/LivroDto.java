package br.com.livraria.dto;

import java.time.LocalDate;


import lombok.Getter;

import lombok.Setter;

@Getter
@Setter

public class LivroDto {

	private Long id;
	private String titulo;
	private Integer numeroPagina;
	private LocalDate dataLancamento;
	
	private Long autorId;


}
