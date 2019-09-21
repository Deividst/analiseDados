package com.desafio.analisedados.model.converter;


import com.desafio.analisedados.model.Vendedor;

public class VendedorConverter {

    public static Vendedor converter(String[] atributos){
        return Vendedor.builder()
                .cpf(atributos[1])
                .nome(atributos[2])
                .salario(atributos[3]).build();
    }
}
