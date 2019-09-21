package com.desafio.analisedados.processor;

import com.desafio.analisedados.dto.RelatorioDto;
import com.desafio.analisedados.model.Enum.TipoDadoEnum;
import com.desafio.analisedados.model.Item;
import com.desafio.analisedados.model.Venda;
import com.desafio.analisedados.model.converter.ClienteConverter;
import com.desafio.analisedados.model.converter.VendaConverter;
import com.desafio.analisedados.model.converter.VendedorConverter;
import com.desafio.analisedados.util.FileUtil;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.List;

/**
 * Classe que vai realizar o processamento do arquivo de entrada.
 */
@Component
public class InputFileProcessor {

    private final String SPLIT_LINE = "ç";

    public RelatorioDto processamento(Path path) {

        List<String> linhas = FileUtil.readFile(path);
        RelatorioDto dto = new RelatorioDto();

        linhas.forEach(linha -> {
            String[] atributos = linha.split(SPLIT_LINE);
            switch (TipoDadoEnum.getValue(atributos[0])) {
                case CLIENTE:
                    dto.getClientes().add(ClienteConverter.converter(atributos));
                    break;
                case VENDEDOR:
                    dto.getVendedores().add(VendedorConverter.converter(atributos));
                    break;
                case VENDA:
                    Venda venda = VendaConverter.converter(atributos);
                    venda.setValorTotal(venda.getItens().stream()
                            .map(Item::getPreco)
                            .reduce(BigDecimal.ZERO, BigDecimal::add));
                    dto.getVendas().add(venda);
                    break;
            }

        });

        return dto;
    }
}
