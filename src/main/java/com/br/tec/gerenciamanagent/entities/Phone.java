package com.br.tec.gerenciamanagent.entities;


import com.br.tec.gerenciamanagent.entities.enums.TipoTelefone;
import lombok.*;
import javax.persistence.*;



@Builder
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTelefone type;

    @Column(nullable = false, unique = true)
    private String number;
}
