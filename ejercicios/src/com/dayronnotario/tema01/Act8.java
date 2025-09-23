package com.dayronnotario.tema01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Act8 {
    private File file;

    public Act8(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }

    public File getFile() {
        return file;
    }

    public void setFile(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }

    public void leerArchivo(String directorio, String archivo) throws IOException {
        file = new File(directorio + "/" + archivo);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
    }
}
