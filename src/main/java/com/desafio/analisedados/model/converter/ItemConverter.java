package com.desafio.analisedados.model.converter;


import com.desafio.analisedados.model.Item;

import java.math.BigDecimal;

public class ItemConverter {

    private static final String SPLIT_LINE = "-";

    public static Item converter(String linha){
        String[] atributos = linha.split(SPLIT_LINE);
        return Item.builder()
                .id(Long.parseLong(atributos[0]))
                .quantidade(Integer.parseInt(atributos[1]))
                .preco(new BigDecimal(atributos[2])).build();
    }

}
