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

@SpringBootApplication
public class AnaliseDadosApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnaliseDadosApplication.class, args);
        try {
            FileUtil.createFolder(PathConfig.PATH_IN);
            Path teste = Paths.get(PathConfig.PATH_IN + File.separator + "teste.txt");
            System.out.println(FileUtil.readFile(teste));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
