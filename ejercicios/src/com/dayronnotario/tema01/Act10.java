package com.dayronnotario.tema01;

import java.io.*;

public class Act10 {
    private File file;

    public Act10(String directorio, String archivo) {
            this.file = File(directorio + "/" + archivo);
        }

    public File getFile() {
        return file;
    }

    public void setFile(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }

    public void concat(String directorio, String archivo, String archivo2, String archivo3) throws IOException {
        file = new File(directorio + "/" + archivo);
        File file2 = new File(directorio + "/" + archivo2);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        FileReader fr2 = new FileReader(file2);
        BufferedReader br2 = new BufferedReader(fr2);
        String linea;
        String lineatotal = "";
        while ((linea = br.readLine()) != null) {
            lineatotal = lineatotal + linea + " ";
        }
        String linea2;
        String linea2total = "";
        while ((linea2 = br2.readLine()) != null) {
            linea2total = linea2total + linea2 + " ";
        }
        File file3 = new File(directorio + "/" + archivo3);
        FileWriter fw = new FileWriter(file3);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(lineatotal + linea2total);
        bw.close();
        fw.close();
    }
}
