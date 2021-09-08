package com.br.tec.gerenciamanagent.dto;


import com.br.tec.gerenciamanagent.entities.Pessoa;
import com.br.tec.gerenciamanagent.entities.PessoaDto;
import com.br.tec.gerenciamanagent.services.PessoaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/Pessoa")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaController {


    private PessoaService pessoaService;


    @GetMapping("/{id}")
    public ResponseEntity<PessoaDto> findById(@PathVariable Long id) {

        PessoaDto pessoaDto = new PessoaDto();

        BeanUtils.copyProperties(pessoaService.findById(id), pessoaDto);


        return ResponseEntity.ok(pessoaDto);
    }


    @PostMapping("/Create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> create(@RequestBody @Valid Pessoa pessoa) {
        return ResponseEntity.ok().build();
    }


    @GetMapping
    public List<Pessoa> listAll() {
        return pessoaService.all();
    }

}
