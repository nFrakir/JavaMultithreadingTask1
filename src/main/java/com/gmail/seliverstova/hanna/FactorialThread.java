package com.gmail.seliverstova.hanna;

import java.math.BigInteger;

public class FactorialThread implements Runnable {
    private int number;

    public FactorialThread(int number) {
        super();
        this.number = number;
    }

    public FactorialThread() {
        super();
    }

    public int getNumber() {
        return number;
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        System.out.println(th.getName() + ": " + this.number + "! = " + calculateFactorial(this.number));
    }

    private BigInteger calculateFactorial(int number) {
        BigInteger fact = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }
}
