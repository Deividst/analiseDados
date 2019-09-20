package com.desafio.analisedados.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<String> readFile(Path filePath) {
        List<String> linhas = new ArrayList<>();
        try {
            FileReader fl = new FileReader(filePath.toFile());
            BufferedReader br = new BufferedReader(fl);
            String linha;

            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }

    public static void createFolder(Path path) throws IOException {
        if (Files.notExists(path)) {
            Files.createDirectory(path.toAbsolutePath());
        }
    }

}
