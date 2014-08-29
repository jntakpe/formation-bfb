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

    private static void strReplace() {
        String a = "toto";
        a.toUpperCase();
        System.out.println(a);
    }

    private static void dateReplace() {
        Date date = new Date();
        date.setTime(0);
        System.out.println(date.getTime());
    }

}
