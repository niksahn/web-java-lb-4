package com.niksahn.laba4;

import java.io.*;

public class FI {
    private DataOutputStream currentFileStream;
    private File f;
    public void createFile(String file) throws FileNotFoundException {
        currentFileStream = new DataOutputStream(new FileOutputStream(file));
    }

    public void addText(String text) throws IOException {
        currentFileStream.writeChars(text + "\n");
    }

}
