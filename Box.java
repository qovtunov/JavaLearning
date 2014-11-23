package com.company;

/**
 * Created by kovtunov on 23/08/14.
 */
public class Box {

    double widthWidth;
    double height;
    double depth;

    Box(double w, double h, double d) {
        widthWidth = w;
        height = h;
        depth = d;
    }

    Box(Box ob) {
        widthWidth = ob.widthWidth;
        height = ob.height;
        depth = ob.depth;
    }

    Box() {
        widthWidth = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        widthWidth = height = depth = len;
    }

    double volume() {
        return widthWidth * height * depth;
    }

}
