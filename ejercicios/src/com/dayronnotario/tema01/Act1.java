package com.dayronnotario.tema01;

import java.io.File;

public class Act1 {
    private File file;

    public Act1(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public boolean Exist(){
        boolean files = file.exists();
        return files;
    }
    public boolean Directorio(){
        boolean files = file.isDirectory();
        return files;
    }
}