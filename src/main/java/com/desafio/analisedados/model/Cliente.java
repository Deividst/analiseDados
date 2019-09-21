package com.desafio.analisedados.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Cliente {

    private String cnpj;
    private String nome;
    private String areaNegocio;

}
