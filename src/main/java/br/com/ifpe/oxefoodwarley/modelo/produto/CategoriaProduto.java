package br.com.ifpe.oxefoodwarley.modelo.produto;

import br.com.ifpe.oxefoodwarley.util.entity.EntidadeAuditavel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoriaProduto extends EntidadeAuditavel {
	
	private static final long serialVersionUID = -1056979035020019302L;

	private String chaveEmpresa;
	
	private String descricao;
}

