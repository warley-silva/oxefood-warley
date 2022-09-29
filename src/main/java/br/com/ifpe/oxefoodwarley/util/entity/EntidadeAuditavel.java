package br.com.ifpe.oxefoodwarley.util.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntidadeAuditavel extends EntidadeNegcio {
	
	private Long versao; 
	
	private LocalDate dataCriacao;
	
	private LocalDate dataUltimaModificacao;
	
	private Long criadorPor;
	
	private Long ultimaModificacaoPor;
	
}
