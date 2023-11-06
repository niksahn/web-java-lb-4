package com.niksahn.laba4;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FI {
    private DataOutputStream currentFile;
    public FI(String file) throws FileNotFoundException {
        currentFile =  new DataOutputStream( new
                FileOutputStream(file));
    }

    public void addText(String text) throws IOException {
        currentFile.writeChars(text + "\n");
    }

}
