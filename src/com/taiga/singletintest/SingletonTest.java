package com.taiga.singletintest;

/*
单例设计模式

饿汉式实现

 */

public class SingletonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);

    }



}

class Bank {
    private Bank(){

    }
    private static final Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }
}