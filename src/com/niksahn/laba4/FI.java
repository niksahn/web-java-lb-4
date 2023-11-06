package com.niksahn.laba4;

import java.io.*;

public class FI {
    private DataOutputStream currentFileStream;

    public FI(ConsoleUI curUI) {
        curUI.displayInfo("Введите название файла, куда вы хотите сохранить перевернутый stack");
        String fileName = "";
        boolean exist = false;
        while (!exist) {
            try {
                fileName = curUI.inputInfo();
                currentFileStream = new DataOutputStream(new FileOutputStream(fileName + ".txt"));
                exist = true;
            } catch (FileNotFoundException e) {
                curUI.displayInfo("Неверное название, введите другое");
            }
        }
    }
    public void addText(String text) throws IOException {
        currentFileStream.writeChars(text + "\n");
    }

}
