package br.com.ifpe.oxefoodwarley.modelo.produto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import br.com.ifpe.oxefoodwarley.util.entity.EntidadeAuditavel;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaProduto extends EntidadeAuditavel {
	
	private String chaveEmpresa;
	
	private String descricao;
}
