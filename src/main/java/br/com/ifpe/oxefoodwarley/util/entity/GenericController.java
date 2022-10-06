package br.com.ifpe.oxefoodwarley.util.entity;

import br.com.ifpe.oxefoodwarley.util.exceptions.PreenchimentoException;

public class GenericController {

    protected void validarPreenchimentoChave(String chave) {

    if (chave == null || chave.equals("")) {
        throw new PreenchimentoException(PreenchimentoException.MSG_CHAVE_NAO_INFORMADA);
    }
    }
}

