package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by kovtunov on 04/09/14.
 */
public class StringDemo {

    void string1() {

        String strOb1 = "First string";
        //System.out.println(strOb1.charAt(0).);
        char char1 = strOb1.charAt(0);
        System.out.println(char1);
        String charToString = Character.toString(char1);
        System.out.println(charToString.getBytes());


    }



}
