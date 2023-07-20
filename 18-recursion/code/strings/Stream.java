package com.kunal.strings;

public class Stream {
    public static void main(String[] args) {
        // skip("", "baccdahj");
        // System.out.println(skip2("", "baccdahj"));
        // System.out.println(skip3("baccdahj"));
        System.out.println(skipApple("bacappledahapplej"));
        System.out.println(skipApple2("bacappledaapphapplej"));
        System.out.println(skipAppNotApple("bacappledahapplejapp"));
    }
    static void skip(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    static String skip2(String p, String up){
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(p, up.substring(1));
        } else {
            return skip2(p + ch, up.substring(1));
        }
    }
    // Very important concept (note carefully) !!
    static String skip3(String up){
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip3(up.substring(1));
        } else {
            // This tells, hey you are going up
            // can you take my answer
            return ch + skip3(up.substring(1));
        }
    }
    // Very important concept (note carefully) !!
    static String skipApple(String up){
        // up = bacappledahapplej
        if (up.length() == 0) {
            return "";
        }

        String str = up.length() < 5 ? up.substring(0) : up.substring(0, 5);
        String strChar = up.substring(0, 1);

        if (str.equals("apple")) {
            return skipApple(up.substring(5));
        } else {
            // This tells, hey you are going up
            // can you take my answers
            return strChar + skipApple(up.substring(1));
        }
    }
    static String skipApple2(String up){
        // up = bacappledaapphapplej
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple2(up.substring(5));
        } else {
            // This tells, hey you are going up
            // can you take my answers
            return up.charAt(0) + skipApple2(up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        // up = bacappledahapplejapp
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            // This tells, hey you are going up
            // can you take my answers
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
