package com.br.tec.gerenciamanagent.services;


import com.br.tec.gerenciamanagent.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {


    private final PessoaRepository pessoaRepository;


    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }




}
