package com.bforbank.formation.bfb;

import java.util.ArrayList;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (Object age : listAges()) {
            sum += (Integer) age;
        }
        System.out.println(sum);
    }

    public static ArrayList listAges() {
        ArrayList list = new ArrayList();
        list.add(25);
        list.add(27);
        list.add("65");
        list.add(30);
        return list;
    }
}
