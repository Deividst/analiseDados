package com.desafio.analisedados.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Venda {

    private Long idVenda;
    private String nomeVendedor;
    private List<Item> itens;


}
