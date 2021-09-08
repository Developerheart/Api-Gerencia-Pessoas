package com.br.tec.gerenciamanagent.services;


import com.br.tec.gerenciamanagent.entities.Pessoa;
import com.br.tec.gerenciamanagent.entities.PessoaDto;
import com.br.tec.gerenciamanagent.exceptions.PessoaNotFoundException;
import com.br.tec.gerenciamanagent.repositories.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<PessoaDto> update(Long id, PessoaDto personDTO) throws PessoaNotFoundException {
        pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNotFoundException(id));

        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(personDTO, pessoa);
        pessoaRepository.save(pessoa);
        return ResponseEntity.ok(personDTO);
    }

    public void delete(Long id) throws PessoaNotFoundException {
        pessoaRepository.findById(id)
                .orElseThrow(() -> new PessoaNotFoundException(id));

        pessoaRepository.deleteById(id);
    }



}
