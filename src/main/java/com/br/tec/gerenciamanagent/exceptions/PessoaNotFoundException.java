package com.br.tec.gerenciamanagent.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNotFoundException extends Exception{

    public PessoaNotFoundException(Long id){
        super(String.format("Pessoa com o ID %s NÃO ENCONTRADA", id));
    }

}
