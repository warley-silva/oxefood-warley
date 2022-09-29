package br.com.ifpe.oxefoodwarley.util.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntidadeNegcio implements Seriazable {
	
	private long id;
	private Boolean habilitado;
}
