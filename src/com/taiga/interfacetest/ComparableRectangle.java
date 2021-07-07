package com.taiga.interfacetest;

public class ComparableRectangle extends Rectangle implements CompareObject{
    public ComparableRectangle(int x, int y) {
        super(x,y);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o)return 0;
        if(o instanceof ComparableRectangle r) {
            return this.getX() * this.getY() - r.getX() * r.getY();
        }
        return -1;
    }
}
