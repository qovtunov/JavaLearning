package com.company;

public class Main {

    public static void main(String[] args) {

                           // OverloadDemo
        /*OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.2);
        System.out.println("Result: " + result);*/

                        // Box
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);



        /*double vol;

        vol = mybox1.volume();
        System.out.println("mybox1 = " + vol);
        vol = mybox2.volume();
        System.out.println("mybox2 = " + vol);
        vol = mycube.volume();
        System.out.println("mycube = " + vol);
        vol = myclone.volume();
        System.out.println("myclone = " + vol);*/

                        // BoxWeight (EXTENDS)
        /*BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3 );
        double vol;

        vol = mybox1.volume();

        System.out.println(vol);
        System.out.println(mybox1.weight);*/

                        // ObLikeParam
        /*ObLikeParam ob1 = new ObLikeParam(100, 22);
        ObLikeParam ob2 = new ObLikeParam(100, 22);
        ObLikeParam ob3 = new ObLikeParam(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));*/

                        // Factorial
        /*Factorial f = new Factorial();

        System.out.println("f3: " + f.fact(3));
        System.out.println("f4: " + f.fact(4));
        System.out.println("f5: " + f.fact(5));*/

                        // String
        /*StringDemo symbol = new StringDemo();
        symbol.string1();*/

                        // Static

        //UseStatic.meth(42);

                        // Inheritance (extends)





    }
}
