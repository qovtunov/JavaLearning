package com.company;

/**
 * Created by kovtunov on 03/11/14.
 */
public class UseStatic {
    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("x = " + a);
        System.out.println("x = " + b);
    }

    static {
        System.out.println("Static block");
        b = a * 4;
    }

}
