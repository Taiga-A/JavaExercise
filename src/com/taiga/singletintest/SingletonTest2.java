package com.taiga.singletintest;

/*
单例设计模式

懒汉式实现

 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order2 == order1);
    }

}

class Order {
    private Order() {

    }
    private static Order instance = null;

    public static Order getInstance() {
        if(instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
