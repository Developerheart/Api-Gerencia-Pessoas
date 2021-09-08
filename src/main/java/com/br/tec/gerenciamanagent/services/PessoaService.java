package com.br.tec.gerenciamanagent.services;


import com.br.tec.gerenciamanagent.entities.Pessoa;
import com.br.tec.gerenciamanagent.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {


    private final PessoaRepository pessoaRepository;


    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    public Optional<Pessoa> findById(Long id){
        return pessoaRepository.findById(id);
    }


    public void save(Pessoa pessoa){
        pessoaRepository.save(pessoa);
    }

    public List<Pessoa> all (){
        return pessoaRepository.findAll();
    }

}
