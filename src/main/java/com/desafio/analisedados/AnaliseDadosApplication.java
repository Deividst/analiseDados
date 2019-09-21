package com.desafio.analisedados;

import com.desafio.analisedados.config.PathConfig;
import com.desafio.analisedados.model.Enum.TipoDadoEnum;
import com.desafio.analisedados.util.FileUtil;
import com.desafio.analisedados.util.MessagesUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AnaliseDadosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnaliseDadosApplication.class, args);
    }

}
