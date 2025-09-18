package com.dayronnotario.tema01;

import java.io.File;

public class Act3 {
    private File file;

    public Act3(File file) {
        this.file = file;
    }
    public File getFile() {
        return file;
    }
    public void setFile(File file) {
        this.file = file;
    }
    public String Name() {
        return file.getName();
    }
    public String Path() {
        return file.getAbsolutePath();
    }
    public boolean Read() {
        return file.canRead();
    }
    public boolean Write() {
        return file.canWrite();
    }
}
