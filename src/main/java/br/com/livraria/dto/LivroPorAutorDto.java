package br.com.livraria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class LivroPorAutorDto {
	private String autor;
	private Long quantidadedeLivros;
	private Double percentual;
}
