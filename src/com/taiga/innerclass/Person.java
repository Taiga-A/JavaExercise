package com.taiga.innerclass;

public class Person {
    //静态成员内部类
    static class A1 {

    }
    //非静态成员内部类
    class A2 {

    }

    public void method() {
        class AA {
            //局部内部类
        }
    }

    {
        class BB {
            //局部内部类
        }
    }

    public Person() {
        class CC {
            //局部内部类
        }
    }


}
