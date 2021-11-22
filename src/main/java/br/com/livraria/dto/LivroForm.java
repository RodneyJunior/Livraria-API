package br.com.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class LivroForm {
	
	
	@Size (min = 10)
	private String titulo;
	
	@Min(value = 100)
	private Integer numeroPagina;
	
	@PastOrPresent
	private LocalDate dataLancamento;
	
	@JsonAlias("autor_id")
	private Long autorId;
}
