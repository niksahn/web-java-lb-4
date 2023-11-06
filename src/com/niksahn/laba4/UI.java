package com.niksahn.laba4;

import java.util.Scanner;

public class UI {
    static private final Scanner in = new Scanner(System.in);

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
