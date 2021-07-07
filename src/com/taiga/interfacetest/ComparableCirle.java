package com.taiga.interfacetest;

public class ComparableCirle extends Circle implements CompareObject{

    ComparableCirle(int r) {
        super(r);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o)return 0;
        if(o instanceof ComparableCirle c) {
            return this.getRedius() - c.getRedius();
        }
        return -1;
    }
}
