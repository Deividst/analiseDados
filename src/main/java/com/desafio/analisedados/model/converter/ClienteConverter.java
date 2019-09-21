package com.desafio.analisedados.model.converter;


import com.desafio.analisedados.model.Cliente;

public class ClienteConverter {

    public static Cliente converter(String[] atributos){
        return Cliente.builder()
                .cnpj(atributos[1])
                .nome(atributos[2])
                .areaNegocio(atributos[3]).build();
    }

}
