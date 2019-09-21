package com.desafio.analisedados.controller;

import com.desafio.analisedados.processor.RelatorioProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controlador que inicializa a Thread do relatório.
 */
@Controller
public class RelatorioVendasController {

    @Autowired
    public RelatorioVendasController(RelatorioProcessor processor) {
        processor.start();
    }
}
