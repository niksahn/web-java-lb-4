package com.niksahn.laba4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConsoleUI {
    static private final Scanner in = new Scanner(System.in);

    public void startUserInteraction(FI fileInterface) { // (FI fileInterface, StackCollection stack)
        boolean flag = false;
        String inpStack;
        while (!flag) {
            displayInfo("Введите stack разделяя символы пробелами");
            inpStack = inputInfo();
            StackCollection stack = StackCollection.addFromString(inpStack); // stack.addFromString(inpStack);
            getRightFileName(fileInterface);
        }
    }

    private void getRightFileName(FI fileInterface) {
        displayInfo("Введите название файла, куда вы хотите сохранить перевернутый stack");
        String fileName = "";
        boolean exist = false;
        while (!exist) {
            try {
                fileName = inputInfo();
                fileInterface.createFile(fileName);
                exist = true;
            } catch (FileNotFoundException e) {
                displayInfo("Неверное название, введите другое");
            }
        }
    }

    static private void displayInfo(String str) {
        System.out.println(str);
    }

    static private String inputInfo() {
        return in.nextLine();
    }

    static public void displayInfoMsg() {
        displayInfo("22ВП3 Бригада 3 Сахно и Новосельцев \n Вариант №3: Класс Stack \n");
    }

}
