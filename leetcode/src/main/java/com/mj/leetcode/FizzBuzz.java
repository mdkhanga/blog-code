package com.mj.leetcode;

import java.util.function.IntConsumer;

public class FizzBuzz {

    private int n;
    private Object lock = new Object() ;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        synchronized (lock) {
            while( (n % 3 != 0) || (n %5 == 0)) {
                lock.wait();
            }
            printFizz.run();
            n++;
        }
        lock.notifyAll();
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        synchronized (lock) {
            while( (n % 3 == 0) || (n %5 != 0)) {
                lock.wait();
            }
            printBuzz.run();
            n++;
        }
        lock.notifyAll();
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        synchronized (lock) {
            while( (n % 3 != 0) || (n %5 != 0)) {
                lock.wait();
            }
            printFizzBuzz.run();
            n++;
        }
        lock.notifyAll();
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {

        synchronized (lock) {
            while( (n % 3 == 0) || (n %5 == 0)) {
                lock.wait();
            }
            printNumber.accept(n);
            n++;
        }
        lock.notifyAll();
    }



}
