package com.dayronnotario.tema01;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Act4 {
    private File file;

    public Act4(File file) {
        for (int i=0; i<file.listFiles().length; i++) {
            if (file.listFiles()[i].isFile()) {
                this.file = file.listFiles()[i];
                return;
            }
        }
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
    public boolean Hide() {
        return file.isHidden();
    }
    public boolean Read() {
        return file.canRead();
    }
    public boolean Write() {
        return file.canWrite();
    }
    public String LastModified() {
        LocalDateTime datetime = Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        String formatted;
        return  formatted = datetime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public void setTime() {
        file.setLastModified(Instant.now().toEpochMilli());
    }

    public String size() {
        String size = file.length() + "bytes, " + file.length()/1000 + "KB, " +  file.length()/1000000 + "MB";
        return size;
    }
}
