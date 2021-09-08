package com.br.tec.gerenciamanagent.repositories;

import com.br.tec.gerenciamanagent.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
