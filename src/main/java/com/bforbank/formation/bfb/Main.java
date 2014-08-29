package com.bforbank.formation.bfb;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe mère de l'application
 *
 * @author jntakpe
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(daysSinceImBornJdk7());
    }

    public static long daysSinceImBorn() {
        return 0L;
    }

    public static long daysSinceImBornJdk7() {
        Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1986, Calendar.SEPTEMBER, 25);
        long diff = new Date().getTime() - dateOfBirth.getTime().getTime();
        return diff / (1000 * 60 * 60 * 24);
    }

}
