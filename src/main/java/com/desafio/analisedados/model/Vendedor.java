package com.desafio.analisedados.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Vendedor {

    private String cpf;
    private String nome;
    private String salario;

}
