
package br.com.livraria.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AutorForm {
	
	private String nome;
	private String email;
	private LocalDate datanascimento;
	private String minicurriculo;
	

}
