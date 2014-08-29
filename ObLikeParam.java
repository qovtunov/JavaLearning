package com.company;

/**
 * Created by kovtunov on 23/08/14.
 */
public class ObLikeParam {
    int a,b;

    ObLikeParam(int i, int j) {
        a = i;
        b = j;

    }

    boolean equals(ObLikeParam o) {
        if (o.a == a && o.b ==b) return true;
        else return false;
    }
}
