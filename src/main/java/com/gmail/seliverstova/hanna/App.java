package com.gmail.seliverstova.hanna;

public class App {
    public static void main(String[] args) {
        Thread[] thrArray = new Thread[100];
        for (int i = 0; i < thrArray.length; i++) {
            thrArray[i] = new Thread(new FactorialThread(i));
        }
        for (int i = 0; i < thrArray.length; i++) {
            thrArray[i].start();
        }
    }
}
