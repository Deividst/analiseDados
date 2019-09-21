package com.desafio.analisedados.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public static List<String> readFile(Path filePath) {
        List<String> linhas = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath.toFile());
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String linha;

            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }

            br.close();
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

    public static void writeFile(Path path, List<String> linhas) {
        try {
            FileOutputStream fos = new FileOutputStream(path.toString() + File.separator + "out.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);

            linhas.forEach(linha -> {
                try {
                    bw.write(linha);
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
