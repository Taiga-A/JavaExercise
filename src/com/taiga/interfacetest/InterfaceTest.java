package com.taiga.interfacetest;

public class InterfaceTest {
    public static void main(String[] args) {
        CompareObject o1 = new ComparableCirle(3);
        CompareObject o2 = new ComparableCirle(5);
        System.out.println(o1.compareTo(o2));
        CompareObject r1 = new ComparableRectangle(2,5);
        CompareObject r2 = new ComparableRectangle(4,5);
        System.out.println(r1.compareTo(r2));
    }
}
