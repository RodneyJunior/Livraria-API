package br.com.livraria.modelo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
	// mínimo 10 caractere
	private String titulo;
	
	//deve ser maior ou igual a 100
	private Integer numeroPagina;
// deve ser menor que a data atual
	private LocalDate dataLancamento;

}
