package com.niksahn.laba4;
import java.util.Scanner;

public class ConsoleUI {
    static private final Scanner in = new Scanner(System.in);

    public ConsoleUI() {
        displayInfo("22ВП3 Бригада 3 Сахно и Новосельцев \n Вариант №3: Класс Stack \n");
    }

    public void displayInfo(String str) {
        System.out.println(str);
    }

    public String inputInfo() {
        return in.nextLine();
    }
}
