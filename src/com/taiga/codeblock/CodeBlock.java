package com.taiga.codeblock;
/*

静态代码块和非静态代码块

静态：
    》可以盛放函数，加载类时会执行，且仅执行一次

非静态：
    》可以盛放函数，实例化对象时会执行，每次实例化都会执行

*作用：可以对‘类’或‘对象’进行初始化，或是提前执行一些任务。

 */


public class CodeBlock {
    public static void main(String[] args) {
        System.out.println("**********");
        System.out.println(Test.str);
        System.out.println(Test.str);
        Test test1 = new Test();
        Test test2 = new Test();
    }

}

class Test {
    public static String str = "static String";

    static {
        System.out.println("static block in runtime");
    }

    {
        System.out.println("normal block in runtime");
    }
}