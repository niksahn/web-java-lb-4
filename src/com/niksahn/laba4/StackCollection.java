package com.niksahn.laba4;

import java.util.Arrays;
import java.util.Stack;

public class StackCollection {
    private Stack<String> stack = new Stack<>();

    /**
     * Переворачивает стек
     * @return перевернутый стек
     **/
    public StackCollection revert() {
        Stack<String> newStack =  stack;
        stack = new Stack<>();
        var newStackIter = newStack.iterator();
        while (newStackIter.hasNext()) {
            stack.push(newStack.pop());
        }
        return this;
    }


    @Override
    public String toString(){
        String str = "";
        for (String s : stack) {
            str += s + " ";
        }
        return  str;
    }

    /**
     * Добавляет в stack объекта данные из строки
     * **/
    public void  addFromString(String str){
        var strArray = str.split(" ");
        Arrays.stream(strArray).forEach(this.stack::push);
    }
}

