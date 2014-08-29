package com.bforbank.formation.bfb;

import java.util.Date;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
public class Main {

    public static void main(String[] args) {
    }


    private static void primTest() {
        int a = 1;
        int b = 1;
        System.out.println(a == b);
    }

    private static void objTest() {
        long sysDate = System.currentTimeMillis();
        Date a = new Date(sysDate);
        Date b = new Date(sysDate);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    private static void strTest() {
        String a = "test";
        String b = "test";
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    private static void strNewTest() {
        String a = new String("test");
        String b = new String("test");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

}
