package com.niksahn.laba4;

import java.util.Arrays;
import java.util.Stack;

public class StackCollection {

    private FI currentFI;
    private ConsoleUI currentUI;

    public StackCollection(FI curFI, ConsoleUI curUI){
        this.currentFI = curFI;
        this.currentUI = curUI;
    }
    private Stack<String> stack = new Stack<>();

    public void startUserInteraction() { // (FI fileInterface, StackCollection stack)
        boolean flag = false;
        String inpStack;
        while (!flag) {
            currentUI.displayInfo("Введите stack разделяя символы пробелами");
            inpStack = currentUI.inputInfo();
            StackCollection stack = StackCollection.addFromString(inpStack, this.currentFI, this.currentUI); // stack.addFromString(inpStack);
            try {
                stack.revert();
                currentUI.displayInfo(stack.toString());
                currentFI.addText(stack.toString());
            } catch (Exception e) {
                currentUI.displayInfo("Ошибка записи");
            }
        }
    }

    /**
     * Переворачивает стек
     *
     * @return перевернутый стек
     **/
    public StackCollection revert() {
        Stack<String> newStack = stack;
        stack = new Stack<>();
        var newStackIter = newStack.iterator();
        while (newStackIter.hasNext()) {
            stack.push(newStack.pop());
        }
        return this;
    }


    @Override
    public String toString() {
        String str = "";
        for (String s : stack) {
            str += s + " ";
        }
        return str;
    }

    /**
     * Возвращает созданный из строки объект StackCollection
     **/
    public static StackCollection addFromString(String str, FI fileInterface, ConsoleUI curUI) {
        StackCollection newStack = new StackCollection(fileInterface, curUI);
        var strArray = str.split(" ");
        Arrays.stream(strArray).forEach(newStack.stack::push);
        return newStack;
    }
}