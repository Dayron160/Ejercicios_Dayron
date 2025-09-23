package com.dayronnotario.tema01;

import java.io.*;

public class GestionArchivos {
    private File file;

    public GestionArchivos(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }
    public File getFile() {
        return file;
    }
    public void setFile(String directorio, String archivo) {
        this.file = File(directorio + "/" + archivo);
    }
    public boolean crearArchivo(String directorio, String archivo) {
        File archivo1= new File(directorio + "/" + archivo);
        try {
            return archivo1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void listarDirectorio(String directorio) {
        String tipo;
        String lectura;
        String escribir;
        file = new File(directorio);
        for (int i=0; i<file.listFiles().length; i++){
            if (file.listFiles()[i].isDirectory()){
                tipo = "d";
            } else tipo = "f";
            if (file.listFiles()[i].canRead()){
                lectura = "r";
            } else lectura = " ";
            if (file.listFiles()[i].canWrite()){
                escribir = "w";
            } else escribir = " ";

            System.out.println(file.listFiles()[i].getName() + " " + tipo + " " + file.listFiles()[i].length() + " bytes " + lectura +  escribir);
        }
    }
    public void verInfo(String directorio, String archivo) {
        String tipo;
        String lectura;
        String escribir;
        file = new File(directorio +  "/" + archivo);
        if (file.isDirectory()){
            tipo = "d";
        } else tipo = "f";
        if (file.canRead()){
            lectura = "r";
        } else lectura = " ";
        if (file.canWrite()){
            escribir = "w";
        } else escribir = " ";

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName() + " " + tipo + " " + file.length() + " bytes " + lectura +  escribir);
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

    public void leerHexadecimal(String directorio, String archivo) throws IOException {
        file = new File(directorio + "/" + archivo);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);
                int lineaDecimal = caracter;
                System.out.printf("%x", lineaDecimal);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
