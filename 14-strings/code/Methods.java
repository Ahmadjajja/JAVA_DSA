package com.kunal;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("K"));
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".trim());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
