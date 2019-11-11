package com.company;

/**
 * @author Awet-PC
 */
class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Main {
    public static void main(String[] args) {
        String input = "keep";
        int stackSize = input.length();
        Stack stack = new Stack(stackSize);

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            char ch = stack.pop();
            System.out.println(ch);
        }
    }
}