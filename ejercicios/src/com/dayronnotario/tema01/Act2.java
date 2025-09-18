package com.dayronnotario.tema01;

import java.io.File;

public class Act2 {
    private File file;

    public Act2(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public String[] mostrar(){
        String[] files = file.list();
        return files;
    }
}
