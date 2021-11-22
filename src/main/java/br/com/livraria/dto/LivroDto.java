package br.com.livraria.dto;

import java.time.LocalDate;


import lombok.Getter;

import lombok.Setter;

@Getter
@Setter

public class LivroDto {

	private String titulo;
	private Integer numeroPagina;
	private LocalDate dataLancamento;

}
