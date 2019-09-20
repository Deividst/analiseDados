package com.desafio.analisedados.model.Enum;

import com.desafio.analisedados.util.MessagesUtil;

import java.util.Arrays;

/**
 * Enum para identificar o tipo de dado.
 */
public enum TipoDadoEnum {

    VENDEDOR("001"), CLIENTE("002"), VENDA("003");

    private final String code;

    TipoDadoEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    /**
     * Busca o valor do enum conforme o codigo passado como parâmetro.
     * @param code String
     * @return {@link TipoDadoEnum}
     */
    public static TipoDadoEnum getValue(String code) {
        return Arrays.stream(TipoDadoEnum.values())
                .filter(tipo -> tipo.code.equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        MessagesUtil.getMessage("erro.argumento.invalido.tipo.dado", code)));
    }
}
