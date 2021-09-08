package com.br.tec.gerenciamanagent.entities;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDto {
    private String firstName;
    private String lastName;
    private String cpf;

    private LocalDate birthDate;
    private final List<Phone> phones = new ArrayList<>();


}
