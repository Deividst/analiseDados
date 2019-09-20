package com.desafio.analisedados.model;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Item {

    private Long id;
    private Integer quantidade;
    private BigDecimal preco;

}
