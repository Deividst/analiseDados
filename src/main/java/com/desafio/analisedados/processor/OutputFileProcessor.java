package com.desafio.analisedados.processor;

import com.desafio.analisedados.config.PathConfig;
import com.desafio.analisedados.dto.RelatorioDto;
import com.desafio.analisedados.service.AnaliseDadosService;
import com.desafio.analisedados.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Component
public class OutputFileProcessor {

    private final AnaliseDadosService service;

    @Autowired
    public OutputFileProcessor(AnaliseDadosService service) {
        this.service = service;
    }

    public void process(RelatorioDto dto){
        List<String> linhas = new ArrayList<>();
        service.setDto(dto);

        linhas.add("Quantidade de clientes no arquivo de entrada: " + service.getQuantidadeClientes());
        linhas.add("Quantidade de vendedores no arquivo de entrada: " + service.getQuantidadeVendedores());
        linhas.add("ID da venda mais cara: " + service.getIdVendaMaisCara());
        linhas.add("O pior vendedor: " + service.getPiorVendedor());

        FileUtil.writeFile(PathConfig.PATH_OUT, linhas);
    }

}
