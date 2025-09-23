package com.dayronnotario.tema01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File file = new File("ficheros");
	String dir = "ficheros";
	String arch = "";

        System.out.println();
        System.out.println("Act. 1");
        System.out.println();

        Act1 a1 = new Act1(file);

        System.out.println(a1.Exist());
        System.out.println(a1.Directorio());

        System.out.println();
        System.out.println("Act. 2");
        System.out.println();

        Act2 a2 = new Act2(file);

        for (int i=0; i<a2.mostrar().length; i++){
            System.out.println(a2.mostrar()[i]);
        }

        System.out.println();
        System.out.println("Act. 3");
        System.out.println();

        Act3 a3 = new Act3(file);

        System.out.println(a3.Name());
        System.out.println(a3.Path());
        System.out.println(a3.Read());
        System.out.println(a3.Write());

        System.out.println();
        System.out.println("Act. 4");
        System.out.println();

        Act4 a4 = new Act4(file);

        System.out.println(a4.Name());
        System.out.println(a4.Path());
        System.out.println(a4.Hide());
        System.out.println(a4.Read());
        System.out.println(a4.Write());
        System.out.println(a4.LastModified());
        a4.setTime();
        System.out.println(a4.LastModified());
        System.out.println(a4.size());

        System.out.println();
        System.out.println("Act. 5");
        System.out.println();

        GestionArchivos a5 = new GestionArchivos(dir, arch);

        System.out.println("Escribe la ruta del directorio");
        String directorio = null;
        try {
            directorio = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del archivo");
        String archivo = null;
        try {
            archivo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(a5.crearArchivo(directorio, archivo));
        System.out.println();
        a5.listarDirectorio(directorio);
        System.out.println();
        a5.verInfo(directorio, archivo);

        System.out.println();
        System.out.println("Act. 6");
        System.out.println();

        System.out.println("Escribe la ruta del directorio");
        directorio = null;
        try {
            directorio = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del archivo");
        archivo = null;
        try {
            archivo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        a5.leerArchivo(directorio, archivo);

        System.out.println();
        System.out.println("Act. 7");
        System.out.println();

        System.out.println("Escribe la ruta del directorio");
        directorio = null;
        try {
            directorio = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del archivo");
        archivo = null;
        try {
            archivo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        a5.leerHexadecimal(directorio, archivo);

        System.out.println();
        System.out.println("Act. 8");
        System.out.println();

        Act8 a8 = new Act8(dir, arch);

        a8.leerArchivo(args[0], args[1]);

        System.out.println();
        System.out.println("Act. 9");
        System.out.println();

        Act9 a9 = new Act9(dir, arch);

        System.out.println("Escribe la ruta del directorio");
        directorio = null;
        try {
            directorio = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del archivo");
        archivo = null;
        try {
            archivo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del otro archivo");
        String archivo2 = null;
        try {
            archivo2 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(a9.comparar(directorio, archivo, archivo2));

        System.out.println();
        System.out.println("Act. 10");
        System.out.println();

        Act10 a10 = new Act10(dir, arch);

        System.out.println("Escribe la ruta del directorio");
        directorio = null;
        try {
            directorio = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del archivo");
        archivo = null;
        try {
            archivo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del otro archivo");
        archivo2 = null;
        try {
            archivo2 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del nuevo archivo");
        String archivo3 = null;
        try {
            archivo3 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        a10.concat(directorio, archivo, archivo2, archivo3);

        System.out.println();
        System.out.println("Act. 11");
        System.out.println();

        Act11 a11 = new Act11(dir, arch);

        System.out.println("Escribe la ruta del directorio");
        directorio = null;
        try {
            directorio = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del archivo");
        archivo = null;
        try {
            archivo = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del otro archivo");
        archivo2 = null;
        try {
            archivo2 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Escribe el nombre del nuevo archivo");
        archivo3 = null;
        try {
            archivo3 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        a11.concatLines(directorio, archivo, archivo2, archivo3);
    }
}
