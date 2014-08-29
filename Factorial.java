package com.company;

/**
 * Created by kovtunov on 23/08/14.
 */
public class Factorial {

    int fact(int n) {
        int result;
        if (n==1) return 1;
        result = fact(n-1) * n;
        return  result;
    }
}
