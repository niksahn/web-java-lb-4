package com.niksahn.laba4;

public class Main {
    public static void main(String[] args) {
        ConsoleUI consUi = new ConsoleUI();
        FI fileInterface = new FI();
        consUi.startUserInteraction(fileInterface);
    }
}